package com.example.ridehop_intership_project.databinding;
import com.example.ridehop_intership_project.R;
import com.example.ridehop_intership_project.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NavigationLayoutBindingImpl extends NavigationLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nvView, 1);
        sViewsWithIds.put(R.id.ll_home, 2);
        sViewsWithIds.put(R.id.ll_profile, 3);
        sViewsWithIds.put(R.id.ll_Settings, 4);
        sViewsWithIds.put(R.id.ll_my_rides, 5);
        sViewsWithIds.put(R.id.ll_promocode, 6);
        sViewsWithIds.put(R.id.ll_rewards, 7);
        sViewsWithIds.put(R.id.ll_logout, 8);
    }
    // views
    @NonNull
    private final com.google.android.material.navigation.NavigationView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NavigationLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private NavigationLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[1]
            );
        this.mboundView0 = (com.google.android.material.navigation.NavigationView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}