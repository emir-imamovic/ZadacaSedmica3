package Zadaca;

public class Z1SumaCifara {
	public static void main(String[] args) {
		System.out.println("Unesite broj.");
		int broj = TextIO.getlnInt();
		sumaCifara(broj);
	}
	/**
	 * funkcija vraca sumu cifara unesenog broja
	 * @param broj (unosi korisnik)
	 * @return suma cifara unesenog broja
	 */
public static int sumaCifara(int broj){
	int suma = 0;
	while (broj != 0) {
		suma += broj % 10;
		broj = broj / 10;
	}
	System.out.println("Suma cifara unesenog broja je: " + suma);
	return suma;
}

}