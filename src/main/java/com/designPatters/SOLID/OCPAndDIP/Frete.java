package com.designPatters.SOLID.OCPAndDIP;

public class Frete implements ModeloDeFrete {
    public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
