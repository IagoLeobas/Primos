package com.unitins.controller;

public class Regras {

	public static void main(String[] args) {

		//String dadoDoBanco = Database.buscarDadoDoBanco();
		//System.out.print("Resultado: " + dadoDoBanco);
		//verificarCaracteresPrimos(dadoDoBanco);
	}

	public static String verificarCaracteresPrimos(String numero) {
		String sequencia = "";
		
		for (int i = 0; i < numero.length(); i++) {
			char caractere = numero.charAt(i);

			if (verificarPrimo(caractere)) {
				sequencia+= caractere ;
			}
		}
		return sequencia;
	}

	public static boolean verificarPrimo(char caractere) {
		int valor = Character.getNumericValue(caractere);

		if (valor <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(valor); i++) {
			if (valor % i == 0) {
				return false;
			}
		}

		return true;
	}
}