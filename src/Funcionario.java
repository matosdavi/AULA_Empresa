import java.util.Scanner;

public class Funcionario {

    public String nome;
    public String matricula;
    public String cargo;
    public double salario_hora;
    public double quantidade_hora;

    public void mostrarDados() {
        System.out.println("Nome: " + nome +
                "\nMatrícula: " + matricula +
                "\nCargo: " + cargo +
                "\nSalário p/ Hora: " + salario_hora +
                "\nCarga horária: " + quantidade_hora +
                "\nSalário calculado: " + calcularSalario());
    }

    public double calcularSalario() {
        return (salario_hora * quantidade_hora);
    }

    public void entradaDeDados() {
        Scanner entrada = new Scanner(System.in);

        imprime("Informe o nome do funcionário: ");
        nome = entrada.nextLine();

        imprime("Informe o número da matrícula do funcionário: ");
        matricula = entrada.nextLine();

        imprime("Informe o cargo do funcionário: ");
        cargo = entrada.nextLine();

        imprime("Informe o salário por hora do funcionário: ");
        salario_hora = Double.parseDouble(entrada.nextLine());

        imprime("Informe a quantidade de horas trabalhadas do funcionário: ");
        quantidade_hora = Double.parseDouble(entrada.nextLine());
    }

    static void imprime(String msg) {
        System.out.print(msg);
    }
}