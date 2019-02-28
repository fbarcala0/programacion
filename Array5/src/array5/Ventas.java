package array5;

import java.util.Random;

public class Ventas {

    /*Primero de todo se le añaden las propiedades*/
    private int ano;
    private int[] vector = new int[12];

    // Constructores //
    /*En primer lugar hacemos que el vector nos de un valor aleatorio entre
        0 y 1000 con un bucle recorriendo las 12 posiciones del vector*/
    /**
     * Constructor que inicializa el año con parametro y el vector con números
     * aleatorios entre 0 y 1000
     *
     * @param ano Año que se le pasa
     */
    public Ventas(int ano) {
        this.ano = ano;
        Random r = new Random();
        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] = r.nextInt((1000) + 1);
        }

    }
    // Fin constructor //

    /**
     * Devuelve la media de valores del vector
     *
     * @return media
     */
    public double media() { //elimina paso de parametros
        /*Para calcular la media, lo que hacemos primero es recorrer las 12 
        posiciones del vector e ir sumandolas a una variable que llamamos media,
        la cual despues haremos el calculo dividiendo entre la longitud del
        vector y nos dara la media*/
        double media = 0;
        for (int i = 0; i < this.vector.length; i++) {
            media = media + this.vector[i];
        }
        media = media / this.vector.length;
        return media;
    }

    /**
     * Ejecutar un gráfico que por cada 100 unidades ponga una "#"
     */
    public void grafica() { // Alinear -> Done
        /*Para la grafica, debemos primero recorrer con el bucle las posiciones
        del vector e ir añadiendo el mes*/
        for (int i = 0; i < this.vector.length; i++) {
            System.out.printf("Mes %2d (%4d): ", i + 1, this.vector[i]);
            /*Con este siguiente bucle, j, asignaremos las "#", las cuales
                se añadirá conforme cada vez que el número que salga se divide
                entre 100 y se le suma una, entonces, si es 300 por ejemplo,
                se divide entre 100+1 y da 4, por lo que pondrá 4 "#"*/
            for (int j = this.vector[i] / 100 + 1; j > 0; j--) {
                System.out.printf("#");
            }
            System.out.println("");
        }
    }

}
