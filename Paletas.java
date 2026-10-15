import java.util.Scanner;

public class Paletas {
    public static void main(String[] args) {
        int fresa = 15;
        int limon = 12;
        int coco = 18;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ventas Dia 1");
        System.out.println("Paletas de fresa vendidas: ");
        int fresaVendidas = scanner.nextInt();
        System.out.println("Paletas de limon vendidas: ");
        int limonVendidas = scanner.nextInt();
        System.out.println("Paletas de coco vendidas: ");
        int cocoVendidas = scanner.nextInt();

        int totalDia1 = (fresa * fresaVendidas) + (limon * limonVendidas) + (coco * cocoVendidas);
        System.out.println("Total de ventas del día 1: " + totalDia1);

        System.out.println("Ventas Dia 2");
        System.out.println("Paletas de fresa vendidas: ");
        int fresaVendidas2 = scanner.nextInt();
        System.out.println("Paletas de limon vendidas: ");
        int limonVendidas2 = scanner.nextInt();
        System.out.println("Paletas de coco vendidas: ");
        int cocoVendidas2 = scanner.nextInt();

        int totalDia2 = (fresa * fresaVendidas2) + (limon * limonVendidas2) + (coco * cocoVendidas2);
        System.out.println("Total de ventas del día 2: " + totalDia2);

        int totalGeneral = totalDia1 + totalDia2;
        System.out.println("Total de ventas de los dos días: " + totalGeneral);
    }

}
