package lab1;

public class Lista {

	Nodo inicio;

	int largo() {

		return largo(inicio);
	}

	int largo(Nodo n) {

		if (n == null) {
			return 0;
		}
		return 1 + largo(n.siguiente);
	}

	// Ej 8 - b)
	public void agregarRaro(Nodo n, int a, int b) {
		if (n == null) {
			return;
		}
		if (n.dato == a) {
			Nodo nuevo = new Nodo(b);
			nuevo.siguiente = n.siguiente;
			n.siguiente = nuevo;
			n = n.siguiente;
		}
		agregarRaro(n.siguiente, a, b);
	}
}
