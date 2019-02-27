package array4;
import java.util.Scanner;

public class Array4 {
    /**
     * Función que muestra las letras de una cadena en lineas distintas
     * @param texto . Cadena de texto que introducimos
     */
    public static void muestraEnLinea(String texto){
        /*Hacemos un bucle for para recorrer cada una 
        de las letras de la cadena */
        for(int i = 0; i < texto.length(); i++){
            System.out.printf("%s\n", texto.charAt(i));
        }
    }
    
    /**
     * Función que devuelve un fragmento de una cadena de texto que indicamos
     * @param cadena . Cadena de texto
     * @param pos . Posición en la que queremos que recoja
     * @param longi. Longitud de la cadena que queremos mostrar
     * @return subCadena. Tipo String que devuelve el fragmento de la cadena que queremos
     */
    public static String subCadena(String cadena, int pos, int longi){
        /*Creamos una variable llamada subCadena. Acto seguido, realizamos
        un if para comprobar los limites y que nos de error en caso de
        parámetros no validos. Hacemos pos+longi > cadena-length porque,
        de esta manera comprobamos ambos a la vez, y también porque lo
        necesitamos en el for siguiente.*/
        String subCadena = "";
        if(pos < 0 || longi < 1 || pos+longi > cadena.length())
            throw new IllegalArgumentException("Parámetros no válidos");
        /*Ejecutamos ahora un bucle for en el que i empieza en la posición
        que le indicamos y que recorra el bucle hasta que llegue a la longitud
        que queramos desde la posición. Dentro, lo que hacemos es que subCadena
        coja la cadena de texto que queremos mostrar.*/
        for(int i = pos; i < pos+longi;i++){
            subCadena += cadena.charAt(i);
        }
        return subCadena;             
    }
    
    /**
     * Función que muestra una cadena de texto çentrada en consola de 80
     * @param texto . Texto es la cadena de texto
     */
    public static void muestraCentrado(String texto){
        /*if(texto.length() > 80){
            throw new BufQueLargaException("Cadena demasiado larga");
        }*/
        /*Primero creamos las variables de los centros, tanto de la cadena,
        para poder cuadrarlo con la otra variable, que es el centro de la 
        consola. El centro de la cadena es su longitud entre 2 y el de la
        consola es 80 en este caso, entre 2, y a esa operación le restamos 
        la variable centroCadena para que así cuente desde la mitad del centro
        de la cadena los espacios*/
        int centroCadena = texto.length() / 2;
        int centroConsola = 80 / 2 - centroCadena;
        
        /*Se puede hacer mediante bucle for, recorriendo i desde 0 hasta el
        centroConsola, y que a cada vuelta que de el bucle añada un espacio.
        Acto seguido, cerramos el bucle y mostramos el texto y ya.*/
        for(int i = 0; i < centroConsola; i++){
            System.out.printf(" ");
        }
        System.out.printf("%s", texto);
        
        /*De esta otra manera, lo que hacemos es mediante solo una muestra en
        pantalla, que coja tantos espacios como tenga el centro de la consola y
        añadiendo la longitud de la cadena de texto para que la primera letra
        empiece en 40.
        
        System.out.printf("%" + (centroConsola + texto.length())+ "s", texto);
        
        */
    }
    
    /**
     * 
     * @param cadena . Cadena de texto a pasar
     * @return hector, que es el vector que contiene los caracteres de la cadena
     */
    public static char[] cadenaAVector(String cadena){
        char[] hector = new char[cadena.length()];
        for(int i = 0; i < cadena.length(); i++){
            hector[i] = cadena.charAt(i);
        }
        return hector;
    }
    
    /**
     * Función que queremos que nos ponga lo que escribamos pero al revés
     * @param frase .Frase o palabra que queremos poner al revés
     * @return fin, que es un String que sea frase, pero al revés
     */
    public static String alReves(String frase){
        char[] alReves = cadenaAVector(frase);
        String fin = "";
        for(int i = alReves.length-1; i >= 0; i--){
        fin += alReves[i];
        }
        return fin;
    }
    
    /**
     * Función que pasa lo que escribamos a mayúsculas
     * @param cadena . Cadena es la cadena de texto que pasamos para que lo pase
     * @return may, que es la cadena pero ya en mayúsculas
     */
    public static String pasoAMayusculas(String ... cadena){
        /*En primer lugar con un String vacío juntamos todo*/
        String vacio = "";
        for(int i = 0; i < cadena.length; i++){
            vacio += cadena[i];
        }
        // Convertimos la cadena a un vector usando la función anterior
        char[] letras = cadenaAVector(vacio);
        
        String may = "";
        for(int i = 0; i < letras.length;i++){
            /*Convertimos que si hay un '_', lo pase a un espacio*/
            if(letras[i] == '_'){
                letras[i] = ' ';
                may += letras[i];
            }
            /*Hacemos que pase las letras en minúsculas a mayusculas. Para ello
            juntamos las letras y si esta en minúscula hacemos que le reste 32,
            que es la misma letra pero en mayúscula. Lo casteamos a char*/
            if(letras[i] <= 122 && letras[i] >= 97){
                may += (char)(letras[i]-32);
            }else{
                may += letras[i];
            }
        }
        return may;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf(subCadena("Esto es una prueba",3,8));
        System.out.println("");
        muestraCentrado("Hola buenas\n");
        System.out.printf("%s\n", alReves("ocnam"));
        System.out.printf("%s\n", pasoAMayusculas("hola","buenas"));
    }
    
}
