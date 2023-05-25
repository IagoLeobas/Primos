package com.unitins.service;

import org.springframework.stereotype.Service;
import com.unitins.dao.BancoDao;

@Service
public class Regras {

	public static String obterPrimos(String numero) {
		String sequencia = "";

		for (int i = 0; i < numero.length() - 3; i++) {
			String substring = numero.substring(i, i + 4);
			int num = Integer.parseInt(substring);

			if (verificaPrimo(num)) {
				sequencia += num;
			}
		}
		return sequencia;
	}

	public static boolean verificaPrimo(int numero) {
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

	public static void imprimirResultado() {
		String dadoDoBanco = BancoDao.buscarDado();
		System.out.println("-----------------------------------");
		System.out.println("Número informado: " + dadoDoBanco);
		System.out.println("Sequência obtida: " + obterPrimos(dadoDoBanco));
	}
}
