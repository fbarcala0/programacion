package array2;
import java.util.Random;
/**
 *
 * @author fbarcala0
 */

//Creamos un array con una dimensión más, n y m en este caso
public class Array2 {
     public static char[][] matriz(int n, int m){
        char[][] nums = new char[n][m];
        Random r = new Random();
        int max = 90;
        int min = 65;
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (char)(r.nextInt((max-min)+1)+min);
               // nums[i][j] = (char)(r.nextInt(25)+'A');
            }
        }
        return nums;
     }
     
    public static void mostrar(char[][]matriz){
        for(char[] letras: matriz){
            for(char l: letras){
                    System.out.printf("%s, ", l);
            }
        }
        /*for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.printf("%s, ", matriz[i][j]);
            }
        }
        */
    }
    
    public static char vectorinoMax(char[][]matriz){
        char max = matriz[0][0];       
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(max < matriz[i][j]){
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }
    
    public static char vectorinoMin(char[][]matriz){
        char min = matriz[0][0];
        for(char[] letras: matriz){
            for(char l: letras){
                if(min > l){
                    min = l;
                }
            }
        }
        /*
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(min > matriz[i][j]){
                    min = matriz[i][j];
                }
            }
        }
        */
        return min;
    }
    
    public static boolean vectorinoTF(char[][]matriz,int n,int m,int v, int b){
        if(n < 0 || m < 0 || v < 0 || b < 0){
            return false;
        }
        if(n >= matriz.length || m >= matriz[n].length || v >= matriz.length || b >= matriz[v].length){
            return false;
        }
        
        char temp = matriz[n][m];
        matriz[n][m] = matriz[v][b];
        matriz[v][b] = temp;
        return true;
    }

    public static void main(String[] args) {
        char[][]vectorino = matriz(3,4);
        mostrar(vectorino);

        System.out.printf("Maximo: %s\n", vectorinoMax(vectorino));
        System.out.printf("Minimo: %s\n", vectorinoMin(vectorino));

        if(vectorinoTF(vectorino, 0,0 , 2,4))
            mostrar(vectorino);
    }
    
}
