package ExerciciosPOO;

public class Livro {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.println("Informações sobre o livro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de paginas: " + paginas);
    }

    public static void main(String[] args){
        Livro livro = new Livro("É assim que acaba",
                "Collen Hoover",
                288);
    }
}