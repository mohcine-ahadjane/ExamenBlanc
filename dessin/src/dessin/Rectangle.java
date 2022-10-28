package dessin;

public class Rectangle extends Figure{

    private Point coinGauche =new Point();

    private double largeur ;
    private double hauteur ;

    public Rectangle(Point coinGauche, double l, double h) {
        this.coinGauche = coinGauche;
        largeur = l;
        hauteur = h;
    }
    public Rectangle() {

    }

    public Point getCoinGauche() {
        return coinGauche;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setCoinGauche(Point coinGauche) {
        this.coinGauche = coinGauche;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public double perimetre() {
        return largeur*hauteur;
    }

    @Override
    public double surface() {
        return 2*(largeur+hauteur);
    }

    @Override
    public void dessigner() {

    }


    @Override
    public void afficher() {
        System.out.println("------------------");
        System.out.println("La figure est un rectangle de Largeur "+largeur+" et d'hauteur "+hauteur);
        System.out.println("Le perimetre est :"+ perimetre());
        System.out.println("La surface  est :"+ surface());

    }


}
