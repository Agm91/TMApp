package com.agm91.tmapp.view.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.agm91.tmapp.BR
import com.agm91.tmapp.R
import com.agm91.tmapp.databinding.FragmentAccountBinding
import com.agm91.tmapp.model.Account

const val ARG_ACCOUNT = "store"

class AccountFragment : Fragment() {
    private var account: Account? = null
    private var binding: FragmentAccountBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            account = it.get(ARG_ACCOUNT) as Account?
        }

        val actionbar = (activity as AppCompatActivity).supportActionBar
        actionbar?.let {
            actionbar.apply {
                title = account?.accountName
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_account, container, false)
        bind()

        return binding?.root
    }

    private fun bind() {
        binding?.setVariable(BR.account, account)
        binding?.executePendingBindings()
    }

    companion object {
        @JvmStatic
        fun newInstance(bundle: Bundle) =
            AccountFragment().apply {
                arguments = bundle
            }
    }
}
