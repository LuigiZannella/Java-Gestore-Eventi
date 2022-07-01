package jana60;

import java.time.LocalDate;
import java.util.Scanner;

public class Vacanza {

	public static void main(String[] args) throws Exception {

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Benvenuto in Java Spettacolo");
		
        System.out.println("Inserisci Titolo Evento:");
        String evento = scan.nextLine();
        
        System.out.println("Inserisci la capienza dell'evento:");
        int capienza = Integer.parseInt(scan.nextLine());
        
        System.out.println("Inserisci il Giorno:");
        int giorno = Integer.parseInt(scan.nextLine());
        System.out.println("Inserisci il Mese:");
        int mese = Integer.parseInt(scan.nextLine());
        System.out.println("Inserisci il Anno:");
        int anno = Integer.parseInt(scan.nextLine());
        
        LocalDate data = LocalDate.of(anno, mese, giorno);
        
        Evento eve = new Evento(evento, data, capienza);
        
        scan.close();
        
	    
	}
}