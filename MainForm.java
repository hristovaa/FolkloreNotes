/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hristova
 */
public class MainForm extends javax.swing.JFrame implements Observer, Serializable{

    /**
     * Creates new form MainForm
     */
    
    private final Data dt;

    
    public MainForm() {
      
        initComponents();
        dt = new Data();
        this.dt.addObserver(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        butAdd = new javax.swing.JButton();
        butRemove = new javax.swing.JButton();
        butSave = new javax.swing.JButton();
        butOpen = new javax.swing.JButton();
        butNumElem = new javax.swing.JButton();
        butNumSteps = new javax.swing.JButton();
        butSort = new javax.swing.JButton();
        butDeleteAll = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 450, 350));
        setSize(450, 350);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Име", "Тип", "Фолк. област", "Тактов размер", "Брой стъпки"
            }
        ));
        jTable1.setDoubleBuffered(true);
        jTable1.setDragEnabled(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${rowSelectionAllowed}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("rowSelectionAllowed"));
        bindingGroup.addBinding(binding);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setCellEditor(null);
        }

        butAdd.setText("Добави");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        butRemove.setText("Премахни");
        butRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveActionPerformed(evt);
            }
        });

        butSave.setText("Запази");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        butOpen.setText("Отвори");
        butOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOpenActionPerformed(evt);
            }
        });

        butNumElem.setText("Бр.елементи");
        butNumElem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNumElemActionPerformed(evt);
            }
        });

        butNumSteps.setText("Бр. стъпки");
        butNumSteps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNumStepsActionPerformed(evt);
            }
        });

        butSort.setText("Сортирай");
        butSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortActionPerformed(evt);
            }
        });

        butDeleteAll.setText("Изтрий списък");
        butDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteAllActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Име", "Тип", "Фолк. област" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Възходящо", "Низходящо" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butNumElem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butNumSteps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butDeleteAll)
                    .addComponent(butAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butNumElem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butNumSteps, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
       new AddEditForm(dt).setVisible(true);
       
    }//GEN-LAST:event_butAddActionPerformed

    
    
    private void butRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Успешно изтрито !");
            model.fireTableDataChanged();
        }
        else {
            JOptionPane.showMessageDialog(null, "Моля изберете ред за изтриване !");
        }
    }//GEN-LAST:event_butRemoveActionPerformed

    private void butDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteAllActionPerformed
       DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();     
       dm.setRowCount(0);
       dm.fireTableDataChanged();
    }//GEN-LAST:event_butDeleteAllActionPerformed

    private void butNumElemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNumElemActionPerformed
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        JOptionPane.showMessageDialog(null, "Броят на елементите в списъка е: " + tm.getRowCount());
    }//GEN-LAST:event_butNumElemActionPerformed

    private void butNumStepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNumStepsActionPerformed
      int steps = 0;
            for(int i = 0; i < jTable1.getRowCount(); i++)
            {
                steps += Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                
            }
            JOptionPane.showMessageDialog(null, "Общият брой стъпки е: " + Integer.toString(steps));
    }//GEN-LAST:event_butNumStepsActionPerformed

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setDialogTitle("Изберете място и име за запазване на файла");
      int userSel = fileChooser.showSaveDialog(this);
      if(userSel == JFileChooser.APPROVE_OPTION){
          File fileToSave = fileChooser.getSelectedFile();
          try{
              FileWriter fw = new FileWriter(fileToSave);
              BufferedWriter bufWr = new BufferedWriter(fw);
              for(int i = 0; i < jTable1.getRowCount(); i++){
                  for(int k = 0; k < jTable1.getColumnCount(); k++){
                      bufWr.write(jTable1.getValueAt(i, k).toString() + "\t");
                  }
                  bufWr.newLine();
              }
              bufWr.close();
              fw.close();
              JOptionPane.showMessageDialog(this, "Успешно запазено", "Информация", JOptionPane.INFORMATION_MESSAGE);
          } catch (IOException ex) {
              JOptionPane.showMessageDialog(this, "Грешка", "Съобщение за грешка", JOptionPane.ERROR_MESSAGE);
          }
      }
        }

    @Override
    public void update(Observable o, Object o1) {
        this.addRow();
    }//GEN-LAST:event_butSaveActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void butOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOpenActionPerformed
        if(jTable1.getRowCount() == 0){
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        String fileName = file.getAbsolutePath();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(fr);
            
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();     
            Object[] lines = bufReader.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split("\t");
                dm.addRow(row);
            }
            
            dm.fireTableDataChanged();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
        else{
            JOptionPane.showMessageDialog(this, "Моля изтрийте списъка.", "Съобщение", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_butOpenActionPerformed

    private void butSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortActionPerformed
       TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        ArrayList list = new ArrayList();
     
  
        if(jComboBox1.getSelectedItem().equals("Име") && jComboBox2.getSelectedItem().equals("Възходящо")){
            list.add(new RowSorter.SortKey(0, SortOrder.ASCENDING) );
            sorter.setSortKeys(list);
            sorter.sort(); 
        } 
        else if(jComboBox1.getSelectedItem().equals("Тип") && jComboBox2.getSelectedItem().equals("Възходящо")){
            list.add(new RowSorter.SortKey(1, SortOrder.ASCENDING) );
            sorter.setSortKeys(list);
            sorter.sort();
        }
        else if(jComboBox1.getSelectedItem().equals("Фолк. област") && jComboBox2.getSelectedItem().equals("Възходящо")){
            list.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
            sorter.setSortKeys(list);
            sorter.sort();
        }
        else if(jComboBox1.getSelectedItem().equals("Име") && jComboBox2.getSelectedItem().equals("Низходящо")){
            list.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
            sorter.setSortKeys(list);
            sorter.sort();
        } 
        else if(jComboBox1.getSelectedItem().equals("Тип") && jComboBox2.getSelectedItem().equals("Низходящо")){
            list.add(new RowSorter.SortKey(1, SortOrder.DESCENDING) );
            sorter.setSortKeys(list);
            sorter.sort();
        }
        else if(jComboBox1.getSelectedItem().equals("Фолк. област") && jComboBox2.getSelectedItem().equals("Низходящо")){
            list.add(new RowSorter.SortKey(2, SortOrder.DESCENDING));
            sorter.setSortKeys(list);
            sorter.sort();
        } 
        else{
            JOptionPane.showMessageDialog(this, "Моля изберете критерии за сортиране.");
        } 
        
    }//GEN-LAST:event_butSortActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    public void addRow(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();
        v.add(dt.getFd().getName());
        v.add(dt.getFd().getType());
        v.add(dt.getFd().getRegion());
        v.add(dt.getFd().getSize());
        v.add(dt.getFd().getSteps());
       
        model.addRow(v);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butDeleteAll;
    private javax.swing.JButton butNumElem;
    private javax.swing.JButton butNumSteps;
    private javax.swing.JButton butOpen;
    private javax.swing.JButton butRemove;
    private javax.swing.JButton butSave;
    private javax.swing.JButton butSort;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
    
}



