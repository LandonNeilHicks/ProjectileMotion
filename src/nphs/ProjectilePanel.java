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
    
    public void update(double deltaTime){
        projectile.setMaxXPosition(getWidth());
        projectile.setMaxXPosition(getWidth());
        projectile.setXPos(projectile.getXVel() * deltaTime );
        projectile.setYPos(projectile.getYVel() * deltaTime);
        repaint();
    }
        
}
