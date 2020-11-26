import java.util.Scanner;


public class exerc4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[],b=0,i;
		
		a = new int [10];
		
		//Entrada de dados
		for(i=0;i<10;i++) {
			System.out.println("Entre com o "+ (i+1)+"º valor:");
			a[i]=sc.nextInt();
			
			b = b + a[i];
		}
		
		//Imprimir saída para o usuário
		System.out.print("Os dez valores = " );
		for(i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		
		double res = b / 10;
		
		System.out.println();
		System.out.println();
		
		System.out.println("     Fórmula: ");
		System.out.println();
		
		System.out.println("       " + b + "               (soma dos valores)");
		System.out.println("-------------------");
		System.out.println("       10               (total de valores)");
		System.out.println();
		System.out.print("  = " + res + " resultado");
		
	  
	sc.close();

	}

}
