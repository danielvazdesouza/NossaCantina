/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.view;

import com.senac.dao.ProdutoDao;
import com.senac.model.Produto;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class ProdutosGerenciar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Teste
     */
    public ProdutosGerenciar() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        painelCadastrar = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbCodProduto = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox();
        lbTipo = new javax.swing.JLabel();
        fldCodProduto = new javax.swing.JTextField();
        lbPreco = new javax.swing.JLabel();
        fldNome = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        fldPreco = new javax.swing.JTextField();
        painelEditar = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lbPesquisa = new javax.swing.JLabel();
        fldPesquisa = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gerenciar Produtos");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitulo.setText("Cadastrar Produto");

        lbCodProduto.setText("Código:");

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bebida", "Diversos", "Doce", "Salgado" }));

        lbTipo.setText("Tipo:");

        lbPreco.setText("Preço:");

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbNome.setText("Nome:");

        javax.swing.GroupLayout painelCadastrarLayout = new javax.swing.GroupLayout(painelCadastrar);
        painelCadastrar.setLayout(painelCadastrarLayout);
        painelCadastrarLayout.setHorizontalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar))
                    .addGroup(painelCadastrarLayout.createSequentialGroup()
                        .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo)
                            .addComponent(lbNome)
                            .addComponent(lbTipo)
                            .addGroup(painelCadastrarLayout.createSequentialGroup()
                                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodProduto)
                                    .addComponent(lbPreco))
                                .addGap(22, 22, 22)
                                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelCadastrarLayout.createSequentialGroup()
                                            .addComponent(boxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(240, 240, 240)))
                                    .addComponent(fldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCadastrarLayout.setVerticalGroup(
            painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodProduto)
                    .addComponent(fldCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(fldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(fldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(painelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        tabbedPane.addTab("Cadastrar", painelCadastrar);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        lbPesquisa.setText("Pesquisa:");

        fldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fldPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painelEditarLayout = new javax.swing.GroupLayout(painelEditar);
        painelEditar.setLayout(painelEditarLayout);
        painelEditarLayout.setHorizontalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPesquisa)
                .addGap(18, 18, 18)
                .addComponent(fldPesquisa)
                .addContainerGap())
        );
        painelEditarLayout.setVerticalGroup(
            painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPesquisa)
                    .addComponent(fldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Editar", painelEditar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void fldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldPesquisaKeyReleased
        pesquisar();
    }//GEN-LAST:event_fldPesquisaKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(evt.getClickCount() > 1){
            Produto p = new Produto();
            p.setCodProduto(Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0))));
            p.setNome(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)));
            p.setTipo(String.valueOf(table.getValueAt(table.getSelectedRow(), 2)));
            p.setPreco(Double.parseDouble(String.valueOf(table.getValueAt(table.getSelectedRow(), 3))));
            new ProdutosEditar(p).setVisible(true);
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxTipo;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField fldCodProduto;
    private javax.swing.JTextField fldNome;
    private javax.swing.JTextField fldPesquisa;
    private javax.swing.JTextField fldPreco;
    private javax.swing.JLabel lbCodProduto;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel painelCadastrar;
    private javax.swing.JPanel painelEditar;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        try {
            Produto p = new Produto();
            p.setCodProduto(Integer.parseInt(fldCodProduto.getText()));
            p.setNome(fldNome.getText());
            p.setPreco(Double.parseDouble(fldPreco.getText()));
            p.setTipo(boxTipo.getSelectedItem().toString());
            ProdutoDao pd = new ProdutoDao();
            pd.salvar(p);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "", JOptionPane.PLAIN_MESSAGE);
            limpar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto", "", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void pesquisar() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setNumRows(0);
        ProdutoDao pd = new ProdutoDao();
        try {
            List<Produto> pro = pd.listarProdutos(fldPesquisa.getText());
            for (Produto p : pro) {
                model.addRow(new Object[]{p.getCodProduto(), p.getNome(), p.getTipo(), p.getPreco()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produto", "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpar() {
        fldCodProduto.setText(null);
        fldNome.setText(null);
        fldPreco.setText(null);
        boxTipo.setSelectedIndex(0);
    }
}
