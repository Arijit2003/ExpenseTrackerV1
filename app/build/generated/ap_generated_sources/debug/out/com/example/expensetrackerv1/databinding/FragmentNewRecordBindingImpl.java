package com.example.expensetrackerv1.databinding;
import com.example.expensetrackerv1.R;
import com.example.expensetrackerv1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewRecordBindingImpl extends FragmentNewRecordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.radioGroup, 6);
        sViewsWithIds.put(R.id.radioBtnExpense, 7);
        sViewsWithIds.put(R.id.radioBtnIncome, 8);
        sViewsWithIds.put(R.id.dateInputLayout, 9);
        sViewsWithIds.put(R.id.descInputLayout, 10);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.Button mboundView5;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnDateClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickSaveAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mViewModelOnBackButtonPressedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener amountEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.transactionAmount
            //         is viewModel.setTransactionAmount((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(amountEditText);
            // localize variables for thread safety
            // viewModel
            com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.transactionAmount
            java.lang.String viewModelTransactionAmount = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setTransactionAmount(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener descEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.description
            //         is viewModel.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(descEditText);
            // localize variables for thread safety
            // viewModel
            com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel viewModel = mViewModel;
            // viewModel.description
            java.lang.String viewModelDescription = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentNewRecordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentNewRecordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioGroup) bindings[6]
            );
        this.amountEditText.setTag(null);
        this.dateEditText.setTag(null);
        this.descEditText.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
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
        android.view.View.OnClickListener viewModelOnDateClickAndroidViewViewOnClickListener = null;
        java.lang.String viewModelDescription = null;
        android.view.View.OnClickListener viewModelOnClickSaveAndroidViewViewOnClickListener = null;
        java.lang.String viewModelTransactionAmount = null;
        android.view.View.OnClickListener viewModelOnBackButtonPressedAndroidViewViewOnClickListener = null;
        com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onDateClick
                    viewModelOnDateClickAndroidViewViewOnClickListener = (((mViewModelOnDateClickAndroidViewViewOnClickListener == null) ? (mViewModelOnDateClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnDateClickAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel.description
                    viewModelDescription = viewModel.getDescription();
                    // read viewModel::onClickSave
                    viewModelOnClickSaveAndroidViewViewOnClickListener = (((mViewModelOnClickSaveAndroidViewViewOnClickListener == null) ? (mViewModelOnClickSaveAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickSaveAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel.transactionAmount
                    viewModelTransactionAmount = viewModel.getTransactionAmount();
                    // read viewModel::onBackButtonPressed
                    viewModelOnBackButtonPressedAndroidViewViewOnClickListener = (((mViewModelOnBackButtonPressedAndroidViewViewOnClickListener == null) ? (mViewModelOnBackButtonPressedAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mViewModelOnBackButtonPressedAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amountEditText, viewModelTransactionAmount);
            this.dateEditText.setOnClickListener(viewModelOnDateClickAndroidViewViewOnClickListener);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descEditText, viewModelDescription);
            this.mboundView1.setOnClickListener(viewModelOnBackButtonPressedAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(viewModelOnClickSaveAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.amountEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, amountEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.descEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, descEditTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value;
        public OnClickListenerImpl setValue(com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onDateClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value;
        public OnClickListenerImpl1 setValue(com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickSave(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value;
        public OnClickListenerImpl2 setValue(com.example.expensetrackerv1.ui.home.fragments.newrecord.NewRecordViewModel value) {
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
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}