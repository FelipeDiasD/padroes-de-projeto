package org.felipeDias.strategy;

public class Personagem {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
