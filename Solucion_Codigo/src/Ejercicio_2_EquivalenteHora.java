public class Ejercicio_2_EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;
    public Ejercicio_2_EquivalenteHora(int horas) {
        this.horas = horas;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }
    @Override
    public String toString() {
        return String.format("Horas: %d, Minutos: %d, Segundos: %d, Días: %d", horas, minutos, segundos, dias);
    }
}
