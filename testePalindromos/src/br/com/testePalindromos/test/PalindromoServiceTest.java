package br.com.testePalindromos.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.testePalindromos.PalindromoService;

class PalindromoServiceTest {

	private PalindromoService palindromoService;

	@BeforeEach
	void setUp() throws Exception {
		palindromoService = new PalindromoService();
	}

	@Test
	void testValidaPalindromoPositivo() {
		assertEquals(true, palindromoService.validaPalindromo("mirim"));
	}
	
	@Test
	void testValidaPalindromoNegativo() {
		assertEquals(false, palindromoService.validaPalindromo("palavra"));
	}
	
	@Test
	void testValidaPalindromoPalavraNulo() {
		assertEquals(false, palindromoService.validaPalindromo(null));
	}
	
	@Test
	void testValidaPalindromoPalavraVazia() {
		assertEquals(false, palindromoService.validaPalindromo(""));
	}
	
	@Test
	void testValidaPalindromoPalavraTamanhoInvalido() {
		assertEquals(false, palindromoService.validaPalindromo("p"));
	}
}
