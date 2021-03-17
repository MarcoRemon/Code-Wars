package MarcoRemon.company;


public class Alumno implements Comparable<Alumno>{

    private int legajo;
    private int nota1;
    private int nota2;
    private int nota3;

    public int getLegajo() {
        return legajo;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public Alumno(int legajo, int nota1, int nota2, int nota3) {
        this.legajo = legajo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getPromedio() {
        return " El promedio del alumno de legajo " + this.legajo + " teniendo en cuenta las notas: " + this.nota1 + " " + this.nota2 + " " + this.nota3 + " " + " es: " + calculatePromedio();
    }

    public int calculatePromedio(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }


    @Override
    public int compareTo(Alumno alumno) {
        if (this.calculatePromedio()> alumno.calculatePromedio()){
            return 1;
        }
        if (this.calculatePromedio()<alumno.calculatePromedio()){
            return -1;
        }else return 0;
    }
}
