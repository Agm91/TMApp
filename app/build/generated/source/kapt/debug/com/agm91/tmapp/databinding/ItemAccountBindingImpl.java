package com.agm91.tmapp.databinding;
import com.agm91.tmapp.R;
import com.agm91.tmapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAccountBindingImpl extends ItemAccountBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraint, 4);
        sViewsWithIds.put(R.id.name_, 5);
        sViewsWithIds.put(R.id.iban_, 6);
        sViewsWithIds.put(R.id.balance_, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAccountBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemAccountBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.balance.setTag(null);
        this.iban.setTag(null);
        this.item.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.account == variableId) {
            setAccount((com.agm91.tmapp.model.Account) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccount(@Nullable com.agm91.tmapp.model.Account Account) {
        this.mAccount = Account;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.account);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String balanceAndroidStringAsStringAccountAccountBalanceInCents = null;
        java.lang.String accountAccountName = null;
        int accountAccountBalanceInCents = 0;
        com.agm91.tmapp.model.Account account = mAccount;
        java.lang.String accountIban = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (account != null) {
                    // read account.accountName
                    accountAccountName = account.getAccountName();
                    // read account.accountBalanceInCents
                    accountAccountBalanceInCents = account.getAccountBalanceInCents();
                    // read account.iban
                    accountIban = account.getIban();
                }


                // read @android:string/as_string
                balanceAndroidStringAsStringAccountAccountBalanceInCents = balance.getResources().getString(R.string.as_string, accountAccountBalanceInCents);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.balance, balanceAndroidStringAsStringAccountAccountBalanceInCents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.iban, accountIban);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, accountAccountName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): account
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}