package array6;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int opcion;
        System.out.printf("---Bienvenido---");
        System.out.println("");
        
        System.out.printf("Introduzca el tamaño de la matriz:");
        N = Integer.parseInt(sc.nextLine());
        Matriz m = new Matriz(N);
        
        do{
            System.out.println("1- Mostrar matriz");
            System.out.println("2- Suma total");
            System.out.println("3- Suma diagonal");
            System.out.println("4- Suma del resto");
            System.out.println("5- Suma por fila");
            System.out.println("6- Salir");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                    m.muestraMatriz();
                    break;
                
                case 2:
                    System.out.printf("La suma total es: %d\n", m.suma());
                    break;
                    
                case 3:
                    System.out.printf("La suma de la diagonal es: %d\n", m.suma(true));
                    break;
                    
                case 4:
                    System.out.printf("La suma del resto de elementos es: %d\n", m.suma(false));
                    break;
                    
                case 5:
                    int fila;
                    System.out.printf("Seleccione una fila:");
                    fila = Integer.parseInt(sc.nextLine());
                    
                    System.out.printf("La suma de la fila %d es: %d\n", fila, m.suma(fila));
                    break;
                    
                case 6:
                    System.out.println("Gracias por participar");
                    break;
                    
                default:
                    break;
            
            }
        }while(opcion != 6);
        
        
        
        
        
        
//        Matriz m = new Matriz(5);
//        m.muestraMatriz();
//        System.out.println("");
//        System.out.printf("La suma de todos los elementos es: %d\n", m.suma());
//        System.out.printf("La suma de la diagonal es: %d\n", m.suma(true));
//        System.out.printf("La suma del resto es: %d\n", m.suma(false));
//        System.out.printf("La suma de la fila indicada es: %d\n", m.suma(4));

    }
    
}
