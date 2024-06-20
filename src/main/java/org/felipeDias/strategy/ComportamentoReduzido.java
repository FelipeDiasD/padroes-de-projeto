package org.felipeDias.strategy;

public class ComportamentoReduzido implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O movimento reduzido é de 3 hexágonos");
    }
}
