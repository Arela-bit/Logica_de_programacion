import java.util.*;
public class Examen2Parcial_Manrique_Fernanda {
   public static void main(String[] args) {
       String[] nombres = new String[]{"Chocolate", "Paleta", "Gomitas", "Galletas"};
       int[] precios = new int[]{18, 12, 25, 15};
       int[] vendidos = new int[4];
       ArrayList<String> clientes = new ArrayList<>();
       double totalGeneral = 0;
      
       Scanner sc = new Scanner(System.in);
       int numClientes;
       do {
           System.out.print("Ingrese el número de clientes: ");
           numClientes = sc.nextInt();
       } while (numClientes <= 0);
       sc.nextLine();
       
       for (int i = 1; i <= numClientes; i++) {
           System.out.print("Nombre del cliente " + i + ": ");
           clientes.add(sc.nextLine());
           double totalCliente = 0;
           String otro;
         
           do {
               System.out.println("1) Chocolate $18  2) Paleta $12  3) Gomitas $25  4) Galletas $15");
               int codigo;
               do {
                   System.out.print("Código (1-4): ");
                   codigo = Integer.parseInt(sc.nextLine());
               } while (codigo < 1 || codigo > 4);
               int cantidad;
               do {
                   System.out.print("Cantidad: ");
                   cantidad = Integer.parseInt(sc.nextLine());
               } while (cantidad <= 0);
               int indice = 0;
              
               switch (codigo) {
                   case 1: indice = 0; break;
                   case 2: indice = 1; break;
                   case 3: indice = 2; break;
                   case 4: indice = 3; break;
               }
               totalCliente += precios[indice] * cantidad;
               vendidos[indice] += cantidad;
               System.out.print("¿Agregar otro producto? (s/n): ");
               otro = sc.nextLine();
           } while (otro.equalsIgnoreCase("s"));
           System.out.println("Total de " + clientes.get(i - 1) + ": $" + totalCliente);
           totalGeneral += totalCliente;
       }

       System.out.println("\nProducto\tPrecio\tVendidos\tImporte");
       for (int i = 0; i < 4; i++) {
           System.out.println(nombres[i] + "\t$" + precios[i] + "\t" + vendidos[i]
                   + "\t\t$" + (precios[i] * vendidos[i]));
       }
      

       System.out.println("\n Reporte final ");
       System.out.println("Clientes atendidos: " + clientes.size());
       System.out.println("Clientes: " + clientes);
       System.out.println("Total recaudado: $" + totalGeneral);
       System.out.println("Promedio de dinero por cliente: $" + (totalGeneral / clientes.size()));
   }
}