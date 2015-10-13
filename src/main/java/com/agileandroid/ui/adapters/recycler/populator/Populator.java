package com.agileandroid.ui.adapters.recycler.populator;

import com.agileandroid.ui.adapters.recycler.builder.AgileRecyclerBuilder;

/**
 * Created by oscar.urbina on 8/28/15.
 */
public abstract class Populator{

    /**
     * Populate current view.
     */
    public abstract void populate(final AgileRecyclerBuilder agileRecyclerBuilder);
}
