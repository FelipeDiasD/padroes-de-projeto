package org.felipeDias.strategy;

public class ComportamentoAmpliado implements Comportamento{

    @Override
    public void mover() {
        System.out.println("O movimento ampliado é de 12 hexágonos");
    }
}
