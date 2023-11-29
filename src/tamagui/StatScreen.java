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

        BoredomBar = new javax.swing.JProgressBar();
        FullnessBar = new javax.swing.JProgressBar();
        HappinessBar = new javax.swing.JProgressBar();
        FullnessLabel = new javax.swing.JLabel();
        BoredomLabel = new javax.swing.JLabel();
        HappinessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoredomBar.setStringPainted(true);

        FullnessBar.setStringPainted(true);

        HappinessBar.setStringPainted(true);

        FullnessLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        FullnessLabel.setText("Fullness");

        BoredomLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        BoredomLabel.setText("Entertained");

        HappinessLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        HappinessLabel.setText("Happiness");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoredomBar, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(HappinessLabel)
                    .addComponent(HappinessBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FullnessBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullnessLabel)
                            .addComponent(BoredomLabel))
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
                .addComponent(BoredomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoredomBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BoredomBar.setValue(100);
        FullnessBar.setValue(100);
        HappinessBar.setValue(100);
    }
    
    
    
    
    
    
    
    
    private void feedPet() {
        // Update the fullness bar when the pet is fed
        int currentFullness = FullnessBar.getValue();
        int newFullness = Math.min(100, currentFullness + 10);  //Can change the +10 to a method that deals with different foods.
        FullnessBar.setValue(newFullness);
    }
    
    private void playwithPet() {
        // Update the fullness bar when the pet is fed
        int currentBoredom = BoredomBar.getValue();
        int newBoredom = Math.min(100, currentBoredom + 10);  //Can change the +10 to a method that deals with different toys.
        FullnessBar.setValue(newBoredom);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Set Methods
    public void setBoredom(int value) {
        BoredomBar.setValue(value);
    }

    public void setFullness(int value) {
        FullnessBar.setValue(value);
    }

    public void setHappiness(int value) {
        HappinessBar.setValue(value);
    }
 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BoredomBar;
    private javax.swing.JLabel BoredomLabel;
    private javax.swing.JProgressBar FullnessBar;
    private javax.swing.JLabel FullnessLabel;
    private javax.swing.JProgressBar HappinessBar;
    private javax.swing.JLabel HappinessLabel;
    // End of variables declaration//GEN-END:variables
}
