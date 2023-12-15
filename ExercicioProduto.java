package ExerciciosPOO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeDisponivel;

    public Produto(String nome, double preco, int quantidadeDisponivel) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void realizarCompra(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            quantidadeEmEstoque += quantidadeComprada;
            System.out.println(quantidadeComprada + " Unidades de " + nome + " foram compradas.");
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade Disponivel: " + quantidadeDisponivel);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Mouse", 2.5, 70); 

        produto.exibirInformacoes();

        produto.realizarCompra(20);

        produto.exibirInformacoes();
    }
}