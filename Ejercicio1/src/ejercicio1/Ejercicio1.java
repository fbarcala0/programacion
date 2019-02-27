package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author fbarcala0
 */

/* Primero creamos la clase Geometría con las propiedades públicas 
como pide el ejercicio. Acto seguido, añadimos los constructores*/
class Geometría {

    public boolean figura;
    public int altura;
    public int base;

    // INICIO DE CONSTRUCTORES //
    /*Este lo que hace es dar valores por defecto. La figura será un triángulo
    con base y altura iguales a 2. El this. se usa para que coja los datos de 
    este objeto*/
    public Geometría() {
        this.figura = false;
        this.altura = 2;
        this.base = 2;
    }

    /*Este lo que hace es que sea la figura un triángulo, pero que por variables
    cojamos la base y la altura*/
    public Geometría(int base, int altura) {
        this.figura = false;
        this.base = base;
        this.altura = altura;
    }

    /*Este último constructor nos pide por variables la base la altura y la 
    figura, y acto seguido igualamos base, figura y altura
    del objeto a las variables que asignamos*/
    public Geometría(int base, int altura, boolean figura) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;
    }

    // FIN DE CONSTRUCTORES //
    // Ahora hacemos las funciones que pide el ejercicio //
    /*Esta función calcula dependiendo de si el boolean es true(rectángulo) o
    false(triángulo), el área de la figura con los parametros del objeto,
    usando this.*/
    public double area() {
        double area;
        if (this.figura) {
            area = this.base * this.altura;
        } else {
            area = (this.base * this.altura) / 2;
        }
        return area;
    }

    /* Ya al poner if(this.figura), este ya está en true, por lo que no es 
    necesario asignarlo y no hace falta crear una variable perimetro, se puede
    hacer directamente con returns*/
    public double perimetro() {
        if (this.figura) {
            return 2 * (this.base + this.altura);
        } else {
            return this.base + this.altura + this.diagonal();
        }
    }

    /*Esta función calcula la diagonal del rectángulo y la hipotenusa del 
    triángulo*/
    public double diagonal() {
        return Math.sqrt((this.base * this.base) + (this.altura * this.altura));
    }

}

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Primero creamos variables que vamos a pedir al usuario, base y altura*/
        int base, altura;

        /*Primero pedimos base y altura del rectángulo.*/
        System.out.printf("Dame la base del rectángulo:");
        base = Integer.parseInt(sc.nextLine());
        System.out.printf("Dame la altura del rectángulo:");
        altura = Integer.parseInt(sc.nextLine());

        /*Creamos el objeto con el booleano en true para que sea rectángulo*/
        Geometría rectangulo = new Geometría(base, altura, true);

        System.out.printf("El rectángulo tiene de base: %d y de altura: %d \n", rectangulo.base, rectangulo.altura);
        System.out.printf("El área del rectángulo es: %.2f\n", rectangulo.area());
        System.out.printf("El perímetro del rectángulo es: %.2f\n", rectangulo.perimetro());
        System.out.printf("La diagonal del rectángulo es: %.2f\n", rectangulo.diagonal());
        

        /*Ahora pedimos la base y altura del triángulo*/
        System.out.printf("Dame la base del triángulo:");
        base = Integer.parseInt(sc.nextLine());
        System.out.printf("Dame la altura del triángulo:");
        altura = Integer.parseInt(sc.nextLine());

        /*Creamos el objeto triángulo con booleano en false*/
        Geometría triángulo = new Geometría(base, altura, false);

        System.out.printf("El triángulo tiene de base: %d y de altura: %d \n", triángulo.base, triángulo.altura);
        System.out.printf("El área del triángulo es: %.2f\n", triángulo.area());
        System.out.printf("El perímetro del triángulo es: %.2f\n", triángulo.perimetro());
        System.out.printf("La hipotenusa del triángulo es: %.2f\n", triángulo.diagonal());

    }
}