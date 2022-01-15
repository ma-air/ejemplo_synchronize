package ejemplo_synchronized;

public class SacarDinero extends Thread{
	private Cuenta c;
	String nom;
	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c = c;
	}
	public void run() {
		for(int x = 1; x <=4; x++) {
			c.RetirarDinero(10, getName());
		}
	}

}
