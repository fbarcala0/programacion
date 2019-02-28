package array5;
import java.util.Scanner;

public class Array5 {
    
    public static void main(String[] args) {  // que repita -> done
        Scanner sc = new Scanner(System.in);
        int ano;
        char res;
        do{
            System.out.printf("Introduzca un año:");
            ano = Integer.parseInt(sc.nextLine());
            Ventas v = new Ventas(ano);
            v.grafica();
            System.out.printf("La media es de: %.3f\n", v.media());
            System.out.println("");
            System.out.printf("Desea repetir?s/n:");
            res = sc.nextLine().charAt(0);
        }while(res == 's');
    }
    
}
