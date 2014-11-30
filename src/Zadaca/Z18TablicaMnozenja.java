package Zadaca;

public class Z18TablicaMnozenja {
	public static void main(String[] args) {
		System.out.println("Unesite format tablice mnozenja");
		int kolona = TextIO.getInt();
		int red = TextIO.getInt();
		
            tablicaMnozenja((kolona+1), (red+1));
	}
	/**
	 * Funkcija mnozi brojeve i pravi tablicu tih brojeva
	 * @param a redovi tablice
	 * @param b kolone tablice
	 */
		public static void tablicaMnozenja(int a, int b) {

			int[][] tablica = new int[a][b];

			for (int i = 1; i < a; i++) {
				for (int j = 1; j < b; j++) {
					tablica[i][j] = i * j;
	              System.out.print(tablica [i][j] + "  ");
	              
				}
				System.out.println();
			}

		}
}
