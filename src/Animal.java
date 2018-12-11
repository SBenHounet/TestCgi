import java.util.Scanner;

public class Animal {
	
	
	
	public Animal() {
	}
	
	public Animal(String sedeplace, String manger) {
		String reponse;
		Scanner clavier = new Scanner(System.in);

		do {
			System.out.println("Votre animal se déplace à quatre pattes? oui/Non");
			
			reponse = clavier.nextLine();
			
			if ("oui".equals(reponse)) {
				deplacer(true);
			} else {
				deplacer(false);
				
			}
			
			System.out.println("Votre animal est-il carnivore?");
			reponse =clavier.nextLine();
			
			if ("oui".equals(reponse)) {
				manger(true);
			} else {
				manger(false);
				
			}
			
			System.out.println("Voulez vous recommencez?(oui/non)");
			reponse=clavier.nextLine();
			
		} while ("oui".equals(reponse));
		clavier.close();
	}
	
	/**
	 * 
	 * @param pdeplacer
	 */
	protected static void deplacer(boolean pdeplacer) {
		if (pdeplacer) {
			System.out.println("Votre animal est quadrupède!");
		} else {
			System.out.println("Votre animal il doit être bipède ou amputé!");
		}
	}
	
	/**
	 * ma méthode fait...
	 * 
	 * @param pmanger correspond à...
	 */
	protected static void manger(boolean pmanger) {
		if (pmanger) {
			System.out.println("Votre animal aime la viande et la chair!! C'est sûrement un cousin de denver!");
		} else {
			System.out.println("Il est aime les plantes! il doit être de la même famille que bob marley!");
		}
	}
	
}

