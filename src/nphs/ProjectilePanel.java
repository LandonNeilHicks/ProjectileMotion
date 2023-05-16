/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author Landon Hicks
 */
public class ProjectilePanel extends JPanel{
    private final Color BACKGROUND_COLOR;
    private Projectile projectile;
    public ProjectilePanel(){
       super();
       BACKGROUND_COLOR = new Color (200, 0, 100);
       projectile = new Projectile(0,0,0,0);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0,0,getWidth(),getHeight());
        projectile.paint(g);
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
            System.out.print("Physics Updated");
            
            
        }
    }
        
}
