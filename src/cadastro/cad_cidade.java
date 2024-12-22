package cadastro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utilitario.Conexao;

public class cad_cidade extends JFrame {

    // criação do objeto 
    Conexao con_cidade;
    int navega = 0;

    public cad_cidade() {
        initComponents();
        //inicialização do objeto
        con_cidade = new Conexao();
        con_cidade.conecta();
        con_cidade.executeSQL("select * from cidade");
        try {
            while (con_cidade.resultSet.next()) {
                jcb_pesquisa.addItem(con_cidade.resultSet.getString("nome"));

            }
            con_cidade.resultSet.first();
            mostrar_dados();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados");
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

        botao_gravar = new javax.swing.JButton();
        botao_inserir = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_anterior = new javax.swing.JButton();
        botao_proximo = new javax.swing.JButton();
        botao_ultimo = new javax.swing.JButton();
        botao_primeiro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_pesquisa = new javax.swing.JTextField();
        jcb_pesquisa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nome_cidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_uf = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção do Cadastro de Cidade");

        botao_gravar.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\gravar_registro.gif")); // NOI18N
        botao_gravar.setToolTipText("Gravar");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_inserir.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\novo_registro.gif")); // NOI18N
        botao_inserir.setToolTipText("Inserir");
        botao_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_inserirActionPerformed(evt);
            }
        });

        botao_excluir.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\delete.gif")); // NOI18N
        botao_excluir.setToolTipText("Excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\alterar_registro.gif")); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        botao_anterior.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\registro_anterior.gif")); // NOI18N
        botao_anterior.setToolTipText("Proximo Registro");
        botao_anterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botao_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_anteriorActionPerformed(evt);
            }
        });

        botao_proximo.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\proximo_registro.gif")); // NOI18N
        botao_proximo.setToolTipText("Proximo Registro");
        botao_proximo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botao_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_proximoActionPerformed(evt);
            }
        });

        botao_ultimo.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\ultimo_registro.gif")); // NOI18N
        botao_ultimo.setToolTipText("Ultimo Registro");
        botao_ultimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botao_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ultimoActionPerformed(evt);
            }
        });

        botao_primeiro.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\primeiro_registro.gif")); // NOI18N
        botao_primeiro.setToolTipText("Primeiro Registro");
        botao_primeiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botao_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_primeiroActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisa.:");

        jLabel3.setText("Código.:");

        jLabel4.setText("Nome.:");

        jLabel5.setText("UF.:");

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJ", "PR", "PO", "RG" }));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Manutenção do Cadastro de Cidade");

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nome_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao_primeiro)
                                .addGap(18, 18, 18)
                                .addComponent(botao_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_proximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_ultimo)
                                .addGap(18, 18, 18)
                                .addComponent(botao_gravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_inserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_excluir)
                                .addGap(18, 18, 18)
                                .addComponent(botao_alterar))
                            .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nome_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_alterar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botao_gravar)
                        .addComponent(botao_inserir)
                        .addComponent(botao_excluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botao_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botao_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76))
        );

        setBounds(0, 0, 726, 385);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ultimoActionPerformed
        try {
            con_cidade.resultSet.last();
            mostrar_dados();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados");
        }
    }//GEN-LAST:event_botao_ultimoActionPerformed

    private void botao_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_proximoActionPerformed
        try {
            con_cidade.resultSet.next();
            mostrar_dados();
            navega = 2;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados");
        }
    }//GEN-LAST:event_botao_proximoActionPerformed

    private void botao_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_primeiroActionPerformed
        try {
            con_cidade.resultSet.first();
            mostrar_dados();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados");
        }
    }//GEN-LAST:event_botao_primeiroActionPerformed

    private void botao_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_anteriorActionPerformed
        try {
            con_cidade.resultSet.previous();
            mostrar_dados();
            navega = 1;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados");
        }
    }//GEN-LAST:event_botao_anteriorActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
        try {

            String sqlinsert = "insert into cidade (nome,uf) values ('" + tf_nome_cidade.getText() + "','" + cb_uf.getSelectedItem() + "')";
            con_cidade.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null, "Gravação realizados com sucesso");

            //atualiza o resultSet
            // con_cidade.resultSet = con_cidade.statement.executeQuery("select * from cidade");
            con_cidade.executeSQL("select * from cidade");
            con_cidade.resultSet.first();
            mostrar_dados();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro ao Gravar:");
        }

    }//GEN-LAST:event_botao_gravarActionPerformed

    private void botao_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_inserirActionPerformed
        tf_codigo.setText("");
        tf_nome_cidade.setText("");
        cb_uf.setSelectedItem("RJ");
        tf_nome_cidade.requestFocus();
        tf_codigo.setEditable(false);
    }//GEN-LAST:event_botao_inserirActionPerformed

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
        try {

            String sql = "insert into cidade Where codigo = " + tf_codigo.getText();
            // con_cidade.executeSQL(sql);
            con_cidade.resultSet.first();
            String nome = "Deletar a cidade :" + con_cidade.resultSet.getString("nome");
            int opcao_escolhida = JOptionPane.showConfirmDialog(null, nome, "Exclusão ", JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida == JOptionPane.YES_OPTION) {
                sql = "DELETE FROM cidade Where codigo = " + tf_codigo.getText();
                int conseguiu_excluir = con_cidade.statement.executeUpdate(sql);
                if (conseguiu_excluir == 1) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso");
                    //atualizar o REsulset
                    con_cidade.executeSQL("Select * from cidade ");
                    con_cidade.resultSet.first();
                    mostrar_dados();
                }
            } else {
                return;
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o registro:");
        }

    }//GEN-LAST:event_botao_excluirActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
        try {

            String sql = "UPDATE cidade SET nome ='" + tf_nome_cidade.getText() + "'," + "uf = '" + cb_uf.getSelectedItem() + "' where codigo = " + tf_codigo.getText();
            con_cidade.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

            //atualiza o ResultSet
            con_cidade.executeSQL("select * from cidade");
            con_cidade.resultSet.next();
            mostrar_dados();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o registro:");
        }
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        try {
            con_cidade.resultSet.first();
            String igual = "n";
            int tamanho_pesquisa = tf_pesquisa.getText().length();
            while (igual == "n") {
                String pesquisando = con_cidade.resultSet.getString("nome").substring(0, ( tamanho_pesquisa ));
                if (pesquisando.equals(tf_pesquisa.getText())) {
                    igual = "s";
                } else {
                    con_cidade.resultSet.next();
                }
            }
            tf_codigo.setText(con_cidade.resultSet.getString("codigo"));
            mostrar_dados();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não conseguiu localizar via digitação.");
        }
    }//GEN-LAST:event_pesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] ) {
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
            java.util.logging.Logger.getLogger(cad_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cad_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cad_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cad_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_anterior;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_inserir;
    private javax.swing.JButton botao_primeiro;
    private javax.swing.JButton botao_proximo;
    private javax.swing.JButton botao_ultimo;
    private javax.swing.JComboBox<String> cb_uf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jcb_pesquisa;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome_cidade;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    public void mostrar_dados() {
        try {
            tf_codigo.setText(con_cidade.resultSet.getString("codigo"));
            tf_nome_cidade.setText(con_cidade.resultSet.getString("nome"));
            cb_uf.setSelectedItem(con_cidade.resultSet.getString("uf"));

            /*String uf = con_cidade.resultSet.getString("uf");
            if (cb_uf.getItemCount() == 0) { // Verifica se a lista está vazia
                cb_uf.addItem(uf);
            }
            cb_uf.setSelectedItem(uf);*/
        } catch (SQLException erro) {
            if (navega == 1) {

                JOptionPane.showMessageDialog(null, "Olja, voçê já estar no primeiro registro!");
            } else if (navega == 2) {
                JOptionPane.showMessageDialog(null, "Voçê já esta no ultimo regigistro.");
            } else {
                JOptionPane.showMessageDialog(null, "Não localizou dados");
                navega = 0;
            }
        }
    }

}
