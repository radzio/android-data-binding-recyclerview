package net.droidlabs.mvvmdemo.model;

public class User
{
    private  String firstName;
    private  String lastName;

    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //    @Bindable
//    public String getFirstName()
//    {
//        return firstName;
//    }
//
//    @Bindable
//    public String getLastName()
//    {
//        return lastName;
//    }
//
//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//        Log.e("A", firstName);
//        notifyPropertyChanged(BR.firstName);
//    }
//
//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//        Log.e("A", lastName);
//        notifyPropertyChanged(net.droidlabs.mvvmdemo.BR.lastName);
//    }
//
//    public TextWatcher getTextWatcher()
//    {
//        return textWatcher;
//    }
//
//
//    public void onTextChanged(String s)
//    {
//        this.setLastName(s);
//    }
//    public TextWatcher textWatcher = new TextWatcher()
//    {
//        @Override
//        public void beforeTextChanged(CharSequence s, int start, int count, int after)
//        {
//
//        }
//
//        @Override
//        public void onTextChanged(CharSequence s, int start, int before, int count)
//        {
//            User.this.setLastName(s.toString());
//        }
//
//        @Override
//        public void afterTextChanged(Editable s)
//        {
//
//        }
//    };
}
