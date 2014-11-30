package Zadaca;

public class Z12BinarnaReprezentacija {
	public static void main(String[] args) {
		System.out.println("Unesibroj: ");
		int unos = TextIO.getInt();
		System.out.println("Uneseni broj u binarnom sistemu je: ");
		binarni(unos);

	}
/**
 * Funkcija konvertuje uneseni decimalni broj u binarni
 * @param decimalni broj kojeg unosi korisnik
 */
	public static void binarni(int unos) {
		String binarniBroj = "";
		for (int i = 0; i < 8; i++) {

			if (unos % 2 != 0) {
				binarniBroj = "1" + binarniBroj;

			}
			if (unos % 2 == 0) {
				binarniBroj = "0" + binarniBroj;
			}

			unos = unos / 2;

		}
		System.out.println(binarniBroj);
	}
}
