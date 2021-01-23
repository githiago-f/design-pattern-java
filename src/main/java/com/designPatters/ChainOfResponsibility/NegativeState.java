package com.designPatters.ChainOfResponsibility;

public class NegativeState implements IAccountState {
    @Override
    public void changeState(Conta conta) {
        if (conta.getSaldo() > 0.0) {
            conta.accountState = new PositiveState();
        }
    }
}
