package Zadaca;

public class Z10PosljednjaRijec {
	public static void main(String[] args) {
		System.out.println("Upisi recenicu");
		String recenica = TextIO.getln();
		System.out.println("Zadnja rijec u recenici je: ");
		string(recenica);

	}
/**
 * Funkcija vraca zadnju rijec u unesenoj recenici.
 * @param recenica(unosi korisnik)
 * @return zadnja rijec u recenici.
 */
	public static String string(String recenica) {

		int brojac = 0;
		for (int i = 0; i < recenica.length(); i++) {
			recenica = recenica.trim();

		}
		System.out.println(recenica.substring(1 + recenica.lastIndexOf(' ')));
		return recenica.substring(brojac);
	}
}
