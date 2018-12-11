import java.util.Scanner;

public class Animalcompagnie extends Animal {

	private static final String VOTRE_ANIMAL_DE_COMPAGNIE_APPEL_S_ET_IL_A_ANS = "Votre animal de compagnie s'appel %s et il a %s ans";
	private String nom;
	private int age;

	public Animalcompagnie(String pNom, int pAge) {
		super();
		System.out.println("Quel est le nom de votre animal?");
		Scanner clavier = new Scanner(System.in);
		pNom = clavier.nextLine();
		nom = pNom;
		System.out.println("Quel est l'age de votre animal?");
		pAge=clavier.nextInt();
		age = pAge;

		System.out.println(String.format(VOTRE_ANIMAL_DE_COMPAGNIE_APPEL_S_ET_IL_A_ANS, pNom, pAge));
		ageAnimal();

	}

	private void ageAnimal() {
		try {
			while(age<0) {
			
			Scanner clavier = null;
			age=clavier.nextInt();
		}
		}	catch(NullPointerException e) {
				System.out.println("Vous êtes sûr que son age est négatif? c'est pas tim burton quand même? ça n'a pas de sens!! veuillez entrer un age positif!");
		}
		
		if (age>=0 && age<5) {
			System.out.println("Votre animal vient de naître!");
		} else if (age>=5&&age<10) {
			System.out.println("Votre animal est jeune");
		} else if (age>=10&&age<15) {
			System.out.println("Votre animal commence à prendre de l'age!");
		}else if(age>15) {
			System.out.println("Il est vieux! le bougre! ");
		}else {
			System.out.println("Je répète l'age doit être positif!");
		}
	}
}
