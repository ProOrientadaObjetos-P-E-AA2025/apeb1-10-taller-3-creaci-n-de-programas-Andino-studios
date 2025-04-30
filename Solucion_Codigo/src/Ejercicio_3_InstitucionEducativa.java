public class Ejercicio_3_InstitucionEducativa {
    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;
    public Ejercicio_3_InstitucionEducativa(String nombre, String tipo, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        this.presupuesto = numeroAlumnos * gastosProyectadosPorEstudiante; 
    }
    @Override
    public String toString() {
        return String.format("Institución: %s, Tipo: %s, Alumnos: %d, Docentes: %d, Sedes: %d, Gasto Estudiante: %.2f, Presupuesto: %.2f",
                nombre, tipo, numeroAlumnos, numeroDocentes, numeroSedes, gastosProyectadosPorEstudiante, presupuesto);
    }
}