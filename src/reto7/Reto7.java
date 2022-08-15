
package reto7;

// Alejandro Becerra Acevedo
// Emmanuel Bustamante

public class Reto7 {


    public static void main(String[] args) {
        
        TramoVia tramoA = new Asfalto(-4,0,0,-2,"coltan",80.3,true);
        TramoVia tramoB = new Asfalto(0,-2,2,-6,"rolt",50.3,false);
        TramoVia tramoC = new NoAsfalto(2,-6,6,-4,"piedra",0.3);
        TramoVia tramoD = new NoAsfalto(6,-4,4,0,"Arena",0.3);
        TramoVia tramoE = new NoAsfalto(4,4,8,4,"Balastro",0.3);
        
        
        Carretera gaitan = new Carretera();
        
        gaitan.setVias(tramoA);
        gaitan.setVias(tramoB);
        gaitan.setVias(tramoC);
        gaitan.setVias(tramoD);
        gaitan.setVias(tramoE);
        
        
        
        System.out.println("");
        System.out.println("Carretera Gauitan");
        System.out.println("");
        gaitan.tramosConectados();
        System.out.print("Longitud Total: " + gaitan.longitudTotal());
        System.out.println("");
        System.out.print("Area Total: " + gaitan.areaTotal());
        System.out.println("");
        System.out.print("Volumen Total: " + gaitan.volumenTotal());
        System.out.println("");
        System.out.print("Volumen Asfalto: " + gaitan.volumenAsfaltoTotal());
        System.out.println("");
        System.out.print("Volumen Sin Asfalto: " + gaitan.volumenNoAsfaltoTotal());
        System.out.println("");
        System.out.print("Distancia Tercer Tramo: " + tramoC.longitud());
        System.out.println("");
        System.out.print("Area Primer Tramo: " + tramoA.area());
        System.out.println("");
        System.out.print("Volumen Primer Tramo: " + tramoA.volumen());
        System.out.println("");
        
        Carretera eliecer = new Carretera();
        
        eliecer.setVias(tramoA);
        eliecer.setVias(tramoB);
        eliecer.setVias(tramoC);
        
        System.out.println("");
        System.out.println("Carretera Eliecer");
        System.out.println("");
        System.out.print("Longitud Total: " + eliecer.longitudTotal());
        System.out.println("");
        System.out.print("Area Total: " + eliecer.areaTotal());
        System.out.println("");
        System.out.print("Volumen Total: " + eliecer.volumenTotal());
        System.out.println("");
        System.out.print("Volumen Asfalto: " + eliecer.volumenAsfaltoTotal());
        System.out.println("");
        System.out.println("Volumen Sin Asfalto: " + eliecer.volumenNoAsfaltoTotal());
        
        eliecer.tramosConectados();

        
    }
    
}
