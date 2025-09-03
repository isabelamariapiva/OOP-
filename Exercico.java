package Exercício01;

public interface Computador {
    void ligar();

    void reiniciar();

    void desligar();

    void carregandoSistema();
}


package Exercício01;

public class Gamer implements Exercício01.Computador {
    public Gamer() 
    public void ligar()

    public void reiniciar() 
    public void desligar() 

    public void carregandoSistema() 
}


package Exercício01;

public class Home implements Computador {
    public void ligar() {
        System.out.println("Home: Ligando o Sistema...");
    }

    public void reiniciar() {
        System.out.println("Home: Reiniciando o sistema...");
    }

    public void desligar() {
        System.out.println("Home: Desligando o sistema...");
    }

    public void carregandoSistema() {
        System.out.println("Home: Carregando o sistema...");
    }
}


package Exercício01;

public class Principal {
    public static void main(String[] args) {
        Computador gamer = new Gamer();
        gamer.ligar();
        gamer.reiniciar();
        gamer.desligar();
        gamer.carregandoSistema();
        System.out.println();
        Computador home = new Home();
        home.ligar();
        home.reiniciar();
        home.desligar();
        home.carregandoSistema();
    }
}

