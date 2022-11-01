public class Main {
    public static void main(String[] args) {

        isPositive(3);
        isPositive(-1);

        System.out.println("Bucle While");
        numWhile();

        System.out.println("Bucle DoWhile: ");
        numDoWhile();

        System.out.println("Bucle For:");
        numFor();

        System.out.println("Estación actual en Chile:");
        estacionesCase();


    }

    public static void isPositive(int n){

        if (n > 0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }
    }

    public static void numWhile(){
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    public static void numDoWhile(){
        int numeroWhile = 0;
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);
    }

    public static void numFor(){
        for(int i=0; i <=3; i++){
            System.out.println(i);
        }
    }

    public static  void  estacionesCase(){
        String estaciones = "Primavera";

        switch (estaciones){
            case "Verano":{
                System.out.println("Es Verano");
                break;
            }
            case "Otono":{
                System.out.println("Es Otono");
                break;
            }
            case "Invierno":{
                System.out.println("Es Invierno");
                break;
            }
            case "Primavera":{
                System.out.println("Es Primavera");
                break;
            }

        }
    }
}