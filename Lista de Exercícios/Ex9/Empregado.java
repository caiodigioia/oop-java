public class Empregado {

    // declaração de atributos
    private String primeiro_nome, sobrenome;
    private double salario;

    // construtor
    public Empregado (String primeiro_nome, String sobrenome, double salario) {
        setPrimeiroNome(primeiro_nome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }

    // métodos acessores
    public void setPrimeiroNome (String novo_primeiro_nome) {
        primeiro_nome = novo_primeiro_nome;
    }

    public String getPrimeiroNome () {
        return primeiro_nome;
    }

    public void setSobrenome (String novo_sobrenome) {
        sobrenome = novo_sobrenome;
    }

    public String getSobrenome () {
        return sobrenome;
    }

    public void setSalario (double novo_salario) {
        if (novo_salario >= 0) {
            salario = novo_salario;
        }
    }

    public double getSalario () {
        return salario;
    }

    public void aumentaSalario (double aumento) {
        salario = salario + (salario * (aumento / 100));
    }

    public String toString () {
        return new String("Nome: " + getPrimeiroNome() + "\n" +
                          "Sobrenome: " + getSobrenome() + "\n" +
                          "Salário: " + "R$" + getSalario());
    }
}
