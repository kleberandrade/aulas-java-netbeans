package br.edu.fatec.aula;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class ControleFinanceiroFrame extends javax.swing.JFrame {

    public ControleFinanceiroFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contaRecebidaLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        contaPagaLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        dataDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        valorTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        categoriaComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        adicionarButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contasTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        removerButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        graficoBarraPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        graficoPizzaPanel = new javax.swing.JPanel();
        gravarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aula 9 - Controle Financeiro");
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setBackground(new java.awt.Color(41, 128, 185));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/icones/banknotes-48.png"))); // NOI18N
        jLabel1.setText("CONTROLE FINANCEIRO");
        jLabel1.setIconTextGap(20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(236, 240, 241));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 40, 0));

        jPanel4.setBackground(new java.awt.Color(39, 174, 96));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contas Recebidas");

        contaRecebidaLabel.setBackground(new java.awt.Color(255, 255, 255));
        contaRecebidaLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        contaRecebidaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contaRecebidaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contaRecebidaLabel.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contaRecebidaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaRecebidaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(231, 76, 60));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contas Pagas");

        contaPagaLabel.setBackground(new java.awt.Color(255, 255, 255));
        contaPagaLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        contaPagaLabel.setForeground(new java.awt.Color(255, 255, 255));
        contaPagaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contaPagaLabel.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contaPagaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaPagaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(52, 152, 219));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Saldo");

        saldoLabel.setBackground(new java.awt.Color(255, 255, 255));
        saldoLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        saldoLabel.setForeground(new java.awt.Color(255, 255, 255));
        saldoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        saldoLabel.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(236, 240, 241));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Descrição");

        descricaoTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dataDateChooser.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Data");

        valorTextField.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Categoria");

        categoriaComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        categoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Categoria", "Alimentação", "Compras", "Estudos", "Lazer", "Moradia", "Transporte", "Saúde", "Outros", "Receita" }));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Valor (R$)");

        tipoComboBox.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despesa", "Crédito" }));
        tipoComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoComboBoxItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Tipo");

        adicionarButton.setBackground(new java.awt.Color(39, 174, 96));
        adicionarButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        adicionarButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/icones/plus-4-16.png"))); // NOI18N
        adicionarButton.setText("Adicionar");
        adicionarButton.setIconTextGap(10);
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 587, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 134, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(valorTextField)
                                .addContainerGap())))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descricaoTextField)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoriaComboBox, 0, 413, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dataDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(236, 240, 241));

        contasTable.setBackground(new java.awt.Color(236, 240, 241));
        contasTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        contasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Tipo", "Valor", "Categoria", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(contasTable);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Últimos lançamentos");

        removerButton.setBackground(new java.awt.Color(231, 76, 60));
        removerButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        removerButton.setForeground(new java.awt.Color(255, 255, 255));
        removerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/icones/x-mark-3-16.png"))); // NOI18N
        removerButton.setText("Remover");
        removerButton.setIconTextGap(10);
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        jPanel9.setBackground(new java.awt.Color(236, 240, 241));

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Despesas por Tipo");

        graficoBarraPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficoBarraPanelLayout = new javax.swing.GroupLayout(graficoBarraPanel);
        graficoBarraPanel.setLayout(graficoBarraPanelLayout);
        graficoBarraPanelLayout.setHorizontalGroup(
            graficoBarraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficoBarraPanelLayout.setVerticalGroup(
            graficoBarraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setText("Despesas por Categoria");

        graficoPizzaPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout graficoPizzaPanelLayout = new javax.swing.GroupLayout(graficoPizzaPanel);
        graficoPizzaPanel.setLayout(graficoPizzaPanelLayout);
        graficoPizzaPanelLayout.setHorizontalGroup(
            graficoPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        graficoPizzaPanelLayout.setVerticalGroup(
            graficoPizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        gravarButton.setBackground(new java.awt.Color(52, 152, 219));
        gravarButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        gravarButton.setForeground(new java.awt.Color(255, 255, 255));
        gravarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatec/icones/save-16.png"))); // NOI18N
        gravarButton.setText("Gravar Gráficos");
        gravarButton.setIconTextGap(10);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoBarraPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addComponent(graficoPizzaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gravarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficoBarraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficoPizzaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gravarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 442, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarCampos() {
        descricaoTextField.setText("");
        valorTextField.setText("");

        tipoComboBox.setSelectedIndex(0);
        categoriaComboBox.setSelectedIndex(0);

        dataDateChooser.setDate(new Date());

        verificaSaldo();
    }

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String descricao = descricaoTextField.getText();
        String tipo = (String) tipoComboBox.getSelectedItem();
        Double valor = Double.parseDouble((String) valorTextField.getText().replaceAll(",", "."));
        String categoria = (String) categoriaComboBox.getSelectedItem();
        String data = df.format(dataDateChooser.getDate());

        if (tipo.equalsIgnoreCase("despesa")) {
            despesa += valor;
        } else {
            receita += valor;
        }

        DefaultTableModel modelo = (DefaultTableModel) contasTable.getModel();
        Object[] linha = {
            descricao,
            tipo,
            String.format("%.2f", valor),
            categoria,
            data
        };
        modelo.addRow(linha);

        inicializarCampos();
        verificaSaldo();
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void verificaSaldo() {
        double saldo = receita - despesa;

        contaPagaLabel.setText(String.format("R$ %.2f", despesa));
        contaRecebidaLabel.setText(String.format("R$ %.2f", receita));
        saldoLabel.setText(String.format("R$ %.2f", saldo));

        atualizarGraficoPizza();
        atualizarGraficoBarra();
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializarCampos();
    }//GEN-LAST:event_formWindowOpened

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed

        int linhaSelecionada = contasTable.getSelectedRow();
        if (linhaSelecionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) contasTable.getModel();

            Double valor = Double.parseDouble(((String) modelo.getValueAt(linhaSelecionada, 2)).replaceAll(",", "."));
            String tipo = (String) modelo.getValueAt(linhaSelecionada, 1);
            if (tipo.equalsIgnoreCase("despesa")) {
                despesa -= valor;
            } else {
                receita -= valor;
            }

            modelo.removeRow(linhaSelecionada);
        }

        verificaSaldo();
    }//GEN-LAST:event_removerButtonActionPerformed

    private void tipoComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoComboBoxItemStateChanged
        String tipo = (String) tipoComboBox.getSelectedItem();

        if (tipo.equalsIgnoreCase("despesa")) {
            categoriaComboBox.setSelectedIndex(0);
            categoriaComboBox.setEnabled(true);
        } else {
            categoriaComboBox.setSelectedIndex(categoriaComboBox.getItemCount() - 1);
            categoriaComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_tipoComboBoxItemStateChanged

    private void atualizarGraficoPizza() {

        Map<String, Double> valoresMap = new HashMap<>();
        for (int i = 1; i < categoriaComboBox.getItemCount(); i++) {
            valoresMap.put(categoriaComboBox.getItemAt(i), 0.0);
        }

        DefaultTableModel modelo = (DefaultTableModel) contasTable.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String categoria = (String) modelo.getValueAt(i, 3);
            Double valor = Double.parseDouble(((String) modelo.getValueAt(i, 2)).replaceAll(",", "."));
            valoresMap.put(categoria, valoresMap.get(categoria) + valor);
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 1; i < categoriaComboBox.getItemCount() - 1; i++) {
            String categoria = categoriaComboBox.getItemAt(i);
            Double valor = valoresMap.get(categoria);
            dataset.setValue(categoria, valor);
        }

        JFreeChart graficoPizza = ChartFactory.createPieChart(
                "",
                dataset,
                true,
                true,
                false);

        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) graficoPizza.getPlot()).setLabelGenerator(labelGenerator);

        // Create Panel
        ChartPanel painel = new ChartPanel(graficoPizza);

        graficoPizzaPanel.setPreferredSize(new java.awt.Dimension(graficoPizzaPanel.getWidth(), graficoPizzaPanel.getHeight()));
        graficoPizzaPanel.setLayout(new BorderLayout());
        graficoPizzaPanel.add(painel, BorderLayout.CENTER);
        graficoPizzaPanel.validate();
    }

    private void atualizarGraficoBarra() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Population in 2005
        dataset.addValue(despesa, "Despesa", "2018");
        dataset.addValue(receita, "Receita", "2018");

        //Create chart
        JFreeChart graficoBarra = ChartFactory.createBarChart(
                "", //Chart Title
                "", // Category axis
                "", // Value axis
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        ChartPanel painel = new ChartPanel(graficoBarra);
        graficoBarraPanel.setPreferredSize(new java.awt.Dimension(graficoBarraPanel.getWidth(), graficoBarraPanel.getHeight()));
        graficoBarraPanel.setLayout(new BorderLayout());
        graficoBarraPanel.add(painel, BorderLayout.CENTER);
        graficoBarraPanel.validate();
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
            java.util.logging.Logger.getLogger(ControleFinanceiroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleFinanceiroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleFinanceiroFrame().setVisible(true);
            }
        });
    }

    private double receita = 0.0;
    private double despesa = 0.0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JComboBox<String> categoriaComboBox;
    private javax.swing.JLabel contaPagaLabel;
    private javax.swing.JLabel contaRecebidaLabel;
    private javax.swing.JTable contasTable;
    private com.toedter.calendar.JDateChooser dataDateChooser;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JPanel graficoBarraPanel;
    private javax.swing.JPanel graficoPizzaPanel;
    private javax.swing.JButton gravarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JTextField valorTextField;
    // End of variables declaration//GEN-END:variables
}
