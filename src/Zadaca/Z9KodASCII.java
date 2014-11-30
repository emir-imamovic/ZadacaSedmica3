package Zadaca;

public class Z9KodASCII {
	public static void main(String[] args) {
		System.out.println("Upisi znak");
		char unos = TextIO.getChar();
		int prethodni = (int) (unos - 1);
		int sljedeci = (int) (unos + 1);
		System.out.println("ASCII kod znaka " + unos + " je: " + (int) unos
				+ " prethodni znak je: " + (char) prethodni + ", a sljedeci znak je: " + (char) sljedeci);
	}
}
