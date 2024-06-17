/*
 * Caso você deseje apenas uma instância universal para uma classe
 */

package design_patterns.singleton;

public class App {
    public static void main(String[] args) {

        // Primeira Configuração
        DatabaseConnectionEAGER dbEager = DatabaseConnectionEAGER.INSTANCE;
        dbEager.setConnectionString("192.168.0.0");
        dbEager.setPort(4310);
        dbEager.setUser("mysql");

        DatabaseConnectionLAZY dbLazy = DatabaseConnectionLAZY.getInstance();
        dbLazy.setConnectionString("192.168.0.0");
        dbLazy.setPort(4310);
        dbLazy.setUser("mysql");

        DatabaseConnectionENUM dbEnum = DatabaseConnectionENUM.INSTANCE;
        dbEnum.setConnectionString("192.168.0.0");
        dbEnum.setPort(4310);
        dbEnum.setUser("mysql");



        // Segunda configuração
        DatabaseConnectionEAGER dbEager1 = DatabaseConnectionEAGER.INSTANCE;
        dbEager1.setConnectionString("192.168.10.20");
        dbEager1.setPort(210);
        dbEager1.setUser("postgres");

        DatabaseConnectionLAZY dbLazy1 = DatabaseConnectionLAZY.getInstance();
        dbLazy1.setConnectionString("192.168.10.20");
        dbLazy1.setPort(210);
        dbLazy1.setUser("postgres");

        DatabaseConnectionENUM dbEnum1 = DatabaseConnectionENUM.INSTANCE;
        dbEnum1.setConnectionString("192.168.10.20");
        dbEnum1.setPort(210);
        dbEnum1.setUser("postgres");
        

        //Comprovação
        System.out.println("Singleton EAGER: " + dbEager.toString() + dbEager1.toString());
        System.out.println("Singleton LAZY: " + dbLazy.toString() + dbLazy1.toString());
        System.out.println("Singleton ENUM: " + dbLazy.toString() + dbLazy1.toString());
        System.out.println("Mesma configuração no final ^^^^");

    }
}
