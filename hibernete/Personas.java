package hibernete;
// Generated 23/04/2023 05:27:22 PM by Hibernate Tools 4.3.1



/**
 * Personas generated by hbm2java
 */
public class Personas  implements java.io.Serializable {


     private Integer id;
     private String cedula;
     private String nombre;
     private String apellido;
     private String email;
     private String estado;

    public Personas() {
    }

    public Personas(String cedula, String nombre, String apellido, String email, String estado) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.email = email;
       this.estado = estado;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


