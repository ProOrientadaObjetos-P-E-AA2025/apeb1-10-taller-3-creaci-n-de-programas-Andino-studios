public class Ejercicio_5_Estudiante {
    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private String estado;
    public Ejercicio_5_Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
        this.promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
        this.estado = (promedio >= 6.5) ? "Aprobado" : "Reprobado";
    }
    @Override
    public String toString() {
        return String.format("Estudiante: %s, Promedio: %.2f, Estado: %s", nombre, promedio, estado);
    }
}
