package praticaeranca;

   
public class Empregado {
    
    private int codigo;
    private String nome, email;
    private double salario;
    
public Empregado (int cod, String nom, String mail, double sal) {
    this.codigo = cod;
    this.nome = nom;
    this.email = mail;
    this.salario = sal;
}

public double getSalario(){
    return this.salario;
}

public double aumentoSalario (double percentual){
    return this.salario * (percentual / 100);
}

}
