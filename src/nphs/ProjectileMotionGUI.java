/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nphs;

/**
 *
 * @author Landon Hicks
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class ProjectileMotionGUI extends javax.swing.JFrame {
    private Timer updateTimer;
    private Projectile projectile;
    private static double yVelI;
    private static double xVelI;
    

    /**
     * Creates new form ProjectileMotionGUI
     */
    public ProjectileMotionGUI() {
        initComponents();
        projectilePanel1.update();
       updateTimer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                projectilePanel1.updatePhysics(30);
                repaint();
                
            }
        });
        
        
    }
    double vel;
    double theta;
    public double getYVel (){
        
        if(velocityInput.getText()== null || velocityInput.getText().equals("")){
            vel = 0;
        }else{
            vel =(Double.parseDouble(velocityInput.getText()));
        }
        if(angleInput.getText() == null || angleInput.getText().equals("")){
            theta = 0;
        }else{
           theta = Double.parseDouble(angleInput.getText());
        }
        return -1 * (Math.sin(theta) * vel);
        
    }
    public double getXVel (){
        
        if(velocityInput.getText()== null || velocityInput.getText().equals("")){
            vel = 0;
        }else{
            vel =(Double.parseDouble(velocityInput.getText()));
        }
        if(angleInput.getText() == null || angleInput.getText().equals("")){
            theta = 0;
        }else{
           theta = Double.parseDouble(angleInput.getText());
        }
        return Math.cos(theta) * vel;
    }
    
    public double getYPos(){
        if (yPosInput.getText() != null || yPosInput.getText() != "")
        {
            String input = yPosInput.getText();
            double newPos = Double.parseDouble(input);
            return newPos;
        }
        else{
            return 260;
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initialYPosition = new javax.swing.JSpinner();
        launchAngleInput = new javax.swing.JSpinner();
        initialVelocityInput = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        launchButton = new javax.swing.JButton();
        velocityInput = new javax.swing.JTextField();
        angleInput = new javax.swing.JTextField();
        yPosInput = new javax.swing.JTextField();
        projectilePanel1 = new nphs.ProjectilePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        initialVelocityInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        initialVelocityInput.setName(""); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        launchButton.setText("Launch!");
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        angleInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angleInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout projectilePanel1Layout = new javax.swing.GroupLayout(projectilePanel1);
        projectilePanel1.setLayout(projectilePanel1Layout);
        projectilePanel1Layout.setHorizontalGroup(
            projectilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        projectilePanel1Layout.setVerticalGroup(
            projectilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jLabel1.setText("Initial Y Pos:");

        jLabel2.setText("Launch Angle:");

        jLabel3.setText("Initial Vel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(velocityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(angleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yPosInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(launchButton)
                .addContainerGap())
            .addComponent(projectilePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(projectilePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(launchButton)
                    .addComponent(velocityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yPosInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void angleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angleInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angleInputActionPerformed

    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButtonActionPerformed
        
        System.out.println("Button Click");
        projectilePanel1.setXPos(0.0);
        projectilePanel1.setYPos(getYPos());
        projectilePanel1.setXVel(getXVel());
        projectilePanel1.setYVel(getYVel());
        updateTimer.start();
    
    }//GEN-LAST:event_launchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectileMotionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectileMotionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectileMotionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectileMotionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectileMotionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleInput;
    private javax.swing.JSpinner initialVelocityInput;
    private javax.swing.JSpinner initialYPosition;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JSpinner launchAngleInput;
    private javax.swing.JButton launchButton;
    private nphs.ProjectilePanel projectilePanel1;
    private javax.swing.JTextField velocityInput;
    private javax.swing.JTextField yPosInput;
    // End of variables declaration//GEN-END:variables
}
