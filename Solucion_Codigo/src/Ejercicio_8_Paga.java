public class Ejercicio_8_Paga {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "María", "Pedro", "Ana", "Juan", "Laura", "Luis", "Sofía", "Ricardo", "Carmen"};
        String[] apellidos = {"González", "Pérez", "Rodríguez", "López", "Martínez", "Hernández", "García", "Fernández"};
        
        String nombreCliente = nombres[(int)(Math.random() * nombres.length)] + " " + 
                               apellidos[(int)(Math.random() * apellidos.length)];
        String[] bancos = {"Banco de Loja", "Banco de Guayaquil", "Banco Pichincha"};
        String nombreBanco = bancos[(int)(Math.random() * bancos.length)];
        double valorCheque = Math.random() * 10000 + 500;
        Ejercicio_8_Cheque cheque = new Ejercicio_8_Cheque(nombreCliente, nombreBanco, valorCheque);
        System.out.println(cheque.toString());
    }
}
