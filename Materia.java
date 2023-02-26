public class Materia {
    private String nombre;
    private int credito;
    private String clave;
    public Materia(String nombre, int credito, String clave){
        this.nombre=nombre;
        this.credito=credito;
        this.clave=clave;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
