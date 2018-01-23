package com.wordgame.gameframe;

import com.wordgame.dboperation.DBOperation;
import com.wordgame.model.Simvol;
import com.wordgame.model.Word;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AddWord extends javax.swing.JFrame {

    DBOperation db = new DBOperation();

    public AddWord() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddSimvol = new javax.swing.JButton();
        tfSimvol1 = new javax.swing.JTextField();
        tfSimvol2 = new javax.swing.JTextField();
        tfSimvol3 = new javax.swing.JTextField();
        tfSimvol4 = new javax.swing.JTextField();
        tfSimvol7 = new javax.swing.JTextField();
        tfSimvol5 = new javax.swing.JTextField();
        tfSimvol6 = new javax.swing.JTextField();
        tfSimvol8 = new javax.swing.JTextField();
        tfWord = new javax.swing.JTextField();
        btnAddWord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddSimvol.setText("Hərf əlavə et");
        btnAddSimvol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSimvolActionPerformed(evt);
            }
        });

        tfSimvol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSimvol1ActionPerformed(evt);
            }
        });
        tfSimvol1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSimvol1KeyReleased(evt);
            }
        });

        tfSimvol2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol2KeyPressed(evt);
            }
        });

        tfSimvol3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol3KeyPressed(evt);
            }
        });

        tfSimvol4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol4KeyPressed(evt);
            }
        });

        tfSimvol7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol7KeyPressed(evt);
            }
        });

        tfSimvol5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol5KeyPressed(evt);
            }
        });

        tfSimvol6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol6KeyPressed(evt);
            }
        });

        tfSimvol8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSimvol8KeyPressed(evt);
            }
        });

        btnAddWord.setText("Söz əlavə et");
        btnAddWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(tfSimvol1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSimvol8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddWord, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddSimvol, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSimvol1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSimvol8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddSimvol)
                .addGap(34, 34, 34)
                .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddWord)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSimvolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSimvolActionPerformed

        Simvol simvol = new Simvol();
        simvol.setSimvol1(tfSimvol1.getText().toUpperCase());
        simvol.setSimvol2(tfSimvol2.getText().toUpperCase());
        simvol.setSimvol3(tfSimvol3.getText().toUpperCase());
        simvol.setSimvol4(tfSimvol4.getText().toUpperCase());
        simvol.setSimvol5(tfSimvol5.getText().toUpperCase());
        simvol.setSimvol6(tfSimvol6.getText().toUpperCase());
        simvol.setSimvol7(tfSimvol7.getText().toUpperCase());
        simvol.setSimvol8(tfSimvol8.getText().toUpperCase());
        db.AddSimvol(simvol);
        simvol.setSimvol1("");
        simvol.setSimvol2("");
        simvol.setSimvol3("");
        simvol.setSimvol4("");
        simvol.setSimvol5("");
        simvol.setSimvol6("");
        simvol.setSimvol7("");
        simvol.setSimvol8("");
    }//GEN-LAST:event_btnAddSimvolActionPerformed

    private void btnAddWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWordActionPerformed
        Word w = new Word();
        String equalsWword = "";
        for (Word word : db.AllWord()) {
            if (tfWord.getText().equalsIgnoreCase(word.getWord())) {
                equalsWword = tfWord.getText();
            }
        }
        if (equalsWword.equals("")) {
            w.setWord(tfWord.getText());
            db.AddWord(w);
            tfWord.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Bu söz artıq daxil edilib !!!");
        }
    }//GEN-LAST:event_btnAddWordActionPerformed

    private void tfSimvol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSimvol1ActionPerformed


    }//GEN-LAST:event_tfSimvol1ActionPerformed

    private void tfSimvol1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol1KeyPressed
        if (tfSimvol1.getText().length() > 0) {

            tfSimvol1.setText(tfSimvol1.getText().substring(0, tfSimvol1.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol1KeyPressed

    private void tfSimvol1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol1KeyReleased

    }//GEN-LAST:event_tfSimvol1KeyReleased

    private void tfSimvol2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol2KeyPressed
        if (tfSimvol2.getText().length() > 0) {

            tfSimvol2.setText(tfSimvol2.getText().substring(0, tfSimvol2.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol2KeyPressed

    private void tfSimvol3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol3KeyPressed
        if (tfSimvol3.getText().length() > 0) {

            tfSimvol3.setText(tfSimvol3.getText().substring(0, tfSimvol3.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol3KeyPressed

    private void tfSimvol4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol4KeyPressed
        if (tfSimvol4.getText().length() > 0) {

            tfSimvol4.setText(tfSimvol4.getText().substring(0, tfSimvol4.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol4KeyPressed

    private void tfSimvol5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol5KeyPressed
        if (tfSimvol5.getText().length() > 0) {

            tfSimvol5.setText(tfSimvol5.getText().substring(0, tfSimvol5.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol5KeyPressed

    private void tfSimvol6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol6KeyPressed
        if (tfSimvol6.getText().length() > 0) {

            tfSimvol6.setText(tfSimvol6.getText().substring(0, tfSimvol6.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol6KeyPressed

    private void tfSimvol7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol7KeyPressed
        if (tfSimvol7.getText().length() > 0) {

            tfSimvol7.setText(tfSimvol7.getText().substring(0, tfSimvol7.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol7KeyPressed

    private void tfSimvol8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSimvol8KeyPressed
        if (tfSimvol8.getText().length() > 0) {

            tfSimvol8.setText(tfSimvol8.getText().substring(0, tfSimvol8.getText().length() - 1));
        }
    }//GEN-LAST:event_tfSimvol8KeyPressed

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
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSimvol;
    private javax.swing.JButton btnAddWord;
    private javax.swing.JTextField tfSimvol1;
    private javax.swing.JTextField tfSimvol2;
    private javax.swing.JTextField tfSimvol3;
    private javax.swing.JTextField tfSimvol4;
    private javax.swing.JTextField tfSimvol5;
    private javax.swing.JTextField tfSimvol6;
    private javax.swing.JTextField tfSimvol7;
    private javax.swing.JTextField tfSimvol8;
    private javax.swing.JTextField tfWord;
    // End of variables declaration//GEN-END:variables
}
