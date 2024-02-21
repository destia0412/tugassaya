
package kalkulator;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JFrame {

   
    public Form() {
        initComponents();
    }

    
    proses model = new proses();
    String angka="";
    
    public void getNumber(javax.swing.JButton button){
        angka+=button.getText();
        model.setNumber(angka);
        hasil.setText(angka);
        proses.setText(angka);
    }
    
    private void getOperator(int opt){
        model.setOperator(opt);
        angka="";
    }
    
    private void proses(){
        DecimalFormat df = new DecimalFormat("#,###.########");
        model.process();
        hasil.setText(df.format(model.getResult())+"");
        proses.setText(df.format(model.angka3)+""+model.process+""+(df.format(model.angka2)
                +"="+(df.format(model.result))));
        
        
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btndelete = new rojerusan.RSMaterialButtonRectangle();
        hasil = new javax.swing.JTextField();
        btn7 = new rojerusan.RSMaterialButtonRectangle();
        btn8 = new rojerusan.RSMaterialButtonRectangle();
        btnclear = new rojerusan.RSMaterialButtonRectangle();
        btntambah = new rojerusan.RSMaterialButtonRectangle();
        btn9 = new rojerusan.RSMaterialButtonRectangle();
        btnsamadengan = new rojerusan.RSMaterialButtonRectangle();
        btn5 = new rojerusan.RSMaterialButtonRectangle();
        btn6 = new rojerusan.RSMaterialButtonRectangle();
        btnkurang = new rojerusan.RSMaterialButtonRectangle();
        btn4 = new rojerusan.RSMaterialButtonRectangle();
        btn0 = new rojerusan.RSMaterialButtonRectangle();
        btn00 = new rojerusan.RSMaterialButtonRectangle();
        btntitik = new rojerusan.RSMaterialButtonRectangle();
        btnbagi = new rojerusan.RSMaterialButtonRectangle();
        btn1 = new rojerusan.RSMaterialButtonRectangle();
        btn2 = new rojerusan.RSMaterialButtonRectangle();
        btn3 = new rojerusan.RSMaterialButtonRectangle();
        btnkali = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        proses = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FORM_KALKULATOR");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndelete.setBackground(new java.awt.Color(255, 204, 255));
        btndelete.setForeground(new java.awt.Color(0, 0, 0));
        btndelete.setText("AC");
        btndelete.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 63, 43));

        hasil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hasil.setText("0");
        jPanel1.add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 470, 40));

        btn7.setBackground(new java.awt.Color(255, 204, 255));
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 63, 43));

        btn8.setBackground(new java.awt.Color(255, 204, 255));
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 63, 43));

        btnclear.setBackground(new java.awt.Color(255, 204, 255));
        btnclear.setForeground(new java.awt.Color(0, 0, 0));
        btnclear.setText("C");
        btnclear.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 63, 43));

        btntambah.setBackground(new java.awt.Color(255, 204, 255));
        btntambah.setForeground(new java.awt.Color(0, 0, 0));
        btntambah.setText("+");
        btntambah.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        jPanel1.add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 63, 43));

        btn9.setBackground(new java.awt.Color(255, 204, 255));
        btn9.setForeground(new java.awt.Color(0, 0, 0));
        btn9.setText("9");
        btn9.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 63, 43));

        btnsamadengan.setBackground(new java.awt.Color(255, 204, 255));
        btnsamadengan.setForeground(new java.awt.Color(0, 0, 0));
        btnsamadengan.setText("=");
        btnsamadengan.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });
        jPanel1.add(btnsamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 60, 130));

        btn5.setBackground(new java.awt.Color(255, 204, 255));
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 63, 43));

        btn6.setBackground(new java.awt.Color(255, 204, 255));
        btn6.setForeground(new java.awt.Color(0, 0, 0));
        btn6.setText("6");
        btn6.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 63, 43));

        btnkurang.setBackground(new java.awt.Color(255, 204, 255));
        btnkurang.setForeground(new java.awt.Color(0, 0, 0));
        btnkurang.setText("-");
        btnkurang.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        jPanel1.add(btnkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 63, 43));

        btn4.setBackground(new java.awt.Color(255, 204, 255));
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 63, 43));

        btn0.setBackground(new java.awt.Color(255, 204, 255));
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.setText("0");
        btn0.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 63, 43));

        btn00.setBackground(new java.awt.Color(255, 204, 255));
        btn00.setForeground(new java.awt.Color(0, 0, 0));
        btn00.setText("00");
        btn00.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 63, 43));

        btntitik.setBackground(new java.awt.Color(255, 204, 255));
        btntitik.setForeground(new java.awt.Color(0, 0, 0));
        btntitik.setText(".");
        btntitik.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });
        jPanel1.add(btntitik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 63, 43));

        btnbagi.setBackground(new java.awt.Color(255, 204, 255));
        btnbagi.setForeground(new java.awt.Color(0, 0, 0));
        btnbagi.setText("/");
        btnbagi.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        jPanel1.add(btnbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 63, 43));

        btn1.setBackground(new java.awt.Color(255, 204, 255));
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 63, 43));

        btn2.setBackground(new java.awt.Color(255, 204, 255));
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 63, 43));

        btn3.setBackground(new java.awt.Color(255, 204, 255));
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 63, 43));

        btnkali.setBackground(new java.awt.Color(255, 204, 255));
        btnkali.setForeground(new java.awt.Color(0, 0, 0));
        btnkali.setText("*");
        btnkali.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 63, 43));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setText("KALKULATOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel4.setText("KALKULATOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        proses.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        proses.setText("PROSES");
        jPanel1.add(proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, 20));

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("ABOUT");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("EXIT");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
getNumber(btn00);        
    }//GEN-LAST:event_btn00ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
System.exit(0);      
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
JOptionPane.showMessageDialog(rootPane, "<html><body> APLIKASI ALKULATOR SEDERHANA <br> "
+ "Nama&nbsp&nbsp&nbsp&nbsp&nbsp: DESTIA INDAH EMILIA <br>"
+ "Kelas&nbsp&nbsp&nbsp&nbsp&nbsp : XII RPL 2 <br>"
+ "Jurusan&nbsp : REKAYASA PERANGKAT LUNAK <br>"
+ "</body></html>");    
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
getNumber(btn7);       
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
getNumber(btn8);    
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
getNumber(btn9);        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
getNumber(btn4);       
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
getNumber(btn5);        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
getNumber(btn6);      
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
getNumber(btn1);      
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
getNumber(btn2); 
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
getNumber(btn3);      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
getNumber(btn0);        
    }//GEN-LAST:event_btn0ActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
getNumber(btntitik);        
    }//GEN-LAST:event_btntitikActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
getOperator(1);        
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
getOperator(2);        
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
getOperator(3);     
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
 getOperator(4);      
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
proses();     
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
if(hasil.getText().length()<=1){
angka="";
hasil.setText(("0"));
}else{
angka=hasil.getText().substring(0, hasil.getText().length()-1);
hasil.setText(angka);
}
if(proses.getText().length()<=1){
angka="";
proses.setText(("0"));
}else{
angka=proses.getText().substring(0,proses.getText().length()-1);
proses.setText(angka);
}
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
angka="";
model.setOperator(0);
model.setResult(0);
hasil.setText("0");
proses.setText("process");
    }//GEN-LAST:event_btnclearActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn0;
    private rojerusan.RSMaterialButtonRectangle btn00;
    private rojerusan.RSMaterialButtonRectangle btn1;
    private rojerusan.RSMaterialButtonRectangle btn2;
    private rojerusan.RSMaterialButtonRectangle btn3;
    private rojerusan.RSMaterialButtonRectangle btn4;
    private rojerusan.RSMaterialButtonRectangle btn5;
    private rojerusan.RSMaterialButtonRectangle btn6;
    private rojerusan.RSMaterialButtonRectangle btn7;
    private rojerusan.RSMaterialButtonRectangle btn8;
    private rojerusan.RSMaterialButtonRectangle btn9;
    private rojerusan.RSMaterialButtonRectangle btnbagi;
    private rojerusan.RSMaterialButtonRectangle btnclear;
    private rojerusan.RSMaterialButtonRectangle btndelete;
    private rojerusan.RSMaterialButtonRectangle btnkali;
    private rojerusan.RSMaterialButtonRectangle btnkurang;
    private rojerusan.RSMaterialButtonRectangle btnsamadengan;
    private rojerusan.RSMaterialButtonRectangle btntambah;
    private rojerusan.RSMaterialButtonRectangle btntitik;
    private javax.swing.JTextField hasil;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel proses;
    // End of variables declaration//GEN-END:variables
}
