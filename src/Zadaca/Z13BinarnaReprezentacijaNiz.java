package Zadaca;

public class Z13BinarnaReprezentacijaNiz {
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int unos = TextIO.getInt();
		System.out.print("Uneseni broj u binarnom sistemu je: { " );
		binarni(unos);
		System.out.println(" }.");
	}
/**
 * funkcija pretvara decimalni broj u niz brojeva koji zajedno predstavljaju binarni zapis unesenog broja
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
		char[] binarniNiz = new char[8];
		binarniNiz = binarniBroj.toCharArray();

		for (int i = 0; i < 8; i++)
			System.out.print(binarniNiz[i] + ", ");
	}
}