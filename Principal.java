import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        Endereco end = new Endereco();
        Formacao f = new Formacao();
        Curso c = new Curso();
        
        String opc;
        do {
            System.out.println("\n..: Menu Principal :..");
            System.out.println("----------------------");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Mostrar os dados do aluno");
            System.out.println("4 - Mostrar os dados do professor");
            System.out.println("5 - Sair do sistema ");
            System.out.print("Digite uma opção: ");
            opc = ler.next();
            switch (opc) {
                case "1":
                    System.out.println("Nome do aluno: ");
                    String nome = ler.next();
                    a.setNome(nome); 
                    ler.next();
                    System.out.println("CPF: ");
                    String cpf = ler.nextLine();
                    while(cpf.length() != 11){
                        System.out.println("!CPF INVÁLIDO!");
                        cpf = ler.nextLine();
                    }
                    a.setCpf(cpf);
                    
                    System.out.println("Sexo do aluno: ");
                    String sexo = ler.nextLine();
                    a.setSexo(sexo);
                    
                    System.out.println("RA: ");
                    String ra = ler.nextLine();
                    Float RA = Float.parseFloat(ra);
                    a.setRa(RA);
                    
                    System.out.println("Dados do Curso");
                    System.out.println("Nome do Curso:");
                    String nomeCurso = ler.nextLine();
                    c.setNome(nomeCurso);
                    c.setMensalidade(nomeCurso);
                    
          
                    System.out.println("Endereço do aluno completo: ");
                    System.out.println("Rua:");
                    String rua = ler.nextLine();
                    end.setRua(rua);
                    
                    System.out.println("Número da rua:");
                    String numero = ler.nextLine();
                    int num = Integer.parseInt(numero);
                    end.setNumero(num);
                    
                    System.out.println("Bairro:");
                    String bairro = ler.nextLine();
                    end.setBairro(bairro);
                    
                    System.out.println("Cidade:");
                    String cidade = ler.nextLine();
                    end.setCidade(cidade);
                    
                    System.out.println("UF");
                    String uf = ler.nextLine();
                    end.setUF(uf);
                    a.setCurso(c);
                    a.setEndereco(end);
                    a.dadosAluno();
                      
                    break;
                case "2":
                	System.out.println("Nome do Professor: ");
                    String NomeProf = ler.nextLine();
                    p.setNome(NomeProf);
                    
                    System.out.println("CPF: ");
                    String CPF = ler.nextLine();
                    a.setCpf(CPF);
                    
                    System.out.println("Sexo do Professor: ");
                    String Sexo = ler.nextLine();
                    p.setSexo(Sexo);
                	
                    System.out.println("Endereço do Professor completo: ");
                    System.out.println("Rua:");
                    String Rua = ler.nextLine();
                    end.setRua(Rua);
                    
                    System.out.println("Número da rua:");
                    String numero1 = ler.nextLine();
                    int num1 = Integer.parseInt(numero1);
                    end.setNumero(num1);
                    
                    System.out.println("Bairro:");
                    String bairro1 = ler.nextLine();
                    end.setBairro(bairro1);
                    
                    System.out.println("Cidade:");
                    String cidade1 = ler.nextLine();
                    end.setCidade(cidade1);
                    
                    System.out.println("UF");
                    String uf1 = ler.nextLine();
                    end.setUF(uf1);
                    
                    System.out.println("Dados da Formação do Prof");
                    System.out.println("Nome: ");
                    String nomeF = ler.nextLine();
                    f.setNomecurso(nomeF);
                    
                    System.out.println("Carga Horária ");
                    String cargah = ler.nextLine();
                    int cargaH = Integer.parseInt(cargah);
                    f.setCargHorCurso(cargaH);
                    
                    System.out.println("Título: ");
                    String Titulo = ler.nextLine();
                    f.setTitulo(Titulo);
                    
                    System.out.println("Salario: ");
                    String Salario = ler.nextLine();
                    double salario = Double.parseDouble(Salario);
                    p.setSalario(salario);
                    p.setSalarioIR(salario);
                    p.setFormacao(f);
                    p.setEndereco(end);
                    p.dadosProfessor();
                    break;
                case "3":
                    a.dadosAluno();
                    break;
                case "4":
                    p.dadosProfessor();
                    break;
                case "5":
                    System.out.println("Saindo do sistema......");
                    opc = "0";
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        } while(opc != ("1") || opc != ("2") || opc != ("3") || opc != ("4") || opc != ("5"));
        ler.close();
       
    }
}