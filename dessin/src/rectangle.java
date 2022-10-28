public class rectangle extends Figure implements Observer{
    private Point CoinSupGauche;
    private double largeur;
    private double hauteur;


    @Override
    public double CalculPerimetre(Observable o) {
        return 0;
    }

    @Override
    public double CalculSurface(Observer o) {
        return 0;
    }

    @Override
    public void dessiner(Observer o) {

    }
}
