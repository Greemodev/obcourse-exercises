package tema9;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad("20");
        cliente.setNombre("Kurt");
        cliente.setTelefono("1111-1111-1111-1111");
        cliente.setCredito("$ 500");
        Trabajador trabajador = new Trabajador();
        trabajador.setSalario("$ 2000");

        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito de : " + cliente.getCredito());
        System.out.println("Salario del trabajador: " + trabajador.getSalario());


    }

    static class Persona{
        String edad;
        String nombre;
        String telefono;

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

    static class Cliente extends Persona{
        private String credito;

        public String getCredito() {
            return credito;
        }

        public void setCredito(String credito) {
            this.credito = credito;
        }
    }


    static class Trabajador extends Persona{
        private String salario;

        public String getSalario() {
            return salario;
        }

        public void setSalario(String salario) {
            this.salario = salario;
        }
    }
}
