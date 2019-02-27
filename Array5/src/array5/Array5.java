package array5;
import java.util.Scanner;

public class Array5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.printf("Introduzca un año:");
        ano = Integer.parseInt(sc.nextLine());
        Ventas v = new Ventas(ano);
        v.grafica();
        System.out.printf("La media es de: %.3f\n", v.media(ano));
    }
    
}
