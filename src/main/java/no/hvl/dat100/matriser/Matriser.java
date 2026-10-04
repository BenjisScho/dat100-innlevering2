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

		for (int i = 0; i < matrise.length; i++) {
			String rowString = Arrays.toString(matrise[i]);

			rowString = rowString.replace("[", "").replace("]", "").replace(",", "");

			output += rowString + "\n";
		}

		return output;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] output = new int[matrise.length][]; // lager en ny matrise med den gamle som basis

		for (int i = 0; i < matrise.length; i++) {
			output[i] = new int[matrise[i].length]; // fyller ny matrise med gamle verdier
			for (int j = 0; j < matrise[i].length; j++) {
				output[i][j] = matrise[i][j] * tall;
			}
		}

		return output;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a == b) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
