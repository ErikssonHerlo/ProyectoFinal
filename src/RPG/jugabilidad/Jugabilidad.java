
package RPG.jugabilidad;

import RPG.enemigos.Enemigo;
import RPG.escenario.IconoEnemigo;
import RPG.interfaz.ListadoVehiculo;
import RPG.vehiculos.Vehiculo;
import java.util.Random;
import javax.swing.Icon;

public class Jugabilidad {
  
    public static Vehiculo vehiculoUno = ListadoVehiculo.vehiculoUno;
    public static Vehiculo vehiculoDos = ListadoVehiculo.vehiculoDos;
    public static Vehiculo vehiculoTres = ListadoVehiculo.vehiculoTres;
    private final String enemigo1 = "DEVASTADOR",enemigo2 = "TORNADO",enemigo3 = "PESADILLA";
    private final String vidaEnemigo = "75";
    private final String ataqueEnemigo = "12";
    public static Enemigo[] enemigos = new Enemigo[3];
    IconoEnemigo iconoEnemigo = new IconoEnemigo();
    
    public int noMovimientos(){
        Random movimmientoAleatorio = new Random();
        return movimmientoAleatorio.nextInt(6)+1;
    }
    public int porcentajeAtaque(){
        Random porcentajeAleatorio = new Random();
        return porcentajeAleatorio.nextInt(100)+1;
    }
    public String mostrarMovimientos(){
        String movimiento = Integer.toString(noMovimientos());        
        return movimiento;
    }
    public String mostrarPorcentaje(){
        String porcentaje = Integer.toString(porcentajeAtaque());        
        return porcentaje;
    }
    public Enemigo[] Enemigos(){
        enemigos[0] = new Enemigo(enemigo1,vidaEnemigo,ataqueEnemigo,0,0);
        enemigos[1] = new Enemigo(enemigo2,vidaEnemigo,ataqueEnemigo,0,0);
        enemigos[2] = new Enemigo(enemigo3,vidaEnemigo,ataqueEnemigo,0,0);
        return enemigos;
    }
    public String[][] mostrarEnemigos(){
        Enemigos();
        String[][] verEnemigos = new String[3][4];
        verEnemigos[0][0] = enemigos[0].getNombre();
        verEnemigos[1][0] = enemigos[1].getNombre();
        verEnemigos[2][0] = enemigos[2].getNombre();
        verEnemigos[0][1] = enemigos[0].getVida();
        verEnemigos[1][1] = enemigos[1].getVida();
        verEnemigos[2][1] = enemigos[2].getVida();
        verEnemigos[0][2] = enemigos[0].getAtaque();
        verEnemigos[1][2] = enemigos[1].getAtaque();
        verEnemigos[2][2] = enemigos[2].getVida();
        return verEnemigos;
    }
    public String[][] mostrarVidaJugador(){
       String[][] vidaVehiculos = new String[3][4];
       vidaVehiculos[0][0] = vehiculoUno.getNombre();
       vidaVehiculos[1][0] = vehiculoDos.getNombre();
       vidaVehiculos[2][0] = vehiculoTres.getNombre();
       vidaVehiculos[0][1] = vehiculoUno.getTipoVehiculo();
       vidaVehiculos[1][1] = vehiculoDos.getTipoVehiculo();
       vidaVehiculos[2][1] = vehiculoTres.getTipoVehiculo();
       vidaVehiculos[0][2] = vehiculoUno.getVida();
       vidaVehiculos[1][2] = vehiculoDos.getVida();
       vidaVehiculos[2][2] = vehiculoTres.getVida();
       return vidaVehiculos;
    }
    public String[][] mostrarAtaqueJugador(){
       String[][] ataqueVehiculos = new String[3][3];
       ataqueVehiculos[0][0] = vehiculoUno.getNombre();
       ataqueVehiculos[1][0] = vehiculoDos.getNombre();
       ataqueVehiculos[2][0] = vehiculoTres.getNombre();
       ataqueVehiculos[0][1] = vehiculoUno.getAtaque();
       ataqueVehiculos[1][1] = vehiculoDos.getAtaque();
       ataqueVehiculos[2][1] = vehiculoTres.getAtaque();
       return ataqueVehiculos;
    }
    public String[][] mostrarDefensaJugador(){
       String[][] defensaVehiculos = new String[3][3];
       defensaVehiculos[0][0] = vehiculoUno.getNombre();
       defensaVehiculos[1][0] = vehiculoDos.getNombre();
       defensaVehiculos[2][0] = vehiculoTres.getNombre();
       defensaVehiculos[0][1] = vehiculoUno.getDefensa();
       defensaVehiculos[1][1] = vehiculoDos.getDefensa();
       defensaVehiculos[2][1] = vehiculoTres.getDefensa();
       return defensaVehiculos;
    }
    public String[][] mostrarAtaqueDefensaJugador(){
       String[][] ataqueDefensaVehiculos = new String[3][4];
       ataqueDefensaVehiculos[0][0] = vehiculoUno.getNombre();
       ataqueDefensaVehiculos[1][0] = vehiculoDos.getNombre();
       ataqueDefensaVehiculos[2][0] = vehiculoTres.getNombre();
       ataqueDefensaVehiculos[0][1] = vehiculoUno.getAtaque();
       ataqueDefensaVehiculos[1][1] = vehiculoDos.getAtaque();
       ataqueDefensaVehiculos[2][1] = vehiculoTres.getAtaque();
       ataqueDefensaVehiculos[0][2] = vehiculoUno.getDefensa();
       ataqueDefensaVehiculos[1][2] = vehiculoDos.getDefensa();
       ataqueDefensaVehiculos[2][2] = vehiculoTres.getDefensa();
       return ataqueDefensaVehiculos;
    }
    public void moverse(String cantidadCasillas){
        int casillas = Integer.parseInt(cantidadCasillas);
        
    }
    public int ataque(String recibirPorcentaje, String valorAtaque){
        int porcentaje = Integer.parseInt(recibirPorcentaje);
        int ataque = Integer.parseInt(valorAtaque);
        
        return ataque;
    }
    public int randomFilas(int filas){
        Random posFila = new Random();
        return posFila.nextInt(filas);
    }
    public int randomColumnas(int columnas){
        Random posColumna = new Random();
        return posColumna.nextInt(columnas);
    }
    public void coordenadasVehiculoUno(int fila,int columna){
        vehiculoUno.setPosFila(fila);
        vehiculoUno.setPosColumna(columna);
    }
    public void coordenadasVehiculoDos(int fila,int columna){
        vehiculoDos.setPosFila(fila);
        vehiculoDos.setPosColumna(columna);
    }
    public void coordenadasVehiculoTres(int fila,int columna){
        vehiculoTres.setPosFila(fila);
        vehiculoTres.setPosColumna(columna);
    }
    public void guardarPosicion(int identificador,int fila, int columna){
        if(identificador == 3){
            coordenadasVehiculoUno(fila+1,columna+1);            
        }
        if(identificador == 2){
            coordenadasVehiculoDos(fila+1,columna+1);            
        }
        if(identificador == 1){
            coordenadasVehiculoTres(fila+1,columna+1);            
        }
    }
    public String[][] mostrarPosicion(){
       String[][] posicionVehiculos = new String[3][3];
       String posX,posY;
       posicionVehiculos[0][0] = vehiculoUno.getNombre();
       posicionVehiculos[1][0] = vehiculoDos.getNombre();
       posicionVehiculos[2][0] = vehiculoTres.getNombre();
       posicionVehiculos[0][1] = posX = String.valueOf(vehiculoUno.getPosFila());
       posicionVehiculos[1][1] = posX = String.valueOf(vehiculoDos.getPosFila());
       posicionVehiculos[2][1] = posX = String.valueOf(vehiculoTres.getPosFila());
       posicionVehiculos[0][2] = posY = String.valueOf(vehiculoUno.getPosColumna());
       posicionVehiculos[1][2] = posY = String.valueOf(vehiculoDos.getPosColumna());
       posicionVehiculos[2][2] = posY = String.valueOf(vehiculoTres.getPosColumna());
       return posicionVehiculos;
    }
    
    
    
}
