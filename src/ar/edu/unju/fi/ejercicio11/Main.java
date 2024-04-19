package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2, j;
		int v = 0;
		int d = 1;
		boolean b = true;
		for (j = 40; j >= 0; j--) {

			if (b) {
				v = j * i;
				b = false;
				d = d + i;
			} else {
				System.out.print(v + " ");

				v = v + (40 - d);

				d = d + i;
			}
		}
	}

}
