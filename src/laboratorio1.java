
public class laboratorio1 {

	public static void main(String[] args) {

		System.out.println(" >> Practico 0 <<");

		// Ej 1
		System.out.println(" ");
		System.out.println(" Ejercicio 1");
		imprimirImparesEntre1y50();

		// Ej 2
		System.out.println(" ");
		System.out.println(" Ejercicio 2");
		int nro = 8989;
		imprimirNrosConEspacioEntreSi(nro);

		// Ej 3
		System.out.println(" ");
		System.out.println(" Ejercicio 3");
		int n = 6;
		// Iterativo:
		listarDel1AlN(n);
		// Recursivo:
		// listarHastaNRecur(n);

		System.out.println(" ");
		System.out.println(" Ejercicio 3 - Reverso");
		// Iterativo: listarDel1AlNReverso(n);
		// Recursivo:
		listarHastaNReverRecur(n);

		int nf = 3;
		System.out.println(" ");
		System.out.println(" Ejercicio 4 - Factorial de " + nf);
		System.out.println(" " + factorial(nf));

		System.out.println(" ");
		System.out.println(" Ejercicio 5 ");

		int[] arreglo = { 2, 4, 6, 8, 9 };
		// a
		retoranarMinimoElemento(arreglo);
		// b
		retornarPosicionMaxElemento(arreglo);
		// c
		ordenaRecursivo(arreglo, 6);

		// Ejercicio 8
		// b)
		Nodo nodo = new Nodo(3);
		Lista lista = new Lista();
		int a = 7;
		int b = 3;
		lista.agregarRaro(nodo, a, b);
		/*
		 * 5 ways to sort a vector > SELECTION Sort (get the minimum(or maximum)
		 * and switch) INSERTION Sort (have a ordered vector, and go inserting
		 * the next item from the unordered vector) BUBBLE Sort (gathers a
		 * couple of two and switches them if they're not in order) MERGE Sort
		 * (divide vectors of vector in two and then merge the ordered vectors)
		 * QUICK Sort (grab a random pivot element and compare the items on the
		 * left and the right of the pivot, usually the first element is the one
		 * used as the pivot)
		 */

	}

	private static void ordenaRecursivo(int[] arreglo, int max) {
		// Selection Sort gathering max value first, recursive 2nd
		if (arreglo[0] < max) {
		}
		for (int i = 0; i < arreglo.length; i++) {

		}
	}

	private static void retornarPosicionMaxElemento(int[] arreglo) {
		int pos = 0;
		int max = arreglo[pos];

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
				pos = i;
			}
		}
		System.out.println(" b) Posicion del maximo elemento: " + pos);
	}

	private static void retoranarMinimoElemento(int[] arreglo) {
		int min = arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
		}
		System.out.println(" a) Minimo elemento: " + min);
	}

	// Test 5) a)
	int min(int[] arreglo, int largo) {
		return minimo(arreglo, arreglo.length - 1, arreglo.length);
	}

	// usar largo como parametro para evitar ejecutar el lengh
	private int minimo(int[] arreglo, int pos, int largo) {
		int minRes = 0;
		if (pos == largo) {
			return arreglo[pos];
		} else {
			// asignar resultado de minimo a minRes para no ejecutarlo dos veces
			minRes = minimo(arreglo, pos, largo);
			if (arreglo[pos] < minRes) { // 1
				return arreglo[pos];
			} else {
				return minRes; // 2
			}
		}
	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	private static void imprimirNrosConEspacioEntreSi(int nro) {
		String nroStr = String.valueOf(nro);
		for (int i = 0; i < nroStr.length(); i++) {
			char chr = nroStr.charAt(i);
			System.out.println(" " + chr);
		}

	}

	private static void imprimirImparesEntre1y50() {

		int res = 0;
		for (int i = 1; i < 51; i++) {
			if (i % 2 != 0) {
				res = res + i;
			}
		}
		System.out.println(" Total suma de nros impares: " + res);
	}

	private static void listarDel1AlN(int n) {
		int fin = 0;
		while (fin != n) {
			fin++;
			System.out.println(fin);
		}
	}

	private static void listarHastaNRecur(int n) {
		int fin = 1;
		if (fin <= n) {
			System.out.println(fin);
			fin++;
			listarHastaNRecur(fin);
		}
	}

	private static void listarHastaNReverRecur(int n) {
		int fin = n;
		if (fin != 0) {
			System.out.println(fin);
			fin--;
			listarHastaNReverRecur(fin);
		}
	}

	private static void listarDel1AlNReverso(int n) {
		int fin = n;
		while (fin > 0) {
			System.out.println(fin);
			fin--;
		}
	}

}
