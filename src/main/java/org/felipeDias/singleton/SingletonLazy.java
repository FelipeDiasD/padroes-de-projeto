package org.felipeDias.singleton;

//lazy = "preguiçoso'
//Só instância o objeto sob demanda (quando é chamado)
public class SingletonLazy {

    //Instancia para a ser disponibilizada
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
           instancia = new SingletonLazy();
        }
        return instancia;
    }


}
