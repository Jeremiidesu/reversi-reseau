package reversi.gui;

import reversi.*;

public class Controleur{

    private Plateau plateau;
    private FrameJeu IHM;

    private int joueur;

    public Controleur() throws Exception {


        int joueur = 1;

        this.plateau = new Plateau(8);
        this.IHM = new FrameJeu(this);

    }

    public String getNomJoueur(int i)
    {
        return plateau.getNomJoueur(i);
    }

    public int getLargeurPlateau(){return this.plateau.getLargeur();}
    public int getHauteurPlateau(){return this.plateau.getHauteur();}
    public char getCasePlateau(int x, int y)
    {
        return this.plateau.getCase(x,y);
    }
    public int getScoreJoueur(int i){
        return this.plateau.getScoreJoueur(i);
    }

    /*public boolean jouer(int x, int y)
    {
        // Appeler le jeu

        // Changement de joueur
        joueur = 3 - joueur;

        return true;
    }*/

    public static void main(String[] args) throws Exception {
        new Controleur();
    }
}