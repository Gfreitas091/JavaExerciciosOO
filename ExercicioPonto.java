package ExerciciosPOO;

public class Ponto {


    private int x;
    private int y;


    public void finalX(int valorX){
        x = valorX;
    }


    public void finalY(int valorY){
        y = valorY;
    }

    
    public void exibirCoordenadas(){
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

}