package net.droidlabs.mvvmdemo.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import net.droidlabs.mvvmdemo.model.User;

public class UsersViewModel extends BaseObservable
{
    @Bindable
    public ObservableArrayList<UserViewModel> users;

    public UsersViewModel()
    {
        this.users = new ObservableArrayList<>();
    }

    public void addUser(String name, String surname)
    {
        this.users.add(new UserViewModel(new User(name, surname)));
    }

}
