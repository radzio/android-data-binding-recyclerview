package net.droidlabs.mvvm.recyclerview.adapter.binder;

public class CompositeItemBinder<T> implements ItemBinder<T>
{
    private final ConditionalDataBinder<T>[] conditionalDataBinders;

    public CompositeItemBinder(ConditionalDataBinder<T>... conditionalDataBinders)
    {
        this.conditionalDataBinders = conditionalDataBinders;
    }

    @Override
    public int getLayoutRes(T model)
    {
        for (int i = 0; i < conditionalDataBinders.length; i++)
        {
            ConditionalDataBinder<T> dataBinder = conditionalDataBinders[i];
            if (dataBinder.canHandle(model))
            {
                return dataBinder.getLayoutRes(model);
            }
        }

        throw new IllegalStateException();
    }

    @Override
    public int getBindingVariable(T model)
    {
        for (int i = 0; i < conditionalDataBinders.length; i++)
        {
            ConditionalDataBinder<T> dataBinder = conditionalDataBinders[i];
            if (dataBinder.canHandle(model))
            {
                return dataBinder.getBindingVariable(model);
            }
        }

        throw new IllegalStateException();
    }
}
