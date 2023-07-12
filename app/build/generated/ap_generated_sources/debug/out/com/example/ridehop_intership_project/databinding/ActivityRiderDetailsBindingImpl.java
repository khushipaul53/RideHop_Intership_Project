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
        sViewsWithIds.put(R.id.LLRides, 1);
        sViewsWithIds.put(R.id.imageview, 2);
        sViewsWithIds.put(R.id.tvName, 3);
        sViewsWithIds.put(R.id.tvPrice, 4);
        sViewsWithIds.put(R.id.tvAge, 5);
        sViewsWithIds.put(R.id.tvPhoneNumber, 6);
        sViewsWithIds.put(R.id.tvEmail, 7);
        sViewsWithIds.put(R.id.rating, 8);
        sViewsWithIds.put(R.id.LLCarDetails, 9);
        sViewsWithIds.put(R.id.tvCarType, 10);
        sViewsWithIds.put(R.id.tvVechicle, 11);
        sViewsWithIds.put(R.id.tvContact, 12);
        sViewsWithIds.put(R.id.btEmail, 13);
        sViewsWithIds.put(R.id.btcalling, 14);
        sViewsWithIds.put(R.id.bt_book, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRiderDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityRiderDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RatingBar) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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