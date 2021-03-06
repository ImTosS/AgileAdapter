package com.agileandroid.ui.adapters.recycler.interactor;

import com.agileandroid.ui.adapters.AgileAdapterBuilder;
import com.agileandroid.ui.adapters.holder.BaseHolder;

/**
 * Created by oscar.urbina on 8/28/15.
 *
 * @param <T> the type parameter
 * @param <H> the type parameter
 */
public abstract class Interactor<T, H extends BaseHolder>{

    /**
     * Sets interaction.
     *
     * @param agileAdapterBuilder the agile recycler builder
     */
    public abstract void setInteraction(final AgileAdapterBuilder<T, H> agileAdapterBuilder);
}
