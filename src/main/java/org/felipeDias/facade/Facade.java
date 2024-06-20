package org.felipeDias.facade;

//Expõe ou consolida uma interface para uma operação que é mais complexa

/*

Situação problema
Possuo uma base de clientes  a qual quero migrar e/ou complementar as informações
Os clientes possuem os seguintes dados: nome e CEP
Quero consumir uma api de dados para adquirir mais dados sobre os clientes
A facade vai ter a função de consolidar essa informações

*/

import subsistema.apiCep.CepAPI;
import subsistema.crm.CrmService;

public class Facade {

    //Essa vai ser a "interface" que iremos usar
    public void migrarCliente(String nome, String cep){

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        CrmService.adicionaCliente(nome, cep, cidade, estado);

    }
}
