package com.designPatters.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    private final List<Item> items = new ArrayList<>();

    protected State state;

    public Orcamento(double valor) {
        this.valor = valor;
        state = new OnApproval();
    }

    public double getValor() {
        return valor;
    }

    public int getItemsSize() { return items.size(); }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public State getState() {
        return state;
    }

    public void applyExtraDiscount() {
        state.applyExtraDiscount(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void reprove() {
        state.reprove(this);
    }

    public void conclude() {
        state.conclude(this);
    }
}
