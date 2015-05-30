package net.droidlabs.mvvmdemo.view;

import net.droidlabs.mvvmdemo.adapter.binder.ItemBinderBase;

public abstract class ConditionalDataBinder<T> extends ItemBinderBase<T>
{
    public ConditionalDataBinder(int bindingVariable, int layoutId)
    {
        super(bindingVariable, layoutId);
    }

    public abstract boolean canHandle(T model);

    public  boolean canHandle(int layoutId)
    {
        return this.layoutId == layoutId;
    }
}
