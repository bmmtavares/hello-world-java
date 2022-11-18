package br.com.honda.models;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		System.out.println("Teste Ola Mundo");

		System.out.println("Digitado: " + getNroTeclado());
		System.out.println("Nome informado: " + getNome());

		// Usando git para versionamento do codigo-fonte

		System.out.println("This line is here to show how merging works");

		System.out.println("Testando git...branch hello-world-images");

	}

	public static int getNroTeclado() {
		Scanner lerTeclado = new Scanner(System.in);
		System.out.print("Informe o nro:");
		int testInt = lerTeclado.nextInt();
		lerTeclado.close();
		return testInt;
	}

	public static String getNome() {
		Scanner lerTeclado = new Scanner(System.in);
		System.out.print("Informe o nome:");
		String nome = lerTeclado.next();
		lerTeclado.close();
		return nome;
	}
}
