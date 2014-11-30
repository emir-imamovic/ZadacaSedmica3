package Zadaca;

public class Z5RastaviString {
	public static void main(String[] args) {
		System.out.println("Unesite string za razdvajanje:");
		String recenica = TextIO.getln();
		System.out
				.println("Unesite delimiter po kojem zelite da se izvrsi razdvajanje:");
		char delimiter = TextIO.getAnyChar();
		String[] rezultat = rastavljanjePoDelimiteru(recenica, delimiter);
		for(int i= 0; i<rezultat.length; i++){
			System.out.println("\"" + rezultat[i].toString()+ "\"");
		}
	}

	public static String[] rastavljanjePoDelimiteru(String recenica,
			char delimiter) {
		int brojRijeci = 0;
		String zadnjaRijec = "";
		if (recenica.lastIndexOf(delimiter) != recenica.length() - 1){
			brojRijeci++;
			zadnjaRijec = recenica.substring(recenica.lastIndexOf(delimiter), recenica.length()).trim();
		}

		for (int i = 0; i < recenica.length(); i++) {
			if (recenica.charAt(i) == delimiter) {
				brojRijeci++;
			}

		}
		String[] rastavljeneRijeci = new String[brojRijeci];
		int counter = 0;
		int lastDelimiterIndex = 0;
		for (int i = 0; i < recenica.length(); i++) {
			if (recenica.charAt(i) == delimiter) {
				rastavljeneRijeci[counter++] = recenica.substring(
						lastDelimiterIndex, i).trim();
				lastDelimiterIndex = i;
			}

		}
		if(!zadnjaRijec.equals(""))
			rastavljeneRijeci[brojRijeci-1] = zadnjaRijec;
		

		return rastavljeneRijeci;
	}
}