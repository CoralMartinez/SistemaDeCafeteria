import java.util.ArrayList;
import java.util.Scanner;

public class MenuCliente{

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<String> pedido = new ArrayList<>();

        int opcion;
        double total = 0;

        do {

            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║       CAFETERÍA           ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Café Americano .... $30   ║");
            System.out.println("║ 2. Capuccino ......... $45   ║");
            System.out.println("║ 3. Frappé ............ $55   ║");
            System.out.println("║ 4. Dona .............. $20   ║");
            System.out.println("║ 5. Pastel ............ $40   ║");
            System.out.println("║ 0. Finalizar Pedido         ║");
            System.out.println("╚══════════════════════════════╝");

            System.out.print("Seleccione opción: ");
            opcion = leer.nextInt();

            switch(opcion){

                case 1:
                    pedido.add("Café Americano");
                    total += 30;
                    System.out.println("Producto agregado");
                    break;

                case 2:
                    pedido.add("Capuccino");
                    total += 45;
                    System.out.println("Producto agregado");
                    break;

                case 3:
                    pedido.add("Frappé");
                    total += 55;
                    System.out.println("Producto agregado");
                    break;

                case 4:
                    pedido.add("Dona");
                    total += 20;
                    System.out.println(" Producto agregado");
                    break;

                case 5:
                    pedido.add("Pastel");
                    total += 40;
                    System.out.println("Producto agregado");
                    break;

                case 0:

                    System.out.println("\nRESUMEN DEL PEDIDO");

                    for(String p : pedido){
                        System.out.println("- " + p);
                    }

                    System.out.println("Total: $" + total);
                    System.out.println("Gracias por su compra");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while(opcion != 0);

        leer.close();
    }
}