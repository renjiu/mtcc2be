
package raizgeom;

/**
 *
 * @author Hank
 */
import java.awt.*;
import java.applet.*;
import java.awt.geom.*;

public class Line2D1 extends Applet {

    private Line2D Shape1;
    private Line2D Shape2;
    private Line2D Shape3;
    private Line2D iShape;
    //double diagonal;
    private Point2D Point1;
    private Point2D iPoint;
    double raizquadrada;
    boolean continua = true;

    public static void main(String[] args) {
        Line2D1 mede = new Line2D1();
        mede.raiziterativa();
        Line2D1 desenha = new Line2D1();
        desenha.paint(null);

    }

    public void raiziterativa() {

        boolean continua = true;

        while (continua == true) {
            iPoint = new Point2D.Double(0, raizquadrada);
            raizquadrada = iPoint.distance(Shape1.getP2());
            iShape = new Line2D.Double(Shape1.getP1(), iPoint);
            long i;
            i = Math.round(Math.pow(raizquadrada, 2)) ;

            System.out.println("raiz de " + i + " " + raizquadrada);
        }

    }

    public Line2D1() {
        Shape1 = new Line2D.Double(0, 0, 1, 0); // linha vertical vetor da esqPdir
        //Shape2 = new Line2D.Double();
        //Shape2.setLine(20.F, 0.F, 20.F, 100.F); // linha horizontal vetor de cimaPbaixo cpb
        //Shape3 = new Line2D.Double(120, 0, 20, 100); // diagonal cpb dpe.
        Point1 = new Point2D.Double(0, 1);
        Shape2 = new Line2D.Double(Shape1.getP1(), Point1);
        Shape3 = new Line2D.Double(Shape1.getP2(), Point1);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2D;
        boolean Hit;

        g2D = (Graphics2D) g;

        Hit = Shape1.intersectsLine(Shape2);
        g2D.drawString("intersects = " + Hit, 20, 145);

        g2D.draw(Shape1);
        g2D.draw(Shape2);
        g2D.draw(Shape3);

    }

}

/*
 <APPLET CODE="Line2D1"
 WIDTH=150 HEIGHT=150>
 </APPLET>   
 */
