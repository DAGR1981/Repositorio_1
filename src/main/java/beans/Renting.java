
package beans;

import java.sql.Date;

public class Renting {
    
    private int id;
    private String username;
    private Date fecha;
    private String tipo;
    private String marca;

    public Renting(int id, String username, Date fecha, String tipo, String marca) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Renting{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", tipo=" + tipo + ", marca=" + marca + '}';
    }
    
    

   
    }

    
