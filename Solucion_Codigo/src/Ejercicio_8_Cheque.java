public class Ejercicio_8_Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    public Ejercicio_8_Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.comisionBanco = valorCheque * 0.00003; 
    }
    @Override
    public String toString() {
        return String.format("Cheque: Cliente: %s, Banco: %s, Valor Cheque: %.2f, Comisión Banco: %.2f", 
                nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
