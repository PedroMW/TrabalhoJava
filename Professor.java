public class Professor extends Pessoa implements Imposto{
    private Formacao formacao;
    private int cargHoraTrabalho;
    private double salario;
    private double salarioIR;

    public Professor() {
        super();
    }

    public Professor(String cpf, String nome, String sexo, Endereco endereco, Formacao formacao, int cargHoraTrabalho, double salario, double salarioIR) {
        super(cpf, nome, sexo, endereco);
        this.formacao = formacao;
        this.cargHoraTrabalho = cargHoraTrabalho;
        this.salario = salario;
        this.salarioIR = salarioIR;
    }

    public Formacao getFormacao() {
        return this.formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public int getCargHoraTrabalho() {
        return this.cargHoraTrabalho;
    }

    public void setCargHoraTrabalho(int cargHoraTrabalho) {

        this.cargHoraTrabalho = cargHoraTrabalho;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public double getSalarioIR() {
        return this.salarioIR;
    }

    public void setSalarioIR(double salario) {
        if (salario <= 1903.98) {
            salario -= 0.0;
        } else if (salario <= 2826.65) {
            salario -= 142.8;
        } else if (salario <= 3751.05) {
            salario -= 354.8;
        } else if (salario <= 4664.68) {
            salario -= 636.13;
        } else {
            salario -= 869.36;
        }

        this.salarioIR = salario;
    }



    public void dadosProfessor() {
        System.out.println("\n Mostrando os dados digitados:");
        System.out.println("\n Professor\n-----------------\nCPF: " +
                            "\nNome: " + getNome() +
                            "\nSexo: "+ getSexo()  +
                            "\nFormação: "+ getFormacao()  +
                            "\nCarga horária de trabalho: "+ getCargHoraTrabalho()  +
                            "\nSalário: " + getSalario() +
                            "\nSalário líquido: "+ getSalarioIR()+
                            "\nRua: " + getEndereco().getRua() +
                            "\nNumero: " + getEndereco().getNumero()+
                            "\nBairro: " +getEndereco().getBairro()+
                            "\nCidade: " +getEndereco().getCidade() +
                            "\nUF: " +getEndereco().getUF() );
    }

    public double IR(double salario) {
        return salario - this.salarioIR;
    }
}
