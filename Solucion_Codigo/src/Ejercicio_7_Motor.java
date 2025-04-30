public class Ejercicio_7_Motor {
     public static void main(String[] args) {
        String[] marcas = {"Toyota", "Camaro", "Chevrolet", "Nissan"};
        double[] valores = {18000, 22000, 30000, 35000, 40000, 45000, 50000};
        String cedula = String.format("%010d", (long)(Math.random() * 10000000000L));
        String marca = marcas[(int)(Math.random() * marcas.length)];
        int anio = (int)(Math.random() * (2024 - 1990 + 1)) + 1990;
        double valor = valores[(int)(Math.random() * valores.length)];
        Ejercicio_7_AutoMotor auto = new Ejercicio_7_AutoMotor(cedula, marca, anio, valor);
        System.out.println(auto);
    }
}
