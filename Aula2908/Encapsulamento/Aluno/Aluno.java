package Aula2908.Encapsulamento.Aluno;

public class Aluno {
    private String nome;
    private double Nota1;
    private double Nota2;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void setNota1(double Nota1){
        if(Nota1 >=0 && Nota1 <=10){
            this.Nota1 = Nota1;
        }else{
            System.out.println("Nota 1 inválida! A nota deve estar entre 0 e 10.");
        }
    }

    public void setNota2(double Nota2){
        if(Nota2 >=0 && Nota2 <=10){
            this.Nota2 = Nota2;
        }else{
            System.out.println("Nota 2 inválida! A nota deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia(){
        return (Nota1 + Nota2) / 2;
    }

    public void mostrarDados(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + Nota1);
        System.out.println("Nota 2: " + Nota2);
        System.out.println("Média: " + calcularMedia());
    }
}
