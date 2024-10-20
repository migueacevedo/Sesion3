package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;
import pkg.Movimiento;
import pkg.Movimiento.Signo;

class CuentaTest {
	static Cuenta cuenta;
	static Cuenta cuenta2;

	static Movimiento m1;
	static Movimiento m2;
	static Movimiento m3;
	static Movimiento m4;
	static Movimiento m5;
	static Movimiento m6;
	static Movimiento m7;
	static Movimiento m8;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345", "Miguel", 50);
		cuenta2 = new Cuenta("67890", "Antonio", 0);

		m1 = new Movimiento(200, "Reintegro", Signo.D);
		m2 = new Movimiento(350, "Reintegro", Signo.D);
		m3 = new Movimiento(100, "Ingreso", Signo.D);
		m4 = new Movimiento(200, "Reintegro", Signo.H);
		m5 = new Movimiento(150, "Reintegro", Signo.D);
		m6 = new Movimiento(200, "Reintegro", Signo.D);
		m7 = new Movimiento(50, "Ingreso", Signo.H);
		m8 = new Movimiento(100, "Reintegro", Signo.D);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(50);
		cuenta2.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {

		// assertEquals(200, cuenta.getSaldo());
	}

	@Test
	void testRetirar() {

		// assertEquals(200, cuenta.getSaldo());
	}

	@Test
	void test0014() {

		double saldoActual = cuenta.getSaldo();

		System.out.println("Saldo inicial (cuenta 1) de: " + saldoActual + "€");

		cuenta.retirar(m1.getImporte());
		cuenta.ingresar(m3.getImporte());
		cuenta.retirar(m6.getImporte());
		System.out.println("Saldo final (cuenta 1) de: " + cuenta.getSaldo() + "€");
		assertEquals(-250, cuenta.getSaldo());
		
		double saldoActual2 = cuenta2.getSaldo();
		System.out.println("Saldo inicial (cuenta 2) de: " + saldoActual2 + "€");
		cuenta2.retirar(m2.getImporte());
		cuenta2.retirar(m4.getImporte());
		cuenta2.retirar(m5.getImporte());
		cuenta2.ingresar(m7.getImporte());
		System.out.println("Saldo final (cuenta 2) de: " + cuenta2.getSaldo() + "€");
		cuenta2.retirar(m8.getImporte());

	}

}
