package subsistema2;



public class CepApi {
    private static CepApi instancia = new CepApi();;
    private CepApi (){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String obterCidade(String cep){
        return "Rio de Janeiro";
    }
    public String obterEstado(String cep){
    return "RJ";
    }
}
