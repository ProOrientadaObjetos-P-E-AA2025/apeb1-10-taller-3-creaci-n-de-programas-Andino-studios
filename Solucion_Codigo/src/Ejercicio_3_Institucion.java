public class Ejercicio_3_Institucion {
    public static void main(String[] args) {
        String[] instituciones = {"La Dolorosa", "La Salle Loja", "Santa Mariana de Jesús"};
        String nombreInstitucion = instituciones[(int)(Math.random() * instituciones.length)];
        String tipo = "Privada"; 
        int numeroAlumnos = (int)(Math.random() * 2000) + 500; 
        int numeroDocentes = (int)(Math.random() * 100) + 20;  
        int numeroSedes = (int)(Math.random() * 5) + 1;  
        double gastosProyectadosPorEstudiante = Math.random() * 1000 + 500;
        Ejercicio_3_InstitucionEducativa institucion = new Ejercicio_3_InstitucionEducativa(
            nombreInstitucion, tipo, numeroAlumnos, numeroDocentes, numeroSedes, gastosProyectadosPorEstudiante
        );
        System.out.println(institucion.toString());
    }
}