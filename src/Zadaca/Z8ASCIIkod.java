package Zadaca;

public class Z8ASCIIkod {
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int unos = TextIO.getlnInt();
		char ascii = (char)unos;
		System.out.println("ASCII kod broja " + unos + " je: " + ascii);
	}
}
 