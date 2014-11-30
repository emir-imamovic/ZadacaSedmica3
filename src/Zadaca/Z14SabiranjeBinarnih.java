package Zadaca;

public class Z14SabiranjeBinarnih {
	public static void main(String[] args) {
		System.out.println("Unesi  binarne brojeve (max. 8 cifara) ");
		String broj1 = TextIO.getln();
		String broj2 = TextIO.getln();
		stringZbirBinarnih(zbirBinarnih(broj1, broj2));
	}
	public static int cijeli(String binarni) {

		int stepen = 128;
		int zbir = 0;
		while (binarni.length() < 8) {
			binarni = "0" + binarni;

		}

		for (int i = 0; i < 8; i++) {
			if (binarni.charAt(i) == '1') {

				zbir = zbir + stepen * 1;
			}
			stepen = stepen / 2;
		}

		return zbir;
	}

	public static int zbirBinarnih(String binarni1, String binarni2) {

		int suma = cijeli(binarni1) + cijeli(binarni2);

		return suma;
	}

	public static void stringZbirBinarnih(int suma) {

		String binarniBroj = "";
		for (int i = 0; i < 8; i++) {

			if (suma % 2 != 0) {
				binarniBroj = "1" + binarniBroj;

			}
			if (suma % 2 == 0) {
				binarniBroj = "0" + binarniBroj;
			}

			suma = suma / 2;

		}
		System.out.println(binarniBroj);
	}
}
