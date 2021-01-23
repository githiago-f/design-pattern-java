package com.designPatters.Decorator.fraudDetect;

import com.designPatters.ChainOfResponsibility.Conta;

import java.util.List;

public interface IFilter {
    List<Conta> accountFilter(List<Conta> accounts);
}
