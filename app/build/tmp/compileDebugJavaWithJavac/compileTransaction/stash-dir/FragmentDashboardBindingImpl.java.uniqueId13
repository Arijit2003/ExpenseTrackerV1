package com.example.expensetrackerv1.databinding;
import com.example.expensetrackerv1.R;
import com.example.expensetrackerv1.BR;
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
        sViewsWithIds.put(R.id.searchView, 2);
        sViewsWithIds.put(R.id.dashboardRecyclerView, 3);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelOnAddNewBtnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentDashboardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDashboardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.FrameLayout) bindings[0]
            , (androidx.appcompat.widget.SearchView) bindings[2]
            );
        this.addNewBtn.setTag(null);
        this.dashboardRoot.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.expensetrackerv1.ui.home.fragments.dashboard.DashboardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.expensetrackerv1.ui.home.fragments.dashboard.DashboardViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
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
        android.view.View.OnClickListener viewmodelOnAddNewBtnClickAndroidViewViewOnClickListener = null;
        com.example.expensetrackerv1.ui.home.fragments.dashboard.DashboardViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel::onAddNewBtnClick
                    viewmodelOnAddNewBtnClickAndroidViewViewOnClickListener = (((mViewmodelOnAddNewBtnClickAndroidViewViewOnClickListener == null) ? (mViewmodelOnAddNewBtnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelOnAddNewBtnClickAndroidViewViewOnClickListener).setValue(viewmodel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.addNewBtn.setOnClickListener(viewmodelOnAddNewBtnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.dashboard.DashboardViewModel value;
        public OnClickListenerImpl setValue(com.example.expensetrackerv1.ui.home.fragments.dashboard.DashboardViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAddNewBtnClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}