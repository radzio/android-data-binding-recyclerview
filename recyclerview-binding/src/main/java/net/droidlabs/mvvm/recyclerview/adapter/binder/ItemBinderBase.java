package net.droidlabs.mvvm.recyclerview.adapter.binder;

import android.support.annotation.Nullable;

import java.util.Map;

public class ItemBinderBase<T> implements ItemBinder<T> {
    final int bindingVariable;
    final int layoutId;
    final Map<Integer, Object> bindings;

    public ItemBinderBase(int bindingVariable, int layoutId, @Nullable Map<Integer, Object> bindings) {

        this.bindingVariable = bindingVariable;
        this.layoutId = layoutId;
        this.bindings = bindings;
    }

    public int getLayoutRes(T model) {
        return layoutId;
    }

    public int getBindingVariable(T model) {
        return bindingVariable;
    }

    @Override public Map<Integer, Object> getBindings() {
        return bindings;
    }


}
