public class Ejercicio_6_Sueldo {
    public static void main(String[] args) {
        String nombreProfesor = "Carlos";
        String apellidoProfesor = "García";
        double sueldoBasico = Math.random() * 4000 + 1000;  
        String cedula = String.format("%010d", (int)(Math.random() * 10000000000L)); 
        Ejercicio_6_Profesor profesor = new Ejercicio_6_Profesor(nombreProfesor, apellidoProfesor, sueldoBasico, cedula);
        System.out.println(profesor.toString());
    }
}