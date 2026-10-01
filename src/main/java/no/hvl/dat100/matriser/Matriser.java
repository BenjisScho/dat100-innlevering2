package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++){

            System.out.print(i + ": ");
            for (int p = 0; p < matrise[i].length; p++){

                System.out.print(matrise[i][p] + " ");
            }
            System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String output = "";

		// TODO
		for (int i = 0; i < matrise.length; i++)  {
			output += Arrays.toString(matrise[i]) + "\n";
		}
		return output;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
