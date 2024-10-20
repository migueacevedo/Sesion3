package pkg;

import pkg.Movimiento.Signo;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private double saldo;
	private String numero;
	private String titular;
	private List<Movimiento> movs;

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.saldo = saldo;
		this.numero = numeroCuenta;
		this.titular = titular;
		this.movs = new ArrayList<Movimiento>();
	}

	public void ingresar(double cantidad) {
		this.saldo += cantidad;
		Movimiento movimiento = new Movimiento(cantidad, "Ingreso", Signo.H);
		movs.add(movimiento);
		System.out.println("Ingreso de " + cantidad + "€");
	}

	public void retirar(double cantidad) {
		if (saldo - cantidad >= -500) {
			saldo -= cantidad;
			Movimiento movimiento = new Movimiento(cantidad, "Retirada", Signo.D);
			movs.add(movimiento);
			System.out.println("Retirada de " + cantidad + "€");
		} else {
			System.out.println("Fondos insuficientes (" + saldo + "€) en la cuenta " + numero + " para la retirada de "
					+ cantidad + "€");
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}

	public void setmMovimientos(List<Movimiento> movs) {
		this.movs = movs;
	}
	
	public List<Movimiento> getmMovimientos() {
		return this.movs;
	}

}
