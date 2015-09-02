package com.agileandroid.ui.listeners.adapters.dto;

import com.agileandroid.ui.listeners.adapters.interactors.Interactor;
import com.agileandroid.ui.listeners.adapters.populators.Populator;
import com.agileandroid.ui.listeners.adapters.resolvers.ViewResolverRecycler;

/**
 * Created by oscar.urbina on 8/28/15.
 */
public class AgileAdapterDTORecycler{

    private Populator populator;
    private ViewResolverRecycler viewResolverRecycler;
    private Interactor interactor;

    /**
     * Instantiates a new Agile adapter dTO.
     *
     * @param viewResolverRecycler the recycler view resolver
     * @param populator the populator
     */
    public AgileAdapterDTORecycler(ViewResolverRecycler viewResolverRecycler, Populator populator) {
        this.populator = populator;
        this.viewResolverRecycler = viewResolverRecycler;
    }

    /**
     * Instantiates a new Agile adapter dTO.
     *
     * @param viewResolverRecycler the recycler view resolver
     * @param populator the populator
     * @param interactor the interactor
     */
    public AgileAdapterDTORecycler(ViewResolverRecycler viewResolverRecycler, Populator populator, Interactor interactor) {

        this.populator = populator;
        this.viewResolverRecycler = viewResolverRecycler;
        this.interactor = interactor;
    }

    /**
     * Gets populator.
     *
     * @return the populator
     */
    public Populator getPopulator() {
        return populator;
    }

    /**
     * Gets recycler view resolver.
     *
     * @return the recycler view resolver
     */
    public ViewResolverRecycler getViewResolverRecycler() {
        return viewResolverRecycler;
    }

    /**
     * Gets interactor.
     *
     * @return the interactor
     */
    public Interactor getInteractor() {
        return interactor;
    }
}