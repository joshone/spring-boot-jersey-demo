package cl.joshone.jerseydemo.model;

public class Book{

    private String nombre;
    private String autor;

    public Book (){
    }
    public Book (String nombre, String autor){
        this.nombre = nombre;
        this.autor = autor;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}