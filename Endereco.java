
public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String UF;


    public Endereco() {

    }

    public Endereco(String rua, int numero, String bairro, String cidade, String UF) {

        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {

        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public String getUF() {
        return this.UF;
    }

    public void setUF(String UF) {

        this.UF = UF;
    }


}
