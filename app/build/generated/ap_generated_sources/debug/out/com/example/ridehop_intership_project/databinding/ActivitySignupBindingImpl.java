package com.example.ridehop_intership_project.databinding;
import com.example.ridehop_intership_project.R;
import com.example.ridehop_intership_project.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignupBindingImpl extends ActivitySignupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.TvEmail, 1);
        sViewsWithIds.put(R.id.etEmail, 2);
        sViewsWithIds.put(R.id.TvName, 3);
        sViewsWithIds.put(R.id.etName, 4);
        sViewsWithIds.put(R.id.TvAge, 5);
        sViewsWithIds.put(R.id.etAge, 6);
        sViewsWithIds.put(R.id.TvPassword, 7);
        sViewsWithIds.put(R.id.ETPassword, 8);
        sViewsWithIds.put(R.id.TvConfirmPassword, 9);
        sViewsWithIds.put(R.id.ETConfirmPassword, 10);
        sViewsWithIds.put(R.id.TvGender, 11);
        sViewsWithIds.put(R.id.idRadioGroup, 12);
        sViewsWithIds.put(R.id.maleRadio, 13);
        sViewsWithIds.put(R.id.femaleRadio, 14);
        sViewsWithIds.put(R.id.cb_terms, 15);
        sViewsWithIds.put(R.id.bt_Signup, 16);
        sViewsWithIds.put(R.id.tvSignin, 17);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivitySignupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.CheckBox) bindings[15]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.RadioGroup) bindings[12]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.TextView) bindings[17]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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