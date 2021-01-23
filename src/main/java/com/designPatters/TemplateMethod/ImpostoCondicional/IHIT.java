package com.designPatters.TemplateMethod.ImpostoCondicional;

import com.designPatters.Strategy.Item;
import com.designPatters.Strategy.Orcamento;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

    private boolean buscaPorDuplicata(List<Item> items) {
        if(items.size() <= 1) {
            return false;
        }
        List<String> noItems = new ArrayList<>();
        for (Item item : items) {
            if (noItems.contains(item.getName())) {
                return true;
            }
            noItems.add(item.getName());
        }
        return false;
    }

    @Override
    public double impostoMinimo(Orcamento orcamento) {
        return orcamento.getValor() * 0.13;
    }

    @Override
    public boolean atendeCondicao(Orcamento orcamento) {
        List<Item> items = orcamento.getItems();
        return buscaPorDuplicata(items);
    }

    @Override
    public double impostoMaximo(Orcamento orcamento) {
        double impostoPorItem = 0.01 * orcamento.getItemsSize();
        return orcamento.getValor() * impostoPorItem;
    }
}
