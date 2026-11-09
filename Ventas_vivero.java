import java.util.Scanner;

public class Ventas_vivero {
    public static void main(String[] args) {
        String[] plantas = {"Cactus", "Suculenta", "Maceta", "Tierra", "Fertilizante"};
        double[] precios = {45.5, 35.5, 60, 80, 95};
        int[] ventas = new int[5];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        double [][] montos = new double[5][6];

        System.out.println("Ingrese la cantidad de ventas para cada planta por semana:");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Ventas el dia " + dias[i] + ":");
            for (int j = 0; j < plantas.length; j++) {
                System.out.print(plantas[j] + ": ");
                ventas[j] += scanner.nextInt();
                montos[j][i] = ventas[j] * precios[j];
            }
        }
        
        System.out.println("ventas por dia");
        System.out.printf("%-14s", "");
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%12s", dias[i]);
        }
        System.out.println();
 
        for (int j = 0; j < plantas.length; j++) {
            System.out.printf("%-14s", plantas[j]);
            for (int i = 0; i < dias.length; i++) {
                System.out.printf("%12.2f", montos[j][i]);
            }
            System.out.println();
        }
        
        scanner.close();
    }

}
