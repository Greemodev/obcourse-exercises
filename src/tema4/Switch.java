package exercises;

public class Switch {
    public static void main(String[] args) {

        String estacion = "Invierno";
        switch (estacion){
            case "Verano":
                System.out.println("Es verano!");
                break;

            case "Otoño":
                System.out.println("Es otoño!");
                break;

            case "Invierno":
                System.out.println("Es invierno!");
                break;

            case "Primavera":
                System.out.println("Es primavera!");
                break;

            default:
                System.out.println(estacion);

        }

    }
}
