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
        for(int[] fila:this.notas){
            for(int n:fila){
                media = media + n;
            }
        }
        return media/this.notas.length;
    }
    
    public double mediaAlumno(int alumno){
        double media = 0;
        for(int i = 0;i < this.notas[alumno].length;i++){
            media = media + this.notas[alumno][i];
        }
        return media/this.notas[alumno].length;
    }
    
    public double mediaMateria(int materia){
        double media = 0;
        for(int i = 0; i < this.notas.length;i++){
            media = media + this.notas[materia][i];
        }
        return media/this.alumnos.length;
    }
    
    public int notaMax(int materia){
        int max = 0;
        for(int i = 0; i < this.notas.length;i++){
            if(this.notas[i][materia] > max){
            max = this.notas[i][materia];
            }
        }
        return max;
    }
    
    public int notaMin(int materia){
        int min = 10;
        for(int i = 0; i < this.notas.length;i++){
            if(this.notas[i][materia] < min){
                min = this.notas[i][materia];
            }
        }
        return min;
    }
    
}
