import java.util.Scanner;

public class MenuCliente {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion = -1;

        while(opcion != 0){

            System.out.println("\n====================");
            System.out.println("CAFETERIA");
            System.out.println("====================");
            System.out.println("1. Cafe Americano");
            System.out.println("2. Capuccino");
            System.out.println("3. Frappe");
            System.out.println("4. Dona");
            System.out.println("5. Pastel");
            System.out.println("6. Sandwich");
            System.out.println("7. Sincronizadas");
            System.out.println("0. Salir");

            System.out.print("Selecciona opcion: ");

            opcion = leer.nextInt();

            if(opcion == 1){
                System.out.println("Cafe Americano agregado");
            }

            else if(opcion == 2){
                System.out.println("Capuccino agregado");
            }

            else if(opcion == 3){
                System.out.println("Frappe agregado");
            }

            else if(opcion == 4){
                System.out.println("Dona agregada");
            }

            else if(opcion == 5){
                System.out.println("Pastel agregado");
            }

            else if(opcion == 6){
                System.out.println("Sandwich agregado");
            }

            else if(opcion == 7){
                System.out.println("Sincronizadas agregadas");
            }

            else if(opcion == 0){
                System.out.println("Gracias por su compra");
            }

            else{
                System.out.println("Opcion invalida");
            }

        }

        leer.close();

    }

}