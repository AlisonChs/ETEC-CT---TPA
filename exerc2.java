import java.util.Scanner;


public class exerc2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int a[],b[], c[],i, f, j=0;
			
			a = new int [10];
			b = new int [10];
			c = new int [10];
			
			//Entrada de dados vetor A
			for(i=0;i<10;i++) {
				System.out.println("Entre com o "+ (i+1 )+"º valor do vetor A:");
				a[i]=sc.nextInt();
			}
			
			//Entrada de dados vetor B
			for(f=0;f<10;f++) {
				System.out.println("Entre com o "+ (f+1 )+"º valor do vetor B:");
				b[f]=sc.nextInt();
				c[j]=(a[f]+b[f]);
				j++;
			}
			
			//Imprimir saída para o usuário
			System.out.print("Vetor A =" );
			for(i=0;i<10;i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			
			System.out.print("Vetor B = " );
			for(i=0;i<10;i++) {
				System.out.print(b[i]+" ");
			}
			
			System.out.println();
			
			System.out.print("Vetor C = " );
			for(i=0;i<10;i++) {
				System.out.print(c[i]+" ");
			}
	  
		sc.close();

	}

}
