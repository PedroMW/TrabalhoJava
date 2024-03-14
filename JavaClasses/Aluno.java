public class Aluno extends Pessoa  {
    private float ra;

    private Curso curso;


    public Aluno() {
        super();
    }

    public Aluno(String cpf, String nome, String sexo, Endereco endereco, float ra) {
        super(cpf, nome, sexo, endereco);
        this.ra = ra;


    }

    public void dadosAluno() {
        System.out.println("\nMostrando os dados digitados:");
        System.out.println("\nAluno\n-----------------\nCPF: " +
                getCpf() + "\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nRA: " + getRa() +
                "\nRua: " + getEndereco().getRua() +
                "\nNumero: " + getEndereco().getNumero() +
                "\nBairro: " + getEndereco().getBairro() +
                "\nCidade: " + getEndereco().getCidade() +
                "\nUF: " + getEndereco().getUF() +
                "\nNome do Curso: " + getCurso().getNome() +
                "\nMensalidade do curso: " + getCurso().getMensalidade() +
                "\nCarga Horária do curso: " + getCurso().getCargaHR());
    }

    // O erro que continha neste metodo VOID foi a falta de fazer ligação com a classe pessoa
    // Foi só fazer "extends <classeImaginaria> e pronto





    public float getRa() {
        return this.ra;
    }

    public void setRa(float ra) {
        this.ra = ra;
    }

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}




}
