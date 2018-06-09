/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.pack;

import java.io.IOException;
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
    
    private final CrudManager crudManager = new CrudManager();
    
    public MyFrame() {
        initComponents();
        jButtonSalvar.setVisible(false);
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
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuConectar = new javax.swing.JMenuItem();
        menuMostrarTodosRegistros = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuInserRegistro = new javax.swing.JMenuItem();
        menuLerRegistro = new javax.swing.JMenuItem();
        menuEditarRegistro = new javax.swing.JMenuItem();
        menuApagarRegistro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(minhaLista);

        jLabel1.setText("CPF");

        jTextFieldNome.setText("______________");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jMenu1.setText("Ações");

        menuConectar.setText("Conectar");
        menuConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConectarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConectar);

        menuMostrarTodosRegistros.setText("Mostrar todos os registros");
        menuMostrarTodosRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarTodosRegistrosActionPerformed(evt);
            }
        });
        jMenu1.add(menuMostrarTodosRegistros);
        jMenu1.add(jSeparator1);

        menuInserRegistro.setText("Inserir registro");
        menuInserRegistro.setActionCommand("Criar item");
        menuInserRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(menuInserRegistro);

        menuLerRegistro.setText("Ler registro");
        menuLerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLerRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(menuLerRegistro);
        menuLerRegistro.getAccessibleContext().setAccessibleName("Ler Registro");

        menuEditarRegistro.setText("Editar Registro");
        menuEditarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(menuEditarRegistro);

        menuApagarRegistro.setText("Apagar registro");
        menuApagarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApagarRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(menuApagarRegistro);
        menuApagarRegistro.getAccessibleContext().setAccessibleName("Apagar Registro");

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIdade)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jTextFieldCPF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInserRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserRegistroActionPerformed
        try {
            Pessoa pessoa = new Pessoa(jTextFieldCPF.getText(), jTextFieldNome.getText(), Integer.parseInt(jTextFieldIdade.getText()));
            crudManager.insertRecord(pessoa);
            menuMostrarTodosRegistrosActionPerformed(evt);
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        }
    }//GEN-LAST:event_menuInserRegistroActionPerformed

    private void menuMostrarTodosRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarTodosRegistrosActionPerformed
        List<Object> records;
        try {
            records = crudManager.getAllRecords();
            String[] data = new String[records.size()];
            Pessoa pessoaAux;
            for(int i = 0; i < records.size(); i++) {
                pessoaAux = (Pessoa)records.get(i);
                if (pessoaAux == null)
                    data[i] = "---Registro vazio---";
                else
                    data[i] = pessoaAux.getCpf()+ "---" + pessoaAux.getNome() + "---" + pessoaAux.getIdade();
            }
            minhaLista.setListData(data);
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuMostrarTodosRegistrosActionPerformed

    private void menuConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConectarActionPerformed
        try {
            crudManager.connect("objectsDatabase.ser");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MyFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuConectarActionPerformed

    private void menuLerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLerRegistroActionPerformed
        try {
            int registroSelecionado = minhaLista.getSelectedIndex();
            if (registroSelecionado < 0) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha");
                return;
            }
            
            Pessoa pessoa = (Pessoa)crudManager.getRecord(registroSelecionado);
            if (pessoa == null) {
                JOptionPane.showMessageDialog(null, "Esse registro foi apagado e não mais ser lido/editado");
                return;
            }
            
            jTextFieldCPF.setText(pessoa.getCpf());
            jTextFieldNome.setText(pessoa.getNome());
            jTextFieldIdade.setText("" + pessoa.getIdade());
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuLerRegistroActionPerformed

    private void menuEditarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarRegistroActionPerformed
        try {
            int registroSelecionado = minhaLista.getSelectedIndex();
            if (registroSelecionado < 0) {
                JOptionPane.showMessageDialog(null, "Selecione uma linha");
                return;
            }
            
            Pessoa pessoa = (Pessoa)crudManager.getRecord(registroSelecionado);
            if (pessoa == null) {
                JOptionPane.showMessageDialog(null, "Esse registro foi apagado e não mais ser lido/editado");
                return;
            }
            
            jTextFieldCPF.setText(pessoa.getCpf());
            jTextFieldNome.setText(pessoa.getNome());
            jTextFieldIdade.setText("" + pessoa.getIdade());
            jButtonSalvar.setVisible(true);
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuEditarRegistroActionPerformed

    private void menuApagarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApagarRegistroActionPerformed
        try {
            crudManager.deleteRecord(minhaLista.getSelectedIndex());
            menuMostrarTodosRegistrosActionPerformed(evt);
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
    }//GEN-LAST:event_menuApagarRegistroActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            Pessoa pessoa = new Pessoa(jTextFieldCPF.getText(), jTextFieldNome.getText(), Integer.parseInt(jTextFieldIdade.getText()));
            crudManager.updateRecord(pessoa, minhaLista.getSelectedIndex());
            menuMostrarTodosRegistrosActionPerformed(evt);
        } catch (CrudManager.NotConnectedException ex) {
            JOptionPane.showMessageDialog(null, "Conecte antes de realizar essa operação");
        }
        jButtonSalvar.setVisible(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JMenuItem menuApagarRegistro;
    private javax.swing.JMenuItem menuConectar;
    private javax.swing.JMenuItem menuEditarRegistro;
    private javax.swing.JMenuItem menuInserRegistro;
    private javax.swing.JMenuItem menuLerRegistro;
    private javax.swing.JMenuItem menuMostrarTodosRegistros;
    private javax.swing.JList<String> minhaLista;
    // End of variables declaration//GEN-END:variables
}
