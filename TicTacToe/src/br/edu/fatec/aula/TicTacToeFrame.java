package br.edu.fatec.aula;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TicTacToeFrame extends javax.swing.JFrame {

    public TicTacToeFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jogador1TextField = new javax.swing.JTextField();
        jogador2TextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        celula0Button = new javax.swing.JButton();
        celula1Button = new javax.swing.JButton();
        celula2Button = new javax.swing.JButton();
        celula3Button = new javax.swing.JButton();
        celula4Button = new javax.swing.JButton();
        celula5Button = new javax.swing.JButton();
        celula6Button = new javax.swing.JButton();
        celula7Button = new javax.swing.JButton();
        celula8Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        reiniciarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 2 - TicTacToe");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Jogador 1");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Jogador 2");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 152, 219));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");

        jogador1TextField.setColumns(5);
        jogador1TextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jogador1TextField.setForeground(new java.awt.Color(44, 62, 80));
        jogador1TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jogador2TextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jogador2TextField.setForeground(new java.awt.Color(44, 62, 80));
        jogador2TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jogador1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jogador2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jogador1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jogador2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));

        celula0Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula0Button.setForeground(new java.awt.Color(44, 62, 80));
        celula0Button.setText("X");
        celula0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula0ButtonActionPerformed(evt);
            }
        });

        celula1Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula1Button.setForeground(new java.awt.Color(44, 62, 80));
        celula1Button.setText("X");
        celula1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula1ButtonActionPerformed(evt);
            }
        });

        celula2Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula2Button.setForeground(new java.awt.Color(44, 62, 80));
        celula2Button.setText("X");
        celula2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula2ButtonActionPerformed(evt);
            }
        });

        celula3Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula3Button.setForeground(new java.awt.Color(44, 62, 80));
        celula3Button.setText("X");
        celula3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula3ButtonActionPerformed(evt);
            }
        });

        celula4Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula4Button.setForeground(new java.awt.Color(44, 62, 80));
        celula4Button.setText("X");
        celula4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula4ButtonActionPerformed(evt);
            }
        });

        celula5Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula5Button.setForeground(new java.awt.Color(44, 62, 80));
        celula5Button.setText("X");
        celula5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula5ButtonActionPerformed(evt);
            }
        });

        celula6Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula6Button.setForeground(new java.awt.Color(44, 62, 80));
        celula6Button.setText("X");
        celula6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula6ButtonActionPerformed(evt);
            }
        });

        celula7Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula7Button.setForeground(new java.awt.Color(44, 62, 80));
        celula7Button.setText("X");
        celula7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula7ButtonActionPerformed(evt);
            }
        });

        celula8Button.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        celula8Button.setForeground(new java.awt.Color(44, 62, 80));
        celula8Button.setText("X");
        celula8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celula8ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(celula0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celula1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celula2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(celula3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(celula4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(celula5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(celula6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(celula7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(celula8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celula0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celula3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celula6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celula8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(52, 73, 94));

        reiniciarButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reiniciarButton.setForeground(new java.awt.Color(44, 62, 80));
        reiniciarButton.setText("Reiniciar");
        reiniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reiniciarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reiniciarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void setCelulas(boolean estado) {
        celula0Button.setEnabled(estado);
        celula1Button.setEnabled(estado);
        celula2Button.setEnabled(estado);
        celula3Button.setEnabled(estado);
        celula4Button.setEnabled(estado);
        celula5Button.setEnabled(estado);
        celula6Button.setEnabled(estado);
        celula7Button.setEnabled(estado);
        celula8Button.setEnabled(estado);
    }

    private void inicializarTabuleiro() {
        jogador1TextField.setText("");
        jogador2TextField.setText("");

        simbolo = "X";

        setCelulas(true);

        celula0Button.setText("");
        celula1Button.setText("");
        celula2Button.setText("");
        celula3Button.setText("");
        celula4Button.setText("");
        celula5Button.setText("");
        celula6Button.setText("");
        celula7Button.setText("");
        celula8Button.setText("");

        celula0Button.setForeground(new Color(52, 73, 94));
        celula1Button.setForeground(new Color(52, 73, 94));
        celula2Button.setForeground(new Color(52, 73, 94));
        celula3Button.setForeground(new Color(52, 73, 94));
        celula4Button.setForeground(new Color(52, 73, 94));
        celula5Button.setForeground(new Color(52, 73, 94));
        celula6Button.setForeground(new Color(52, 73, 94));
        celula7Button.setForeground(new Color(52, 73, 94));
        celula8Button.setForeground(new Color(52, 73, 94));

        jogadas = 0;
    }
    
    private void jogadaAutomatica(){
        if (jogadas < 9 && simbolo.equals("O") && jogador2TextField.getText().equals("")){
            boolean conseguirFazerJogada = false;
            while (!conseguirFazerJogada){
                int jogada = (int)(Math.random() * 9);
                if (jogada == 0 && celula0Button.isEnabled()){
                    celula0Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 1 && celula1Button.isEnabled()){
                    celula1Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 2 && celula2Button.isEnabled()){
                    celula2Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 3 && celula3Button.isEnabled()){
                    celula3Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 4 && celula4Button.isEnabled()){
                    celula4Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 5 && celula5Button.isEnabled()){
                    celula5Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 6 && celula6Button.isEnabled()){
                    celula6Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 7 && celula7Button.isEnabled()){
                    celula7Button.doClick();
                    conseguirFazerJogada = true;
                }
                else if (jogada == 8 && celula8Button.isEnabled()){
                    celula8Button.doClick();
                    conseguirFazerJogada = true;
                }
            }
        }
    }

    private void reiniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarButtonActionPerformed
        inicializarTabuleiro();
    }//GEN-LAST:event_reiniciarButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarTabuleiro();
    }//GEN-LAST:event_formWindowOpened

    private void celula0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula0ButtonActionPerformed
        celula0Button.setText(simbolo);
        celula0Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula0ButtonActionPerformed

    private void celula1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula1ButtonActionPerformed
        celula1Button.setText(simbolo);
        celula1Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula1ButtonActionPerformed

    private void celula2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula2ButtonActionPerformed
        celula2Button.setText(simbolo);
        celula2Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula2ButtonActionPerformed

    private void celula3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula3ButtonActionPerformed
        celula3Button.setText(simbolo);
        celula3Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula3ButtonActionPerformed

    private void celula4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula4ButtonActionPerformed
        celula4Button.setText(simbolo);
        celula4Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula4ButtonActionPerformed

    private void celula5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula5ButtonActionPerformed
        celula5Button.setText(simbolo);
        celula5Button.setEnabled(false);
       
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula5ButtonActionPerformed

    private void celula6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula6ButtonActionPerformed
        celula6Button.setText(simbolo);
        celula6Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula6ButtonActionPerformed

    private void celula7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula7ButtonActionPerformed
        celula7Button.setText(simbolo);
        celula7Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula7ButtonActionPerformed

    private void celula8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celula8ButtonActionPerformed
        celula8Button.setText(simbolo);
        celula8Button.setEnabled(false);
        
        jogadas++;

        if (verificaVitoria())
            return;

        if (simbolo.equals("X")) {
            simbolo = "O";
        } else {
            simbolo = "X";
        }
        
        jogadaAutomatica();
    }//GEN-LAST:event_celula8ButtonActionPerformed

    boolean verificaVitoria() {

        boolean acabouJogo = false;

        if (celula0Button.getText().equals(simbolo) && celula1Button.getText().equals(simbolo) && celula2Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula0Button.setForeground(new Color(46, 204, 113));
            celula1Button.setForeground(new Color(46, 204, 113));
            celula2Button.setForeground(new Color(46, 204, 113));
        } else if (celula3Button.getText().equals(simbolo) && celula4Button.getText().equals(simbolo) && celula5Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula3Button.setForeground(new Color(46, 204, 113));
            celula4Button.setForeground(new Color(46, 204, 113));
            celula5Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula6Button.getText().equals(simbolo) && celula7Button.getText().equals(simbolo) && celula8Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula6Button.setForeground(new Color(46, 204, 113));
            celula7Button.setForeground(new Color(46, 204, 113));
            celula8Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula0Button.getText().equals(simbolo) && celula3Button.getText().equals(simbolo) && celula6Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula0Button.setForeground(new Color(46, 204, 113));
            celula3Button.setForeground(new Color(46, 204, 113));
            celula6Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula1Button.getText().equals(simbolo) && celula4Button.getText().equals(simbolo) && celula7Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula1Button.setForeground(new Color(46, 204, 113));
            celula4Button.setForeground(new Color(46, 204, 113));
            celula7Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula2Button.getText().equals(simbolo) && celula5Button.getText().equals(simbolo) && celula8Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula2Button.setForeground(new Color(46, 204, 113));
            celula5Button.setForeground(new Color(46, 204, 113));
            celula8Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula0Button.getText().equals(simbolo) && celula4Button.getText().equals(simbolo) && celula8Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula0Button.setForeground(new Color(46, 204, 113));
            celula4Button.setForeground(new Color(46, 204, 113));
            celula8Button.setForeground(new Color(46, 204, 113));
        }
        else if (celula2Button.getText().equals(simbolo) && celula4Button.getText().equals(simbolo) && celula6Button.getText().equals(simbolo)) {
            acabouJogo = true;
            setCelulas(false);
            celula2Button.setForeground(new Color(46, 204, 113));
            celula4Button.setForeground(new Color(46, 204, 113));
            celula6Button.setForeground(new Color(46, 204, 113));
        }

        if (acabouJogo == true) {

            setCelulas(false);

            if (simbolo.equals("X")) {
                JOptionPane.showMessageDialog(null, // NULL
                        "Jogador " + jogador1TextField.getText() + " ganhou!", // Mensagem
                        "Fim do Jogo", // Titulo da janela
                        JOptionPane.INFORMATION_MESSAGE);   // Icone
            } else {
                JOptionPane.showMessageDialog(null, // NULL
                        "Jogador " + jogador2TextField.getText() + " ganhou!", // Mensagem
                        "Fim do Jogo", // Titulo da janela
                        JOptionPane.INFORMATION_MESSAGE);   // Icone
            }
        } else if (jogadas == 9) {
            
            celula0Button.setForeground(new Color(231, 76, 60));
            celula1Button.setForeground(new Color(231, 76, 60));
            celula2Button.setForeground(new Color(231, 76, 60));
            celula3Button.setForeground(new Color(231, 76, 60));
            celula4Button.setForeground(new Color(231, 76, 60));
            celula5Button.setForeground(new Color(231, 76, 60));
            celula6Button.setForeground(new Color(231, 76, 60));
            celula7Button.setForeground(new Color(231, 76, 60));
            celula8Button.setForeground(new Color(231, 76, 60));
            
            
            JOptionPane.showMessageDialog(null, // NULL
                    "Deu Velha!", // Mensagem
                    "Fim do Jogo", // Titulo da janela
                    JOptionPane.INFORMATION_MESSAGE);   // Icone
        }
        
        return acabouJogo;
    }

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    private int jogadas = 0;
    private String simbolo = "X";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton celula0Button;
    private javax.swing.JButton celula1Button;
    private javax.swing.JButton celula2Button;
    private javax.swing.JButton celula3Button;
    private javax.swing.JButton celula4Button;
    private javax.swing.JButton celula5Button;
    private javax.swing.JButton celula6Button;
    private javax.swing.JButton celula7Button;
    private javax.swing.JButton celula8Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jogador1TextField;
    private javax.swing.JTextField jogador2TextField;
    private javax.swing.JButton reiniciarButton;
    // End of variables declaration//GEN-END:variables
}
