public class Ejercicio_4_EquipoCelular {
    private String marca;
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double iva;
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    public Ejercicio_4_EquipoCelular(String marca, String sistemaOperativo, double tamañoPantalla, double costoInicial, String direccionMac, String informacionImei) {
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.iva = costoInicial * 0.12; 
        this.costoFinal = costoInicial + iva; 
        this.direccionMac = direccionMac;
        this.informacionImei = informacionImei;
    }
    @Override
    public String toString() {
        return String.format("Equipo Celular: Marca: %s, SO: %s, Pantalla: %.2f pulgadas, Costo Inicial: %.2f, Costo Final: %.2f, MAC: %s, IMEI: %s",
                marca, sistemaOperativo, tamañoPantalla, costoInicial, costoFinal, direccionMac, informacionImei);
    }
}