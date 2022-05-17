package ejercicios_bucles;
import java.util.*;
public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce un número");
    int a=entrada.nextInt();
    System.out.println("Introduce un número");
    int b=entrada.nextInt();
    for(int i=a;i<b;i++)
    	if(i%2!=0&&a>b) {
    		
    	
    	System.out.println(i);
    	}else if(i%2!=0&&a<b){
    		System.out.println(-i);
    	}
    
    	
    
	}

}
