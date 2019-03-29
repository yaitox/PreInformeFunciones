package xd;
import java.util.Scanner;
public class Ej4Functions {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	// TODO Auto-generated method stub
int num;
num=scanner.nextInt();
primoHermano(num);
	}
public static void primoHermano(int num) {
	int contCero=0;
	int primo=num+1;
	if(num%6==0)
		System.out.println("No es primo hermano");
	else
		for(int i=1;i<=primo;i++) {
			if(primo%i==0)
				contCero++;
		}
			if(contCero==2)
				System.out.println("el numero "+num+" es primo hermano");
			else
				System.out.println("no es primo hermano");
}
}
