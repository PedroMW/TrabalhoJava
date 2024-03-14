

public  abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected String sexo;
    protected Endereco endereco;

    public Pessoa(){
        super();
    }

    public Pessoa(String cpf, String nome, String sexo, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;

    }

    public Endereco getEndereco() {
        return this.endereco;
    }
}
