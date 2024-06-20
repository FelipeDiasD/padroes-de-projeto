package subsistema.crm;
//Exemplo de um subsistema externo que fornece dados do cliente
public class CrmService {

    private CrmService(){
        super();
    }

    public static void adicionaCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente adidionado no CRM");
        System.out.println("Nome: " + nome + "\n" + "cep: " + cep + "\n" + "cidade: " + cidade + "\n" + "estado: " + estado);
    }
}
