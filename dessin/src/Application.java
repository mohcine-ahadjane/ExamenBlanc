import dessin.Cercle;
import dessin.Dessin;
import dessin.Point;
import dessin.Rectangle;
import observer.ObservableImpl;
import traitement.Traitement;
import traitement.TraitementImpl1;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Dessin dessin = new Dessin();

        Cercle c = new Cercle(0,0,3);
        Cercle c1 = new Cercle(0,1,5);
        Rectangle rect = new Rectangle(new Point(6,1),3,2);
        dessin.ajouterDessin(c);
        dessin.ajouterDessin(c1);
        dessin.ajouterDessin(rect);
        dessin.afficher();

        ObservableImpl objetParametrage = new ObservableImpl() ;
        objetParametrage.addAllFigures(dessin.getFigures());
        objetParametrage.setCouleurRemp(25);

        Dessin dessin1 = new Dessin();
        dessin1.ajouterDessin(new Cercle(3,4,5));
        dessin1.ajouterDessin(new Rectangle(new Point(1,1),3,4));

        dessin.ajouterDessin(dessin1);

        Traitement traitement = new TraitementImpl1();
        dessin.setTraitement(traitement);
        dessin.traiter();
        dessin.afficher();

    }
}