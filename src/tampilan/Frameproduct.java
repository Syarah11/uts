
package tampilan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import kelas.category;
import kelas.product;





public class Frameproduct extends javax.swing.JFrame {

    public Frameproduct() {
        initComponents();
        loadTabel();
        comboCategory();
        otoID();
        reset();

    }

    void loadTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Product ID");
        model.addColumn("Product Name");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Category");

        try {
            product prod = new product();
            ResultSet data = prod.tampilProduct();

            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("ID"),
                    data.getString("Nama"),
                    data.getString("Desc"),
                    data.getString("Harga"),
                    data.getString("Kategori"),});

            }

        } catch (SQLException sQLException) {
        }

        tProduk.setModel(model);

    }

    void comboCategory() {
        try {
            category cat = new category();
            ResultSet data = cat.tampilComboBox();

            while (data.next()) {
                String isi = data.getString("category_name");
                cKategori.addItem(isi);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Frameproduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void otoID() {
        try {
            product prod = new product();
            ResultSet id = prod.otoID();

            if (id.next()) {
                int auto = id.getInt("product_id") + 1;
                tProductID.setText(String.valueOf(auto));

            } else {
                tProductID.setText("1");
            }

        } catch (SQLException sQLException) {
        }
    }

    void reset() {
        otoID();
        tNama.setText(null);
        tDeskripsi.setText(null);
        tPrice.setText(null);
        cKategori.setSelectedItem(null);

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tProductID = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tProduk = new javax.swing.JTable();
        bTambah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tDeskripsi = new javax.swing.JTextArea();
        cKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Product Id");

        jLabel2.setText("Nama");

        jLabel3.setText("Deskeipsi");

        jLabel4.setText("Price");

        jLabel5.setText("Kategori");

        tProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tProduk);

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

        tDeskripsi.setColumns(20);
        tDeskripsi.setRows(5);
        jScrollPane2.setViewportView(tDeskripsi);

        cKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(110, 110, 110))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUbah)
                    .addComponent(bHapus)
                    .addComponent(bTambah))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
       try {
            product prod = new product();
            category cat = new category();
            prod.setProduct_id(Integer.parseInt(tProductID.getText()));
            prod.setProduct_name(tNama.getText());
            prod.setProduct_desc(tDeskripsi.getText());
            prod.setProduct_price(Integer.parseInt(tPrice.getText()));
            String selectedCategory = (String) cKategori.getSelectedItem();
            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                prod.setProduct_cat_id(Integer.parseInt(isi));
            }

            prod.tambahProduct();
        } catch (SQLException sQLException) {
            System.out.println("Data tidak masuk");
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bTambahActionPerformed

    private void tProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProdukMouseClicked
        int baris = tProduk.rowAtPoint(evt.getPoint());
        String productID = tProduk.getValueAt(baris, 0).toString();
        String productName = tProduk.getValueAt(baris, 1).toString();
        String productDesc = tProduk.getValueAt(baris, 2).toString();
        String productPrice = tProduk.getValueAt(baris, 3).toString();
        String productCat = tProduk.getValueAt(baris, 4).toString();

        tProductID.setText(productID);
        tProductID.setEditable(false);
        tNama.setText(productName);
        tDeskripsi.setText(productDesc);
        tPrice.setText(productPrice);
        cKategori.setSelectedItem(productCat);
    }//GEN-LAST:event_tProdukMouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
       try {
            product prod = new product();
            prod.setProduct_id(Integer.parseInt(tProductID.getText()));
            //int categoryId = Integer.parseInt(tIDCategory.getText());
            prod.hapusProduct();
        } catch (SQLException sQLException) {
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            product prod = new product();
            category cat = new category();

            prod.setProduct_id(Integer.parseInt(tProductID.getText()));
            prod.setProduct_name(tNama.getText());
            prod.setProduct_desc(tDeskripsi.getText());
            prod.setProduct_price(Integer.parseInt(tPrice.getText()));

            cat.setCategory_name(cKategori.getSelectedItem().toString());
            ResultSet data = cat.Konversi();

            if (data.next()) {
                String isi = data.getString("category_id");
                prod.setProduct_cat_id(Integer.parseInt(isi));
            }

            prod.ubahProduct();
        } catch (SQLException sQLException) {
            System.out.println("data tidak masuk");
        }

        loadTabel();
        reset();
    }//GEN-LAST:event_bUbahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frameproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tDeskripsi;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tPrice;
    private javax.swing.JTextField tProductID;
    private javax.swing.JTable tProduk;
    // End of variables declaration//GEN-END:variables
}
