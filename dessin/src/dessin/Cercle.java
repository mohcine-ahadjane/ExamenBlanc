package dessin;

import traitement.Traitement;

public class Cercle extends Figure{
    private Point centre =new Point();
    private double rayon ;
    private Traitement traitement ;

    public Cercle(int x, int y, double rayon) {
        this.centre = new Point(x,y);
        this.rayon = rayon;
    }
    public Cercle() {

    }
    public double perimetre() {
        return rayon*3.14;
    }

    @Override
    public double surface() {
        return 2*3.14*rayon;
    }

    @Override
    public void dessigner() {

    }
    @Override
    public void afficher() {
        System.out.println("************************");
        System.out.println("La figure est une circle de centre (" +centre.x+ ","+centre.y+") et de rayon "+rayon);
        System.out.println("le perimetre est : "+ perimetre());
        System.out.println("la surface  est : "+ surface());
    }

}
