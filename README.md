# Android Data Binding + RecyclerView
Using Recyclerview with the new Android Data Binding framework.

![demo](https://cloud.githubusercontent.com/assets/469111/7898771/36df1504-070b-11e5-95d5-d8ca0aaf50dd.gif)


## How to start?

Just clone this repository and start playing with it! If you want to use some parts of this repository in your project read below.


### Change your gradle file

- In your main  build.gradle add:
 
```gradle
classpath 'com.android.tools.build:gradle:1.3.0-beta1'
classpath "com.android.databinding:dataBinder:1.0-rc0"
```

- In your app build.gradle add:
    
    
```gradle
apply plugin: 'com.android.databinding'
```



### Modify your layout

Remember to use your classes and packages ;-).

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

### Modify your activity

```java
	// your activity
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        usersViewModel = new UsersViewModel();
        usersViewModel.users.add(new SuperUserViewModel(new User("Android", "Dev")));

        binding = DataBindingUtil.setContentView(this, R.layout.users_view);
        binding.setUsersViewModel(usersViewModel);
        binding.activityUsersRecycler.setLayoutManager(new LinearLayoutManager(this));
    }
```

### Modify your ViewModel class

```java
    public class UsersViewModel extends BaseObservable
    {
        public ObservableArrayList<UserViewModel> users;

        public ItemBinder<UserViewModel> itemViewBinder()
            {
                return new ItemBinderBase<UserViewModel>(BR.user, R.layout.item_user);
            }
    }
```

### Some details

Your ViewModel (__UsersViewModel__  in my example) should have field of __ObservableArrayList<YourClass>__ type which will be bind to  recycler view. 

Next thing is __ItemViewBinder__. This class is used in  __BindingRecyclerViewAdapter__ for creating VieHolders and it's item views bindings. In my example I've created __CompositeItemBinder__ in order to support two different item types with separate layouts. If you want to display list with one data type you can use ItemBinderBase:

```java
	public ItemBinder<YourClass> itemViewBinder()
    {
          return new ItemBinderBase<YourClass>(BR.your_variable_name, R.layout.your_item_layout);
    }
```

Please look at **UsersView.java** and **UsersViewModel.java** if something is unclear.
