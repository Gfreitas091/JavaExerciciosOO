package ExerciciosPOO;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;


    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double calcularArea() {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }


    public String verificarTipo() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }


    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 5, 5);

        double area = triangulo.calcularArea();
        String tipo = triangulo.verificarTipo();

        System.out.println("Área do triângulo: " + area);
        System.out.println("Tipo do triângulo: " + tipo);
    }

    
}