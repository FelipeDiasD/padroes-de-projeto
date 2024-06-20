package org.felipeDias;

import org.felipeDias.facade.Facade;
import org.felipeDias.singleton.SingletonEager;
import org.felipeDias.singleton.SingletonLazy;
import org.felipeDias.singleton.SingletonLazyHolder;
import org.felipeDias.strategy.ComportamentoAmpliado;
import org.felipeDias.strategy.ComportamentoPadrao;
import org.felipeDias.strategy.ComportamentoReduzido;
import org.felipeDias.strategy.Personagem;

public class Main {
    public static void main(String[] args) {

        //--------TESTANDO SINGLETONS------------//
        System.out.println("-----------Lazy-----------");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("-----------EAGER-----------");
        SingletonEager eager =SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        System.out.println("-----------LazyHolder-----------");
        SingletonLazyHolder lazyHolder =SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Testando Strategy

        System.out.println("-----------STRATEGY-----------");
        ComportamentoPadrao padrao = new ComportamentoPadrao();
        ComportamentoReduzido reduzido = new ComportamentoReduzido();
        ComportamentoAmpliado ampliado = new ComportamentoAmpliado();

        Personagem personagem1 = new Personagem();

        personagem1.setComportamento(padrao);
        personagem1.mover();
        personagem1.setComportamento(reduzido);
        personagem1.mover();
        personagem1.setComportamento(ampliado);
        personagem1.mover();

        System.out.println("-----------FACADE-----------");

        Facade facade = new Facade();
        /*
            AO invés de chamar a api e depois o CRM e ter uma implementação mais trabalhosa,
            temos apenas a chamada da facade que consolida tudo
         */
        facade.migrarCliente("Jorge", "121213142");



    }
}