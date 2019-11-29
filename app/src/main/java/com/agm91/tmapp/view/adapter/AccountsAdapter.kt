package com.agm91.tmapp.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.agm91.tmapp.BR
import com.agm91.tmapp.R
import com.agm91.tmapp.databinding.ItemAccountBinding
import com.agm91.tmapp.model.Account
import com.agm91.tmapp.model.Accounts
import com.agm91.tmapp.view.activity.GenericActivity
import com.agm91.tmapp.view.fragment.ARG_ACCOUNT

class AccountsAdapter : RecyclerView.Adapter<AccountsAdapter.ViewHolder>() {
    private var allData = mutableListOf<Account>()
    private var data = mutableListOf<Account>()

    fun setData(accounts: Accounts) {
        this.allData = accounts.accounts.toMutableList()
        this.data = accounts.accounts.toMutableList()
        notifyDataSetChanged()
    }

    fun setData(showAll: Boolean) {
        if (showAll)
            this.data = allData
        else{
            data = mutableListOf()
            allData.forEach {
                if(it.isVisible)
                    data.add(it)
            }
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding =
            DataBindingUtil.inflate<ItemAccountBinding>(
                layoutInflater,
                R.layout.item_account,
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    class ViewHolder(private val binding: ItemAccountBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(account: Account) {
            with(binding) {
                setVariable(BR.account, account)
                binding.item.setOnClickListener {
                    val context = binding.root.context
                    val intent = Intent(context, GenericActivity::class.java)
                    intent.apply {
                        putExtra(ARG_ACCOUNT, account)
                    }
                    context.startActivity(intent)
                }
                executePendingBindings()
            }
        }
    }
}