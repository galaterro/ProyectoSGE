/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.cinesaztec.vista;


/**
 *
 * @author allen
 */
class JIFGestionCines extends javax.swing.JInternalFrame {

    
    /**
     * Creates new form JIFGestionCines
     */
    public JIFGestionCines() {
        initComponents();
        this.setSize(990, 700);
        this.setTitle("Gestión Cines");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtBarraMenu = new javax.swing.JToolBar();
        jbAltaCine = new javax.swing.JButton();
        jbtBajaCines = new javax.swing.JButton();
        jbModificacionCine = new javax.swing.JButton();
        jbConsultaCine = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jtBarraMenu.setRollover(true);

        jbAltaCine.setText("Alta");
        jbAltaCine.setFocusable(false);
        jbAltaCine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAltaCine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAltaCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaCineActionPerformed(evt);
            }
        });
        jtBarraMenu.add(jbAltaCine);

        jbtBajaCines.setText("Baja");
        jbtBajaCines.setFocusable(false);
        jbtBajaCines.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtBajaCines.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtBarraMenu.add(jbtBajaCines);

        jbModificacionCine.setText("Modificación");
        jbModificacionCine.setFocusable(false);
        jbModificacionCine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbModificacionCine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtBarraMenu.add(jbModificacionCine);

        jbConsultaCine.setText("Consulta");
        jbConsultaCine.setFocusable(false);
        jbConsultaCine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbConsultaCine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtBarraMenu.add(jbConsultaCine);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtBarraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 462, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaCineActionPerformed
       
    }//GEN-LAST:event_jbAltaCineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAltaCine;
    private javax.swing.JButton jbConsultaCine;
    private javax.swing.JButton jbModificacionCine;
    private javax.swing.JButton jbtBajaCines;
    private javax.swing.JToolBar jtBarraMenu;
    // End of variables declaration//GEN-END:variables
}
