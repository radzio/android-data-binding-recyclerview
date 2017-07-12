package net.droidlabs.mvvm.recyclerview.adapter.binder;

import java.util.Map;

public abstract class ConditionalDataBinder<T> extends ItemBinderBase<T> {
    public ConditionalDataBinder(int bindingVariable, int layoutId, Map<Integer, Object> bindings) {
        super(bindingVariable, layoutId, bindings);
    }

    public abstract boolean canHandle(T model);

    public boolean canHandle(int layoutId) {
        return this.layoutId == layoutId;
    }
}
