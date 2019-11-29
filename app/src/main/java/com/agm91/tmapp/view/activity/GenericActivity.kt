package com.agm91.tmapp.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.agm91.tmapp.R
import com.agm91.tmapp.databinding.ActivityShowAccountsBinding
import com.agm91.tmapp.view.fragment.AccountFragment

class GenericActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityShowAccountsBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_show_accounts)

        val newFragment = AccountFragment.newInstance(intent.extras)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
