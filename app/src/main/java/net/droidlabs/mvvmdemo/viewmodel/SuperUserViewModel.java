package net.droidlabs.mvvmdemo.viewmodel;

import net.droidlabs.mvvmdemo.model.User;

public class SuperUserViewModel extends UserViewModel
{
    public SuperUserViewModel(User model)
    {
        super(model);
    }

    public String getGroup()
    {
        return "Droid";
    }
}
