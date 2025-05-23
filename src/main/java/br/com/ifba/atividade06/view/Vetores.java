/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Cauã
 */
public class Vetores extends javax.swing.JFrame {
    
        private  DefaultListModel<String> modelo = new DefaultListModel<>();// cria um modelo de lista
        private int[] valores = new int[10]; // vetor de inteiros 
    /**
     * Creates new form Vetores
     */
    public Vetores() {
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

        AddValor = new javax.swing.JButton();
        RemoveValor = new javax.swing.JButton();
        OrdenaValores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListVetor = new javax.swing.JList<>();
        Valor = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddValor.setText("Adicionar");
        AddValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddValorActionPerformed(evt);
            }
        });

        RemoveValor.setText("Remove");
        RemoveValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveValorActionPerformed(evt);
            }
        });

        OrdenaValores.setText("Ordenar");
        OrdenaValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenaValoresActionPerformed(evt);
            }
        });

        for (int i = 0; i < valores.length; i++) {// percorre o vetor
            valores[i] = 0;// preenche com 0
            modelo.addElement("Vetor [" + i + "] = " + valores[i]);// coloca no modelo
        }
        ListVetor.setModel(modelo);
        ListVetor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListVetor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(ListVetor);
        ListVetor.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveValor)
                    .addComponent(OrdenaValores)
                    .addComponent(AddValor))
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddValor)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(RemoveValor))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(OrdenaValores)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        AddValor.getAccessibleContext().setAccessibleName("btnAdd");
        RemoveValor.getAccessibleContext().setAccessibleName("btnRemove");
        OrdenaValores.getAccessibleContext().setAccessibleName("btnOrdena");
        Valor.getAccessibleContext().setAccessibleName("SpnValor");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveValorActionPerformed
          
                 RemoveValor.addActionListener((ActionEvent evt1) -> {
                 int escolhido = ListVetor.getSelectedIndex();//pega o selecionado do jlist
                 int novoValor = (Integer) Valor.getValue(); // valor recebido do spinner
                 valores[escolhido] = 0; //insere o 0 pra representar a remoçao 
                 modelo.setElementAt("Vetor [" + escolhido + "] = " + 0,escolhido);//adiciona uma string  que baseada no valor do vetor
              
                
               
         });
    }//GEN-LAST:event_RemoveValorActionPerformed

    private void OrdenaValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenaValoresActionPerformed
     
     
            OrdenaValores.addActionListener((ActionEvent evt1) -> {

              Arrays.sort(valores);//ordena os elementos em ordem crescente
              modelo.clear();//limpa todos os elementos do jlist
              for(int i = 0 ; i < valores.length ; i++){
                  
            modelo.addElement("Vetor [" + i + "] = "  + valores[i]);//adiciona no modelo uma string baseada posicao e no valor do elemento vetor
                
              }
              
         });
    }//GEN-LAST:event_OrdenaValoresActionPerformed

    
    private void AddValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddValorActionPerformed
  
         AddValor.addActionListener((ActionEvent evt1) -> {
             int escolhido = ListVetor.getSelectedIndex();//pega o selecionado do jlist
             if (escolhido > -1 && escolhido < valores.length && escolhido < modelo.getSize()) { // validaçoes
                 int novoValor = (Integer) Valor.getValue(); // valor recebido do spinner
                 valores[escolhido] = novoValor; //insere o valor no escolhido do jlist
                 modelo.setElementAt("Vetor [" + escolhido + "] = " + novoValor,escolhido);//adiciona uma string  que baseada no valor do vetor
             } else {
                 JOptionPane.showMessageDialog(null, "Selecione um item da lista primeiro.");
             }   
         });
    }//GEN-LAST:event_AddValorActionPerformed

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
            java.util.logging.Logger.getLogger(Vetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vetores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddValor;
    private javax.swing.JList<String> ListVetor;
    private javax.swing.JButton OrdenaValores;
    private javax.swing.JButton RemoveValor;
    private javax.swing.JSpinner Valor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
