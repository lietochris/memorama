public class Jugador {
    private  int puntaje;
    private  boolean turno;
    private String nombre;

    public Jugador(boolean turno) {
        this.puntaje = 0;
        this.turno = turno;
    }
    
    public  void sumaPunto() {
        puntaje++;
    }

    public  int getPuntaje() {
        return puntaje;
    }

    public  void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }  

    public  boolean isTurno() {
        return turno;
    }

    public  void setTurno(boolean turno) {
       this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
