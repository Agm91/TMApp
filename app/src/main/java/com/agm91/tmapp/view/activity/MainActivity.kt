package com.agm91.tmapp.view.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.wear.widget.WearableLinearLayoutManager
import com.agm91.tmapp.R
import com.agm91.tmapp.databinding.ActivityMainBinding
import com.agm91.tmapp.util.Utils
import com.agm91.tmapp.view.wear.CustomScrollingLayoutCallback
import com.agm91.tmapp.view.adapter.AccountsAdapter
import com.agm91.tmapp.viewmodel.AccountsViewModel

class MainActivity : AppCompatActivity() {
    private val adapter = AccountsAdapter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recycler.apply {
            if(Utils.isWatch(this@MainActivity)) {
                isEdgeItemsCenteringEnabled = true
                layoutManager =
                    WearableLinearLayoutManager(this@MainActivity,
                        CustomScrollingLayoutCallback()
                    )
            }
        }

        binding.myswitch.setOnCheckedChangeListener{ compoundButton: CompoundButton, b: Boolean ->
            adapter.setData(binding.myswitch.isChecked)
            binding.recycler.adapter = adapter
        }

        val viewModel: AccountsViewModel =
            ViewModelProviders.of(this).get(AccountsViewModel::class.java)
        viewModel.getAccounts().observe(this, Observer { accounts ->
            adapter.setData(accounts)
            binding.recycler.adapter = adapter
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_share -> {
                val sendIntent = Intent()
                sendIntent.action = Intent.ACTION_SEND
                sendIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.text_share))
                sendIntent.type = "text/plain"

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
            R.id.action_gihub -> openUrl(getString(R.string.url_github))
            R.id.action_linkedin -> openUrl(getString(R.string.url_linkedin))
        }
        return true
    }

    private fun openUrl(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }
}
