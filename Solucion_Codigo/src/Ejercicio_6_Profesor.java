public class Ejercicio_6_Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    public Ejercicio_6_Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.sueldoTotal = sueldoBasico * 1.20; 
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return String.format("Profesor: %s %s, Sueldo Básico: %.2f, Sueldo Total: %.2f, Cédula: %s",
                nombre, apellido, sueldoBasico, sueldoTotal, cedula);
    }
}
