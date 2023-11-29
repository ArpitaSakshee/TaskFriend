/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tamagui;

/**
 *
 * @author Christian
 */
public class StatScreen extends javax.swing.JFrame {
    private int fullness;
    private int entertained;
    private int happiness;
    /**
     * Creates new form StatScreen
     */
    public StatScreen() {
        initComponents();
        initializePetStats();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EntertainedBar = new javax.swing.JProgressBar();
        FullnessBar = new javax.swing.JProgressBar();
        HappinessBar = new javax.swing.JProgressBar();
        FullnessLabel = new javax.swing.JLabel();
        Entertained = new javax.swing.JLabel();
        HappinessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EntertainedBar.setStringPainted(true);

        FullnessBar.setStringPainted(true);

        HappinessBar.setStringPainted(true);

        FullnessLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        FullnessLabel.setText("Fullness");

        Entertained.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        Entertained.setText("Entertained");

        HappinessLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        HappinessLabel.setText("Happiness");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntertainedBar, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(HappinessLabel)
                    .addComponent(HappinessBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FullnessBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullnessLabel)
                            .addComponent(Entertained))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(FullnessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullnessBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Entertained)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntertainedBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HappinessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HappinessBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StatScreen().setVisible(true);
        });
    }
    
        
    private void initializePetStats() {
        // Set initial values for the progress bars
       this.updateFullness(100);
       this.updateEntertained(100);
       this.updateHappiness(100);
    }
    
    public void updateFullness(int fullness) {
        //OverFlow
        if (this.fullness + fullness > 100){
            this.fullness = 100;
        }else if (this.fullness + fullness <= 0) {
            // underflow
            this.fullness = 0;
        }else {
             this.fullness += fullness;
        }
        FullnessBar.setValue(this.fullness);
    }
    
    public void updateEntertained(int entertained) {
        //OverFlow
        if (this.entertained + entertained > 100){
            this.entertained = 100;
        }else if (this.entertained + entertained <= 0) {
            // underflow
            this.entertained = 0;
        }else {
             this.entertained += entertained;
        }
        EntertainedBar.setValue(this.entertained);
    }
    
 
    public void updateHappiness(int happiness) {
        //OverFlow
        if (this.happiness + happiness > 100){
            this.happiness = 100;
        }else if (this.happiness + happiness <= 0) {
            // underflow
            this.happiness = 0;
        }else {
             this.happiness += happiness;
        }
        HappinessBar.setValue(this.happiness);
    }
  
    public int getFullness() {
        return this.fullness;
    }
    
    public int getEntertained() {
        return this.entertained;
    }
    
    public int getHappiness() {
        return this.happiness;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entertained;
    private javax.swing.JProgressBar EntertainedBar;
    private javax.swing.JProgressBar FullnessBar;
    private javax.swing.JLabel FullnessLabel;
    private javax.swing.JProgressBar HappinessBar;
    private javax.swing.JLabel HappinessLabel;
    // End of variables declaration//GEN-END:variables
}
