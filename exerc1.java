import java.util.Scanner;


public class exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int a[],b[],i,j=0;
			
			a = new int [10];
			b = new int [10];
			
			//Entrada de dados
			for(i=0;i<10;i++) {
				System.out.println("Entre com o "+ (i+1)+"º valor:");
				a[i]=sc.nextInt();
				b[j]=(a[i]*a[i]);
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
		  
		sc.close();
	}
}
