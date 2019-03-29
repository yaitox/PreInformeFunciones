package a;
import java.util.Scanner;
public class Ej2Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Escriba que numero quiere sacarle su potencia");
int x=scanner.nextInt();
System.out.println("Escriba el exponente");
int z=scanner.nextInt();
int pot1= potencia(x,z);
System.out.println("Escriba que numero quiere sacarle su potencia");
int a=scanner.nextInt();
System.out.println("Escriba el exponente");
int b=scanner.nextInt();
int pot2=potencia(a,b);
if(pot1>pot2)
	System.out.println("la potencia "+pot1+" es mayor");
else if(pot1==pot2)
	System.out.println("las dos potencias son iguales");
else
	System.out.println("La potencia "+pot2+" es mayor");

}
	public static int potencia(int x, int z) {

	    int resultado = 1;

	    for (int i = 1; i <= z; i++) {

	        resultado = resultado * x;

	    }
	    System.out.println(resultado);
	    return(resultado);
	   
	   
	}

}
