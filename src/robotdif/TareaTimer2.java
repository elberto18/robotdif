package robotdif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.TimerTask;

/**
 *
 * @author Usuario
 */
public class TareaTimer2 extends TimerTask {
    
     private double omega2;
    private double velocidad2 = 0;
    private double deltaT = 0.1 ;
    private double theta0 = 0.0;
    private double theta;
    private int  xf2;
    private int xi = 0;
    private int yf2 ;
    private int yi = 0;
    
    private Dibujo dibujo;
  

    public TareaTimer2(Dibujo dibujo) {
        this.dibujo = dibujo;
        
    }
    
    
     @Override
    public void run() {
       
         xf2 = (int)(velocidad2*Math.cos(theta)*deltaT)+xi;
         yf2 = (int)(velocidad2*Math.sin(theta)*deltaT)+yi;
         theta = omega2*deltaT+theta0;
         
         theta0=theta;
         xi=xf2;
         yi=yf2;
         
        dibujo.setPosicionX2(xf2);
        dibujo.setPosicionY2(yf2);
        dibujo.setAngulo2(theta);
        dibujo.repaint();
        System.out.println("Estados" + "Theta " + theta + " X "+ xf2 + " Y " + yf2);
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

    public int getXf2() {
        return xf2;
    }

    public void setXf2(int xf2) {
        this.xf2 = xf2;
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYf2() {
        return yf2;
    }

    public void setYf2(int yf2) {
        this.yf2 = yf2;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }
    
   

    public double getOmega2() {
        return omega2;
    }

    public void setOmega2(double omega2) {
        this.omega2 = omega2;
    }

    public double getVelocidad2() {
        return velocidad2;
    }

    public void setVelocidad2(double velocidad2) {
        this.velocidad2 = velocidad2;
    }
    
   
    
}
