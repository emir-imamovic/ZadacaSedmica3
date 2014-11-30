package Zadaca;

public class Z6StringNaopako {
	public static void main(String[] args) {

		
		System.out.println("Upisi recenicu: ");
		String unos = TextIO.getln();
		niz(unos);
	}
	/**
	 * funkcija okrece unesenu recenicu i ispisuje od zadnjeg ka prvom slovu
	 * @param recenica(unosi korisnik)
	 * @return okrenuta recenica
	 */
	public static String [] niz(String recenica){
		String slovo;
		String [] okrenutaRecenica = new String [recenica.length()];
		for (int i=recenica.length()-1; i>=0; i--){
			slovo = ""+recenica.charAt(i);
			okrenutaRecenica[i]=slovo;
		}	
		for( int i=okrenutaRecenica.length-1; i>=0;i--){
			System.out.print(okrenutaRecenica[i] +"");
		}
		
		return okrenutaRecenica;
		
	}
}
