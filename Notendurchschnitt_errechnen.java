import java.util.Scanner;

public class Notendurchschnitt_errechnen {
	
	public static void main(String[] args) {

		Scanner lesen = new Scanner(System.in);
		
		System.out.println("Wie viele Noten möchtest du eingeben?");
		int anzahl = lesen.nextInt();
		
		double [] noten = new double [anzahl];
		
		System.out.println("Dann her Damit:");
		for (int i = 0; i<noten.length; i++) {
			noten [i] = lesen.nextDouble();
		}
		
		System.out.println("Meine Noten sind: ");
		for (int i = 0; i< noten.length; i++) {
			System.out.print(noten[i] + "|");
		}
		System.out.println("");
		
		System.out.println("Mein Schnitt beträgt: "+schnitt(noten));		
	}

	public static double schnitt (double [] noten) {
		
		double summe = 0;
		int anzahl = noten.length;
		
		for(int i=0; i<noten.length; i++) {
			summe += noten [i];
		}
		
		double schnitt = summe / anzahl;
		
		return schnitt;
	}

}
