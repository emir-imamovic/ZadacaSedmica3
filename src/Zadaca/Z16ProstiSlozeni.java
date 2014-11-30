package Zadaca;

public class Z16ProstiSlozeni {
	
	public static void main(String[] args) {
			int [] niz = new int[10];
			System.out.println("Unesi 10 cijelih pozitivnih brojeva.");
			for (int i = 0; i < 10; i++) {
				int broj = TextIO.getInt();
				niz[i] = broj;
				
			}
			System.out.println("Vas prosti niz je : ");
			 prostiNiz(niz);
			 System.out.println();
			 System.out.println("Vas slozeni niz je : ");
		     slozenNiz(niz);
		}
	/**
	 * Funkcija prima niz kojeg unosi korisnik, a vraca niz prostih brojeva
	 * @param niz brojeva koje unosi korisnik
	 * @return niz prostih brojeva
	 */
	public static int[] prostiNiz(int[] broj) {
		boolean prost = true;
		int[] prostNiz = new int[broj.length];
		int idx = 0;
		for (int j = 0; j < broj.length; j++) {
			for (int i = 2; i < broj[j]; i++) {
                
				if(broj[j]==1){
					prost=true;
					
				}
				
				if (broj[j] % i == 0 )  {
					prost = false;
					break;

				}
				if (broj[j] % i != 0) {
					prost = true;

				}
			}
			if (prost) {
				prostNiz[idx] = broj[j];
				idx++;
			}

		}

		for (int i = 0; i < prostNiz.length; i++) {
			System.out.print(prostNiz[i] + ", ");
		}

		return prostNiz;
	}
/**
 Funkcija prima niz kojeg unosi korisnik, a vraca niz slozenih brojeva
 * @param niz brojeva koje unosi korisnik
 * @return niz slozenih brojeva
 */
	public static int[] slozenNiz(int [] broj){
		
		boolean slozen = true;
		int[] slozeniNiz = new int[broj.length];
		int idx = 0;
		for (int j = 0; j < broj.length; j++) {
			for (int i = 2; i < broj[j]; i++) {
                
				
				if (broj[j] == 1)
					slozen = true;
				
				if (broj[j] % i == 0 && broj[j] != 1) {
					slozen = true;
					break;

				}
				if (broj[j] % i != 0) {
					slozen = false;

				}
			}
			if (slozen) {
				slozeniNiz[idx] = broj[j];
				idx++;
			}

		}

		for (int i = 0; i < slozeniNiz.length; i++) {
			System.out.print(slozeniNiz[i] + ", ");
		}

		return slozeniNiz;
	}
}
