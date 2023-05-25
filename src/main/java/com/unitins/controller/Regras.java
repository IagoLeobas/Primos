package com.unitins.controller;

public class Regras {

	public static void main(String[] args) {

		 String numero = "14159265";
	        verificarCaracteresPrimos(numero);
	    }
	    
	    public static void verificarCaracteresPrimos(String numero) {
	        for (int i = 0; i < numero.length(); i++) {
	            char caractere = numero.charAt(i);
	            
	            if (verificarPrimo(caractere)) {
	                System.out.println(caractere + " ");
	            }
	        }
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