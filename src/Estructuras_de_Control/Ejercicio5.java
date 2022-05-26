package Estructuras_de_Control;

public class Ejercicio5 {
    public static void main(String[] args) {
        var estacion = "Invierno";

        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en Primavera");
            case "Verano":
                System.out.println("Estamos en Verano");
            case "Otoño":
                System.out.println("Estamos en Otoño");
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println();
        }
    }
}
