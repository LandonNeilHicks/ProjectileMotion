/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Landon Hicks
 */
public class ProjectilePanel extends JPanel{
    private final Color BACKGROUND_COLOR;
    private Projectile projectile;
    BufferedImage background;
    
    public ProjectilePanel(){
       super();
       BACKGROUND_COLOR = new Color (200, 0, 100);
       projectile = new Projectile(0,0,0,260);
       background = new BufferedImage(270,270,BufferedImage.TYPE_INT_RGB);
       clearImage();
    }
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = background.getGraphics();
        projectile.paint(g2);
        g.drawImage(background,0,0, getWidth(), getHeight(), null);
    }
    
    public void clearImage(){
        Graphics g = background.getGraphics();
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0,0,background.getWidth(),background.getHeight());
    }
    public void paintAirBall(Graphics g){
        projectile.paint(g);
    }
    public void setYPos( double newPos){
        projectile.setYPos(newPos);
    }
    public void setXVel( double newVel){
        projectile.setXVel(newVel);
    }
    public void setYVel(double newVel){
        projectile.setYVel(newVel);
    }
    public void setXPos( double newPos){
        projectile.setXPos(newPos);
    }
    
    public void update(){
        projectile.setMaxXPosition(getWidth());
        projectile.setMaxYPosition(getHeight());
        repaint();
    }
    public void updatePhysics(double deltaTime){
        if(projectile.getXPos() < getWidth() - 10  && projectile.getYPos() <= getHeight() - 5 ){
            projectile.setYVel(projectile.getYVel() + .001 * deltaTime);
            projectile.setXPos(projectile.getXPos() + projectile.getXVel() * deltaTime );
            projectile.setYPos(projectile.getYPos() + projectile.getYVel() * deltaTime);
            //paintAirBall(g);
            repaint();
            System.out.println("Physics Updated");
            
            
        }
        System.out.println("Finished");
    }
        
}
