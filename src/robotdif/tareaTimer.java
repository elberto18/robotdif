package robotdif;

import java.util.TimerTask;

public class tareaTimer extends TimerTask {

    private double omega;
    private double velocidad = 0;
    private double deltaT = 0.1 ;
    private double theta0 = 0.0;
    private double theta;
    private int  xf;
    private int xi = 0;
    private int yf ;
    private int yi = 0;
    
    private Dibujo dibujo;
  

    public tareaTimer(Dibujo dibujo) {
        this.dibujo = dibujo;
        
    }
    
    
     @Override
    public void run() {
       
         xf = (int)(velocidad*Math.cos(theta)*deltaT)+xi;
         yf = (int)(velocidad*Math.sin(theta)*deltaT)+yi;
         theta = omega*deltaT+theta0;
         
         theta0=theta;
         xi=xf;
         yi=yf;
         
        dibujo.setPosicionX(xf);
        dibujo.setPosicionY(yf);
        dibujo.setAngulo(theta);
        dibujo.repaint();
        System.out.println("Estados" + "Theta " + theta + " X "+ xf + " Y " + yf);
    }

    public double getDeltaT() {
        return deltaT;
    }

    public void setDeltaT(double deltaT) {
        this.deltaT = deltaT;
    }

    public double getTheta0() {
        return theta0;
    }

    public void setTheta0(double theta0) {
        this.theta0 = theta0;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }
    
   

    public double getOmega() {
        return omega;
    }

    public void setOmega(double omega) {
        this.omega = omega;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
   
    
    
    
}
