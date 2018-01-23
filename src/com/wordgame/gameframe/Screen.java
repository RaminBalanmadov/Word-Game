package com.wordgame.gameframe;

import com.wordgame.dboperation.DBOperation;
import com.wordgame.model.SelectedWord;
import com.wordgame.model.Simvol;
import com.wordgame.model.Word;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Screen extends javax.swing.JFrame {

    DBOperation db = new DBOperation();
    int count = 2;
    int count1 = 1;
    String text = "";
    String table = "";
    int coun = 0;
    String button1 = "";
    String button2 = "";
    String button3 = "";
    String button4 = "";
    String button5 = "";
    String button6 = "";
    String button7 = "";
    String button8 = "";
    String clickNewGame = "";

    public Screen() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb6 = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        lblWord = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        lblDelete = new javax.swing.JLabel();
        lblQarisdir = new javax.swing.JLabel();
        pgbar = new javax.swing.JProgressBar();
        lblNewGame = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.black);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tb3.setBackground(new java.awt.Color(0, 51, 255));
        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "5 Hərf"
            }
        ));
        jScrollPane1.setViewportView(tb3);

        tb4.setBackground(new java.awt.Color(0, 51, 255));
        tb4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "6 Hərf"
            }
        ));
        jScrollPane2.setViewportView(tb4);

        tb2.setBackground(new java.awt.Color(0, 51, 255));
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "4 Hərf"
            }
        ));
        jScrollPane3.setViewportView(tb2);

        tb1.setBackground(new java.awt.Color(0, 51, 255));
        tb1.setForeground(new java.awt.Color(255, 255, 255));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "3 Hərf "
            }
        ));
        jScrollPane4.setViewportView(tb1);

        tb5.setBackground(new java.awt.Color(0, 51, 255));
        tb5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "7 Hərf"
            }
        ));
        jScrollPane5.setViewportView(tb5);

        tb6.setBackground(new java.awt.Color(0, 51, 255));
        tb6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "8 Hərf"
            }
        ));
        jScrollPane6.setViewportView(tb6);

        btn1.setBackground(new java.awt.Color(255, 204, 0));
        btn1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 204, 0));
        btn2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 204, 0));
        btn4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 0));
        btn5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 204, 0));
        btn7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 204, 0));
        btn8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 204, 0));
        btn6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        lblWord.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblWord.setForeground(new java.awt.Color(51, 255, 204));
        lblWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn3.setBackground(new java.awt.Color(255, 204, 0));
        btn3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        lblDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordgame/image/delete.png"))); // NOI18N
        lblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteMouseClicked(evt);
            }
        });

        lblQarisdir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordgame/image/qarisdir.png"))); // NOI18N
        lblQarisdir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQarisdirMouseClicked(evt);
            }
        });

        lblNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wordgame/image/new game.png"))); // NOI18N
        lblNewGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNewGameMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("150");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(lblWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(76, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgbar, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDelete)
                .addGap(18, 18, 18)
                .addComponent(lblQarisdir)
                .addGap(18, 18, 18)
                .addComponent(lblNewGame)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgbar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblWord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblQarisdir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for (Simvol s : db.EightSimvolById(count)) {
            btn1.setText(s.getSimvol1());
            btn2.setText(s.getSimvol2());
            btn3.setText(s.getSimvol3());
            btn4.setText(s.getSimvol4());
            btn5.setText(s.getSimvol5());
            btn6.setText(s.getSimvol6());
            btn7.setText(s.getSimvol7());
            btn8.setText(s.getSimvol8());

        }
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int value = pgbar.getValue();
                pgbar.setValue(value + 1);

                if (pgbar.getValue() == pgbar.getMaximum() && clickNewGame.equals("")) {

                    Timer t = (Timer) e.getSource();
                    t.stop();
                    JOptionPane.showMessageDialog(null, "Vaxt Bitti!");

                } else if (pgbar.getValue() == pgbar.getMaximum() && !clickNewGame.equals("")) {
                    Timer t = (Timer) e.getSource();
                    t.stop();
                    JOptionPane.showMessageDialog(null, "New Game!");
                    
                }
            }
        };
        Timer timer = new Timer(1500, actionListener);
        timer.start();
        timer.setRepeats(true);


    }//GEN-LAST:event_formWindowOpened

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        lblWord.setText(text + btn1.getText());
        text += btn1.getText();
        button1 = btn1.getText();
        btn1.setText("");
        String word = "";
        String selectedWord = "";

        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }


    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        lblWord.setText(text + btn2.getText());
        text += btn2.getText();
        button2 = btn2.getText();
        btn2.setText("");
        String word = "";
        String selectedWord = "";

        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }


    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        lblWord.setText(text + btn4.getText());
        text += btn4.getText();
        button4 = btn4.getText();

        btn4.setText("");

        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        lblWord.setText(text + btn5.getText());
        text += btn5.getText();
        button5 = btn5.getText();
        btn5.setText("");
        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        lblWord.setText(text + btn6.getText());
        text += btn6.getText();
        button6 = btn6.getText();
        btn6.setText("");
        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        lblWord.setText(text + btn7.getText());
        text += btn7.getText();
        button7 = btn7.getText();

        btn7.setText("");
        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        lblWord.setText(text + btn8.getText());
        text += btn8.getText();
        button8 = btn8.getText();
        btn8.setText("");
        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        lblWord.setText(text + btn3.getText());
        text += btn3.getText();
        button3 = btn3.getText();
        btn3.setText("");
        String word = "";
        String selectedWord = "";
        for (Word w : db.AllWord()) {

            if (text.equalsIgnoreCase(w.getWord())) {
                word = text;
            }

        }
        SelectedWord sw = new SelectedWord();
        for (SelectedWord sw1 : db.SelectedWord()) {
            if (word.equalsIgnoreCase(sw1.getSelectedWord())) {
                selectedWord = word;
                break;
            }
        }

        if (selectedWord.equals("") && word.length() >= 3) {
            sw.setSelectedWord(text);
            db.AddSelectedWord(sw);
        }

        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();

        if (lblWord.getText().length() == 3 && selectedWord.equals("") && !word.equals("")) {
            tableModel1.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";

        } else if (lblWord.getText().length() == 4 && selectedWord.equals("") && !word.equals("")) {
            tableModel2.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 5 && selectedWord.equals("") && !word.equals("")) {
            tableModel3.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 6 && selectedWord.equals("") && !word.equals("")) {
            tableModel4.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 7 && selectedWord.equals("") && !word.equals("")) {
            tableModel5.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        } else if (lblWord.getText().length() == 8 && selectedWord.equals("") && !word.equals("")) {
            tableModel6.addRow(new Object[]{lblWord.getText()});
            formWindowOpened(null);
            lblWord.setText("");
            text = "";
        }

    }//GEN-LAST:event_btn3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        db.deleteSelectedWord();
    }//GEN-LAST:event_formWindowClosed

    private void lblDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteMouseClicked
        String deletedSimvol = "";
        int length = text.length();
        lblWord.setText(text.substring(0, length - 1).trim());
        deletedSimvol = text.substring(length - 1, length);
        if (deletedSimvol.equalsIgnoreCase(button1) && btn1.getText().equals("")) {
            btn1.setText(button1);
        } else if (deletedSimvol.equalsIgnoreCase(button2) && btn2.getText().equals("")) {
            btn2.setText(button2);
        } else if (deletedSimvol.equalsIgnoreCase(button3) && btn3.getText().equals("")) {
            btn3.setText(button3);
        } else if (deletedSimvol.equalsIgnoreCase(button4) && btn4.getText().equals("")) {
            btn4.setText(button4);
        } else if (deletedSimvol.equalsIgnoreCase(button5) && btn5.getText().equals("")) {
            btn5.setText(button5);
        } else if (deletedSimvol.equalsIgnoreCase(button6) && btn6.getText().equals("")) {
            btn6.setText(button6);
        } else if (deletedSimvol.equalsIgnoreCase(button7) && btn7.getText().equals("")) {
            btn7.setText(button7);
        } else if (deletedSimvol.equalsIgnoreCase(button8) && btn8.getText().equals("")) {
            btn8.setText(button8);
        }
        text = text.substring(0, length - 1).trim();
    }//GEN-LAST:event_lblDeleteMouseClicked

    private void lblQarisdirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQarisdirMouseClicked
        coun = ++coun;
        if (coun == 1) {
            for (Simvol s : db.EightSimvolById(count)) {
                btn1.setText(s.getSimvol8());
                btn2.setText(s.getSimvol4());
                btn3.setText(s.getSimvol3());
                btn4.setText(s.getSimvol2());
                btn5.setText(s.getSimvol5());
                btn6.setText(s.getSimvol1());
                btn7.setText(s.getSimvol7());
                btn8.setText(s.getSimvol1());

            }
            lblWord.setText("");
            text = "";
        } else if (coun == 2) {

            for (Simvol s : db.EightSimvolById(count)) {
                btn1.setText(s.getSimvol6());
                btn2.setText(s.getSimvol5());
                btn3.setText(s.getSimvol2());
                btn4.setText(s.getSimvol1());
                btn5.setText(s.getSimvol7());
                btn6.setText(s.getSimvol4());
                btn7.setText(s.getSimvol8());
                btn8.setText(s.getSimvol3());

            }
            lblWord.setText("");
            text = "";
        } else if (coun == 3) {

            for (Simvol s : db.EightSimvolById(count)) {
                btn1.setText(s.getSimvol1());
                btn2.setText(s.getSimvol4());
                btn3.setText(s.getSimvol5());
                btn4.setText(s.getSimvol2());
                btn5.setText(s.getSimvol6());
                btn6.setText(s.getSimvol7());
                btn7.setText(s.getSimvol3());
                btn8.setText(s.getSimvol8());

            }
            lblWord.setText("");
            text = "";
        } else if (coun == 4) {

            for (Simvol s : db.EightSimvolById(count)) {
                btn1.setText(s.getSimvol8());
                btn2.setText(s.getSimvol1());
                btn3.setText(s.getSimvol3());
                btn4.setText(s.getSimvol8());
                btn5.setText(s.getSimvol5());
                btn6.setText(s.getSimvol6());
                btn7.setText(s.getSimvol7());
                btn8.setText(s.getSimvol2());

            }
            lblWord.setText("");
            text = "";
        } else if (coun == 5) {

            for (Simvol s : db.EightSimvolById(count)) {
                btn1.setText(s.getSimvol3());
                btn2.setText(s.getSimvol4());
                btn3.setText(s.getSimvol8());
                btn4.setText(s.getSimvol2());
                btn5.setText(s.getSimvol5());
                btn6.setText(s.getSimvol7());
                btn7.setText(s.getSimvol1());
                btn8.setText(s.getSimvol6());

            }
            lblWord.setText("");
            text = "";
            coun = 0;
        }
    }//GEN-LAST:event_lblQarisdirMouseClicked

    private void lblNewGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNewGameMouseClicked
        clickNewGame = "new game click";
        count++;
        db.deleteSelectedWord();

        formWindowOpened(null);
        DefaultTableModel tableModel1 = (DefaultTableModel) tb1.getModel();
        DefaultTableModel tableModel2 = (DefaultTableModel) tb2.getModel();
        DefaultTableModel tableModel3 = (DefaultTableModel) tb3.getModel();
        DefaultTableModel tableModel4 = (DefaultTableModel) tb4.getModel();
        DefaultTableModel tableModel5 = (DefaultTableModel) tb5.getModel();
        DefaultTableModel tableModel6 = (DefaultTableModel) tb6.getModel();
        pgbar.setValue(0);

        tableModel1.setRowCount(0);
        tableModel2.setRowCount(0);
        tableModel3.setRowCount(0);
        tableModel4.setRowCount(0);
        tableModel5.setRowCount(0);
        tableModel6.setRowCount(0);


    }//GEN-LAST:event_lblNewGameMouseClicked

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblQarisdir;
    private javax.swing.JLabel lblWord;
    private javax.swing.JProgressBar pgbar;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTable tb4;
    private javax.swing.JTable tb5;
    private javax.swing.JTable tb6;
    // End of variables declaration//GEN-END:variables
}
