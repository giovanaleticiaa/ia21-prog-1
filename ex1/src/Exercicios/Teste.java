package Exercicios;

public class Teste {

    public static void main(String[] args) {
        // Teste Bola
        Bola bolinha = new Bola("rosa", "plastico", 45.2);
        System.out.println("A bola é de cor " + bolinha.mostrarCor());
        bolinha.trocarCor("azul");
        System.out.println("A nova cor da bola é " + bolinha.mostrarCor());
        
        //Teste Quadrado
        Quadrado gigi = new Quadrado(100);
        System.out.println("\nO tamanho do quadrado é " + gigi.retornarValor());
        gigi.mudarValor(50);
        System.out.println("O tamanho do quadrado é " + gigi.retornarValor());
        gigi.calcularArea();
        System.out.println("O tamanho do quadrado é " + gigi.retornarValor());
        
       
        //Teste Pessoa
        Pessoa gigica = new Pessoa("Giovana", 60.2, 1.68, 16);
        System.out.println("\nO nome da Pessoa é " + gigica.Nome() + "!");
        System.out.println("E " + gigica.Nome() + " está com " + gigica.Envelhecer() + " anos.");
        System.out.println("Está com " + gigica.Engordar() + "Kg.");
        System.out.println(gigica.Nome() + " Tem " + gigica.Crescer() + " metros.");
        
        //Teste TV
        
        
    }
}
