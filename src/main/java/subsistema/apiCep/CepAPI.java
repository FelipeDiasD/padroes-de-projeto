package subsistema.apiCep;
//Exemplo de uma api externa que fornece dados sobre o CEP

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Cidade";
    }

    public String recuperarEstado(String cep){
        return "Estado";
    }
}
