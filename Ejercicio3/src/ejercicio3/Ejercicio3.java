package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author fbarcala0
 */

/*Creamos primero la clase empleado con sus propiedades*/
class Empleado{
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salario;
    private double irpf;
    
    // Inicio de constructores //
    public Empleado(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        this.salario = 0;
        this.irpf = 7.5;
    }
    
    public Empleado(String nombre, String apellidos, int edad, String dni, double salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.salario = salario;
        this.irpfCalculo();
    }
    // Fin de constructores //
    
    // Inicio de setters //
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
        this.irpfCalculo();
    }
    // Fin de setters //
    
    // Inicio de getters //
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double getIrpf(){
        return this.irpf;
    }
    // Fin de getters //
    
    // Funciones //
    
    // Esta función es para mostrar todos los datos del empleado //
    public void mostrarDatos(){
    System.out.printf("Nombre completo: %s %s\n", getNombre(), getApellidos());
    System.out.printf("Edad: %d\n", getEdad());
    System.out.printf("DNI: %s\n", getDni());
    System.out.printf("Salario: %.2f\n", getSalario());
    System.out.printf("IRPF: %.2f\n", getIrpf());
    }
    
    // Esta función sirve para mostrar el dato que deseamos ver del empleado //
    public void mostrarDatos(int opcion){
        switch(opcion){
            case 1:
                System.out.printf("Nombre completo: %s %s\n", getNombre(), getApellidos());
                break;
            case 2:
                System.out.printf("Edad: %d\n", getEdad());
                break;
            case 3:
                System.out.printf("DNI: %s\n", getDni());
                break;
            case 4:
                System.out.printf("Salario e IRPF: %.2f\n", getSalario(), getIrpf());
                break;
            default:
                mostrarDatos();
                break;
        }
    }
    
    // Con esta función calculamos el IRPF dependiendo del salario//
    private void irpfCalculo(){
        if(this.salario < 6000){
            this.irpf = 7.5;
        }else if( this.salario <= 30000){
            this.irpf = 15;
        }else {
            this.irpf = 20;
        }
    }
    
    // Esta funciòn calcula según el IRPF, la cantidad de dinero que se lleva hacienda //
    public double hacienda(){
        double hacienda;
        hacienda = getSalario() * getIrpf() / 100;
        return hacienda;
    }
    
    // Función para modificar los datos del empleado //
    public void modificar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Introduzca nombre:");
        setNombre(sc.nextLine());
        System.out.printf("Introduzca apellidos:");
        setApellidos(sc.nextLine());
        System.out.printf("Introduzca edad:");
        setEdad(Integer.parseInt(sc.nextLine()));
        System.out.printf("Introduzca DNI:");
        setDni(sc.nextLine());
        System.out.printf("Introduzca salario:");
        setSalario(Double.parseDouble(sc.nextLine()));
    }
}
// Fin funciones //

// Creamos otra clase Directivo con sus propiedades//
class Directivo{
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String nombreDep;
    private float beneficios;
    
    // Inicio de constructores //
    public Directivo(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.dni = "";
        this.nombreDep = "";
        this.beneficios = 0;
    }
    
    public Directivo(String nombre, String apellidos, int edad, String dni, String nombreDep, float beneficios){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad =  edad;
        this.dni = dni;
        this.nombreDep = nombreDep;
        this.beneficios = beneficios;
    }
    //Fin de constructores //
    
    // Inicio de setters //
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setNombreDep(String nombreDep){
        this.nombreDep = nombreDep.toUpperCase(); //FIXME mayúsculas)
    }
    
    public void setBeneficios(float beneficios){
        this.beneficios = beneficios;
    }
    // Fin de setters //
    
    // Inicio de getters //    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public String getNombreDep(){
        return "\"" + this.nombreDep + "\""; // FIXME entre comillas
    }
    
    public float getBeneficios(){
        return this.beneficios;
    }
    // Fin de getters //
    
    // Funciones //
    
    // Función para mostrar datos del directivo //
    public void mostrarDatos(){
        System.out.printf("Nombre completo: %s %s\n", getNombre(), getApellidos());
        System.out.printf("Edad: %d\n", getEdad());
        System.out.printf("DNI: %s\n", getDni());
        System.out.printf("Departamento: %s\n", getNombreDep());
        System.out.printf("Beneficios: %.2f\n", getBeneficios());
    }
    
    // Función para mostrar el dato que deseamos ver del directivo //
    public void mostrarDatos(int opcion){
        switch(opcion){
            case 1:
                System.out.printf("Nombre completo: %s %s\n", getNombre(), getApellidos());
                break;
            case 2:
                System.out.printf("Edad: %d\n", getEdad());
                break;
            case 3:
                System.out.printf("DNI: %s\n", getDni());
                break;
            case 4:
                System.out.printf("Departamento: %s\n", getNombreDep());
                break;
            case 5:
                System.out.printf("Beneficios: %.2f\n", getBeneficios());
                break;
            default:
                mostrarDatos();
                break;
        }
    }
    
    // Función para calcular la ganancia que tiene el directivo //
    public double ganancia(double g){
        double ganancia = 0;
        if(g < 0){
            ganancia = 0;
        } else {
            ganancia = g * this.beneficios / 100;
        }
        return ganancia;
    }
    
    // Función para modificar las propiedades del directivo //
    public void modificar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Introduzca nombre:");
        setNombre(sc.nextLine());
        System.out.printf("Introduzca apellidos:");
        setApellidos(sc.nextLine());
        System.out.printf("Introduzca edad:");
        setEdad(Integer.parseInt(sc.nextLine()));
        System.out.printf("Introduzca DNI:");
        setDni(sc.nextLine());
        System.out.printf("Introduzca departamento:");
        setNombreDep(sc.nextLine());
        System.out.printf("Introduzca los beneficios:");
        setBeneficios(Float.parseFloat(sc.nextLine()));
    }
}

// Fin funciones //

// Creamos la clase empresa con sus propiedades //
class Empresa{
    private double ganancias;
    public Directivo directivo;
    public Empleado emplea;
    public Empleado empleb;
    
    // Inicio de constructores //
    public Empresa(Directivo directivo, Empleado emplea, Empleado empleb){
        this.directivo = directivo;
        this.emplea = emplea;
        this.empleb = empleb;
    }
    
    public Empresa(Directivo directivo, Empleado emplea, Empleado empleb, double ganancias){
        this.directivo = directivo;
        this.emplea = emplea;
        this.empleb = empleb;
        this.ganancias = ganancias;
    }
    // Fin de constructores //
    
    // Inicio de setters //
    public void setGanancias(double ganancias){
        this.ganancias = ganancias;
    }
    // Fin de setters //
    
    // Inicio de getters //
    public double getGanancias(){
        return this.ganancias;
    }
    // Fin de getters //
}

public class Ejercicio3 {
        public static void modificar(Empresa empresa){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---MODIFICAR DATOS---");
            System.out.println("1.- Modificar datos del directivo");
            System.out.println("2.- Modificar datos del empleado");
            System.out.println("3.- Volver al menu principal");
            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 1:
                    empresa.directivo.modificar();
                    break;
                case 2:
                    System.out.println("---MODIFICAR EMPLADOS---\n");
                    System.out.printf("1.- Modificar datos %s\n", empresa.emplea.getNombre());
                    System.out.printf("2.- Modificar datos %s\n", empresa.empleb.getNombre());
                    System.out.println("3.- Volver al menu \"MODIFICAR DATOS\"");
                    int opcion2 = Integer.parseInt(sc.nextLine());

                    switch(opcion2){
                        case 1:
                            empresa.emplea.modificar();
                            break;
                        case 2:
                            empresa.empleb.modificar();
                            break;
                        default:
                            opcion2 = 3;
                            break;
                    }
                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opcion != 3);
}
         public static void mostrar(Empresa empresa){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("---MOSTRAR DATOS EMPLEADOS---");
            System.out.println("1.- Mostrar todos los datos");
            System.out.println("2.- Mostrar un solo dato");
            System.out.println("3.- Volver al menú principal");
            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 1:
                    empresa.emplea.mostrarDatos();
                    System.out.println("-----------------");
                    empresa.empleb.mostrarDatos();
                    break;
                case 2:
                    System.out.println("---MOSTRAR---");
                    System.out.println("1- Nombre completo");
                    System.out.println("2- Edad");
                    System.out.println("3- DNI");
                    System.out.println("4- Salario e IRPF");
                    System.out.println("5- Volver a \"MOSTRAR DATOS EMPLEADOS\"");
                    int opcion2 = Integer.parseInt(sc.nextLine());

                    switch(opcion2){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            empresa.emplea.mostrarDatos(opcion2);
                            System.out.println("-----------------");
                            empresa.empleb.mostrarDatos(opcion2);
                            break;
                        case 5:
                            break;
                    }
            }
        }while(opcion != 3);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado("Javier","Peña",58,"33229987J",3400);
        Empleado empleado2 = new Empleado("Juan", "Fernández",34,"35555555g",2300);
        Directivo directivo = new Directivo("Antonio","Sarabia",78,"44556777H","Mecanica",33);
        Empresa empresa = new Empresa(directivo, empleado,empleado2,20000);
        
         int opcion;
        do{
            System.out.println();
            System.out.println("1.- Ver datos de los empleados");
            System.out.println("2.- Ver datos de los directivos");
            System.out.println("3.- Editar");
            System.out.println("4.- Pagar");
            System.out.println("5.- Cobrar");
            System.out.println("6.- Salir");
            opcion = Integer.parseInt(sc.nextLine());

            switch(opcion){
                case 1:     //VER DATOS EMPLEADOS
                    mostrar(empresa);
                    break;
                case 2:     //VER DATOS DIRECTIVO
                    empresa.directivo.mostrarDatos();
                    System.out.printf("\n\nGanancias: %.2f€", empresa.directivo.ganancia(empresa.getGanancias()));
                    break;
                case 3:     //MODIFICAR DATOS
                    modificar(empresa);
                    break;
                case 4:     //PAGAR
                    double salarioEmpleados = empresa.emplea.getSalario() + empresa.empleb.getSalario();
                    System.out.printf("Se paga %.2f a los empleados.\nGanancias previas: %.2f || Ganancias actuales: %.2f\n", salarioEmpleados, empresa.getGanancias(), empresa.getGanancias() - salarioEmpleados);
                    empresa.setGanancias(empresa.getGanancias() - salarioEmpleados);
                    break;
                case 5:     //COBRAR
                    System.out.println("Intrdouzca la cantidad a cobrar: ");
                    double cobro = Double.parseDouble(sc.nextLine());
                    System.out.printf("Se cobran %.2f.\nGanancias previas: %.2f || Ganancias actuales: %.2f\n", cobro, empresa.getGanancias(), empresa.getGanancias() + cobro);
                    empresa.setGanancias(empresa.getGanancias() + cobro);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error: opcion inesperada!");
                    break;
            }
}while(opcion != 6);
        /*
        System.out.printf("Nombre:");
        empleado.setNombre(sc.nextLine());
        System.out.printf("Apellidos:");
        empleado.setApellidos(sc.nextLine());
        System.out.printf("Edad:");
        empleado.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.printf("DNI:");
        empleado.setDni(sc.nextLine());
        System.out.printf("Salario:");
        empleado.setSalario(Double.parseDouble(sc.nextLine()));
        
        System.out.printf("------------------ Empleados ------------------\n");
        
        empleado.mostrardatos();
        System.out.printf("Hacienda se queda %.2f euros\n", empleado.hacienda());
        System.out.printf(" ------------------------------------------------------ \n");
        empleado2.mostrardatos();
        System.out.printf("Hacienda se queda %.2f euros\n", empleado2.hacienda());
        
        System.out.printf("-----DIRECTIVO-----\n");
        System.out.printf("Nombre:");
        directivo.setNombre(sc.nextLine());
        System.out.printf("Apellidos:");
        directivo.setApellidos(sc.nextLine());
        System.out.printf("Edad:");
        directivo.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.printf("DNI:");
        directivo.setDni(sc.nextLine());
        System.out.printf("Departamento:");
        directivo.setNombreDep(sc.nextLine());
        System.out.printf("Beneficios:");
        directivo.setBeneficios(Float.parseFloat(sc.nextLine()));
        
        directivo.mostrardatos();
        System.out.printf("Las ganancias son de: %.2f\n", directivo.ganancia(empresa.getganancias()));
        */
        
    }
    
}
