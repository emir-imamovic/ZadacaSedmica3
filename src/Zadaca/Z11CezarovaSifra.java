package Zadaca;

public class Z11CezarovaSifra {
	public static void main(String[] args) {

		System.out.println("Upisi rijec: ");
		String rijec = TextIO.getln();
		System.out.println("Kada se sifruje, unesena rijec glasi: ");
		ispis(rijec);

	}
/**
 * funkcija sifrira unesenu rijec "Cezarovom sifrom"
 * @param rijec koju upisuje korisnik
 */
	public static void ispis(String rijec) {
		char[] niz = rijec.toCharArray();

		for (int i = 0; i < niz.length; i++) {
			int j = niz[i] + 3;

			System.out.print((char) j);
		}

	}
}
