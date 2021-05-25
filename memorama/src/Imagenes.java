
import java.io.File;

public class Imagenes {
    private static String imagenReverso;
    private static int cantidadImagenes;
    private static String[] imagenes;
    
    public Imagenes() {  
        obtenerImagenReverso();  
        obtenerImagenes();        
    }
    
    private void obtenerImagenReverso() {        
        File carpeta = new File("imgBack"); 
        File[] lista = carpeta.listFiles();   
        if( lista.length < 1 ) {
            System.out.println("No hay imagenes en la carpeta imgBack");
        }
        else {             
            imagenReverso=lista[0].toString();            
        }                        
    }
    
    public void obtenerImagenes() {        
        File carpeta = new File("img"); 
        File[] lista = carpeta.listFiles();   
        if( lista.length < 1 ) {
            System.out.println("ERROR: No hay imagenes en la carpeta img");            
        }
        else {             
            cantidadImagenes = lista.length;
            imagenes = new String[cantidadImagenes];
            for(int i=0;i<lista.length;i++) {
                imagenes[i]=lista[i].toString();
            }            
        }            
    }

    public static int getCantidadImagenes() {
        return cantidadImagenes;
    }

    public static String[] getImagenes() {
        return imagenes;
    }

    public static String getImagenReverso() {
        return imagenReverso;
    }

    public static void setImagenes(String[] imagenes) {
        Imagenes.imagenes = imagenes;
    }
    
    public String consultaImagen(int i) {       
        return imagenes[i];
    }
    
    
    
    
}
