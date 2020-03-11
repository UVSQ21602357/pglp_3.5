package fr.uvsq.uvsq21600767;
import java.time.LocalDateTime;

public class AffichageMetier implements AffichageDuMetier {
	
		public void afficheDebut() {
			System.out.println(LocalDateTime.now()
					+ " : D�but de UneMethodeMetier");
		}
		
		public void afficheFin() {
			System.out.println(LocalDateTime.now()
					+ " : Fin de UneMethodeMetier");
		}
}
