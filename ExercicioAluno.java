package ExerciciosPOO;

public class Aluno {

    private String nome;
    private int matricula;
    private double[] notas;


    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }


    public double calcularMedia() {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }


    public String getNome() {
        return nome;
    }


    public int getMatricula() {
        return matricula;
    }


    public double[] getNotas() {
        return notas;
    }


    public static void main(String[] args) {
        double[] notasAluno = {8.2, 9.4, 7.8, 8.2};
        Aluno aluno = new Aluno("Gustavo", 12345, notasAluno);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Notas:");
        for (double nota : aluno.getNotas()) {
            System.out.print(nota + " ");
        }
        System.out.println("\nMédia das notas: " + aluno.calcularMedia());
    }

    
}