public class Main {
    public static void main(String[] args) {

        System.out.println("Esto es una persona");
        Persona p = new Persona();

        p.setEdad(27);
        p.setNombre("Pablo Aravena");
        p.setTelefono("+56912345678");


        System.out.println("La persona se llama: "+p.getNombre()+", tiene "+p.getEdad()+" años y su teléfono es: "+p.getTelefono());
    }
}

class Persona{
    int edad;
    String telefono;
    String nombre;

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}