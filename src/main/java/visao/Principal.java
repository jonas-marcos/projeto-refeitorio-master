package visao;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProduto = new javax.swing.JButton();
        jFornecedor = new javax.swing.JButton();
        jNotas = new javax.swing.JButton();
        jEntrega = new javax.swing.JButton();
        jCadUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jProduto.setText("Cadastro de Produtos");

        jFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jFornecedor.setText("Cadastro de Empresas Fornecedoras");

        jNotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jNotas.setText("Cadastro de Notas de Empenho");
        jNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNotasActionPerformed(evt);
            }
        });

        jEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jEntrega.setText("Lançamento de Entregas por Notas de Empenho");

        jCadUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCadUsuario.setText("Cadastro de usuários");
        jCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProduto)
                    .addComponent(jFornecedor)
                    .addComponent(jNotas)
                    .addComponent(jEntrega)
                    .addComponent(jCadUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jProduto)
                .addGap(18, 18, 18)
                .addComponent(jFornecedor)
                .addGap(18, 18, 18)
                .addComponent(jNotas)
                .addGap(18, 18, 18)
                .addComponent(jEntrega)
                .addGap(18, 18, 18)
                .addComponent(jCadUsuario)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNotasActionPerformed
        AdicionarNotaDeEmpenho adicionarNotaDeEmpenho = new AdicionarNotaDeEmpenho();
        adicionarNotaDeEmpenho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jNotasActionPerformed

    private void jCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadUsuarioActionPerformed
        FrmCadastroUsuario frmCadastroUsuario = new FrmCadastroUsuario();
        frmCadastroUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCadUsuarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadUsuario;
    private javax.swing.JButton jEntrega;
    private javax.swing.JButton jFornecedor;
    private javax.swing.JButton jNotas;
    private javax.swing.JButton jProduto;
    // End of variables declaration//GEN-END:variables
}
