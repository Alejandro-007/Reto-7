
package reto7;

public abstract class TramoVia {
    protected double inicioX;
    protected double inicioY;
    protected double finX;
    protected double finY; 

    public TramoVia(double inicioX, double inicioY, double finX, double finY) {
        this.inicioX = inicioX;
        this.inicioY = inicioY;
        this.finX = finX;
        this.finY = finY;
    }
    
    public abstract double longitud();
    public abstract double area();
    public abstract double volumen();  
    

    public double getInicioX() {
        return inicioX;
    }

    public void setInicioX(double inicioX) {
        this.inicioX = inicioX;
    }

    public double getInicioY() {
        return inicioY;
    }

    public void setInicioY(double inicioY) {
        this.inicioY = inicioY;
    }

    public double getFinX() {
        return finX;
    }

    public void setFinX(double finX) {
        this.finX = finX;
    }

    public double getFinY() {
        return finY;
    }

    public void setFinY(double finY) {
        this.finY = finY;
    }
}


