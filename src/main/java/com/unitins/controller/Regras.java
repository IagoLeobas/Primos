package com.unitins.controller;

public class Regras {

	public static String obterMaioresNumerosPrimos(String numero) {
		String sequencia = "";

		for (int i = 0; i < numero.length() - 3; i++) {
			String substring = numero.substring(i, i + 4);
			int candidato = Integer.parseInt(substring);

			if (ehPrimo(candidato)) {
				sequencia += candidato + " ";
			}
		}
		return sequencia;
	}

	public static boolean ehPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}
}
