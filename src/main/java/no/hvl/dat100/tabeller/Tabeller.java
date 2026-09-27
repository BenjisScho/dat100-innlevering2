package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
        for (int i = 0; i < tabell.length; i++){

            if (i == tabell.length - 1){
                System.out.print(tabell[i]);
            }else{
                System.out.print(tabell[i] + ",");
            }

        }
        System.out.print("]");
        System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String stringTabell = "[";

        for (int i = 0; i < tabell.length; i++){

            if (i == tabell.length - 1){
                stringTabell = stringTabell + tabell[i];
            }else{
                stringTabell = stringTabell + tabell[i] + ",";
            }
        }
        stringTabell = stringTabell + "]";

        System.out.println(stringTabell);
        return stringTabell;
	}

	// c)
	public static int summer(int[] tabell) {

        int sum = 0;

		for (int i = 0; i < tabell.length; i++){
            sum = sum + tabell[i];
        }

        System.out.println("Sum: " + sum);
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

        boolean finnes = false;
		for (int i = 0; i < tabell.length; i++){

            if (tabell[i] == tall){
                finnes = true;
            }
        }

        System.out.println(finnes);
        return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
