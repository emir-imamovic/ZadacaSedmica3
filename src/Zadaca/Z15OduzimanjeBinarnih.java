package Zadaca;

public class Z15OduzimanjeBinarnih {
	public static void main(String[] args) {
		System.out.println("Unesi  binarne brojeve (max. 8 cifara) ");
		String broj1 = TextIO.getln();
		String broj2 = TextIO.getln();
		stringZbirBinarnih(razlikaBinarnih(broj1, broj2));
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

	public static int razlikaBinarnih(String binarni1, String binarni2) {

		int razlika = cijeli(binarni1) - cijeli(binarni2);

		return razlika;
	}

	public static void stringZbirBinarnih(int razlika) {

		String binarniBroj = "";
		for (int i = 0; i < 8; i++) {

			if (razlika % 2 != 0) {
				binarniBroj = "1" + binarniBroj;

			}
			if (razlika % 2 == 0) {
				binarniBroj = "0" + binarniBroj;
			}

			razlika = razlika / 2;

		}
		System.out.println(binarniBroj);
	}
}