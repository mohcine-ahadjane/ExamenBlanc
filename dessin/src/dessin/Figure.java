package dessin;

import observer.Observable;
import observer.ObservableImpl;

public abstract class Figure
{
    int epaisseur;
    int couleurCont ;
    int couleurRemp;
    Observable observable ;

    public  void update (Observable observable){
        couleurCont =((ObservableImpl) observable).getCouleurCout();
        epaisseur =((ObservableImpl) observable).getEpaisseur(); ;
        couleurRemp = ((ObservableImpl) observable).getCouleurRemp();
    }
    public  abstract double perimetre();
    public  abstract double surface();
    public  abstract void dessigner();

    public abstract  void afficher() ;
}

