package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* O programa lê números positivos e negativos, armazena em vetores */
		/*  e mostra apenas os negativos. */
		/* Exercício em Java para treinamento de while, if, For e Vetores. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int contadorLimite = 0;
		int[] vetorNumerosPositivos = new int[10];
		int[] vetorNumerosNegativos = new int[10];
		
		while(x != 0 && contadorLimite <= 10) {
			System.out.println("Digite números positivos e negativos, quando quiser parar digite 0.");
			x = sc.nextInt();
			if(x > 0) {
				vetorNumerosPositivos[contadorLimite] = x;
			}else {
				vetorNumerosNegativos[contadorLimite] = x;
			}
			contadorLimite += 1;
		}
		System.out.println("Números negativos:");
		for(int i=0;i<vetorNumerosNegativos.length;i++) {
			if(vetorNumerosNegativos[i] != 0) {
				System.out.println(" "+vetorNumerosNegativos[i]+" ");
			}
		}
		System.out.println("=============================");
		System.out.println("BÔNUS: conteudo do primeiro vetor:");
		for(int i=0;i<vetorNumerosPositivos.length;i++) {
			System.out.print(" "+vetorNumerosPositivos[i]+" ");
		}
		System.out.printf("%n");
		System.out.println("BÔNUS: conteudo do segundo vetor:");
		for(int i=0;i<vetorNumerosNegativos.length;i++) {
			System.out.print(" "+vetorNumerosNegativos[i]+" ");
		}
		
		sc.close();
		
	}

}
