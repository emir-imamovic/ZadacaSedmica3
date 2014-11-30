package Zadaca;

public class TikTakToe {
	/**

	* funkcija ispisuje matricu[i][j];

	* 

	* @param matrica

	*/

	public static void ispisMatrice(int[][] matrica) {


	for (int i = 0; i < matrica.length; i++) {


	for (int j = 0; j < matrica[i].length; j++) {


	System.out.print(" | " + matrica[i][j] + " |");


	}

	System.out.println();

	for (int j = 0; j < matrica[i].length; j++) {


	System.out.print(" ____ ");


	}

	System.out.println();


	}


	}

	/**

	* Funkcija ispisuje matricu koju definise korisnik 

	* @param sirina matrice(broj kolona)

	* @param visina matrice(broj redova)

	* @return matrica[visina][sirina]

	*/

	public static int[][] matrica(int sirina, int visina) {


	int[][] matrica = new int[visina][sirina];


	return matrica;


	}

	/**

	* funkcija postavlja odreðenu vrijednost na odreðeno mjesto u matrici

	* 

	* @param matrica u koju postavljamo vrijednost

	* @return nova(promijenjena)matrica

	*/

	public static int[][] postaviVrijednost(int[][] matrica, int brojac) {


	int red = 0;


	int kolona = 0;


	do {


	System.out.println("Unesite prvu koordinatu matrice");


	red = TextIO.getlnInt();


	while (red < 0 || red >= matrica.length) {


	System.out


	.println("Unijeli ste pogresnu koordinatu,pokusajte ponovo!");


	red = TextIO.getlnInt();


	}


	System.out.println("Unesite drugu koordinatu matrice");


	kolona = TextIO.getlnInt();


	while (kolona < 0 || kolona >= matrica[red].length) {


	System.out


	.println("Unijeli ste pogresnu koordinatu,pokusajte ponovo!");


	kolona = TextIO.getlnInt();


	}


	} while (matrica[red][kolona] != 0);


	int broj = brojac % 2 + 1;


	matrica[red][kolona] = broj;


	return matrica;


	}

	public static boolean sviIstiKontraDijagonala(int[][] matrica) {

	int j = matrica.length - 1;

	for (int i = 1; i < matrica.length; i++){

	int k = j - i;

	if (matrica[i - 1][k+1] != matrica[i][k]){

	return false;

	}

	}

	return true;

	}


	public static boolean sviIstiDijagonala(int[][] matrica) {

	for (int i = 1; i < matrica.length; i++){

	if (matrica[i - 1][i - 1] != matrica [i][i])

	return false;

	}

	return true;

	}


	public static boolean sviIstiKolona(int[][] matrica, int kolona) {

	int prviClan = matrica[0][kolona];

	for (int i = 1; i < matrica.length; i++){

	if (prviClan != matrica[i][kolona])

	return false;

	}

	return true;

	}


	public static boolean sviIstiRed(int[]matrica) {

	for (int i = 1; i < matrica.length; i++){

	if (matrica[i - 1]!=matrica[i])

	return false;

	}

	return true;

	}

	/**

	* Provjerava da li ima ijedna 0 u matrici

	* @param matrica koju provjeravamo

	* @return Vraca vrijednost true ako u matrici ima bar jedna 0, u suprotnom vraca vrijednost false

	*/

	public static boolean imaNule(int [][] matrica){

	for (int i = 0; i < matrica.length; i++){

	for (int j = 0; j < matrica[i].length; j++){

	if (matrica[i][j] == 0)

	return true;

	}

	}

	return false;

	}

	public static void main(String[] args) {

	int visina;

	System.out.println("Unesi visinu: ");

	visina = TextIO.getlnInt();

	int[][] matrica = matrica(visina,visina);

	ispisMatrice(matrica);

	System.out.println(imaNule(matrica));

	boolean trebaPonavljati = true;

	int brojac = 0;

	do {

	matrica = postaviVrijednost(matrica,brojac);

	for (int i = 0; i < matrica.length; i++){

	if (sviIstiRed(matrica[i]) == true && matrica[i][0] != 0){

	trebaPonavljati = false;

	}

	}	

	for (int i = 0; i < matrica[0].length; i++){

	if (sviIstiKolona(matrica,i) == true && matrica[0][i] != 0){

	trebaPonavljati = false;

	}

	}

	if (sviIstiDijagonala(matrica) == true && matrica [0][0] != 0){

	trebaPonavljati = false;

	}

	if (sviIstiKontraDijagonala(matrica) == true && matrica [0][matrica.length - 1] != 0){

	trebaPonavljati = false;

	}

	brojac ++;

	ispisMatrice(matrica);

	      }  while (imaNule(matrica) == true && trebaPonavljati == true);

	brojac --;

	if (imaNule(matrica) == true || trebaPonavljati == false) {

	System.out.println("Pobjednik je " + (brojac % 2 + 1));

	}  else {

	System.out.println("Igraj ponovo");

	}

	ispisMatrice(matrica);

	}
}
