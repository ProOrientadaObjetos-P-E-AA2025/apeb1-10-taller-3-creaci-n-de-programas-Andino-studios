public class Ejercicio_7_AutoMotor {
    private String cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    public Ejercicio_7_AutoMotor(String cedulaDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;

        int aniosAntiguedad = 2025 - anioFabricacion;
        this.valorMatricula = valorVehiculo * 0.00002 * aniosAntiguedad;
    }
    @Override
    public String toString() {
        return String.format("""
            Cédula del Dueño: %s
            Marca del Vehículo: %s
            Año de Fabricación: %d
            Valor del Vehículo: $%.2f
            Valor de la Matrícula: $%.2f
            """, cedulaDuenio, marcaVehiculo, anioFabricacion, valorVehiculo, valorMatricula);
    }
}
