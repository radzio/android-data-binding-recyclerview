package net.droidlabs.mvvm.recyclerview.adapter.binder;

import java.util.Map;

public interface ItemBinder<T>
{
      int getLayoutRes(T model);
      int getBindingVariable(T model);
      /**
       * used to define your own bindings
       * @return Map
       */
      Map<Integer, Object> getBindings();

}
