package prueba_static;

public class Prueba {
    
public static double div( double x, double y){
    
    double resultado=x/y;
    
    return resultado;
    
}

//Create a function that returns the volume of a sphere with radius r.

public static double volumen(double r){
    
    double volumen=4/3*Math.PI*Math.pow(r, 3);
    
    return volumen;
}

//Create a function that returns the speed of an object falling with a given height at a given time.


public static double velocidad(double h, double t){
    
    double velocidad=Math.sqrt(2*h/t);
    
    return velocidad;

} 

//Create a function that returns the distance between two points (x1, y1) and (x2, y2).

public static double distancia(double x1, double y1, double x2, double y2){
    
    double distancia=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    
    return distancia;   

}

//Create a function that returns the volume of a cuboid with sides a, b, and c.

public static double volumenCubo(double a, double b, double c){
    
    double volumen=a*b*c;
    
    return volumen;

}


    


}