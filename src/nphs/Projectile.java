/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nphs;

/**
 *
 * @author Landon Hicks
 */
import java.awt.Graphics;
import java.awt.Color;


public class Projectile {
    private double yVelocity;
    private double xVelocity;
    private double xPosition;
    private double yPosition;
    private double maxYPosition;
    private double maxXposition;
    private int radius;
    private Color color;
    
    
    
    public Projectile(double xV,double yV, double xP, double yP){
        xVelocity = xV;
        yVelocity = yV;
        xPosition = xP;
        yPosition = yP;   
        radius = 5;
        color = new Color(255,255,255);
    }
    public void paint(Graphics g){
        g.setColor(color);
        int x = (int)(getXPos() - radius);
        int y = (int)(getYPos() - radius);
        g.fillOval(x, y, (int)(radius*2), (int)(radius*2));
 
    }
    public void setMaxXPosition(double mX){
        maxXposition = mX;
    }
    public void setMaxYPosition(double mY){
        maxYPosition = mY;
    }
    public void setXPos(double xP){
        xPosition = xP;
    }
    public void setYPos(double yP){
        xPosition = yP;
    }
    public double getXVel(){
        return xVelocity;
    }
    public double getYVel(){
        return yVelocity;
    }
    public double getXPos(){
        return xPosition;
    }
    public double getYPos(){
        return yPosition;
    }
    public void setYVel(double yV){
        yVelocity = yV;
    }
    public void setXVel(double xV){
        xVelocity = xV;
    }
}
