import java.util.*;
public class eurocalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    double x=166.386;
    double y;
    System.out.println("Introduce el número de pesetas");
    y=entrada.nextDouble();
    
    double euros=y/x;
    System.out.println(y + " pesetas son " + euros + " euros");
	}

}
