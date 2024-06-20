package org.felipeDias.singleton;

//Aproveita o modo que o JVM instancia as classes
//Adia a instanciação do instanceHolder (ou seja, do próprio singleton) até que seja usada (até a primeira chamada do get instancia)
public class SingletonLazyHolder {

    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
