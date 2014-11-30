package Zadaca;

public class Z19PaskalovTrougao {

	public static void main(String[] args) {
		System.out.println("Unesi visinu Paskalovog trougla");
		int visinaPaskalovogTrougla = TextIO.getlnInt();
		int[][] rezultat = PaskalovTrougao(visinaPaskalovogTrougla);

		for (int i = 0; i < rezultat.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0)
					System.out.print(rezultat[i][j]);
				else
					System.out.print(rezultat[i][j] + "|");
			}
			System.out.println();
		}
	}

	/**
	 * funkcija pravi Paskalov trougao, ciju visinu(broj redova) definise
	 * korisnik
	 * 
	 * @param visina
	 *            -broj redova(unosi korisnik)
	 * @return Paskalov trougao
	 */
	public static int[][] PaskalovTrougao(int brojRedova) {
		int[][] trougao = new int[brojRedova][];
		for (int i = 0; i < trougao.length; i++) {
			trougao[i] = new int[i + 1];
		}

		for (int i = 0; i < trougao.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0 || j == 0 || j == i) {
					trougao[i][j] = 1;
				} else {
					trougao[i][j] = trougao[i - 1][j - 1] + trougao[i - 1][j];
				}
			}
		}

		return trougao;
	}
}
