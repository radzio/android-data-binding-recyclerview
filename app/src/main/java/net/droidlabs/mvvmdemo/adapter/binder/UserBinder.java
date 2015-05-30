package net.droidlabs.mvvmdemo.adapter.binder;

import net.droidlabs.mvvmdemo.viewmodel.UserViewModel;

public class UserBinder extends ConditionalDataBinder<UserViewModel>
{
    public UserBinder(int bindingVariable, int layoutId)
    {
        super(bindingVariable, layoutId);
    }

    @Override
    public boolean canHandle(UserViewModel model)
    {
        return true;
    }
}
