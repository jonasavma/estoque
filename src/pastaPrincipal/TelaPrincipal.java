package pastaPrincipal;


import cadastro.cad_cidade;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import utilitario.Data;
import utilitario.beans_thread;

public class TelaPrincipal extends javax.swing.JFrame {

    Data mostra_data;
    String seta_look="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";

    public TelaPrincipal() {
        initComponents();
        mostra_data = new Data();
        mostra_data.le_data();
        label_data.setText(mostra_data.getDia() + "," + mostra_data.getDia_semana() + "," + mostra_data.getAno());
        mostra_data.le_hora();

        label_hora.setText("Hora Atual :" + mostra_data.getHora());
        lookandfell();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_data = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastro = new javax.swing.JMenu();
        menuItem_Cliente = new javax.swing.JMenuItem();
        menuItem_cidades = new javax.swing.JMenuItem();
        menuItem_cidade = new javax.swing.JMenuItem();
        menuItem_cargo = new javax.swing.JMenuItem();
        menuItem_bairro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_estoque = new javax.swing.JMenu();
        menuItem_implatacao = new javax.swing.JMenuItem();
        menuItem_entrada = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItem_funcionario = new javax.swing.JMenuItem();
        menuItem_fornecedores = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItem_sair = new javax.swing.JMenuItem();
        menu_consulta = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        menu_relatorio = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        menu_utilitario = new javax.swing.JMenu();
        menu_thread = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jitem_menu_liquid = new javax.swing.JMenuItem();
        jitem_menu_windows = new javax.swing.JMenuItem();
        jitem_menu_cde = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();

        jPopupMenu1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPopupMenu1ComponentHidden(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jButton1.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\usuarios.gif")); // NOI18N
        jButton1.setText("Clientes");

        jButton2.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\cadastro_cidades.gif")); // NOI18N
        jButton2.setText("Cidades");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\cadastro_bairros.gif")); // NOI18N
        jButton3.setText("Bairros");

        jButton4.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\sair.gif")); // NOI18N
        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\logo.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\neri.jpg")); // NOI18N
        jLabel2.setText("Sistema Desenvolvido Pelo Jonas Avelino ");

        label_data.setText("Data");

        label_hora.setText("Hora");

        jScrollPane1.setViewportView(jTextPane1);

        menu_cadastro.setMnemonic('C');
        menu_cadastro.setText("Cadastro");

        menuItem_Cliente.setIcon(new javax.swing.ImageIcon("G:\\repository\\GitHub\\estoque\\imagens\\usuarios.gif")); // NOI18N
        menuItem_Cliente.setMnemonic('C');
        menuItem_Cliente.setLabel("Clientes");
        menu_cadastro.add(menuItem_Cliente);

        menuItem_cidades.setMnemonic('C');
        menuItem_cidades.setText("Cidades");
        menu_cadastro.add(menuItem_cidades);

        menuItem_cidade.setMnemonic('C');
        menuItem_cidade.setText("Cidade");
        menuItem_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_cidadeActionPerformed(evt);
            }
        });
        menu_cadastro.add(menuItem_cidade);

        menuItem_cargo.setMnemonic('C');
        menuItem_cargo.setText("Cargo");
        menu_cadastro.add(menuItem_cargo);

        menuItem_bairro.setMnemonic('B');
        menuItem_bairro.setText("Bairro");
        menu_cadastro.add(menuItem_bairro);
        menu_cadastro.add(jSeparator1);

        menu_estoque.setMnemonic('E');
        menu_estoque.setText("Estoque");

        menuItem_implatacao.setMnemonic('I');
        menuItem_implatacao.setText("Implantação");
        menu_estoque.add(menuItem_implatacao);

        menuItem_entrada.setMnemonic('E');
        menuItem_entrada.setText("Entrada");
        menu_estoque.add(menuItem_entrada);

        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Saida");
        menu_estoque.add(jMenuItem1);

        menu_cadastro.add(menu_estoque);
        menu_cadastro.add(jSeparator2);

        menuItem_funcionario.setMnemonic('F');
        menuItem_funcionario.setText("Funcionario");
        menu_cadastro.add(menuItem_funcionario);

        menuItem_fornecedores.setMnemonic('F');
        menuItem_fornecedores.setText("Fornecedores");
        menu_cadastro.add(menuItem_fornecedores);
        menu_cadastro.add(jSeparator3);

        menuItem_sair.setMnemonic('S');
        menuItem_sair.setText("Sair");
        menu_cadastro.add(menuItem_sair);

        jMenuBar1.add(menu_cadastro);

        menu_consulta.setMnemonic('N');
        menu_consulta.setText("Consulta");

        jMenuItem4.setText("jMenuItem4");
        menu_consulta.add(jMenuItem4);

        jMenuBar1.add(menu_consulta);

        menu_relatorio.setMnemonic('R');
        menu_relatorio.setText("Relatorio");

        jMenuItem5.setText("jMenuItem5");
        menu_relatorio.add(jMenuItem5);

        jMenuBar1.add(menu_relatorio);

        menu_utilitario.setMnemonic('U');
        menu_utilitario.setText("Utilitarios");

        menu_thread.setText("Aprendendo sobre o uso de Threads");
        menu_thread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_threadActionPerformed(evt);
            }
        });
        menu_utilitario.add(menu_thread);
        menu_utilitario.add(jSeparator4);

        jitem_menu_liquid.setText("Look And - Windows");
        jitem_menu_liquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitem_menu_liquidActionPerformed(evt);
            }
        });
        menu_utilitario.add(jitem_menu_liquid);

        jitem_menu_windows.setText("Loojk And Feel = Liquid");
        jitem_menu_windows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitem_menu_windowsActionPerformed(evt);
            }
        });
        menu_utilitario.add(jitem_menu_windows);

        jitem_menu_cde.setText("Look And Feel - Metal");
        jitem_menu_cde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitem_menu_cdeActionPerformed(evt);
            }
        });
        menu_utilitario.add(jitem_menu_cde);

        jMenuBar1.add(menu_utilitario);

        menu_sair.setMnemonic('S');
        menu_sair.setText("Sair");
        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_hora)
                        .addGap(311, 311, 311))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_data)
                    .addComponent(label_hora))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1040, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem_cidadeActionPerformed

    private void jPopupMenu1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPopupMenu1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPopupMenu1ComponentHidden

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jitem_menu_liquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitem_menu_liquidActionPerformed
       seta_look= "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
       lookandfell();
    }//GEN-LAST:event_jitem_menu_liquidActionPerformed

    private void jitem_menu_windowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitem_menu_windowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jitem_menu_windowsActionPerformed

    private void jitem_menu_cdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitem_menu_cdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jitem_menu_cdeActionPerformed

    private void menu_threadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_threadActionPerformed
       new  beans_thread().show();
    }//GEN-LAST:event_menu_threadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new cad_cidade().show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void timer10nTime( java.awt.event.ActionEvent evt ) {

        mostra_data.le_hora();
        label_hora.setText("Hora Atual :" + mostra_data.getHora());

    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem jitem_menu_cde;
    private javax.swing.JMenuItem jitem_menu_liquid;
    private javax.swing.JMenuItem jitem_menu_windows;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_hora;
    private javax.swing.JMenuItem menuItem_Cliente;
    private javax.swing.JMenuItem menuItem_bairro;
    private javax.swing.JMenuItem menuItem_cargo;
    private javax.swing.JMenuItem menuItem_cidade;
    private javax.swing.JMenuItem menuItem_cidades;
    private javax.swing.JMenuItem menuItem_entrada;
    private javax.swing.JMenuItem menuItem_fornecedores;
    private javax.swing.JMenuItem menuItem_funcionario;
    private javax.swing.JMenuItem menuItem_implatacao;
    private javax.swing.JMenuItem menuItem_sair;
    private javax.swing.JMenu menu_cadastro;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenu menu_estoque;
    private javax.swing.JMenu menu_relatorio;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenuItem menu_thread;
    private javax.swing.JMenu menu_utilitario;
    // End of variables declaration//GEN-END:variables

    public void lookandfell() {

        try {

            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

}
