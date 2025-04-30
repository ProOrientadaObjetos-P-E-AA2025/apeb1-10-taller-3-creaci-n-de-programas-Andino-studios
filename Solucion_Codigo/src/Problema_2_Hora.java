public class Problema_2_Hora {
    public static void main(String[] args) {
        int horas = (int)(Math.random() * 100);
        Ejercicio_2_EquivalenteHora equivalente = new Ejercicio_2_EquivalenteHora(horas);
        System.out.println(equivalente.toString());
    }
}
