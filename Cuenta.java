package ejemplo_synchronized;

public class Cuenta {
	private int saldo;

	Cuenta(int a) { // INICIALIZA SALFO ACTUAL
		saldo = a;
	}

	int getSaldo() { // DEVULEVE EL SALDO
		return saldo;
	}

	void restar(int cantidad) { // SE RESTA LA CANTIDAD AL SALDO
		saldo = saldo - cantidad;
	}
	
	void RetirarDinero(int cant, String nom) {
		if(getSaldo() >= cant) {
			System.out.println("SE VA A RETIRAR... SALDO ACTUAL ES: " +  getSaldo());
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex){
				
			}
			restar(cant);
			System.out.println(nom + " retira => " + cant + " ACTUAL: " + getSaldo());
			
		} else {
			System.err.println(nom + " No puede retirar dinero, NO HAY SALDO " + getSaldo());
		}
		if(getSaldo() <0) {
			System.err.println("SALDO NEGATIVO => " + getSaldo());
		}
	}
}
