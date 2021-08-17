import java.util.Scanner;

public class Kassenbon {
			public static void main(String[] args) {

				Scanner scannen = new Scanner(System.in);
				
				System.out.println("Wie viele Produkte möchten Sie scannen?");
				int anzahl = scannen.nextInt();
				
				String [] Produkt = new String [anzahl]; 
				
				System.out.println("Produktname:");
				for (int i = 0; i<Produkt.length; i++) {
					Produkt [i] = scannen.next();
				}
				
				int [] anzProdukt = new int [anzahl];
				System.out.println("Anzahl der jeweiligen Produkte:");
				for (int i = 0; i<Produkt.length; i++) {
					anzProdukt [i] = scannen.nextInt();
				}
				
				double [] preisProdukt = new double [anzahl];
				System.out.println("Preis der einzelnen Produkte:");
				for (int i = 0; i<Produkt.length; i++) {
					preisProdukt [i] = scannen.nextDouble();
				}
				
				double [] ProduktSumme = new double [anzahl];
				for (int i = 0; i<Produkt.length; i++) {
					ProduktSumme[i] = anzProdukt[i] * preisProdukt[i];
				}
						
				// Inhalt der Brieftasche
				double brieftasche = 20.0;

				// Summe gekaufter Waren
				double summe = 0;
				
				for(int i = 0; i<Produkt.length; i++) {
					summe = summe + anzProdukt[i] * preisProdukt[i];
				}			
							
				// Inhalt des Wechselgeldes
				double wechselgeld = brieftasche - summe;

				while ( summe > brieftasche) {
					System.out.println("Sie haben nicht genug Geld in Ihrer Brieftasche:");
					System.out.println(brieftasche);
					System.out.println("Zu wenig:"+ wechselgeld);
					System.out.println("Wie viel Geld möchten Sie abheben?");
					brieftasche = brieftasche + scannen.nextDouble();
					wechselgeld = brieftasche - summe;
				}
				
				System.out.println();
				
					for (int i = 0; i<Produkt.length; i++) {
					System.out.println(Produkt[i] + "               " + anzProdukt[i] + " x " + preisProdukt[i] + " EUR ");
					System.out.println("                    "+ ProduktSumme[i] + " EUR ");
					System.out.println();
					}
					System.out.println("___________________________");

					System.out.println("Gesamt              " + summe + " EUR");
					System.out.println("Gegeben            " + brieftasche + " EUR");
					System.out.println();
					wechselgeld = brieftasche - summe;
					System.out.println("Zurück             " + wechselgeld + " EUR");
				}
			}
