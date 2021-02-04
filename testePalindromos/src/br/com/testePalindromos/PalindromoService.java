package br.com.testePalindromos;

public class PalindromoService {

	public boolean validaPalindromo(String palavra) {

		if (palavra == null || palavra.equals("") || palavra.length() < 3) {
			return false;
		}

		String palavraInvertida = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {

			palavraInvertida += palavra.charAt(i);

		}

		if (palavraInvertida.equals(palavra)) {
			return true;
		}

		return false;

	}

}
