package net.droidlabs.mvvmdemo.adapter.binder;

import net.droidlabs.mvvmdemo.viewmodel.SuperUserViewModel;
import net.droidlabs.mvvmdemo.viewmodel.UserViewModel;

public class SuperUserBinder extends ConditionalDataBinder<UserViewModel>
{
    public SuperUserBinder(int bindingVariable, int layoutId)
    {
        super(bindingVariable, layoutId);
    }

    @Override
    public boolean canHandle(UserViewModel model)
    {
        return model instanceof SuperUserViewModel;
    }
}
