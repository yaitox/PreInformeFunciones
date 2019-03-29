package xd;
import java.util.Scanner;
public class Ej1Funciones {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
int num;
System.out.println("Digite hasta que numero quiere evaluar");
num=scanner.nextInt();
for(int i=1;i<=num;i++)
impar(i);
	}
public static void impar(int num) {
	if (num%2!=0)
		System.out.println("es impar: "+num);
	
}
}
