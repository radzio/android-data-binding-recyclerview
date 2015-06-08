package net.droidlabs.mvvm.recyclerview.adapter.binder;

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
