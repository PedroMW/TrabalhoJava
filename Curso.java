public class Curso implements Mensalidade {
    private String nome;
    private double mensalidade;

    private int cargaHR;
    
    double mensal;

    public Curso() {
        super();
    }

    public Curso(String nome, double mensalidade, int cargaHR) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.cargaHR = cargaHR;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getCargaHR() {
        return cargaHR;
    }

    public void setCargaHR(int cargaHR) {
        this.cargaHR = cargaHR;
    }

    public void setMensalidade(String nome){

        if (nome.equals ("tecnologo"))
        {
            mensal = mensalidade1;
            cargaHR = 2000;
        }
        else if (nome.equals("bacharelado"))
        {
            mensal = mensalidade2;
            cargaHR = 3000;
        }
        else if (nome.equals ("licenciado"))
        {
            mensal = mensalidade3;
            cargaHR = 3400;
        }

        setCargaHR(cargaHR);
        this.mensalidade = mensal;
    }

    public double getMensalidade(){
        return mensalidade;
    }
    @Override
    public double Mens(double mes){return 0;}



}
