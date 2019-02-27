package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author fbarcala0
 */
/*Creamos primero la clase Fecha con sus propiedades*/
class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    // Inicio de constructores //
    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.año = 1990;
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    // Fin de constructores //
    
    // Funciones //
    
    public boolean bisiesto(int año){
        if(año % 4 == 0 && año % 100 != 0){
                return true;
            } else if(año % 400 == 0){
                return true;
            } 
            return false;
    }
    
    public String fechaFormateada(boolean tipo){
        if(tipo)
            return  this.dia + "/" + this.mes + "/" + this.año;
        else{
            String mes = "";
            switch(this.mes){
                case 1:
                    mes = "enero";
                    break;
                case 2:
                    mes = "febrero";
                    break;
                case 3:
                    mes = "marzo";
                    break;
                case 4:
                    mes = "abril";
                    break;
                case 5:
                    mes = "mayo";
                    break;
                case 6:
                    mes = "junio";
                    break;
                case 7:
                    mes = "julio";
                    break;
                case 8:
                    mes = "agosto";
                    break;
                case 9:
                    mes = "septiembre";
                    break;
                case 10:
                    mes = "octubre";
                    break;
                case 11:
                    mes = "noviembre";
                    break;
                case 12:
                    mes = "diciembre";
                    break;
                default:
                    System.out.println("Error: El mes no existe");
                    break;
            }
            return  this.dia + " de " + mes + " de " + this.año;
        }
        

    }
    
    public static int diferencia(Fecha a, Fecha b){
        int dif;
        if(a.getAño() > b.getAño()){
            dif = a.getAño() - b.getAño();
        }else{
            dif = b.getAño() - a.getAño();
        }
        return dif;
    }
    
    // Fin de funciones //
    
    
    
    // Inicio de setters(cambiar valor) //
    public void setDia(int dia){
        if(dia < 1 || dia > 31){
            this.dia = 1;
        }else this.dia = dia;
    }
    
    public void setMes(int mes){
            if(mes < 1 || mes > 12){
                this.mes = 1;
            }else this.mes = mes;
    }
    
    public void setAño(int año){
        this.año = año;
    }
    // Fin de setters //
    
    // Inicio de getters(mostrar valor) //
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAño(){
        return this.año;
    }
    // Fin de getters //
}

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        
        System.out.printf("---- Introduce la primera fecha ---- \n");
        
        System.out.printf("Introduce el día: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.printf("Introduce el mes: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.printf("Introduce el año: ");
        año = Integer.parseInt(sc.nextLine());
        
        Fecha uno = new Fecha(dia,mes,año);

        System.out.printf("---- Introduce la segunda fecha ----\n");
        
        System.out.printf("Introduce el día: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.printf("Introduce el mes: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.printf("Introduce el año: ");
        año = Integer.parseInt(sc.nextLine());
        
        Fecha dos = new Fecha(dia,mes,año);
        
        System.out.printf("Primera fecha: %s \n", uno.fechaFormateada(false));
        
        System.out.printf("Segunda fecha: %s \n", dos.fechaFormateada(true));
        
        System.out.printf("La diferencia de años entre ambas fechas es de %d años \n", Fecha.diferencia(uno, dos));
        
    }
    
}
