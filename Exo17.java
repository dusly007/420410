

public class Test {
	public static void main(String[] args) {
		char[] tableau = {'a', 'b','e','f','i','o','u','p',};
		int nbVoyelles = 0;
			for(int i = 0; i < tableau.length; i++){
			if(tableau[i] == 'a' || tableau[i] == 'e' ||tableau[i] == 'i' ||tableau[i] == 'o' ||tableau[i] == 'u' ||tableau[i] == 'y')
				nbVoyelles++;
		}
	System.out.printf("Il y a %d voyelles dans le tableau\n", nbVoyelles);
	}
}