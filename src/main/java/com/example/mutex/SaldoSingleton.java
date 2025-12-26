package com.example.mutex;

import java.util.concurrent.atomic.AtomicInteger;

public class SaldoSingleton {


    private static final SaldoSingleton INSTANCE = new SaldoSingleton();
    private final AtomicInteger saldo = new AtomicInteger(1000);

    private SaldoSingleton() {}

    public static SaldoSingleton getInstance() {
        return INSTANCE;
    }

    public void debitar(int valor) {
        saldo.updateAndGet(atual -> {
            if (valor > atual) {
                throw new IllegalStateException("Saldo insuficiente");
            }
            return atual - valor;
        });
    }

    public int getSaldo() {
        return saldo.get();
    }
}
