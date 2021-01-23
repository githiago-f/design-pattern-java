package com.designPatters.Decorator.fraudDetect;

import com.designPatters.ChainOfResponsibility.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class Filter implements IFilter {
    private Optional<Filter> otherFilter = Optional.empty();

    public Filter(Filter otherFilter) {
        this.otherFilter = Optional.of(otherFilter);
    }

    public Filter() {}

    public abstract List<Conta> accountFilter(List<Conta> accounts);

    protected List<Conta> applyOtherFilter(List<Conta> accounts) {
        if(otherFilter.isEmpty()) return new ArrayList<>();
        return otherFilter.get().accountFilter(accounts);
    }
}
