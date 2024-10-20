package pkg;

public class Cuenta {
	Double saldo;
	
	public Cuenta(Double saldo)
	{
		this.saldo=saldo;
	}
	
	public Double getSald() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo=saldo;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void ingresar(Double i) {
		this.saldo += i;
	}
	
	public void retirar(Double d)
	{
		this.saldo -= d;
	}
}
