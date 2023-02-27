public class Escuela {
    private String Nombre;
    private int Alumnos[];
    public void alumnos(){Alumnos=new int [1];}
    private int Clases[];
    public void clases(){Clases=new int  [1];}
    public String Mat[]=new String [1];
    public Escuela(String nombre){
        this.Nombre=nombre;
    }
    public void addAlumnos(){

    }
    public boolean elimAlumno(){

    }
    public void ListadoAlumnos(){

    }
    public void listadoCarr (){

    }
    public void listadoClase(){
        
    }
    public void listadoClase(valor){
        
    }
    public void listadoClaseProm(){
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println(Clases[i]+" Promedio: "+Clases[i]/Clases.length);
        }
    }
    public void listadoMatporCarr(){
        for (int i = 0; i < Mat.length; i++) 
            System.out.println(Mat[i]);
        
    }
    public void AgregarMat(Carrera){

        for (int i = 0; i < Alumnos.length; i++) {
            if((Mat[i]==x))
            Mat[i]=Carrera;
        } 
    }
    public void ElimMat(Mat, Carrera){
        for (int i = 0; i < Alumnos.length; i++) {
            if((Mat[i]==x))
            Mat[i]=null;
        }
    }
}
