package Zadaca;

public class Z20SabiranjeMatrica {
	public static void main(String[] args) {
		System.out.print("Unesi format prve matrice, tj. visinu: ");
		int kolona = TextIO.getInt();
		System.out.print(" i sirinu: ");
		int red = TextIO.getInt();
		System.out.print("Unesi format druge matrice, tj. visinu: ");
		int kolona1 = TextIO.getInt();
		System.out.print(" i sirinu: ");
		int red1 = TextIO.getInt();

		sumaMatrica(prvaMatrica(kolona, red), drugaMatrica(kolona1, red1));
	}

	/**
	 * Funkcija pravi prvu matricu koju definise korisnik
	 * 
	 * @return matrica
	 */
	public static int[][] prvaMatrica(int kolona, int red) {

		int[][] matrica = new int[kolona][red];

		for (int i = 0; i < kolona; i++) {
			for (int j = 0; j < red; j++) {
				System.out.println("Unesi broj");
				int unos = TextIO.getlnInt();
				matrica[i][j] = unos;

			}

		}

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {

				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();

		}

		return matrica;
	}

	/**
	 * Funkcija pravi drugu matricu koju definise korisnik
	 * 
	 * @return matrica
	 */
	public static int[][] drugaMatrica(int kolona1, int red1) {
		int[][] matrica = new int[kolona1][red1];

		for (int i = 0; i < kolona1; i++) {
			for (int j = 0; j < red1; j++) {
				System.out.println("Unesi broj");
				int unos = TextIO.getInt();
				matrica[i][j] = unos;

			}

		}

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {

				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();

		}

		return matrica;
	}

	/**
	 * Funkcija sabira dvije matrice koje je korisnik prethodno definisao.
	 * 
	 * @param prva matrica
	 * @param druga matrica
	 * @return zbir prve i druge matrice
	 */
	public static int[][] sumaMatrica(int[][] matrica1, int[][] matrica2) {
		int[][] sumaMatrica = new int[matrica1.length][matrica1.length];

		if (matrica1.length != matrica2.length) {
			System.out.println("Matrice nisu istog formata.");
			return sumaMatrica;
		}

		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1[i].length; j++) {
				sumaMatrica[i][j] = matrica1[i][j] + matrica2[i][j];
			}

		}
		System.out.println("Suma matrica je: ");
		for (int i = 0; i < sumaMatrica.length; i++) {
			for (int j = 0; j < sumaMatrica[i].length; j++) {

				System.out.print(sumaMatrica[i][j] + " ");
			}
			System.out.println();

		}
		return sumaMatrica;

	}
}
