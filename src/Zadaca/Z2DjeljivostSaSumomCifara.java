package Zadaca;

public class Z2DjeljivostSaSumomCifara {
	
	public static void main(String[] args) {

		System.out.println("Unesite vas broj");
		int broj = TextIO.getlnInt();
		System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
		for (int i = 1; i <= broj; i++) {
			suma(i);

		}
	}
	/**
	 * funkcija provjerava koji su brojevi djeljivi sa sumom svojih cifara i ispisuje ih
	 * @param broj do kojeg funkcija provjerava
	 * @return brojevi djeljivi sa sumom svojih cifara
	 */
	public static int suma(int broj) {
		int suma = 0;
		int pomocna = broj;
		while (broj != 0) {
			suma = suma + broj % 10;
			broj = broj / 10;
        }
		if (pomocna % suma == 0) {
			System.out.print(pomocna + ", ");
			}
		return pomocna;
	}
	
}