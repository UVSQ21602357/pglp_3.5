package fr.uvsq.uvsq21602357;

public class UneClasseMetier {
	AffichageMetier affichageMetier;
	
	public UneClasseMetier(final AffichageMetier affichageMetier)
	{
		this.affichageMetier = affichageMetier;
	}
	
	public void uneMethodeMetier() {
		affichageMetier.afficheDebut();
		affichageMetier.afficheFin();
	}
}
