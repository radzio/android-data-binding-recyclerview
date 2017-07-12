package net.droidlabs.mvvmdemo.binder;

import net.droidlabs.mvvm.recyclerview.adapter.binder.ConditionalDataBinder;
import net.droidlabs.mvvmdemo.viewmodel.UserViewModel;

public class UserBinder extends ConditionalDataBinder<UserViewModel> {
    public UserBinder(int bindingVariable, int layoutId) {
        super(bindingVariable, layoutId, null);
    }

    @Override
    public boolean canHandle(UserViewModel model) {
        return true;
    }
}
