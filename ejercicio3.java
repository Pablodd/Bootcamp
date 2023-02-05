public class ejercicio3{

    public static void main(String[]args){

        int resultado;

        resultado = suma(1,2,3);

        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        

        System.out.println(miCoche.nPuertas);
    }

    private static int suma(int i, int j, int k) {


        return i + j + k;
    }

    

}

class Coche {
    public int nPuertas = 0;

    public void sumarPuertas(){

        this.nPuertas++;

    }

}