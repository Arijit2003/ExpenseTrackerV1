package com.example.expensetrackerv1.databinding;
import com.example.expensetrackerv1.R;
import com.example.expensetrackerv1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentViewRecordBindingImpl extends FragmentViewRecordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewRecordTranType, 4);
        sViewsWithIds.put(R.id.viewRecordTranDate, 5);
        sViewsWithIds.put(R.id.viewRecordTranDesc, 6);
        sViewsWithIds.put(R.id.viewRecordTranAmount, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewmodelOnEditButtonPressedAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewmodelOnBackButtonPressedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentViewRecordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentViewRecordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
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
            setViewmodel((com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel Viewmodel) {
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
        android.view.View.OnClickListener viewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewmodelOnEditButtonPressedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewmodelOnBackButtonPressedAndroidViewViewOnClickListener = null;
        com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel::onDeleteButtonPressed
                    viewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener = (((mViewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener == null) ? (mViewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener).setValue(viewmodel));
                    // read viewmodel::onEditButtonPressed
                    viewmodelOnEditButtonPressedAndroidViewViewOnClickListener = (((mViewmodelOnEditButtonPressedAndroidViewViewOnClickListener == null) ? (mViewmodelOnEditButtonPressedAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewmodelOnEditButtonPressedAndroidViewViewOnClickListener).setValue(viewmodel));
                    // read viewmodel::onBackButtonPressed
                    viewmodelOnBackButtonPressedAndroidViewViewOnClickListener = (((mViewmodelOnBackButtonPressedAndroidViewViewOnClickListener == null) ? (mViewmodelOnBackButtonPressedAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewmodelOnBackButtonPressedAndroidViewViewOnClickListener).setValue(viewmodel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(viewmodelOnBackButtonPressedAndroidViewViewOnClickListener);
            this.mboundView2.setOnClickListener(viewmodelOnEditButtonPressedAndroidViewViewOnClickListener);
            this.mboundView3.setOnClickListener(viewmodelOnDeleteButtonPressedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value;
        public OnClickListenerImpl setValue(com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onDeleteButtonPressed(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value;
        public OnClickListenerImpl1 setValue(com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onEditButtonPressed(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value;
        public OnClickListenerImpl2 setValue(com.example.expensetrackerv1.ui.home.fragments.viewrecord.ViewRecordViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onBackButtonPressed(arg0); 
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