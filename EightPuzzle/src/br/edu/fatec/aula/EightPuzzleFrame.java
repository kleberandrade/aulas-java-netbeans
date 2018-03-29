/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatec.aula;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class EightPuzzleFrame extends javax.swing.JFrame {

    public EightPuzzleFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        movimentoLabel = new javax.swing.JLabel();
        tempoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cel00Button = new javax.swing.JButton();
        cel01Button = new javax.swing.JButton();
        cel02Button = new javax.swing.JButton();
        cel10Button = new javax.swing.JButton();
        cel11Button = new javax.swing.JButton();
        cel12Button = new javax.swing.JButton();
        cel20Button = new javax.swing.JButton();
        cel21Button = new javax.swing.JButton();
        cel22Button = new javax.swing.JButton();
        embaralharButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novoJogoMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        sairMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sobreMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 4 - 8 Puzzle");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(new java.awt.Color(44, 62, 80));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(189, 195, 199));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tempo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 195, 199));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Movimentos");

        movimentoLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        movimentoLabel.setForeground(new java.awt.Color(236, 240, 241));
        movimentoLabel.setText("0000");

        tempoLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tempoLabel.setForeground(new java.awt.Color(236, 240, 241));
        tempoLabel.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tempoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(movimentoLabel)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempoLabel)
                    .addComponent(movimentoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));

        cel00Button.setBackground(new java.awt.Color(52, 152, 219));
        cel00Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel00Button.setForeground(new java.awt.Color(52, 73, 94));
        cel00Button.setText("1");
        cel00Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel00ButtonActionPerformed(evt);
            }
        });

        cel01Button.setBackground(new java.awt.Color(52, 152, 219));
        cel01Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel01Button.setForeground(new java.awt.Color(52, 73, 94));
        cel01Button.setText("2");
        cel01Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel01ButtonActionPerformed(evt);
            }
        });

        cel02Button.setBackground(new java.awt.Color(52, 152, 219));
        cel02Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel02Button.setForeground(new java.awt.Color(52, 73, 94));
        cel02Button.setText("3");
        cel02Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel02ButtonActionPerformed(evt);
            }
        });

        cel10Button.setBackground(new java.awt.Color(52, 152, 219));
        cel10Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel10Button.setForeground(new java.awt.Color(52, 73, 94));
        cel10Button.setText("4");
        cel10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel10ButtonActionPerformed(evt);
            }
        });

        cel11Button.setBackground(new java.awt.Color(52, 152, 219));
        cel11Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel11Button.setForeground(new java.awt.Color(52, 73, 94));
        cel11Button.setText("5");
        cel11Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel11ButtonActionPerformed(evt);
            }
        });

        cel12Button.setBackground(new java.awt.Color(52, 152, 219));
        cel12Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel12Button.setForeground(new java.awt.Color(52, 73, 94));
        cel12Button.setText("6");
        cel12Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel12ButtonActionPerformed(evt);
            }
        });

        cel20Button.setBackground(new java.awt.Color(52, 152, 219));
        cel20Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel20Button.setForeground(new java.awt.Color(52, 73, 94));
        cel20Button.setText("7");
        cel20Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel20ButtonActionPerformed(evt);
            }
        });

        cel21Button.setBackground(new java.awt.Color(52, 152, 219));
        cel21Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel21Button.setForeground(new java.awt.Color(52, 73, 94));
        cel21Button.setText("8");
        cel21Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel21ButtonActionPerformed(evt);
            }
        });

        cel22Button.setBackground(new java.awt.Color(52, 152, 219));
        cel22Button.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cel22Button.setForeground(new java.awt.Color(52, 73, 94));
        cel22Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cel22ButtonActionPerformed(evt);
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
                        .addComponent(cel00Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel01Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel02Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cel10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel11Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel12Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cel20Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel21Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cel22Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel00Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel01Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel02Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel11Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel12Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cel20Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel21Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cel22Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        embaralharButton.setBackground(new java.awt.Color(46, 204, 113));
        embaralharButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        embaralharButton.setForeground(new java.awt.Color(44, 62, 80));
        embaralharButton.setText("Embaralhar");
        embaralharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embaralharButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(embaralharButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(embaralharButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        novoJogoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        novoJogoMenuItem.setText("Novo Jogo");
        novoJogoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(novoJogoMenuItem);
        jMenu1.add(jSeparator1);

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        sairMenuItem.setText("Sair");
        sairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(sairMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        sobreMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sobreMenuItem.setText("Sobre");
        sobreMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(sobreMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sobreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreMenuItemActionPerformed
        JOptionPane.showMessageDialog(null,
                "Kleber de Oliveira Andrade\nAnálise e Desenvolvimento de Sistemas\nFaculdade de Tecnologia Americana",
                "Sobre o autor",
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_sobreMenuItemActionPerformed

    private void sairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairMenuItemActionPerformed

    private void verificarVitoria() {
        if (tabuleiro[0][0] == '1' && tabuleiro[0][1] == '2' && tabuleiro[0][2] == '3'
                && tabuleiro[1][0] == '4' && tabuleiro[1][1] == '5' && tabuleiro[1][2] == '6'
                && tabuleiro[2][0] == '7' && tabuleiro[2][1] == '8' && tabuleiro[2][2] == ' ') {

            cronometro.stop();
            
            JOptionPane.showMessageDialog(null,
                    "Você ganhou em " + numeroMovimento + " movimentos realizados em " + tempoSegundos + " segundos",
                    "Parabéns!",
                    JOptionPane.PLAIN_MESSAGE);

            novoJogoMenuItem.doClick();
        }
    }

    private void inicializarCronometro() {

        tempoSegundos = 0;
        if (cronometro != null) {
            cronometro.start();
            return;
        }

        cronometro = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tempoSegundos++;
                tempoLabel.setText(String.format("%04d", tempoSegundos));
            }
        });

        cronometro.start();
    }

    private void inicializarTabuleiro() {
        tabuleiro[0][0] = '1';
        tabuleiro[0][1] = '2';
        tabuleiro[0][2] = '3';
        tabuleiro[1][0] = '4';
        tabuleiro[1][1] = '5';
        tabuleiro[1][2] = '6';
        tabuleiro[2][0] = '7';
        tabuleiro[2][1] = '8';
        tabuleiro[2][2] = ' ';

        numeroMovimento = 0;

        tempoSegundos = 0;
        tempoLabel.setText("0000");

        inicializarCronometro();
    }

    private void verificarDireita(int linha, int coluna) {
        if (coluna + 1 < 3 && tabuleiro[linha][coluna + 1] == ' ') {
            tabuleiro[linha][coluna + 1] = tabuleiro[linha][coluna];
            tabuleiro[linha][coluna] = ' ';
            numeroMovimento++;
        }
    }

    private void verificarEsquerda(int linha, int coluna) {
        if (coluna - 1 >= 0 && tabuleiro[linha][coluna - 1] == ' ') {
            tabuleiro[linha][coluna - 1] = tabuleiro[linha][coluna];
            tabuleiro[linha][coluna] = ' ';
            numeroMovimento++;
        }
    }

    private void verificarBaixo(int linha, int coluna) {
        if (linha + 1 < 3 && tabuleiro[linha + 1][coluna] == ' ') {
            tabuleiro[linha + 1][coluna] = tabuleiro[linha][coluna];
            tabuleiro[linha][coluna] = ' ';
            numeroMovimento++;
        }
    }

    private void verificarCima(int linha, int coluna) {
        if (linha - 1 >= 0 && tabuleiro[linha - 1][coluna] == ' ') {
            tabuleiro[linha - 1][coluna] = tabuleiro[linha][coluna];
            tabuleiro[linha][coluna] = ' ';
            numeroMovimento++;
        }
    }

    private void atualizarTabuleiro() {
        cel00Button.setText("" + tabuleiro[0][0]);
        cel01Button.setText("" + tabuleiro[0][1]);
        cel02Button.setText("" + tabuleiro[0][2]);
        cel10Button.setText("" + tabuleiro[1][0]);
        cel11Button.setText("" + tabuleiro[1][1]);
        cel12Button.setText("" + tabuleiro[1][2]);
        cel20Button.setText("" + tabuleiro[2][0]);
        cel21Button.setText("" + tabuleiro[2][1]);
        cel22Button.setText("" + tabuleiro[2][2]);

        movimentoLabel.setText("" + numeroMovimento);
    }

    private void cel00ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel00ButtonActionPerformed
        if (cel00Button.getText().equals(' ')) {
            return;
        }

        verificarCima(0, 0);
        verificarDireita(0, 0);
        verificarBaixo(0, 0);
        verificarEsquerda(0, 0);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel00ButtonActionPerformed

    private void cel21ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel21ButtonActionPerformed
        if (cel21Button.getText().equals(' ')) {
            return;
        }

        verificarCima(2, 1);
        verificarDireita(2, 1);
        verificarBaixo(2, 1);
        verificarEsquerda(2, 1);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel21ButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarTabuleiro();
        atualizarTabuleiro();
    }//GEN-LAST:event_formWindowOpened

    private void cel01ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel01ButtonActionPerformed
        if (cel01Button.getText().equals(' ')) {
            return;
        }

        verificarCima(0, 1);
        verificarDireita(0, 1);
        verificarBaixo(0, 1);
        verificarEsquerda(0, 1);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel01ButtonActionPerformed

    private void cel02ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel02ButtonActionPerformed
        if (cel02Button.getText().equals(' ')) {
            return;
        }

        verificarCima(0, 2);
        verificarDireita(0, 2);
        verificarBaixo(0, 2);
        verificarEsquerda(0, 2);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel02ButtonActionPerformed

    private void cel10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel10ButtonActionPerformed
        if (cel10Button.getText().equals(' ')) {
            return;
        }

        verificarCima(1, 0);
        verificarDireita(1, 0);
        verificarBaixo(1, 0);
        verificarEsquerda(1, 0);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel10ButtonActionPerformed

    private void cel11ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel11ButtonActionPerformed
        if (cel11Button.getText().equals(' ')) {
            return;
        }

        verificarCima(1, 1);
        verificarDireita(1, 1);
        verificarBaixo(1, 1);
        verificarEsquerda(1, 1);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel11ButtonActionPerformed

    private void cel12ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel12ButtonActionPerformed
        if (cel12Button.getText().equals(' ')) {
            return;
        }

        verificarCima(1, 2);
        verificarDireita(1, 2);
        verificarBaixo(1, 2);
        verificarEsquerda(1, 2);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel12ButtonActionPerformed

    private void cel20ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel20ButtonActionPerformed
        if (cel20Button.getText().equals(' ')) {
            return;
        }

        verificarCima(2, 0);
        verificarDireita(2, 0);
        verificarBaixo(2, 0);
        verificarEsquerda(2, 0);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel20ButtonActionPerformed

    private void cel22ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cel22ButtonActionPerformed
        if (cel22Button.getText().equals(' ')) {
            return;
        }

        verificarCima(2, 2);
        verificarDireita(2, 2);
        verificarBaixo(2, 2);
        verificarEsquerda(2, 2);

        atualizarTabuleiro();

        if (!estaEmbaralhando) {
            verificarVitoria();
        }
    }//GEN-LAST:event_cel22ButtonActionPerformed

    private void novoJogoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoMenuItemActionPerformed
        inicializarTabuleiro();
        atualizarTabuleiro();
    }//GEN-LAST:event_novoJogoMenuItemActionPerformed

    private void embaralharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embaralharButtonActionPerformed

        estaEmbaralhando = true;

        for (int i = 0; i < 1000; i++) {
            int linha = (int) (Math.random() * 3);
            int coluna = (int) (Math.random() * 3);

            verificarCima(linha, coluna);
            verificarDireita(linha, coluna);
            verificarBaixo(linha, coluna);
            verificarEsquerda(linha, coluna);
        }

        numeroMovimento = 0;
        movimentoLabel.setText("0000");

        tempoSegundos = 0;
        tempoLabel.setText("0000");

        atualizarTabuleiro();

        estaEmbaralhando = false;
    }//GEN-LAST:event_embaralharButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EightPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EightPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EightPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EightPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EightPuzzleFrame().setVisible(true);
            }
        });
    }

    private Timer cronometro;
    private int numeroMovimento;
    private char[][] tabuleiro = new char[3][3];
    private int tempoSegundos;
    private boolean estaEmbaralhando = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cel00Button;
    private javax.swing.JButton cel01Button;
    private javax.swing.JButton cel02Button;
    private javax.swing.JButton cel10Button;
    private javax.swing.JButton cel11Button;
    private javax.swing.JButton cel12Button;
    private javax.swing.JButton cel20Button;
    private javax.swing.JButton cel21Button;
    private javax.swing.JButton cel22Button;
    private javax.swing.JButton embaralharButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel movimentoLabel;
    private javax.swing.JMenuItem novoJogoMenuItem;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenuItem sobreMenuItem;
    private javax.swing.JLabel tempoLabel;
    // End of variables declaration//GEN-END:variables
}
