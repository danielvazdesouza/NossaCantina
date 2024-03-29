/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.view;

import com.senac.dao.ClienteDao;
import com.senac.exceptions.SaldoException;
import com.senac.util.ReportXLS;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ClienteFrontEnd extends javax.swing.JFrame {

    /**
     * Creates new form ClienteFrontEnd
     */
    public ClienteFrontEnd(int matricula) {
        initComponents();
        try {
            ClienteDao cd = new ClienteDao();
            String saldo = String.valueOf(cd.consultarSaldo(matricula));
            fldMatricula.setText(String.valueOf(matricula));
            fldSaldo.setText(saldo);
            fldMatriculaDeb.setText(String.valueOf(matricula));
            fldSaldoDeb.setText(saldo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao importar dados.\n" + e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }

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
        panelAddFundos = new javax.swing.JPanel();
        lbMatricula = new javax.swing.JLabel();
        lbSaldo = new javax.swing.JLabel();
        fldMatricula = new javax.swing.JTextField();
        fldSaldo = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btExportar = new javax.swing.JButton();
        panelTransfer = new javax.swing.JPanel();
        lbMatriculaDeb = new javax.swing.JLabel();
        fldMatriculaDeb = new javax.swing.JTextField();
        lbSaldoDeb = new javax.swing.JLabel();
        fldSaldoDeb = new javax.swing.JTextField();
        lbMatriculaCred = new javax.swing.JLabel();
        fldMatriculaCred = new javax.swing.JFormattedTextField();
        lbValor = new javax.swing.JLabel();
        fldValor = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMatricula.setText("Matricula:");

        lbSaldo.setText("Saldo:");

        fldMatricula.setEditable(false);

        fldSaldo.setEditable(false);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_export.png"))); // NOI18N
        btExportar.setText("Histórico de vendas");
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddFundosLayout = new javax.swing.GroupLayout(panelAddFundos);
        panelAddFundos.setLayout(panelAddFundosLayout);
        panelAddFundosLayout.setHorizontalGroup(
            panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddFundosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMatricula)
                    .addComponent(lbSaldo))
                .addGap(53, 53, 53)
                .addGroup(panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddFundosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExportar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addContainerGap())
        );

        panelAddFundosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btExportar});

        panelAddFundosLayout.setVerticalGroup(
            panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddFundosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(fldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldo)
                    .addComponent(fldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(panelAddFundosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btExportar))
                .addContainerGap())
        );

        tabbedPane.addTab("Adicionar Fundos", panelAddFundos);

        lbMatriculaDeb.setText("Matricula a ser debitada:");

        fldMatriculaDeb.setEditable(false);

        lbSaldoDeb.setText("Saldo:");

        fldSaldoDeb.setEditable(false);

        lbMatriculaCred.setText("Matricula a ser Creditada:");

        try {
            fldMatriculaCred.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbValor.setText("Valor:");

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_cancel.png"))); // NOI18N
        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/senac/icon/bt_save.png"))); // NOI18N
        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransferLayout = new javax.swing.GroupLayout(panelTransfer);
        panelTransfer.setLayout(panelTransferLayout);
        panelTransferLayout.setHorizontalGroup(
            panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransferLayout.createSequentialGroup()
                        .addGap(0, 104, Short.MAX_VALUE)
                        .addComponent(btSave)
                        .addGap(18, 18, 18)
                        .addComponent(btCancel))
                    .addGroup(panelTransferLayout.createSequentialGroup()
                        .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatriculaDeb)
                            .addComponent(lbMatriculaCred))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldMatriculaCred, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldMatriculaDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTransferLayout.createSequentialGroup()
                        .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSaldoDeb)
                            .addComponent(lbValor))
                        .addGap(18, 18, 18)
                        .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldSaldoDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        panelTransferLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fldSaldoDeb, fldValor});

        panelTransferLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancel, btSave});

        panelTransferLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fldMatriculaCred, fldMatriculaDeb});

        panelTransferLayout.setVerticalGroup(
            panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatriculaDeb)
                    .addComponent(fldMatriculaDeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSaldoDeb)
                    .addComponent(fldSaldoDeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatriculaCred)
                    .addComponent(fldMatriculaCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(fldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btSave))
                .addContainerGap())
        );

        tabbedPane.addTab("Tranferir Créditos", panelTransfer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        salvar();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        ReportXLS report = new ReportXLS();
        try {
            report.reportUsuario(Integer.parseInt(fldMatriculaDeb.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar vendas.\n"+ex.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.\n"+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExportar;
    private javax.swing.JButton btSave;
    private javax.swing.JTextField fldMatricula;
    private javax.swing.JFormattedTextField fldMatriculaCred;
    private javax.swing.JTextField fldMatriculaDeb;
    private javax.swing.JTextField fldSaldo;
    private javax.swing.JTextField fldSaldoDeb;
    private javax.swing.JTextField fldValor;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbMatriculaCred;
    private javax.swing.JLabel lbMatriculaDeb;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSaldoDeb;
    private javax.swing.JLabel lbValor;
    private javax.swing.JPanel panelAddFundos;
    private javax.swing.JPanel panelTransfer;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables

    private double debitado;
    private double creditado;

    private void validarSaldo() {
        debitado = Double.parseDouble(fldSaldoDeb.getText());
        if (fldMatriculaCred.getText().isEmpty() || fldValor.getText().isEmpty()) {
            throw new SaldoException();
        } else {
            creditado = Double.parseDouble(fldValor.getText());
            if (creditado > debitado) {
                throw new SaldoException();
            }
        }
    }

    private void salvar() {
        try {
            validarSaldo();
            ClienteDao cd = new ClienteDao();
            int matriculaDeb = Integer.parseInt(fldMatriculaDeb.getText());
            Double valorDeb = debitado - creditado;
            int matriculaCred = Integer.parseInt(fldMatriculaCred.getText());
            cd.transferirSaldo(matriculaDeb, valorDeb, matriculaCred, creditado);
            JOptionPane.showMessageDialog(null, "Valor transferido com sucesso");
            System.exit(0);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao transferir.\n"+ex,"",JOptionPane.ERROR_MESSAGE);
        } catch (SaldoException e){
            JOptionPane.showMessageDialog(null, "Verifique o valor a ser transferido.","",JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.\n"+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
        }
    }
}
