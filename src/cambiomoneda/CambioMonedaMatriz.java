/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiomoneda;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class CambioMonedaMatriz extends javax.swing.JFrame {
    int Vmoneda [];
    int conta=1;
    int var=0;
    /**
     * Creates new form CambioMonedaMatriz
     */
    public CambioMonedaMatriz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMoneda = new javax.swing.JButton();
        TexMoneda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JacambioMo = new javax.swing.JTable();
        CambioMoneda = new javax.swing.JButton();
        TexCambio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TexRegistro = new javax.swing.JTextField();
        btnRegistra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMoneda.setText("Enviar");
        btnMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedaActionPerformed(evt);
            }
        });

        JacambioMo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JacambioMo);

        CambioMoneda.setText("Construir");
        CambioMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambioMonedaActionPerformed(evt);
            }
        });

        jLabel2.setText("Monedas");

        jLabel3.setText("Cantida Monedas ");

        btnRegistra.setText("Registra");
        btnRegistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(CambioMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addComponent(TexCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(TexMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TexRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoneda)
                    .addComponent(TexMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistra)
                            .addComponent(TexRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CambioMoneda)
                            .addComponent(TexCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedaActionPerformed
        // TODO add your handling code here:
      
        int n =0;
        try{
            n = Integer.parseInt(TexMoneda.getText());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }
        Vmoneda = new int[n+1];
        Vmoneda[0]= 0;
        btnMoneda.setEnabled(false);
        TexMoneda.setEnabled(false);
    }//GEN-LAST:event_btnMonedaActionPerformed

    private void CambioMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambioMonedaActionPerformed
        // TODO add your handling code here:
        
        int n=0,m=0;
        try{
            n = Integer.parseInt(TexMoneda.getText());
            m = Integer.parseInt(TexCambio.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }
        for(int j=0;j<=n;j++){
            jTextArea1.append(String.valueOf(Vmoneda[j])+"      ");
        } 
        CambioMoneda cm = new CambioMoneda();
        int seleccion[][]= cm.calcularMonedas(m, n,Vmoneda);
        
        this.MostrarMatriz(seleccion, n, m);
    }//GEN-LAST:event_CambioMonedaActionPerformed

    private void btnRegistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraActionPerformed
        // TODO add your handling code here:
        int n =0;
        try{
            n = Integer.parseInt(TexMoneda.getText());            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }    
        if (conta<=n){
            var=var+1;
            conta=conta+1;
            try{
                for (int i=var;i<=n;i++){                                     
                    Vmoneda[i]=Integer.parseInt(TexRegistro.getText());
                }  
                TexRegistro.setText(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }            
        }else{
             btnRegistra.setEnabled(false);
        }   
    }//GEN-LAST:event_btnRegistraActionPerformed

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
            java.util.logging.Logger.getLogger(CambioMonedaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioMonedaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioMonedaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioMonedaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioMonedaMatriz().setVisible(true);
            }
        });
    }
    
    
    
    
    public void MostrarMatriz(int  matriz[][], int n,int m){
       
       DefaultTableModel model = (DefaultTableModel) JacambioMo.getModel(); 
       model.setRowCount(n+1);
       model.setColumnCount(m+1);
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= m; j++) {
                JacambioMo.setValueAt(matriz[i][j],i, j);
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambioMoneda;
    private javax.swing.JTable JacambioMo;
    private javax.swing.JTextField TexCambio;
    private javax.swing.JTextField TexMoneda;
    private javax.swing.JTextField TexRegistro;
    private javax.swing.JButton btnMoneda;
    private javax.swing.JButton btnRegistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}