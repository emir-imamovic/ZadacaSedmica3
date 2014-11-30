package Zadaca;

public class Z7Palindromi {
	public static void main(String[] args) {
		System.out.println("Upisi recenicu");
		String recenica = TextIO.getln();
		System.out.println("Palindromi u unesenoj recenicu su: " + Rijeci(recenica));
	}

	/**
	 * Funkcija poredi svaku rijec sa okrenutim rijecima i tako provjerava da li su palindromi.
	 * @param recenica koju upisuje korisnik
	 * @return palindromi u recenici
	 */
	public static String Rijeci(String str) {

		String[] nizStringova = str.split(" ");
		String kontraRici = "";
		
		for(int i = 0; i < nizStringova.length; i++){
			if(nizStringova[i].toString().equals(kontraRijec(nizStringova[i].toString()))){
				kontraRici += nizStringova[i].toString() + " ";
			}
		}
		return kontraRici;
	}

	/**
	 * Funkcija prima svaku rijec posebno i okrece je.
	 * @param rijec
	 * @return okrenuta rijec
	 */
	public static String kontraRijec(String rijec) {

		String kontraRijec = "";
		for (int i = (rijec.length() - 1); i >= 0; i--) {
			kontraRijec = kontraRijec + "" + rijec.charAt(i);
		}
		kontraRijec = kontraRijec.trim();
		return kontraRijec;
	}
}
