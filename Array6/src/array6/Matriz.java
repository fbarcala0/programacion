package array6;
import java.util.*;

public class Matriz {
    private int[][] matriz;

    // Inicio de constructor //
    public Matriz(int N){
        matriz = new int[N][N];
        Random r = new Random();
        for(int i = 0; i < this.matriz.length; i++){
            for(int j = 0; j < this.matriz[i].length; j++){
                matriz[i][j] = r.nextInt((10)+1);
            }
        }
    }
    // Fin de constructor //
    
    public void muestraMatriz(){
        for(int i = 0; i < this.matriz.length; i++){
            for(int j = 0; j < this.matriz[i].length ; j++){
                System.out.printf("%d ", this.matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public int suma(){
        int suma = 0;
        for(int i = 0; i < this.matriz.length; i++){
            for(int j = 0; j < this.matriz[i].length; j++){
                suma = suma + this.matriz[i][j];
            }
        }
        return suma;
    }
    
    public int suma(boolean tf){
        int suma = 0;
        
        for(int i = 0; i < this.matriz.length; i++){
            suma += this.matriz[i][i];
        }
        
        if(tf){
             return suma;
        }else{
            return this.suma() - suma;
        }
    }
    
    public int suma(int fila){
        int suma = 0;
        if(fila < 0 || fila >= this.matriz.length){
            return suma = -1;
        }
        
        for(int j = 0; j < this.matriz.length; j++){
            suma += this.matriz[fila][j];
        }
        return suma;
    }
}
