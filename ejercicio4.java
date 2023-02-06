import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);

        int numeroIf = myObj.nextInt();
        
        System.out.println("_");
        System.out.println("_");

        if(numeroIf<0){

            System.out.println(numeroIf +" Es Negativo");

        }else if(numeroIf>0){
            System.out.println(numeroIf +" Es Positivo");
        }else{
            System.out.println("Es 0");
        }

        System.out.println("_");
        System.out.println("Siguiente setencia de control While");
        System.out.println("_");

        int numeroWhile = -5;

        while(numeroWhile<3){

            System.out.println(numeroWhile);
            numeroWhile++;

        }

        System.out.println("_");
        System.out.println("Siguiente setencia de control Do While");
        System.out.println("_");

        int numeroDo = -1;

        do{
            System.out.println(numeroDo);
            numeroDo++;

        }while(numeroDo<3);

        System.out.println("_");
        System.out.println("Siguiente setencia de control For");
        System.out.println("_");

        int numeroFor;

        for(numeroFor =0; numeroFor<=3; numeroFor++){

            System.out.println(numeroFor);

        }

        System.out.println("_");
        System.out.println("Siguiente setencia de control Switch");
        System.out.println("_");

        System.out.println("Elige una estación del año");

        int numeroSwitch = myObj.nextInt();
        
        myObj.close();

        switch(numeroSwitch){

            case 1:
                System.out.println("Es Invierno");
                break;

            case 2:
                System.out.println("Es Primavera");
                break;

            case 3:
                System.out.println("Es Verano");
                break;

            case 4:
                System.out.println("Es Otoño");
                break;

            default:

                System.out.println("No has introducido ninguna estación");


        }

    }
     
}
