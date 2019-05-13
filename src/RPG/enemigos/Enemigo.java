
package RPG.enemigos;

public class Enemigo {
 
    private String vida;
    private String ataque;
    private String nombre; 
    private int posFila;
    private int posColumna;

    public String getVida() {
        return vida;
    }
    public void setVida(String vida) {
        this.vida = vida;
    }
    public String getAtaque() {
        return ataque;
    }
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosFila() {
        return posFila;
    }

    public void setPosFila(int posFila) {
        this.posFila = posFila;
    }

    public int getPosColumna() {
        return posColumna;
    }

    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }
    
    public Enemigo(String nombre, String vida, String ataque,int posFila,int posColumna) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
        this.posFila = posFila;
        this.posColumna = posColumna;
    }
}
