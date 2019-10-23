package robotdif;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    private double angulo;
    private int PosicionX;
    private int PosicionY;
    private double angulo2;
    private int PosicionX2;
    private int PosicionY2;
    
    
    public Dibujo() {
    setBackground(Color.ORANGE);
    this.setBounds(0, 0, 455, 455); 
    angulo=0;
    PosicionX=0;
    PosicionY=0;
   }

    @Override
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    //AffineTransform old = g2d.getTransform();
    g2d.setColor(Color.BLUE);
    g2d.rotate(angulo,PosicionX,PosicionY);
    g2d.translate(PosicionX-225, PosicionY-225);
    g2d.fillRect(200, 200, 50, 50);
    g2d.setColor(Color.RED);
    g2d.drawLine(225, 225, 260, 225);
    g2d.setColor(Color.GREEN);
    g2d.drawLine(225, 225, 225, 260);
  //   g2d.setTransform(old);
    
    g2d.setColor(Color.BLACK);
    g2d.rotate(angulo2,PosicionX2,PosicionY2);
    g2d.translate(PosicionX2-225, PosicionY2-225);
    g2d.drawOval(200, 200, 50, 50);
    g2d.setColor(Color.RED);
    g2d.drawLine(225, 225, 260, 225);
    g2d.setColor(Color.GREEN);
    g2d.drawLine(225, 225, 225, 260);

    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    } 

    public void setPosicionX(int PosicionX) {
        this.PosicionX = PosicionX;
    }

    public void setPosicionY(int PosicionY) {
        this.PosicionY = PosicionY;
    }

    public double getAngulo() {
        return angulo;
    }

    public int getPosicionX() {
        return PosicionX;
    }

    public int getPosicionY() {
        return PosicionY;
    }

    public double getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }

    public int getPosicionX2() {
        return PosicionX2;
    }

    public void setPosicionX2(int PosicionX2) {
        this.PosicionX2 = PosicionX2;
    }

    public int getPosicionY2() {
        return PosicionY2;
    }

    public void setPosicionY2(int PosicionY2) {
        this.PosicionY2 = PosicionY2;
    }
    
    
}

