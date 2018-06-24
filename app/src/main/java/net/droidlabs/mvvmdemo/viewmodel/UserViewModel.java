package net.droidlabs.mvvmdemo.viewmodel;

import androidx.databinding.BaseObservable;
import net.droidlabs.mvvmdemo.model.User;

public class UserViewModel extends BaseObservable {
  private final User model;

  public UserViewModel(User model) {
    this.model = model;
  }

  public User getModel() {
    return model;
  }

  public String getFirstName() {
    return model.getFirstName();
  }

  public String getLastName() {
    return model.getLastName();
  }
}
