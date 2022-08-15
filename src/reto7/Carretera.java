
package reto7;


import java.util.ArrayList;


public class Carretera {
    
    private final ArrayList<TramoVia> calle = new ArrayList<>();

    public ArrayList<TramoVia> getVias() {
        return calle;
    }
    public void setVias(TramoVia nuevoTramo) {
        calle.add(nuevoTramo);        
    }
    
    public double longitudTotal(){
        double sumaLongitud = 0;
        for (TramoVia tramo: calle) {
            sumaLongitud += tramo.longitud();
        }
        return sumaLongitud;
    }
    
    public double areaTotal(){
        double sumaArea = 0;
        for (TramoVia tramo: calle) {
            sumaArea +=tramo.area();
        }
        return sumaArea;
    }
    //Un método que devuelva el volumen total de material a utilizar en la carretera.
    
////////////////////////////////////////////////////////////////////////////////7
    public double volumenTotal(){
        double sumaVolumen = 0;
        for (TramoVia tramo: calle) {
            sumaVolumen +=tramo.volumen();
        }
        return sumaVolumen;
    }
    
   // Un método que devuelva el volumen total de asfalto a utilizar en la carretera.    
    public double volumenAsfaltoTotal(){
        double sumaVolumenAsfalto = 0;
        for (TramoVia tramo: calle) {
            if(tramo.getClass().getSimpleName().equals("Asfalto"))
            sumaVolumenAsfalto += tramo.volumen();           
        }
        return sumaVolumenAsfalto;
    } 
///////////////////////////////////////////////////////////////////////////////////
    
    public double volumenNoAsfaltoTotal(){
        double sumaVolumenNoAsfalto = 0;
        for (TramoVia tramo: calle) {
            if(tramo.getClass().getSimpleName().equals("NoAsfalto"))
            sumaVolumenNoAsfalto += tramo.volumen();
        }
        return sumaVolumenNoAsfalto;
    }
    
    public void tramosConectados(){
        int contador = 0;
        for(int i=0; i<calle.size()-1;i++){
            if(calle.get(i).finX == calle.get(i+1).inicioX && calle.get(i).finY == calle.get(i+1).inicioY){
                contador ++;
            }            
        } 
        if(contador == calle.size()-1){
            System.out.println("LOS TRAMOS ESTAN CONECTADOS");
        }else{
            System.out.println("LOS TRAMOS NO ESTAN CONECTADOS");
        }
    }
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
}
