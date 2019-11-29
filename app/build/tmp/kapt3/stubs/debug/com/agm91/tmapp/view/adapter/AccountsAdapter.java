package com.agm91.tmapp.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/agm91/tmapp/view/adapter/AccountsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/agm91/tmapp/view/adapter/AccountsAdapter$ViewHolder;", "()V", "allData", "", "Lcom/agm91/tmapp/model/Account;", "data", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "accounts", "Lcom/agm91/tmapp/model/Accounts;", "showAll", "", "ViewHolder", "app_debug"})
public final class AccountsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.agm91.tmapp.view.adapter.AccountsAdapter.ViewHolder> {
    private java.util.List<com.agm91.tmapp.model.Account> allData;
    private java.util.List<com.agm91.tmapp.model.Account> data;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.agm91.tmapp.model.Accounts accounts) {
    }
    
    public final void setData(boolean showAll) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.agm91.tmapp.view.adapter.AccountsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.agm91.tmapp.view.adapter.AccountsAdapter.ViewHolder holder, int position) {
    }
    
    public AccountsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/agm91/tmapp/view/adapter/AccountsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/agm91/tmapp/databinding/ItemAccountBinding;", "(Lcom/agm91/tmapp/databinding/ItemAccountBinding;)V", "bind", "", "account", "Lcom/agm91/tmapp/model/Account;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.agm91.tmapp.databinding.ItemAccountBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.agm91.tmapp.model.Account account) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.agm91.tmapp.databinding.ItemAccountBinding binding) {
            super(null);
        }
    }
}