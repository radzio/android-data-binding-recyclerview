# android-data-binding-recyclerview
Using Recyclerview with the new Android Data Binding framework


```java
@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        usersViewModel = new UsersViewModel();
        usersViewModel.users.add(new SuperUserViewModel(new User("Android", "Dev")));

        binding = DataBindingUtil.setContentView(this, R.layout.users_view);
        binding.setUsersViewModel(usersViewModel);
        binding.setView(this);
        binding.activityUsersRecycler.setLayoutManager(new LinearLayoutManager(this));
    }
```


```xml
<!-- layout.xml -->
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <data>
              <variable
                  name="usersViewModel"
                  type="net.droidlabs.mvvmdemo.viewmodel.UsersViewModel"/>
    </data>

<android.support.v7.widget.RecyclerView
            android:id="@+id/activity_users_recycler"
            android:scrollbars="vertical"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:items="@{usersViewModel.users}"
            app:itemViewBinder="@{usersViewModel.itemViewBinder}"
            />
</layout>
```