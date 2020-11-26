import java.util.Scanner;


public class exerc3 {

	/**
	 A lógica para realizar este exercício/programa, foi que ao criarmos uma variável
	 "f=10", ela serviria para descobrirmos a última posição da variável "b".  Com
	 isso, podemos reutilizar a lógica presente nos exercícios anteriores.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[],b[],i,j=0, f=10;
		
		a = new int [10];
		b = new int [10];
		
		j = f - 1; // ultima posicao de "b"
		//Entrada de dados
		for(i=0;i<10;i++) {
			System.out.println("Entre com o "+ (i+1)+"º valor:");
			a[i]=sc.nextInt();
			b[j] = a[i];
		    j = j - 1; // penultima, antepenultima, ... posicoes de "b"
		}
		
		//Imprimir saída para o usuário
		System.out.print("Vetor A = " );
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
