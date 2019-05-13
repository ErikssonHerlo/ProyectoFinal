
package RPG.jugador;

public class Jugador {
    
   private String nombre;
   private String nivel;
   private String experiencia;
   private String identificador;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public Jugador(String nombre,String nivel,String experiencia, String identificador) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.identificador = identificador;
    }
   
    
    
    
}
