/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.pack;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.IOException;
import java.time.Instant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class MyFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private CrudManager crudManager = new CrudManager();
    
    public MyFrame() {
        this.setTitle("To-do List");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        minhaLista = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConectar = new javax.swing.JMenuItem();
        menuLerLista = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuInserirItem = new javax.swing.JMenuItem();
        menuLerSegundoItemDaLista = new javax.swing.JMenuItem();
        menuEditarSegundoItemDaLista = new javax.swing.JMenuItem();
        menuApagarSegundoItemDaLista = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(minhaLista);

        jMenu1.setText("Ações");

        menuConectar.setText("Conectar");
        menuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConectar);

        menuLerLista.setText("Ler Lista");
        menuLerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLerListaActionPerformed(evt);
            }
        });
        jMenu1.add(menuLerLista);
        jMenu1.add(jSeparator1);

        menuInserirItem.setText("Inserir item");
        menuInserirItem.setActionCommand("Criar item");
        menuInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirItemActionPerformed(evt);
            }
        });
        jMenu1.add(menuInserirItem);

        menuLerSegundoItemDaLista.setText("Ler 2o Item da Lista");
        menuLerSegundoItemDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLerSegundoItemDaListaActionPerformed(evt);
            }
        });
        jMenu1.add(menuLerSegundoItemDaLista);

        menuEditarSegundoItemDaLista.setText("Editar 2o item da Lista");
        menuEditarSegundoItemDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarSegundoItemDaListaActionPerformed(evt);
            }
        });
        jMenu1.add(menuEditarSegundoItemDaLista);

        menuApagarSegundoItemDaLista.setText("Apagar 2o Item da Lista");
        menuApagarSegundoItemDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApagarSegundoItemDaListaActionPerformed(evt);
            }
        });
        jMenu1.add(menuApagarSegundoItemDaLista);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirItemActionPerformed
        try {
            crudManager.insertRecord("New record " + Instant.now());
        } catch (CrudManager.NotConnectedException ex) {
        }
        menuLerListaActionPerformed(evt);
    }//GEN-LAST:event_menuInserirItemActionPerformed

    private void menuLerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLerListaActionPerformed
        List<String> records;
        try {
            records = crudManager.getAllRecords();
            minhaLista.setListData(records.toArray(new String[0]));
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuLerListaActionPerformed

    private void menuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarActionPerformed
        crudManager.connect("file.txt");
    }//GEN-LAST:event_menuConectarActionPerformed

    private void menuLerSegundoItemDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLerSegundoItemDaListaActionPerformed
        try {
            JOptionPane.showMessageDialog(null, crudManager.getRecord(1));
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuLerSegundoItemDaListaActionPerformed

    private void menuEditarSegundoItemDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarSegundoItemDaListaActionPerformed
        try {
            crudManager.updateRecord("Novo valor", 1);
        } catch (CrudManager.NotConnectedException ex) {
        }
        menuLerListaActionPerformed(evt);
    }//GEN-LAST:event_menuEditarSegundoItemDaListaActionPerformed

    private void menuApagarSegundoItemDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApagarSegundoItemDaListaActionPerformed
        try {
            crudManager.deleteRecord(1);
        } catch (CrudManager.NotConnectedException ex) {
        }
        menuLerListaActionPerformed(evt);
    }//GEN-LAST:event_menuApagarSegundoItemDaListaActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuApagarSegundoItemDaLista;
    private javax.swing.JMenuItem menuConectar;
    private javax.swing.JMenuItem menuEditarSegundoItemDaLista;
    private javax.swing.JMenuItem menuInserirItem;
    private javax.swing.JMenuItem menuLerLista;
    private javax.swing.JMenuItem menuLerSegundoItemDaLista;
    private javax.swing.JList<String> minhaLista;
    // End of variables declaration//GEN-END:variables
}
