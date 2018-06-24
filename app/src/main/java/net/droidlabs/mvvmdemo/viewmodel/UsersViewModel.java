package net.droidlabs.mvvmdemo.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableArrayList;
import net.droidlabs.mvvmdemo.model.User;

public class UsersViewModel extends BaseObservable {
  @Bindable
  public ObservableArrayList<UserViewModel> users;

  public UsersViewModel() {
    this.users = new ObservableArrayList<>();
  }

  public void addUser(String name, String surname) {
    this.users.add(new UserViewModel(new User(name, surname)));
  }

}
