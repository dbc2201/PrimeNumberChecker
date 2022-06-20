package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeNumberCheckerTest {

	private PrimeNumberChecker primeNumberChecker;

	@BeforeEach
	void setUp() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	@ParameterizedTest(name = "isPrime({arguments})")
	@ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97})
	void isPrime(int number) {
		Assertions.assertTrue(primeNumberChecker.isPrime(number));
	}

	@ParameterizedTest(name = "isPrime({arguments})")
	@ValueSource(ints = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 26, 28, 30, 32, 34, 35, 36, 38, 40, 42,
			44, 45, 46, 48, 50, 52, 54, 55, 56, 58, 60, 62, 64, 65, 66, 68, 70, 72, 74, 75, 76, 78, 80, 82, 84, 85, 86,
			88, 90, 92, 94, 95, 96, 98, 100})
	void isNotPrime(int number) {
		Assertions.assertFalse(primeNumberChecker.isPrime(number));
	}

	@ParameterizedTest(name = "isPrime({arguments})")
	@ValueSource(ints = {-1, 0, 1, Integer.MIN_VALUE, -100})
	void isNotPrimeNegative(int number) {
		Assertions.assertFalse(primeNumberChecker.isPrime(number));
	}
}