package com.mycompany.fileoperation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileOperations extends javax.swing.JFrame implements ActionListener {

    int index = 1;

    public FileOperations() {

        // Pencere başlığı "Java Final Projesi" olarak ayarlanır.
        this.setTitle("Java Final Projesi");

        // Bileşenlerin başlatılması için initComponents() metodu çağırılır.
        initComponents();

        // dosyaYoluText bileşeni düzenlenemez olarak ayarlanır.
        dosyaYoluText.setEditable(false);

        // dosyaYoluText bileşenine "Dosya Yolu Seçiniz" metni atanır.
        dosyaYoluText.setText("Dosya Yolu Seçiniz");

        // TasinacakYolText bileşenine "Dosya Yolu Seçiniz" metni atanır.
        TasinacakYolText.setText("Dosya Yolu Seçiniz");

        // TasinacakYolText bileşeni düzenlenemez olarak ayarlanır.
        TasinacakYolText.setEditable(false);

        // TumDosyalarBox bileşeni varsayılan olarak seçili olarak ayarlanır.
        TumDosyalarBox.setSelected(true);

        // Yeni bir DefaultListModel oluşturulur.
        DefaultListModel<String> model = new DefaultListModel<>();

        // DosyaYoluListesi bileşenine model atanır.
        DosyaYoluListesi.setModel(model);

        // Model temizlenir (liste boşaltılır).
        model.clear();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TasiButton = new javax.swing.JButton();
        GizleButton = new javax.swing.JButton();
        SikistirButton = new javax.swing.JButton();
        SifreleButton = new javax.swing.JButton();
        TumDosyalarBox = new javax.swing.JCheckBox();
        SadecePdfBox = new javax.swing.JCheckBox();
        SadeceTxtBox = new javax.swing.JCheckBox();
        SadecePngBox = new javax.swing.JCheckBox();
        DosyaSecButton = new javax.swing.JButton();
        dosyaYoluText = new javax.swing.JTextField();
        TasinacakYolText = new javax.swing.JTextField();
        TasinacakYolButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DosyaYoluListesi = new javax.swing.JList<>();
        ListeyeEkleButton = new javax.swing.JButton();
        SirayiSilButton = new javax.swing.JButton();
        SifreliDosyaCozButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TasiButton.setText("Taşı");
        TasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasiButtonActionPerformed(evt);
            }
        });

        GizleButton.setText("Gizle");
        GizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GizleButtonActionPerformed(evt);
            }
        });

        SikistirButton.setText("Sıkıştır");
        SikistirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SikistirButtonActionPerformed(evt);
            }
        });

        SifreleButton.setText("Şifrele");
        SifreleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreleButtonActionPerformed(evt);
            }
        });

        TumDosyalarBox.setText("Tüm Dosyalar");
        TumDosyalarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TumDosyalarBoxActionPerformed(evt);
            }
        });

        SadecePdfBox.setText("Sadece pdf");
        SadecePdfBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SadecePdfBoxActionPerformed(evt);
            }
        });

        SadeceTxtBox.setText("Sadece txt");
        SadeceTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SadeceTxtBoxActionPerformed(evt);
            }
        });

        SadecePngBox.setText("Sadece png");
        SadecePngBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SadecePngBoxActionPerformed(evt);
            }
        });

        DosyaSecButton.setText("Dosya Seçin");
        DosyaSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosyaSecButtonActionPerformed(evt);
            }
        });

        dosyaYoluText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosyaYoluTextActionPerformed(evt);
            }
        });

        TasinacakYolText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasinacakYolTextActionPerformed(evt);
            }
        });

        TasinacakYolButton.setText("Taşınacak Yolu Seçin");
        TasinacakYolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasinacakYolButtonActionPerformed(evt);
            }
        });

        DosyaYoluListesi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(DosyaYoluListesi);

        ListeyeEkleButton.setText("Listeye Ekle");
        ListeyeEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeyeEkleButtonActionPerformed(evt);
            }
        });

        SirayiSilButton.setText("Seçilen Sırayı Sil");
        SirayiSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SirayiSilButtonActionPerformed(evt);
            }
        });

        SifreliDosyaCozButton.setText("Şifreli Dosya Çöz");
        SifreliDosyaCozButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreliDosyaCozButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SadecePdfBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SadecePngBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dosyaYoluText)
                                .addComponent(TasinacakYolText)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(DosyaSecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 14, Short.MAX_VALUE)
                                    .addComponent(ListeyeEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TasinacakYolButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TumDosyalarBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SadeceTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SikistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SirayiSilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TasiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SifreleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(SifreliDosyaCozButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dosyaYoluText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DosyaSecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListeyeEkleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TasinacakYolText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TasinacakYolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TumDosyalarBox)
                            .addComponent(SadeceTxtBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SadecePdfBox)
                            .addComponent(SadecePngBox))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SirayiSilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(SifreliDosyaCozButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SikistirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SifreleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TasiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TasinacakYolTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasinacakYolTextActionPerformed

    }//GEN-LAST:event_TasinacakYolTextActionPerformed

    private void TasinacakYolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasinacakYolButtonActionPerformed

        // Dosya seçiciyi oluşturuyoruz.
        JFileChooser fileChooser = new JFileChooser();

        // Sadece dizinleri seçmesini sağlıyoruz.
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Dosya seçici penceresini açıyoruz ve kullanıcının seçimini alıyoruz.
        int returnValue = fileChooser.showOpenDialog(null);

        // Kullanıcı bir dosya seçtiyse devam ediyoruz.
        if (returnValue == JFileChooser.APPROVE_OPTION) {

            // Seçilen dosyayı alıyoruz.
            File selectedFile = fileChooser.getSelectedFile();

            // Seçilen dosyanın mutlak yolunu bir metin alanına yerleştiriyoruz.
            TasinacakYolText.setText(selectedFile.getAbsolutePath());

        }

    }//GEN-LAST:event_TasinacakYolButtonActionPerformed

    private void dosyaYoluTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosyaYoluTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosyaYoluTextActionPerformed

    private void DosyaSecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosyaSecButtonActionPerformed

        // Dosya seçiciyi oluşturuyoruz.
        JFileChooser fileChooser = new JFileChooser();

        // Kullanıcının dosya seçimini onaylamasını sağlıyoruz.
        fileChooser.setFileSelectionMode(JFileChooser.APPROVE_OPTION);

        // Dosya seçici penceresini açıyoruz ve kullanıcının seçimini alıyoruz.
        int returnValue = fileChooser.showOpenDialog(null);

        // Kullanıcı bir dosya seçtiyse devam ediyoruz.
        if (returnValue == JFileChooser.APPROVE_OPTION) {

            // Seçilen dosyayı alıyoruz.
            File selectedFile = fileChooser.getSelectedFile();

            // Seçilen dosyanın mutlak yolunu bir metin alanına yerleştiriyoruz.
            dosyaYoluText.setText(selectedFile.getAbsolutePath());

        }

    }//GEN-LAST:event_DosyaSecButtonActionPerformed

    private void TasiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasiButtonActionPerformed

        // Hata durumunda kullanmak üzere IOException nesnesi tanımlanır.
        IOException ex = null;

        // Taşınacak yolun "Dosya Yolu Seçiniz" metni olmadığı kontrol edilir.
        if (!"Dosya Yolu Seçiniz".equals(TasinacakYolText.getText())) {

            // Dosya yolunu tutan bir model alınır.
            DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

            // Modeldeki eleman sayısı alınır.
            int size = model.size();

            // Dosya yollarını tutacak bir dizi oluşturulur.
            String[] dosyaYollari = new String[size];
            for (int i = 0; i < size; i++) {

                // Modeldeki her bir öğenin dosya yoluna ulaşılır ve diziye eklenir.
                dosyaYollari[i] = model.get(i).split(": ")[1];

            }

            // Hedef klasör yolunu alır.
            String hedefKlasorYolu = TasinacakYolText.getText();

            // Seçilen dosya uzantısını alır.
            String dosyaUzantisi = boxIsSelectedFun();

            // Her bir dosya yolu için döngü başlatılır.
            for (String dosyaYolu : dosyaYollari) {

                // Dosya yolunun seçilen uzantıyla bittiği kontrol edilir.
                if (dosyaYolu.toLowerCase().endsWith(dosyaUzantisi)) {

                    // Henüz hata oluşmadıysa işleme devam edilir.
                    if (ex == null) {

                        try {

                            // Dosya nesnesi oluşturulur.
                            File dosya = new File(dosyaYolu);

                            // Hedef dosya yolunu oluşturur.
                            Path hedefDosyaYolu = Paths.get(hedefKlasorYolu, dosya.getName());

                            // Dosyayı hedef klasöre taşır.
                            Files.move(dosya.toPath(), hedefDosyaYolu, StandardCopyOption.REPLACE_EXISTING);

                            // Kullanıcıya başarılı mesajı gösterilir.
                            JOptionPane.showMessageDialog(null, "Taşıma işlemi başarılı.");

                            // Taşıma işleminde bir hata oluşursa yakalanır.
                        } catch (IOException exep) {

                            // Kullanıcıya hata mesajı gösterilir.
                            JOptionPane.showMessageDialog(null, exep.getMessage());

                            // Hata nesnesi ex değişkenine atanır ve döngüden çıkılır.
                            ex = exep;

                            break;

                        }

                        // Daha önce bir hata oluştuysa kullanıcıya hata mesajı gösterilir.
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }

            // Taşınacak yolun seçilmediği durumda kullanıcıya uyarı mesajı gösterilir.
        } else {
            JOptionPane.showMessageDialog(null, "Taşınacak dosya yolunu seçin.");
        }

    }//GEN-LAST:event_TasiButtonActionPerformed

    private String boxIsSelectedFun() {

        if (SadecePdfBox.isSelected()) {
            return ".pdf";
        } else if (SadeceTxtBox.isSelected()) {
            return ".txt";
        } else if (SadecePngBox.isSelected()) {
            return ".png";
        } else {
            return "";
        }
    }

    private void TumDosyalarBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TumDosyalarBoxActionPerformed

        if (TumDosyalarBox.isSelected()) {
            SadecePdfBox.setSelected(false);
            SadeceTxtBox.setSelected(false);
            SadecePngBox.setSelected(false);
        } else {
            TumDosyalarBox.setSelected(true);
        }

    }//GEN-LAST:event_TumDosyalarBoxActionPerformed

    private void SadecePngBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SadecePngBoxActionPerformed

        if (SadecePngBox.isSelected()) {
            TumDosyalarBox.setSelected(false);
            SadecePdfBox.setSelected(false);
            SadeceTxtBox.setSelected(false);
        } else {
            SadecePngBox.setSelected(true);
        }

    }//GEN-LAST:event_SadecePngBoxActionPerformed

    private void ListeyeEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeyeEkleButtonActionPerformed

        // Kullanıcının girdiği dosya yolunu almak için dosyaYoluText bileşeninden değeri alır ve dosyaYolu değişkenine atar.
        String dosyaYolu = dosyaYoluText.getText();
        DefaultListModel<String> model;

        // "Dosya Yolu Seçiniz" metnine eşit olmayan bir dosya yolu girildiyse devam edilir.
        if (!"Dosya Yolu Seçiniz".equals(dosyaYolu)) {

            // DosyaYoluListesi'nin modele sahip olup olmadığı kontrol edilir.
            if (DosyaYoluListesi.getModel() instanceof DefaultListModel) {

                model = (DefaultListModel<String>) DosyaYoluListesi.getModel();
                boolean dosyaYoluVarMi = false;
                for (int i = 0; i < model.getSize(); i++) {

                    // Dosya yolu zaten listede varsa, dosyaYoluVarMi değişkeni true olarak ayarlanır ve döngüden çıkılır.
                    if (model.getElementAt(i).split(": ")[1].equals(dosyaYolu)) {

                        dosyaYoluVarMi = true;
                        break;

                    }

                }

                // Dosya yolu listede yoksa, modelde yeni bir öğe olarak eklenir.
                if (!dosyaYoluVarMi) {

                    model.addElement(index++ + ": " + dosyaYolu);

                }

            } else {

                // DosyaYoluListesi bir DefaultListModel değilse, yeni bir DefaultListModel oluşturulur ve dosya yolunu modelin içine eklenir.
                model = new DefaultListModel<>();
                model.addElement(index++ + ": " + dosyaYolu);
                DosyaYoluListesi.setModel(model);

            }

        } else {

            // "Dosya Yolu Seçiniz" metni girildiyse hata mesajı gösterilir.
            JOptionPane.showMessageDialog(null, "Eklemek istediğiniz dosyayı seçin.");

        }

        // dosyaYoluText bileşenine "Dosya Yolu Seçiniz" metni yeniden atanır.
        dosyaYoluText.setText("Dosya Yolu Seçiniz");

    }//GEN-LAST:event_ListeyeEkleButtonActionPerformed

    private void SadecePdfBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SadecePdfBoxActionPerformed

        if (SadecePdfBox.isSelected()) {
            TumDosyalarBox.setSelected(false);
            SadeceTxtBox.setSelected(false);
            SadecePngBox.setSelected(false);
        } else {
            SadecePdfBox.setSelected(true);
        }

    }//GEN-LAST:event_SadecePdfBoxActionPerformed

    private void SadeceTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SadeceTxtBoxActionPerformed

        if (SadeceTxtBox.isSelected()) {
            TumDosyalarBox.setSelected(false);
            SadecePdfBox.setSelected(false);
            SadecePngBox.setSelected(false);
        } else {
            SadeceTxtBox.setSelected(true);
        }

    }//GEN-LAST:event_SadeceTxtBoxActionPerformed

    private void SikistirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SikistirButtonActionPerformed

        String dosyaUzantisi = boxIsSelectedFun(); // Seçilen dosya uzantısını almak için bir fonksiyon çağırılır ve değer dosyaUzantisi değişkenine atanır.

        // "Dosya Yolu Seçiniz" metnine eşit olmayan bir değer girildiyse devam edilir.
        if (!"Dosya Yolu Seçiniz".equals(TasinacakYolText.getText())) {
            DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

            // Model boşsa hata mesajı gösterilir ve işlev sonlandırılır.
            if (model.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen listeye dosya yolu ekleyiniz.");
                return;
            }

            // Zip dosyasının yolu belirlenir.
            String zipPath = TasinacakYolText.getText() + "/dosyalar.zip";

            // Modeldeki dosya yolları alınır ve diziye atanır.
            int size = model.size();
            String[] dosyaYollari = new String[size];
            for (int i = 0; i < size; i++) {
                dosyaYollari[i] = model.get(i).split(": ")[1];
            }

            byte[] buffer = new byte[1024];

            // Zip dosyası oluşturulur ve dosyalar sıkıştırılır.
            try (FileOutputStream fos = new FileOutputStream(zipPath); ZipOutputStream zos = new ZipOutputStream(fos)) {
                for (String dosyaYolu : dosyaYollari) {

                    // Dosya uzantısı kontrol edilir.
                    if (dosyaYolu.toLowerCase().endsWith(dosyaUzantisi)) {

                        // Dosya varsa işlemler gerçekleştirilir.
                        File dosya = new File(dosyaYolu);
                        if (dosya.exists()) {
                            // Zip dosyasına yeni bir giriş oluşturulur ve dosyanın içeriği yazılır.
                            ZipEntry zipEntry = new ZipEntry(dosya.getName());
                            zos.putNextEntry(zipEntry);
                            try (FileInputStream fis = new FileInputStream(dosya)) {
                                int length;
                                while ((length = fis.read(buffer)) > 0) {
                                    zos.write(buffer, 0, length);
                                }
                            }
                            zos.closeEntry();
                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Dosyalar başarıyla sıkıştırıldı ve " + zipPath + " yolunda kaydedildi.");
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen taşınacak dosya yolunu seçiniz.");
        }

    }//GEN-LAST:event_SikistirButtonActionPerformed

    private void SifreleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreleButtonActionPerformed

        // Seçilen dosya uzantısını almak için bir fonksiyon çağırılır ve değer dosyaUzantisi değişkenine atanır.
        String dosyaUzantisi = boxIsSelectedFun();

        // Şifreleme anahtarı olarak kullanılacak bir dize tanımlanır.
        String key = "HalitGökayTuran";

        // "Dosya Yolu Seçiniz" metnine eşit olmayan bir değer girildiyse devam edilir.
        if (!"Dosya Yolu Seçiniz".equals(TasinacakYolText.getText())) {
            DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

            // Model boşsa hata mesajı gösterilir ve işlev sonlandırılır.
            if (model.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen listeye dosya yolu ekleyiniz.");
                return;
            }

            // Şifreli klasörün yolu belirlenir ve oluşturulur (varsa mevcut olanı kullanılır).
            String sifreliKlasorPath = TasinacakYolText.getText() + "/şifreli";
            File sifreliKlasor = new File(sifreliKlasorPath);
            if (!sifreliKlasor.exists()) {
                sifreliKlasor.mkdir();
            }

            // Modeldeki dosya yolları alınır ve diziye atanır.
            int size = model.size();
            String[] dosyaYollari = new String[size];
            for (int i = 0; i < size; i++) {
                dosyaYollari[i] = model.get(i).split(": ")[1];
            }

            try {
                // Her bir dosya yolu için işlemler gerçekleştirilir.
                for (String dosyaYolu : dosyaYollari) {

                    // Dosya uzantısı kontrol edilir.
                    if (dosyaYolu.toLowerCase().endsWith(dosyaUzantisi)) {

                        // Dosya varsa işlemler gerçekleştirilir.
                        File dosya = new File(dosyaYolu);
                        if (dosya.exists()) {

                            // Şifreleme anahtarı ve algoritmasıyla bir şifreleme nesnesi oluşturulur.
                            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
                            Cipher cipher = Cipher.getInstance("AES");
                            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

                            // Dosyanın içeriği okunur ve şifrelenir.
                            FileInputStream inputStream = new FileInputStream(dosyaYolu);
                            byte[] inputBytes = new byte[(int) new File(dosyaYolu).length()];
                            inputStream.read(inputBytes);

                            byte[] outputBytes = cipher.doFinal(inputBytes);

                            // Şifrelenmiş dosyanın adı ve yolu belirlenir ve oluşturulur.
                            String sifreliDosyaAdi = dosya.getName();
                            String sifreliDosyaYolu = sifreliKlasorPath + "/" + sifreliDosyaAdi;
                            FileOutputStream outputStream = new FileOutputStream(sifreliDosyaYolu);
                            outputStream.write(outputBytes);

                            // Kaynak dosya ve çıktı dosyası kapatılır.
                            inputStream.close();
                            outputStream.close();

                        }

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(this, "Dosyalar başarıyla sıkıştırıldı ve " + sifreliKlasorPath + " yolunda kaydedildi.");
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen taşınacak dosya yolunu seçiniz.");
        }
    }//GEN-LAST:event_SifreleButtonActionPerformed

    private void GizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GizleButtonActionPerformed

        // DefaultListModel sınıfından model adında bir nesne oluşturuldu ve DosyaYoluListesi'nin modeline atandı.
        DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

        // Eğer model boş ise kullanıcıya "Lütfen listeye dosya yolu ekleyiniz." şeklinde bir uyarı mesajı gösterilir ve kodun geri kalanı çalıştırılmaz.
        if (model.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lütfen listeye dosya yolu ekleyiniz.");
            return;
        }

        // boxIsSelectedFun() fonksiyonu çağırılıp dönen değer dosyaUzantisi değişkenine atanır.
        String dosyaUzantisi = boxIsSelectedFun();

        // model'in boyutu size değişkenine atanır.
        int size = model.size();

        // dosyaYollari adında String dizisi oluşturulur ve boyutu size olarak belirlenir.
        String[] dosyaYollari = new String[size];

        // model içindeki her bir öğe için döngü oluşturulur.
        for (int i = 0; i < size; i++) {
            // Her bir öğenin ": " karakterine göre bölünerek dosya yolu kısmı alınır ve dosyaYollari dizisine atılır.
            dosyaYollari[i] = model.get(i).split(": ")[1];
        }

        // dosyaYollari dizisi içindeki her bir dosya yolu için döngü oluşturulur.
        for (String dosyaYolu : dosyaYollari) {
            // Dosya yolu, dosyaUzantisi ile bitiyorsa aşağıdaki işlemler yapılır.
            if (dosyaYolu.toLowerCase().endsWith(dosyaUzantisi)) {
                // Dosya adı dosyaYolu'ndan alınır ve dosya adına sahip bir File nesnesi oluşturulur.
                File dosya = new File(dosyaYolu);
                // Dosya mevcut ise aşağıdaki işlemler yapılır.
                if (dosya.exists()) {
                    try {
                        // Dosyanın "dos:hidden" özniteliği true olarak ayarlanır.
                        Files.setAttribute(dosya.toPath(), "dos:hidden", true);

                        // Kullanıcıya "Gizleme başarıyla tamamlandı." şeklinde bir mesaj gösterilir.
                        JOptionPane.showMessageDialog(this, "Gizleme başarıyla tamamlandı.");
                    } catch (IOException ex) {
                        // İstisna durumu oluştuğunda hata mesajı yazdırılır.
                        ex.printStackTrace();
                    }
                }
            }
        }

    }//GEN-LAST:event_GizleButtonActionPerformed

    private void SirayiSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SirayiSilButtonActionPerformed

        DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

        // Seçili öğelerin indislerini al
        int[] selectedIndices = DosyaYoluListesi.getSelectedIndices();

        // Hiçbir öğe seçilmemişse hata mesajı göster ve işlemi sonlandır
        if (selectedIndices.length == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen öğe seçin.");
            return;
        }

        // Seçili öğeleri geriye doğru döngüyle kaldır
        for (int i = selectedIndices.length - 1; i >= 0; i--) {
            model.remove(selectedIndices[i]);
        }

        // Listeye yapılan değişiklikleri model üzerinden güncelle
        DosyaYoluListesi.setModel(model);


    }//GEN-LAST:event_SirayiSilButtonActionPerformed

    private void SifreliDosyaCozButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreliDosyaCozButtonActionPerformed

        String dosyaUzantisi = boxIsSelectedFun();

        // Kullanıcıdan şifreyi al
        String key = JOptionPane.showInputDialog("Şifreyi giriniz:");

        // "Dosya Yolu Seçiniz" metni, TasinacakYolText metin kutusundaki metinle karşılaştırılır
        if (!"Dosya Yolu Seçiniz".equals(TasinacakYolText.getText())) {
            // DefaultListModel kullanılarak DosyaYoluListesi'nin modeli alınır
            DefaultListModel<String> model = (DefaultListModel<String>) DosyaYoluListesi.getModel();

            // Model boşsa hata mesajı gösterilir ve işlem sonlandırılır
            if (model.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lütfen listeye dosya yolu ekleyiniz.");
                return;
            }

            // Şifreli klasör yolunu belirle
            String sifreliKlasorPath = TasinacakYolText.getText() + "/Çözüldü";
            File sifreliKlasor = new File(sifreliKlasorPath);

            // Şifreli klasör yoksa oluştur
            if (!sifreliKlasor.exists()) {
                sifreliKlasor.mkdir();
            }

            // Modeldeki dosya yollarını alarak diziye aktar
            int size = model.size();
            String[] dosyaYollari = new String[size];
            for (int i = 0; i < size; i++) {
                dosyaYollari[i] = model.get(i).split(": ")[1];
            }

            try {
                // Her bir dosya yolunu döngüyle işle
                for (String dosyaYolu : dosyaYollari) {
                    // Dosya uzantısı doğrulaması yap
                    if (dosyaYolu.toLowerCase().endsWith(dosyaUzantisi)) {
                        // Dosya mevcut ise işlem yap
                        File dosya = new File(dosyaYolu);
                        if (dosya.exists()) {
                            // Şifreleme anahtarını ve şifreleme algoritmasını belirle
                            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
                            Cipher cipher = Cipher.getInstance("AES");
                            cipher.init(Cipher.DECRYPT_MODE, secretKey);

                            // Dosyayı oku ve şifre çöz
                            FileInputStream inputStream = new FileInputStream(dosyaYolu);
                            byte[] inputBytes = new byte[(int) new File(dosyaYolu).length()];
                            inputStream.read(inputBytes);

                            byte[] outputBytes = cipher.doFinal(inputBytes);

                            // Çözülen dosyanın adını ve yolunu belirle
                            String cozulmusDosyaAdi = dosya.getName();
                            String cozulmusDosyaYolu = sifreliKlasorPath + "/" + cozulmusDosyaAdi;

                            // Çözülen dosyayı kaydet
                            FileOutputStream outputStream = new FileOutputStream(cozulmusDosyaYolu);
                            outputStream.write(outputBytes);

                            // Dosya işlemlerini kapat
                            inputStream.close();
                            outputStream.close();
                        }
                    }
                }
                // İşlem başarıyla tamamlandı mesajını göster
                JOptionPane.showMessageDialog(this, "Dosyalar başarıyla çözüldü ve " + sifreliKlasorPath + " yolunda kaydedildi.");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(FileOperations.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // Dosya yolunun seçilmediği durumunda hata mesajı göster
            JOptionPane.showMessageDialog(this, "Lütfen taşınacak dosya yolunu seçiniz.");
        }


    }//GEN-LAST:event_SifreliDosyaCozButtonActionPerformed

    private void moveFile(String sourcePath, String targetPath) throws IOException {

        // Kaynak dosyanın yolu ve hedef dosyanın yolu tanımlanıyor
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath, sourceFile.getName());

        // Kaynak dosyanın hedef dosyaya taşınması gerçekleştiriliyor
        Files.move(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        // Kullanıcıya başarılı bir şekilde taşındığına dair bir ileti gösteriliyor
        JOptionPane.showMessageDialog(null, "Dosya başarıyla taşındı!");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DosyaSecButton;
    private javax.swing.JList<String> DosyaYoluListesi;
    private javax.swing.JButton GizleButton;
    private javax.swing.JButton ListeyeEkleButton;
    private javax.swing.JCheckBox SadecePdfBox;
    private javax.swing.JCheckBox SadecePngBox;
    private javax.swing.JCheckBox SadeceTxtBox;
    private javax.swing.JButton SifreleButton;
    private javax.swing.JButton SifreliDosyaCozButton;
    private javax.swing.JButton SikistirButton;
    private javax.swing.JButton SirayiSilButton;
    private javax.swing.JButton TasiButton;
    private javax.swing.JButton TasinacakYolButton;
    private javax.swing.JTextField TasinacakYolText;
    private javax.swing.JCheckBox TumDosyalarBox;
    private javax.swing.JTextField dosyaYoluText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
