package net.droidlabs.mvvm.recyclerview.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import net.droidlabs.mvvm.recyclerview.adapter.BindingRecyclerViewAdapter;
import net.droidlabs.mvvm.recyclerview.adapter.binder.ItemBinder;
import net.droidlabs.mvvm.recyclerview.adapter.ClickHandler;
import net.droidlabs.mvvm.recyclerview.adapter.LongClickHandler;

import java.util.Collection;

public class RecyclerViewBindings
{
    private static final int KEY_ITEMS = -123;
    private static final int KEY_CLICK_HANDLER = -124;
    private static final int KEY_LONG_CLICK_HANDLER = -125;

    @SuppressWarnings("unchecked")
    @BindingAdapter("items")
    public static <T> void setItems(RecyclerView recyclerView, Collection<T> items)
    {
        BindingRecyclerViewAdapter<T> adapter = (BindingRecyclerViewAdapter<T>) recyclerView.getAdapter();
        if (adapter != null)
        {
            adapter.setItems(items);
        }
        else
        {
            recyclerView.setTag(KEY_ITEMS, items);
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("clickHandler")
    public static <T> void setHandler(RecyclerView recyclerView, ClickHandler<T> handler)
    {
        BindingRecyclerViewAdapter<T> adapter = (BindingRecyclerViewAdapter<T>) recyclerView.getAdapter();
        if (adapter != null)
        {
            adapter.setClickHandler(handler);
        }
        else
        {
            recyclerView.setTag(KEY_CLICK_HANDLER, handler);
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("longClickHandler")
    public static <T> void setHandler(RecyclerView recyclerView, LongClickHandler<T> handler)
    {
        BindingRecyclerViewAdapter<T> adapter = (BindingRecyclerViewAdapter<T>) recyclerView.getAdapter();
        if (adapter != null)
        {
            adapter.setLongClickHandler(handler);
        }
        else
        {
            recyclerView.setTag(KEY_LONG_CLICK_HANDLER, handler);
        }
    }

    @SuppressWarnings("unchecked")
    @BindingAdapter("itemViewBinder")
    public static <T> void setItemViewBinder(RecyclerView recyclerView, ItemBinder<T> itemViewMapper)
    {
        Collection<T> items = (Collection<T>) recyclerView.getTag(KEY_ITEMS);
        ClickHandler<T> clickHandler = (ClickHandler<T>) recyclerView.getTag(KEY_CLICK_HANDLER);
        BindingRecyclerViewAdapter<T> adapter = new BindingRecyclerViewAdapter<>(itemViewMapper, items);
        if(clickHandler != null)
        {
            adapter.setClickHandler(clickHandler);
        }
        recyclerView.setAdapter(adapter);
    }
}