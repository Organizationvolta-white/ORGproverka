/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rabotasmaschinami;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Rabota_zadanie10 extends javax.swing.JFrame {

    int[] carRasstoan = new int[10];
    Classrabota[] gar = new Classrabota[10];
    String[] carIshod = new String[10];
    int carNam = 0;
    int km;
    int mestopas;
    int fuelcap;
    int mpg;

    DefaultListModel dim = new DefaultListModel();
    DefaultListModel dam1 = new DefaultListModel();

    private void Cars_bb() {
        if (txtfVvodrassstoinie.getText().isEmpty() & txtfVvodpot.getText().isEmpty() & txtfVvodemk.getText().isEmpty() & txtfVvod4el.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, " Строка не должна быть пустой");
        } else {
             if(carNam <=9) {
            fuelcap = Integer.parseInt(txtfVvodemk.getText());
            mpg = Integer.parseInt(txtfVvodpot.getText());
            km = Integer.parseInt(txtfVvodrassstoinie.getText());
            mestopas = Integer.parseInt(txtfVvod4el.getText());
            Classrabota car1 = new Classrabota(fuelcap, mpg, mestopas);
            gar[carNam] = car1;
            carRasstoan[carNam] = gar[carNam].getFuelcap() * gar[carNam].getMpg();
            dam1.addElement(carRasstoan[carNam]);
            boolean booll = car1.getInfo(km);
            if (booll) {
                carIshod[carNam] = " Проедет";
                dim.addElement(carIshod[carNam]);

            } else {
                carIshod[carNam] = " Не проедет";
                dim.addElement(carIshod[carNam]);
            }
            carNam = carNam + 1;
        }
                 
        lstSkolko1.setModel(dim);
        lstProeh3.setModel(dam1);

    }
    }
    
    public Rabota_zadanie10() {
        initComponents();
        lstSkolko1.setModel(dim);
        lstProeh3.setModel(dam1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfVvodemk = new javax.swing.JTextField();
        txtfVvodpot = new javax.swing.JTextField();
        txtfVvod4el = new javax.swing.JTextField();
        btnAvtodobav = new javax.swing.JButton();
        btnDobavit = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfVvodrassstoinie = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSkolko1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProeh3 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtfVvodemk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVvodemkActionPerformed(evt);
            }
        });

        txtfVvodpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVvodpotActionPerformed(evt);
            }
        });

        btnAvtodobav.setText("Авто-ки доб-ть");

        btnDobavit.setText("Добавить");
        btnDobavit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDobavitActionPerformed(evt);
            }
        });

        btnDelet.setText("Удалить");
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });

        jLabel4.setText("Ёмкость");

        jLabel5.setText("Потребление");

        jLabel6.setText("Кол-во чел.");

        txtfVvodrassstoinie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVvodrassstoinieActionPerformed(evt);
            }
        });

        btnStart.setText("Выполнить");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel7.setText("Введите расстояние в км.");

        jScrollPane2.setViewportView(lstSkolko1);

        jScrollPane3.setViewportView(lstProeh3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfVvodemk, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(txtfVvodpot)
                            .addComponent(txtfVvod4el))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAvtodobav))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtfVvodrassstoinie, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnDobavit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAvtodobav))
                            .addComponent(txtfVvodemk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfVvodpot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDobavit)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfVvod4el, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelet))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfVvodrassstoinie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStart))
                        .addGap(57, 57, 57))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfVvodemkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVvodemkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVvodemkActionPerformed

    private void btnDobavitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDobavitActionPerformed
        Cars_bb();        
    }//GEN-LAST:event_btnDobavitActionPerformed

    private void txtfVvodrassstoinieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVvodrassstoinieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVvodrassstoinieActionPerformed

    private void txtfVvodpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVvodpotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVvodpotActionPerformed

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(Rabota_zadanie10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rabota_zadanie10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rabota_zadanie10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rabota_zadanie10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rabota_zadanie10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvtodobav;
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnDobavit;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstProeh3;
    private javax.swing.JList<String> lstSkolko1;
    private javax.swing.JTextField txtfVvod4el;
    private javax.swing.JTextField txtfVvodemk;
    private javax.swing.JTextField txtfVvodpot;
    private javax.swing.JTextField txtfVvodrassstoinie;
    // End of variables declaration//GEN-END:variables

    private String carIshod(int CarMasc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
