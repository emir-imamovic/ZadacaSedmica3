package Zadaca;

public class Z17Kompresovanje {
	public static void main(String[] args) {
		System.out.println("Unesite vas string");
		String unos = TextIO.getln();
		niz(unos);
	}
/**
 * Funkcija kompresuje string(rijec),odnosno, ako ima vise od dva ponavljanja istog znaka uzastopno 
 * u jednoj rijeci, funkcija ce ispisati taj znak i broj ponavljanja pored
 * @param string (rijec) koji se kompresuje
 */
	public static void niz(String rijec) {
		String[] niz = new String[rijec.length()];
		String razmak = " ";
		int brojac = 0;
		rijec = rijec + razmak;
		int idx = 0;
		
		for (int i = 0; i < rijec.length() - 1; i++) {
            String znak = "" + rijec.charAt(i);
			String znak1 = "" + rijec.charAt(i + 1);

			if (znak.equals(znak1)) {
				brojac++;
			}
			else {

				niz[idx] = znak + (brojac + 1);
				idx ++;
				brojac = 0;
			}
		}
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == null) {
				niz[i] = "";
			}
			System.out.print(niz[i]);
		}
	}
}