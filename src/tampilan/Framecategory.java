package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.user;
public class Framecategory extends javax.swing.JFrame {

    public Framecategory() {
        initComponents();
        loadTable();
        reset();
    }

    void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID KATEGORI");
        model.addColumn("KATEGORI");

        try {
            category cat = new category();
            ResultSet data = cat.tampilCategory();

            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("category_id"),
                    data.getString("category_name"),});

            }

        } catch (SQLException sQLException) {

        }

        tKategori.setModel(model);
    }

void otoID() {
        try {
            category cat = new category();
            ResultSet id = cat.otoID();

            if (id.next()) {
                int auto = id.getInt("category_id") + 1;
                tID.setText(String.valueOf(auto));

            } else {
                tID.setText("1");
            }

        } catch (SQLException sQLException) {
        }
    }

    void reset() {

        tNama.setText(null);
        otoID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKategori = new javax.swing.JTable();
        bTambah = new javax.swing.JToggleButton();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Category Id");

        jLabel2.setText("Category Name");

        tKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tKategori);

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Category");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bTambah)
                                .addGap(18, 18, 18)
                                .addComponent(bHapus)
                                .addGap(18, 18, 18)
                                .addComponent(bUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(28, 28, 28)
                                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bHapus)
                    .addComponent(bUbah))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
     try {
            category category = new category();
            category.setCategory_id(Integer.parseInt(tID.getText()));
            category.setCategory_name(tNama.getText());

         
            category.tambahKategori();

        } catch (SQLException sQLException) {
        }
        loadTable();
        reset();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
      try {
            category cty = new category();
            cty.setCategory_id(Integer.parseInt(tID.getText()));
            cty.hapusKategori();
        } catch (SQLException sQLException) {
        }
        loadTable();
        reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void tKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tKategoriMouseClicked
       int baris = tKategori.rowAtPoint(evt.getPoint());
        String idCategory = tKategori.getValueAt(baris, 0).toString();
        String namaCategory = tKategori.getValueAt(baris, 1).toString();

        tID.setText(idCategory);
        tID.setEditable(false);
        tNama.setText(namaCategory);
    }//GEN-LAST:event_tKategoriMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            category cub = new category();
            cub.setCategory_id(Integer.parseInt(tID.getText()));
            cub.setCategory_name(tNama.getText());

            cub.ubahKategori();
        } catch (SQLException sQLException) {
        }
        loadTable();
        reset();
    }//GEN-LAST:event_bUbahActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Framecategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JToggleButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tID;
    private javax.swing.JTable tKategori;
    private javax.swing.JTextField tNama;
    // End of variables declaration//GEN-END:variables
}
