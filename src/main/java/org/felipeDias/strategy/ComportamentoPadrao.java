package org.felipeDias.strategy;

public class ComportamentoPadrao implements Comportamento{

    @Override
    public void mover() {
        System.out.println("O movimento normal é 6 hexágonos");
    }
}
