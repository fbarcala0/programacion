package array3;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author fbarcala0
 */
public class Array3 {
    public static ArrayList<Integer> vector(int n){
        ArrayList<Integer> aleatorio = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            Random r = new Random();
            int max = 5000; int min = 1000;
            aleatorio.add(r.nextInt((max - min) + 1 ) + min);
        }
        return aleatorio;
    }
    
    public static void mostrar(ArrayList<Integer> n){
        for(int num:n){
            System.out.printf("%d\n", num);
        }
    }
    
    public static int vectorinoMax(ArrayList<Integer> n){
        int max = n.get(0);
        for(int i = 0; i < n.size();i++){
            if(n.get(i) > max){
                max = n.get(i);
            }
        }
        return max;
    }
    
    public static int vectorinoMin(ArrayList<Integer> n){
        int min = n.get(0);
        for(int num:n){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
    
    public static boolean vectorinoTF(ArrayList<Integer> n, int i, int j){
        if(i < 0 || j < 0){
            return false;
        }
        if(i >= n.size() || j >= n.size()){
            return false;
        }
        
        int temp = n.get(i);
        n.set(i,n.get(j));
        n.set(j, temp);
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = vector(10);
        mostrar(array);
        
        System.out.printf("El mínimo es: %d\n", vectorinoMin(array));
        System.out.printf("El máximo es: %d\n", vectorinoMax(array));
        
        if(vectorinoTF(array,0,9)){
            mostrar(array);
        }
    }
    
}
