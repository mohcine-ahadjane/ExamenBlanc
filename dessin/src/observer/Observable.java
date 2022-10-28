package observer;

import dessin.Figure;

import java.util.List;

public interface Observable {

    public void addFigure(Figure figure) ;
    public void addAllFigures(List<Figure> figures);
    public void removeFigure(Figure figure) ;
    public void notifyFigures() ;

}
