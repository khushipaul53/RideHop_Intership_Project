package com.example.ridehop_intership_project.databinding;
import com.example.ridehop_intership_project.R;
import com.example.ridehop_intership_project.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDashboardBindingImpl extends FragmentDashboardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.sideMenu, 3);
        sViewsWithIds.put(R.id.tv_heading, 4);
        sViewsWithIds.put(R.id.viewPagerMain, 5);
        sViewsWithIds.put(R.id.from, 6);
        sViewsWithIds.put(R.id.to, 7);
        sViewsWithIds.put(R.id.Custom, 8);
        sViewsWithIds.put(R.id.llCustom, 9);
        sViewsWithIds.put(R.id.dateTime, 10);
        sViewsWithIds.put(R.id.tvSeats, 11);
        sViewsWithIds.put(R.id.spSeats, 12);
        sViewsWithIds.put(R.id.bt_Login, 13);
        sViewsWithIds.put(R.id.fab, 14);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDashboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.Spinner) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[11]
            , (androidx.viewpager.widget.ViewPager) bindings[5]
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