package objectpackage;

public class Car {
    public static void main(String[] args) {
        Uno sumar = new Uno();
        sumar.doors();
        sumar.sumaruno();
        System.out.println("Nueva puerta, total puertas: " + sumar.uno);
    }
    static class Uno{
        public int uno = 0;
        public void doors(){
        int i;
        for (i=0; i < 4; i++);
        uno = i;
        System.out.println("Puertas del coche: " + uno);
    }
        public void sumaruno() {
            this.uno++;
        }
    }
}
