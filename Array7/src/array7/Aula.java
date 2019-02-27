package array7;

public class Aula {
    private int[][] notas;
    private String[] alumnos;
    private String[] materias;
    
    // Inicio de constructores //
    public Aula(int n, int m, String[] alumnos, String[] materias){
    this.notas = new int[n][m];
    this.alumnos = alumnos;
    this.materias = materias;
    }
    // Fin de constructores //
    
    // Inicio Getters //
    public int[][] getNotas(){
        return this.notas;
    }
    
    public String[] getAlumno(){
        return this.alumnos;
    }
    
    public String[] getMateria(){
        return this.materias;
    }
    // Fin Getters //
    
    // Inicio Setters //
    public void setNotas(int i, int j, int nota){
        this.notas[i][j] = nota;
    }
    // Fin Setters //
    
    public double mediaTotal(){
        double media = 0;
        
        return media;
    }
    
}
