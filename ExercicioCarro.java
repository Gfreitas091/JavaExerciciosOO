package ExerciciosPOO;

import java.time.LocalDate;

public class Carro {


    private String modelo;
    private String ano;
    private String cor;
    private boolean ligado;


    public Carro(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }


    public void ligarCarro(){
        if (!ligado){
            ligado = true;
            System.out.println("O Carro foi ligado");
        } else {
            System.out.println("O Carro já está ligado");
        }
    }


    public void desligarCarro(){
        if (ligado){
            ligado = false;
            System.out.println("O carro foi desligado");
        } else {
            System.out.println("O carro já está desligado");
        }
    }


    public void exibirInformacoes(){
        System.out.println("Informações do carro: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Modelo: " + ano);
        System.out.println("Modelo: " + cor);
        System.out.println("Modelo: " + (ligado ? "ligado" : "desligado"));
    }


    public static void main(String[] args) {
        Carro carro = new Carro("Onix","2018","Preto");

        carro.ligarCarro();
        carro.exibirInformacoes();

        carro.desligarCarro();
        carro.exibirInformacoes();
    }


}