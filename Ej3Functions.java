package xd;
import java.util.Scanner;
public class Ej3Functions {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);// TODO Auto-generated method stub
int num;
num=scanner.nextInt();
primo(num);
	}
	public static void primo(int num) {
		int contCero=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				contCero++;
		}
			if(contCero==2)
				System.out.println("es primo");
			
			else
					System.out.println("no es primo");
			
		
	}

}
