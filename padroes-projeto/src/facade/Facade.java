package facade;
import subsistema1.CrmService;
import subsistema2.CepApi;


public class Facade {
    public void migraCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().obterCidade(cep);
        String estado = CepApi.getInstancia().obterEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
