package Zadaca;

public class Z4VratiZadnjihDeset {
	public static void main(String[] args) {
		unosIspisBrojeva();
	}
	/**
	 * funkcija trazi unos i ispisuje zadnjih 10 unesenih brojeva(nakon sto se upise -1)
	 * @return zadnjih 10 upisanih brojeva
	 */
	public static int[] unosIspisBrojeva() {
		int brojevi = 0;
		int[] niz = new int[10];
		do {
			for (int i = 0; i < 10; i++) {
				System.out.println("Unesi " + i + ". broj" );
				brojevi = TextIO.getlnInt();

				if (brojevi == -1) {
					System.out.print("Zadnjih 10 unesenih brojeva je: ");
					break;
				}
				niz[i] = brojevi;
			}
		} while (brojevi != -1);

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + ", ");

		}
		return niz;
	}
}