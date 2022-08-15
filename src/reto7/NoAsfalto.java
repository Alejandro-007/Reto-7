
package reto7;


public class NoAsfalto extends TramoVia{
    
    private String tipoMaterial;
    private double espesor;   
    private final int ancho = 6;

    public NoAsfalto(double inicioX,double inicioY,double finX,double finY, String tipoMaterial, double espesor) {
        super(inicioX,inicioY,finX,finY);
        this.tipoMaterial = tipoMaterial;
        this.espesor = espesor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {        
       this.tipoMaterial = tipoMaterial;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
    }
    
  

    @Override
    public double longitud() {
       return Math.sqrt(Math.pow(finX-inicioX,2)+ Math.pow(finY-inicioY,2));
    }

    @Override
    public double area() {
        return ancho*longitud();
    }

    @Override
    public double volumen() {
        return espesor*area();
    }
}
