package tema8;

public class Main {
    public static void main(String[] args){

        Persona persona = new Persona();
        persona.setEdad("90");
        persona.setNombre("Jimmy");
        persona.setTelefono("00000-0000-0000");
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }

    static class Persona{

        private String edad;
        private String nombre;
        private String telefono;

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

}
