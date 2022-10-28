public class Cercle extends Figure implements Observer {
    private Point centre;
    private double rayon;


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
