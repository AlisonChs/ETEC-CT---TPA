import java.util.Scanner;

public class SomaDivisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("A divis�o entre " + num1 + " e " + num2 + " � igual � " +operacoes.divisao(num1,num2));
		System.out.println("A multiplica��o entre " + num1 + " e " + num2 + " � igual � " +operacoes.multiplicacao(num1,num2));
	
		sc.close();
	}
}

class operacoes {
	
	public static double divisao(double num1, double num2) {
		return (num1/num2);
	}
	
	public static double multiplicacao(double num1, double num2) {
		return (num1*num2);
	}
	
}