package array1;
import java.util.Random;
/**
 *
 * @author fbarcala0
 */
public class Array1 {
    
    /*Creamos el array al que llamamos vector que genera números aleatorios
    entre 1000 y 5000*/
    public static int[] vector(int n){
        int[] nums = new int[n];
        Random r = new Random();
        int max = 5000;
        int min = 1000;
        for(int i = 0; i < nums.length; i++){
            nums[i] = r.nextInt((max-min)+1) + min;
        }
        return nums;
    }
    
    // Funcion para mostrar los datos con un for mejorado
    public static void mostrar(int[]vector){
        for(int n:vector){
            System.out.printf("%d, ", n);
        }
    }
    
    public static int vectorinoMax(int[]vector){
        // Iniciamos con un valor de una posición del vector para evitar problemas de inicialización
        int max = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(max < vector[i])
                max = vector[i];
        }
        return max;
    }
    
    public static int vectorinoMin(int[]vector){
        int min = vector[0];
        for(int num:vector){
            if(min > num)
                min = num;
        }
        return min;
    }
    
    /*En esta funcion primero comprobamos que esta entre los 
    valores y si no es asi, devolvemos false*/
    public static boolean vectorinoTF(int[]vector,int n,int m){
        if(n < 0 || m < 0 || n >= vector.length || m >= vector.length)
            return false;
        
        //Metemos uno de los dos en una variable para hacer el cambio acto seguido
        int temp = vector[m];
        vector[m] = vector[n];
        vector[n] = temp;
        return true;
    }
    
    
    
    public static void main(String[] args) {
        int[]vectorino = vector(30);
        mostrar(vectorino);
        System.out.printf("Máximo: %d\n", vectorinoMax(vectorino));
        System.out.printf("Mínimo: %d\n", vectorinoMin(vectorino));
        if(vectorinoTF(vectorino,0,30))
            mostrar(vectorino);
    }
    
}
