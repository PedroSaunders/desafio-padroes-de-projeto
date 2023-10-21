

import facade.Facade;
import singleton.SingletonLazyHolder;
import singleton.SingletonPreguica;
import singleton.SingletonRapido;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

// Classe padrão do vscode que utilizei para testes.
public class App {
    public static void main(String[] args) throws Exception {
        //teste Singleton
        SingletonPreguica lazy = SingletonPreguica.getInstancia();
        System.out.println(lazy);
        lazy = SingletonPreguica.getInstancia();
        System.out.println(lazy);


        SingletonRapido eager = SingletonRapido.getInstancia();
        System.out.println(eager);
        eager = SingletonRapido.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);


        //teste Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        // teste Facede
        Facade facade = new Facade();
        facade.migraCliente("Pedro", "123456-78");
    }


}
