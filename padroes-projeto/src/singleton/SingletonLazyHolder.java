package singleton;
// @Bean e @AutoWired no Spring
public class SingletonLazyHolder {
    private SingletonLazyHolder instancia;
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
