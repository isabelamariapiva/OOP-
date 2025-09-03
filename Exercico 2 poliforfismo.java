package Exercício02;

public abstract class Funcionario {
    private long id;
    private String nome;
    private String telefone;
    private int matricula;
    private String endereco;

    public Funcionario(long id, String nome, String endereco, int matricula, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
        this.telefone = telefone;
    }

    public abstract void calculaSalario();
}


package Exercício02;

public class Horista extends Funcionario {
    private double valorHora;
    private int quantidadeHoras;

    public Horista(long id, String nome, String telefone, int matricula, String endereco, double valorHora, int quantidadeHoras) {
        super(id, nome, telefone, matricula, endereco);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    public void calculaSalario() {
        double salario = this.valorHora * (double)this.quantidadeHoras;
        System.out.println("Salário Horista: R$ " + salario);
    }
}


package Exercício02;

public class Jornada extends Funcionario {
    private double salarioHora;
    private double horasTrabalhadas;

    public Jornada(long id, String nome, String telefone, int matricula, String endereco, double salarioHora, double horasTrabalhadas) {
        super(id, nome, telefone, matricula, endereco);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calculaSalario() {
        double salario = this.salarioHora * this.horasTrabalhadas;
        System.out.println("Salário Jornada: R$ " + salario);
    }
}


package Exercício02;

public class PessoaJuridica extends Funcionario {
    private double valorBruto;
    private double imposto;

    public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco, double valorBruto, double imposto) {
        super(id, nome, telefone, matricula, endereco);
        this.valorBruto = valorBruto;
        this.imposto = imposto;
    }

    public void calculaSalario() {
        double salario = this.valorBruto - this.imposto;
        System.out.println("Salário Pessoa Jurídica: R$ " + salario);
    }
}


package Exercício02;

public class Principal {
    public static void main(String[] args) {
        Jornada jornada = new Jornada(1L, "João", "1111-1111", 101, "Rua A", (double)20.0F, (double)160.0F);
        Horista horista = new Horista(2L, "Maria", "2222-2222", 102, "Rua B", (double)30.0F, 120);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(3L, "Empresa Z", "3333-3333", 103, "Rua C", (double)10000.0F, (double)2500.0F);
        jornada.calculaSalario();
        horista.calculaSalario();
        pessoaJuridica.calculaSalario();
    }
}
