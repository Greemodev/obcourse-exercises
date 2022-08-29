package funcion;

public class Suma {
    public static void main(String[] args) {
        // Llamar a la funcion en main y darle valores
        suma(10, 10, 10);
    }
        // Crear una funcion con 3 parametros numeros que se sumen
    private static void suma(int a, int b, int c) {
        int Resultado;
        Resultado = a + b +c;
        System.out.println("Total: " + Resultado);
    }
}
