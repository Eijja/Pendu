
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		int vie=5;
		char etoile[] = {'*','*','*','*'};
		char mot[] = {'c','h','a','t'};
		char reponse2='0';
		
		System.out.println("Je suis un animal très apprecié de l'internet qui suis-je ?");
		
		
		while (vie >=1)
		{

			System.out.println("IL FAUT DEVINIER LE MOT SUIVANT : "+etoile[0]+etoile[1]+etoile[2]+etoile[3]);
			Scanner clavier = new Scanner(System.in);
			char reponse = clavier.next().charAt(0);
			
			
				while (reponse == 'c' | reponse == 'h' | reponse == 'a'| reponse == 't'| reponse2 == 'c' | reponse2 == 'h' | reponse2 == 'a'| reponse2 == 't')
				{
					
					
						// test si la lettre est C
			
						if (reponse==mot[0] | reponse2==mot[0])
						{
							etoile[0]='c';
							System.out.println(""+etoile[0]+etoile[1]+etoile[2]+etoile[3]);
						}

						// test si la lettre est H
		
						if (reponse==mot[1] | reponse2==mot[1])
						{
							etoile[1]='h';
							System.out.println(""+etoile[0]+etoile[1]+etoile[2]+etoile[3]);
						}

						// test si la lettre est A
		
						if (reponse==mot[2] | reponse2==mot[2])
						{
							etoile[2]='a';
							System.out.println(""+etoile[0]+etoile[1]+etoile[2]+etoile[3]);
						}
		
						// test si la lettre est T
		
						if (reponse==mot[3] | reponse2==mot[3])
						{
							etoile[3]='t';
							System.out.println(""+etoile[0]+etoile[1]+etoile[2]+etoile[3]);
						}

					
					
						// SI LA PERMIERE EST BONNE JE RENTRE PASD DANS LA BOUCLE WHILE SI LA 2EME EST MAUVAISE JE FAIT LE IF SUIVANT :
						if (reponse2 !=  'c' & reponse2 != 'h' & reponse2 !=  'a' & reponse2 != 't' & reponse !=  'c' & reponse != 'h' & reponse !=  'a' & reponse != 't') 
						{
							vie--;
							System.out.println("ERREUR !!!!! ");					
							System.out.println("ESSAIE ENCORE MAIS ATTENTION IL TE RESTE "+vie+" vie(s)");
							System.out.println(" ");
						}

						
						if (mot[0]==etoile[0] & mot[1]==etoile[1] & mot[2]==etoile[2] & mot[3]==etoile[3])
						{
							System.out.println("L'animal qu'il fallait trouver etait bien le CHAT");
							System.exit(0);
						}
					
						
						// reponse2 car sinon ca marche pas !!
					
						System.out.println("DEVINE LA LETTRE SUIVANTE :");
						Scanner clavier2 = new Scanner(System.in);
						reponse2 = clavier2.next().charAt(0);
					
						// eviter que c ne s'imprime à chaque fois !!
						reponse = 'o';

		
				}
		vie--;
		System.out.println("ESSAIE ENCORE MAIS ATTENTION IL TE RESTE "+vie+" vie(s)");
		
		if (vie==0)
		{
		System.out.println("PERDU");	
		}
	}
}
}
		