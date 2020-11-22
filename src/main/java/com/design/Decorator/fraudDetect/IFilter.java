package com.design.Decorator.fraudDetect;

import com.design.ChainOfResponsibility.Conta;

import java.util.List;

public interface IFilter {
    List<Conta> accountFilter(List<Conta> accounts);
}
