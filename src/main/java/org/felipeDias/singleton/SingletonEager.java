package org.felipeDias.singleton;

//Eager = "apressado"
//Já deixa a instância pronta e só retorna quando é chamado
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
            return instancia;
    }

}
