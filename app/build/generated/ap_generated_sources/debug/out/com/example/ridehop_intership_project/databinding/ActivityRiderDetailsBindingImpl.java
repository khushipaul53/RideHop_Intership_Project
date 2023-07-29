package com.example.ridehop_intership_project.databinding;
import com.example.ridehop_intership_project.R;
import com.example.ridehop_intership_project.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRiderDetailsBindingImpl extends ActivityRiderDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.ic_back, 3);
        sViewsWithIds.put(R.id.tv_heading, 4);
        sViewsWithIds.put(R.id.LLRides, 5);
        sViewsWithIds.put(R.id.imageview, 6);
        sViewsWithIds.put(R.id.tvName, 7);
        sViewsWithIds.put(R.id.tvPrice, 8);
        sViewsWithIds.put(R.id.tvAge, 9);
        sViewsWithIds.put(R.id.tvPhoneNumber, 10);
        sViewsWithIds.put(R.id.tvEmail, 11);
        sViewsWithIds.put(R.id.rating, 12);
        sViewsWithIds.put(R.id.LLCarDetails, 13);
        sViewsWithIds.put(R.id.tvCarType, 14);
        sViewsWithIds.put(R.id.tvVechicle, 15);
        sViewsWithIds.put(R.id.tvContact, 16);
        sViewsWithIds.put(R.id.btEmail, 17);
        sViewsWithIds.put(R.id.btcalling, 18);
        sViewsWithIds.put(R.id.bt_book, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRiderDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityRiderDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[5]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[19]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RatingBar) bindings[12]
            , (android.widget.RelativeLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[15]
            );
        this.rlLayout.setTag(null);
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