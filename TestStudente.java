package ese;

import java.util.Scanner;

public class TestStudente {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Studente primoStudente = new Studente("Lucas", 20324);
		System.out.println("Inserire il nome del primo studente:");
		primoStudente.setNome(scan.nextLine());
		System.out.println("Inserire l'anno di nascita del primo studente:");
		primoStudente.setAnnoDiNascita(scan.nextInt());
		scan.nextLine();
		System.out.println("Inserire il nome del secondo studente:");
		String secondoNome = scan.nextLine();
		System.out.println("Inserire l'anno di nascita del secondo studente:");
		int secondaData = scan.nextInt();
		Studente secondoStudente = new Studente (secondoNome, secondaData);
		if (primoStudente.getAnnoDiNascita() == secondoStudente.getAnnoDiNascita()) {
			System.out.println("I due studenti sono dello stesso anno quindi sono coetanei");
		} else if (primoStudente.getAnnoDiNascita() > secondoStudente.getAnnoDiNascita()) {
			System.out.println("Il secondo studente è nato prima del primo studente quindi non sono coetanei");
			
		} else if (primoStudente.getAnnoDiNascita() < secondoStudente.getAnnoDiNascita()) {
			System.out.println("Il primo studente è nato prima del secondo studente  quindi non sono coetanei");
		}
		
	}


}
