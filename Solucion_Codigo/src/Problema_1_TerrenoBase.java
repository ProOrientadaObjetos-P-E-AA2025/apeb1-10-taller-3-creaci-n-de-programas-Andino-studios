public class Problema_1_TerrenoBase {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valor) {
        this.valorMetroCuadrado = valor;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costoTerreno = valorMetroCuadrado * area;
    }

    @Override
    public String toString() {
        return String.format("Ancho: %.2f m\nLargo: %.2f m\nÁrea: %.2f m²\nValor por metro: $%.2f\nCosto total: $%.2f",
                ancho, largo, area, valorMetroCuadrado, costoTerreno);
    }
}
