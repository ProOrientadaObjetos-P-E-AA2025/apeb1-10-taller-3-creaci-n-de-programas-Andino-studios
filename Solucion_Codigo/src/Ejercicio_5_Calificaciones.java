public class Ejercicio_5_Calificaciones {
    public static void main(String[] args) {
        String[] nombres = {"Juan Pérez", "Ana López", "Carlos Sanchéz", "Sofía Martínez", "Luis Rodríguez", "Marta Sánchez", "Pedro Fernández", "Laura Gómez", "Ricardo Díaz", "Patricia Moreno"};
        String nombreEstudiante = nombres[(int)(Math.random() * nombres.length)];
        double calificacionMateria1 = Math.random() * 10;
        double calificacionMateria2 = Math.random() * 10;
        double calificacionMateria3 = Math.random() * 10;
        Ejercicio_5_Estudiante estudiante = new Ejercicio_5_Estudiante(nombreEstudiante, calificacionMateria1, calificacionMateria2, calificacionMateria3);
        System.out.println(estudiante.toString());
    }
}
