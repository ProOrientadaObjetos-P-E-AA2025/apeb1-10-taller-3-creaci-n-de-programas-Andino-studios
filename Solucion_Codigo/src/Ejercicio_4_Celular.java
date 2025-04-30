public class Ejercicio_4_Celular {
    public static void main(String[] args) {
        String[] marcas = {"Xiaomi", "Samsung", "iPhone"};
        String marca = marcas[(int)(Math.random() * marcas.length)];
        double tamañoPantalla = Math.random() * 1.9 + 5.0;
        String sistemaOperativo;
        if (marca.equals("iPhone")) {
            sistemaOperativo = "iOS"; 
        } else {
            sistemaOperativo = "Android";  
        }
        double costoInicial = Math.random() * 1900 + 100;
        String direccionMac = String.format("00:1A:%02X:%02X:%02X:%02X", (int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        String informacionImei = String.format("IMEI-%d%d%d%d%d%d", (int)(Math.random() * 10), (int)(Math.random() * 10), (int)(Math.random() * 10), (int)(Math.random() * 10), (int)(Math.random() * 10), (int)(Math.random() * 10));
        Ejercicio_4_EquipoCelular celular = new Ejercicio_4_EquipoCelular(marca, sistemaOperativo, tamañoPantalla, costoInicial, direccionMac, informacionImei);
        System.out.println(celular.toString());
    }
}