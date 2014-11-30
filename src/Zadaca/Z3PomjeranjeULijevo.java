package Zadaca;

public class Z3PomjeranjeULijevo {
	public static void main(String[] args) {
		System.out.println("Unesi broj elemenata niza");
		int broj = TextIO.getlnInt();
		promjeniNiz(niz(broj));
	}
/**
 * funkcija pravi niz ciju duzinu definise korisnik
 * @param broj clanova - duzina niza(definise korisnik)
 * @return niz
 */
	public static int[] niz(int brojClanova) {
		int[] niz = new int[brojClanova];
		for (int i = 0; i < brojClanova; i++) {
			System.out.println("Unesi " + i + ". broj");
			int broj = TextIO.getlnInt();
			niz[i] = broj;

		}
		return niz;
	}
/**
 * funkcija vraca niz u kojem su prethodno upisani brojevi ,pomjereni ulijevo
 * @param niz 
 * @return novi promijenjeni niz
 */
	public static int[] promjeniNiz(int[] niz) {

		for (int i = 1; i < niz.length; i++) {
			niz[i - 1] = niz[i];

		}
		niz[niz.length - 1] = 0;
		for (int i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");

		return niz;
	}

}