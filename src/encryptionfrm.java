/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author launa
 */
public class encryptionfrm extends javax.swing.JFrame {

    /**
     * Creates new form encryptionfrm
     */
    public encryptionfrm() {
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

        encryptttl = new javax.swing.JLabel();
        encryptttxt = new javax.swing.JTextField();
        encryptbtn = new javax.swing.JButton();
        encryptdtxt = new javax.swing.JTextField();
        encryptttl1 = new javax.swing.JLabel();
        decryptttl = new javax.swing.JLabel();
        decrypttxt = new javax.swing.JTextField();
        decryptetxt = new javax.swing.JTextField();
        decryptbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encryptttl.setText("Encryption/Decryption Program (Caesar Cipher)");

        encryptbtn.setText("Encrypt");
        encryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptbtnActionPerformed(evt);
            }
        });

        encryptttl1.setText("Enter a decrypted message here and it will be encrypted!");

        decryptttl.setText("Enter an encrypted message and it will be decrypted!");

        decryptbtn.setText("Decrypt");
        decryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(decryptttl)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(encryptttl1)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(decrypttxt)
                    .addComponent(encryptdtxt)
                    .addComponent(encryptttxt)
                    .addComponent(decryptetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(encryptbtn)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(encryptttl)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(decryptbtn)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(encryptttl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encryptttl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encryptbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(encryptdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(decryptttl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(decrypttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptbtnActionPerformed
     String encrypt = encryptttxt.getText();
     
   char letter1 = (encrypt.charAt(0));
    
    int asciiVal;
    asciiVal = (int)letter1;
    asciiVal = asciiVal+4;
    char letter1final = (char)asciiVal;
    
    
    char letter2 = (encrypt.charAt(1));
    
    int asciiVal2;
    asciiVal = (int)letter2;
    asciiVal = asciiVal+4;
    char letter2final = (char)asciiVal;
    
    char letter3 = (encrypt.charAt(2));  
    
    int asciiVal3;
    asciiVal = (int)letter3;
    asciiVal = asciiVal+4;
    char letter3final = (char)asciiVal;
    
    char letter4 = (encrypt.charAt(3));
    
    int asciiVal4;
    asciiVal = (int)letter4;
    asciiVal = asciiVal+4;
    char letter4final = (char)asciiVal;
    
    char letter5 = (encrypt.charAt(4));
    
    int asciiVal5;
    asciiVal = (int)letter5;
    asciiVal = asciiVal+4;
    char letter5final = (char)asciiVal;
    
    char letter6 = (encrypt.charAt(5));
    
    int asciiVal6;
    asciiVal = (int)letter6;
    asciiVal = asciiVal+4;
    char letter6final = (char)asciiVal;
    
    char letter7 = (encrypt.charAt(6));
    
    int asciiVal7;
    asciiVal = (int)letter7;
    asciiVal = asciiVal+4;
    char letter7final = (char)asciiVal;
    
    char letter8 = (encrypt.charAt(7));
    
    int asciiVal8;
    asciiVal = (int)letter8;
    asciiVal = asciiVal+4;
    char letter8final = (char)asciiVal;
    
    char letter9 = (encrypt.charAt(8));
    
    int asciiVal9;
    asciiVal = (int)letter9;
    asciiVal = asciiVal+4;
    char letter9final = (char)asciiVal;
    
    char letter10 = (encrypt.charAt(9));
    
    int asciiVal10;
    asciiVal = (int)letter10;
    asciiVal = asciiVal+4;
    char letter10final = (char)asciiVal;
    
    char letter11 = (encrypt.charAt(10));
    
    int asciiVal11;
    asciiVal = (int)letter11;
    asciiVal = asciiVal+4;
    char letter11final = (char)asciiVal;
    
    char letter12 = (encrypt.charAt(11));
    
    int asciiVal12;
    asciiVal = (int)letter12;
    asciiVal = asciiVal+4;
    char letter12final = (char)asciiVal;
    
    char letter13 = (encrypt.charAt(12));
    
    int asciiVal13;
    asciiVal = (int)letter13;
    asciiVal = asciiVal+4;
    char letter13final = (char)asciiVal;
    
    char letter14 = (encrypt.charAt(13));
    
    int asciiVal14;
    asciiVal = (int)letter14;
    asciiVal = asciiVal+4;
    char letter14final = (char)asciiVal;
    
    char letter15 = (encrypt.charAt(14));
    
    int asciiVal15;
    asciiVal = (int)letter15;
    asciiVal = asciiVal+4;
    char letter15final = (char)asciiVal;
    
    char letter16 = (encrypt.charAt(15));
    
    int asciiVal16;
    asciiVal = (int)letter16;
    asciiVal = asciiVal+4;
    char letter16final = (char)asciiVal;
    
    char letter17 = (encrypt.charAt(16));
    
    int asciiVal17;
    asciiVal = (int)letter17;
    asciiVal = asciiVal+4;
    char letter17final = (char)asciiVal;
    
    char letter18 = (encrypt.charAt(17));
    
    int asciiVal18;
    asciiVal = (int)letter18;
    asciiVal = asciiVal+4;
    char letter18final = (char)asciiVal;
    
    char letter19 = (encrypt.charAt(18));
    
    int asciiVal19;
    asciiVal = (int)letter19;
    asciiVal = asciiVal+4;
    char letter19final = (char)asciiVal;
    
    char letter20 = (encrypt.charAt(19));
    
    int asciiVal20;
    asciiVal = (int)letter20;
    asciiVal = asciiVal+4;
    char letter20final = (char)asciiVal;
    
    char letter21 = (encrypt.charAt(20));
    
    int asciiVal21;
    asciiVal = (int)letter21;
    asciiVal = asciiVal+4;
    char letter21final = (char)asciiVal;
    
    char letter22 = (encrypt.charAt(21));
    
    int asciiVal22;
    asciiVal = (int)letter22;
    asciiVal = asciiVal+4;
    char letter22final = (char)asciiVal;
    
    char letter23 = (encrypt.charAt(22));
    
    int asciiVal23;
    asciiVal = (int)letter23;
    asciiVal = asciiVal+4;
    char letter23final = (char)asciiVal;
    
    char letter24 = (encrypt.charAt(23));
    
    int asciiVal24;
    asciiVal = (int)letter24;
    asciiVal = asciiVal+4;
    char letter24final = (char)asciiVal;
    
    char letter25 = (encrypt.charAt(24));
    
    int asciiVal25;
    asciiVal = (int)letter25;
    asciiVal = asciiVal+4;
    char letter25final = (char)asciiVal;
    
    char letter26 = (encrypt.charAt(25));
    
    int asciiVal26;
    asciiVal = (int)letter26;
    asciiVal = asciiVal+4;
    char letter26final = (char)asciiVal;
    
    char letter27 = (encrypt.charAt(26));
    
    int asciiVal27;
    asciiVal = (int)letter27;
    asciiVal = asciiVal+4;
    char letter27final = (char)asciiVal;
    
    char letter28 = (encrypt.charAt(27));
    
    int asciiVal28;
    asciiVal = (int)letter28;
    asciiVal = asciiVal+4;
    char letter28final = (char)asciiVal;
    
    char letter29 = (encrypt.charAt(28));
    
    int asciiVal29;
    asciiVal = (int)letter29;
    asciiVal = asciiVal+4;
    char letter29final = (char)asciiVal;
    
    char letter30 = (encrypt.charAt(29));
    
    int asciiVal30;
    asciiVal = (int)letter30;
    asciiVal = asciiVal+4;
    char letter30final = (char)asciiVal;
    
    char letter31 = (encrypt.charAt(30));
    
    int asciiVal31;
    asciiVal = (int)letter31;
    asciiVal = asciiVal+4;
    char letter31final = (char)asciiVal;
    
    
     String finalencrypt1 = String.valueOf(letter1final);
     String finalencrypt2 = String.valueOf(letter2final);
     String finalencrypt3 = String.valueOf(letter3final);
     String finalencrypt4 = String.valueOf(letter4final);
     String finalencrypt5 = String.valueOf(letter5final);
     String finalencrypt6 = String.valueOf(letter6final);
     String finalencrypt7 = String.valueOf(letter7final);
     String finalencrypt8 = String.valueOf(letter8final);
     String finalencrypt9 = String.valueOf(letter9final);
     String finalencrypt10 = String.valueOf(letter10final);
     String finalencrypt11 = String.valueOf(letter11final);
     String finalencrypt12 = String.valueOf(letter12final);
     String finalencrypt13 = String.valueOf(letter13final);
     String finalencrypt14 = String.valueOf(letter14final);
     String finalencrypt15 = String.valueOf(letter15final);     
     String finalencrypt16 = String.valueOf(letter16final);
     String finalencrypt17 = String.valueOf(letter17final);
     String finalencrypt18 = String.valueOf(letter18final);
     String finalencrypt19 = String.valueOf(letter19final);
     String finalencrypt20 = String.valueOf(letter20final);
     String finalencrypt21 = String.valueOf(letter21final);
     String finalencrypt22 = String.valueOf(letter22final);
     String finalencrypt23 = String.valueOf(letter23final);
     String finalencrypt24 = String.valueOf(letter24final);
     String finalencrypt25 = String.valueOf(letter25final);
     String finalencrypt26 = String.valueOf(letter26final);
     String finalencrypt27 = String.valueOf(letter27final);
     String finalencrypt28 = String.valueOf(letter28final);
     String finalencrypt29 = String.valueOf(letter29final);
     String finalencrypt30 = String.valueOf(letter30final);
     String finalencrypt31 = String.valueOf(letter31final);


     String finalencrypt123 = finalencrypt1 + finalencrypt2 + finalencrypt3 + finalencrypt4 + finalencrypt5 + finalencrypt6 + finalencrypt7+finalencrypt8 + finalencrypt9 + finalencrypt10 + finalencrypt11 + finalencrypt12 + finalencrypt13 + finalencrypt14 + finalencrypt15 + finalencrypt16 + finalencrypt17 + finalencrypt18 + finalencrypt19 + finalencrypt20 + finalencrypt21 + finalencrypt22 + finalencrypt23 + finalencrypt24 + finalencrypt25 + finalencrypt26 + finalencrypt27 + finalencrypt28 + finalencrypt29 + finalencrypt30 + finalencrypt31;   
     encryptdtxt.setText(finalencrypt123);






    
















    }//GEN-LAST:event_encryptbtnActionPerformed

    private void decryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptbtnActionPerformed
     String decrypt = decrypttxt.getText();
     
   char letter1 = (decrypt.charAt(0));
    
    int asciiVal;
    asciiVal = (int)letter1;
    asciiVal = asciiVal-4;
    char letter1final = (char)asciiVal;
    
    char letter2 = (decrypt.charAt(1));
    
    int asciiVal2;
    asciiVal = (int)letter2;
    asciiVal = asciiVal-4;
    char letter2final = (char)asciiVal;
    
    char letter3 = (decrypt.charAt(2));
    
    int asciiVal3;
    asciiVal = (int)letter3;
    asciiVal = asciiVal-4;
    char letter3final = (char)asciiVal;
    
    char letter4 = (decrypt.charAt(3));
    
    int asciiVal4;
    asciiVal = (int)letter4;
    asciiVal = asciiVal-4;
    char letter4final = (char)asciiVal;
    
    char letter5 = (decrypt.charAt(4));
    
    int asciiVal5;
    asciiVal = (int)letter5;
    asciiVal = asciiVal-4;
    char letter5final = (char)asciiVal;
    
    char letter6 = (decrypt.charAt(5));
    
    int asciiVal6;
    asciiVal = (int)letter6;
    asciiVal = asciiVal-4;
    char letter6final = (char)asciiVal;
    
    char letter7 = (decrypt.charAt(6));
    
    int asciiVal7;
    asciiVal = (int)letter7;
    asciiVal = asciiVal-4;
    char letter7final = (char)asciiVal;
    
    char letter8 = (decrypt.charAt(7));
    
    int asciiVal8;
    asciiVal = (int)letter8;
    asciiVal = asciiVal-4;
    char letter8final = (char)asciiVal;
    
    char letter9 = (decrypt.charAt(8));
    
    int asciiVal9;
    asciiVal = (int)letter9;
    asciiVal = asciiVal-4;
    char letter9final = (char)asciiVal;
    
    char letter10 = (decrypt.charAt(9));
    
    int asciiVal10;
    asciiVal = (int)letter10;
    asciiVal = asciiVal-4;
    char letter10final = (char)asciiVal;
    
    char letter11 = (decrypt.charAt(10));
    
    int asciiVal11;
    asciiVal = (int)letter11;
    asciiVal = asciiVal-4;
    char letter11final = (char)asciiVal;
    
    char letter12 = (decrypt.charAt(11));
    
    int asciiVal12;
    asciiVal = (int)letter12;
    asciiVal = asciiVal-4;
    char letter12final = (char)asciiVal;
    
    char letter13 = (decrypt.charAt(12));
    
    int asciiVal13;
    asciiVal = (int)letter13;
    asciiVal = asciiVal-4;
    char letter13final = (char)asciiVal;
    
    char letter14 = (decrypt.charAt(13));
    
    int asciiVal14;
    asciiVal = (int)letter14;
    asciiVal = asciiVal-4;
    char letter14final = (char)asciiVal;
    
    char letter15 = (decrypt.charAt(14));
    
    int asciiVal15;
    asciiVal = (int)letter15;
    asciiVal = asciiVal-4;
    char letter15final = (char)asciiVal;
    
    char letter16 = (decrypt.charAt(15));
    
    int asciiVal16;
    asciiVal = (int)letter16;
    asciiVal = asciiVal-4;
    char letter16final = (char)asciiVal;
    
    char letter17 = (decrypt.charAt(16));
    
    int asciiVal17;
    asciiVal = (int)letter17;
    asciiVal = asciiVal-4;
    char letter17final = (char)asciiVal;
    
    char letter18 = (decrypt.charAt(17));
    
    int asciiVal18;
    asciiVal = (int)letter18;
    asciiVal = asciiVal-4;
    char letter18final = (char)asciiVal;
    
    char letter19 = (decrypt.charAt(18));
    
    int asciiVal19;
    asciiVal = (int)letter19;
    asciiVal = asciiVal-4;
    char letter19final = (char)asciiVal;
    
    char letter20 = (decrypt.charAt(19));
    
    int asciiVal20;
    asciiVal = (int)letter20;
    asciiVal = asciiVal-4;
    char letter20final = (char)asciiVal;
    
    char letter21 = (decrypt.charAt(20));
    
    int asciiVal21;
    asciiVal = (int)letter21;
    asciiVal = asciiVal-4;
    char letter21final = (char)asciiVal;
    
    char letter22 = (decrypt.charAt(21));
    
    int asciiVal22;
    asciiVal = (int)letter22;
    asciiVal = asciiVal-4;
    char letter22final = (char)asciiVal;
    
    char letter23 = (decrypt.charAt(22));
    
    int asciiVal23;
    asciiVal = (int)letter23;
    asciiVal = asciiVal-4;
    char letter23final = (char)asciiVal;
    
    char letter24 = (decrypt.charAt(23));
    
    int asciiVal24;
    asciiVal = (int)letter24;
    asciiVal = asciiVal-4;
    char letter24final = (char)asciiVal;
    
    char letter25 = (decrypt.charAt(24));
    
    int asciiVal25;
    asciiVal = (int)letter25;
    asciiVal = asciiVal-4;
    char letter25final = (char)asciiVal;
    
    char letter26 = (decrypt.charAt(25));
    
    int asciiVal26;
    asciiVal = (int)letter26;
    asciiVal = asciiVal-4;
    char letter26final = (char)asciiVal;
    
    char letter27 = (decrypt.charAt(26));
    
    int asciiVal27;
    asciiVal = (int)letter27;
    asciiVal = asciiVal-4;
    char letter27final = (char)asciiVal;
    
    char letter28 = (decrypt.charAt(27));
    
    int asciiVal28;
    asciiVal = (int)letter28;
    asciiVal = asciiVal-4;
    char letter28final = (char)asciiVal;
    
    char letter29 = (decrypt.charAt(28));
    
    int asciiVal29;
    asciiVal = (int)letter29;
    asciiVal = asciiVal-4;
    char letter29final = (char)asciiVal;
    
    char letter30 = (decrypt.charAt(29));
    
    int asciiVal30;
    asciiVal = (int)letter30;
    asciiVal = asciiVal-4;
    char letter30final = (char)asciiVal;
    
    char letter31 = (decrypt.charAt(30));
    
    int asciiVal31;
    asciiVal = (int)letter31;
    asciiVal = asciiVal-4;
    char letter31final = (char)asciiVal;
    
    
    String finaldecrypt1 = String.valueOf(letter1final);
     String finaldecrypt2 = String.valueOf(letter2final);
     String finaldecrypt3 = String.valueOf(letter3final);
     String finaldecrypt4 = String.valueOf(letter4final);
     String finaldecrypt5 = String.valueOf(letter5final);
     String finaldecrypt6 = String.valueOf(letter6final);
     String finaldecrypt7 = String.valueOf(letter7final);
     String finaldecrypt8 = String.valueOf(letter8final);
     String finaldecrypt9 = String.valueOf(letter9final);
     String finaldecrypt10 = String.valueOf(letter10final);
     String finaldecrypt11 = String.valueOf(letter11final);
     String finaldecrypt12 = String.valueOf(letter12final);
     String finaldecrypt13 = String.valueOf(letter13final);
     String finaldecrypt14 = String.valueOf(letter14final);
     String finaldecrypt15 = String.valueOf(letter15final);     
     String finaldecrypt16 = String.valueOf(letter16final);
     String finaldecrypt17 = String.valueOf(letter17final);
     String finaldecrypt18 = String.valueOf(letter18final);
     String finaldecrypt19 = String.valueOf(letter19final);
     String finaldecrypt20 = String.valueOf(letter20final);
     String finaldecrypt21 = String.valueOf(letter21final);
     String finaldecrypt22 = String.valueOf(letter22final);
     String finaldecrypt23 = String.valueOf(letter23final);
     String finaldecrypt24 = String.valueOf(letter24final);
     String finaldecrypt25 = String.valueOf(letter25final);
     String finaldecrypt26 = String.valueOf(letter26final);
     String finaldecrypt27 = String.valueOf(letter27final);
     String finaldecrypt28 = String.valueOf(letter28final);
     String finaldecrypt29 = String.valueOf(letter29final);
     String finaldecrypt30 = String.valueOf(letter30final);
     String finaldecrypt31 = String.valueOf(letter31final);

    
    String finaldecrypt123 = finaldecrypt1 + finaldecrypt2 + finaldecrypt3 + finaldecrypt4 + finaldecrypt5 + finaldecrypt6 + finaldecrypt7+finaldecrypt8 + finaldecrypt9 + finaldecrypt10 + finaldecrypt11 + finaldecrypt12 + finaldecrypt13 + finaldecrypt14 + finaldecrypt15 + finaldecrypt16 + finaldecrypt17 + finaldecrypt18 + finaldecrypt19 + finaldecrypt20 + finaldecrypt21 + finaldecrypt22 + finaldecrypt23 + finaldecrypt24 + finaldecrypt25 + finaldecrypt26 + finaldecrypt27 + finaldecrypt28 + finaldecrypt29 + finaldecrypt30 + finaldecrypt31;   
    decryptetxt.setText(finaldecrypt123);

    
    
    
    
    
    
    
    
    
    
    
   
   
    
     
    }//GEN-LAST:event_decryptbtnActionPerformed

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
            java.util.logging.Logger.getLogger(encryptionfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encryptionfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encryptionfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encryptionfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encryptionfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptbtn;
    private javax.swing.JTextField decryptetxt;
    private javax.swing.JLabel decryptttl;
    private javax.swing.JTextField decrypttxt;
    private javax.swing.JButton encryptbtn;
    private javax.swing.JTextField encryptdtxt;
    private javax.swing.JLabel encryptttl;
    private javax.swing.JLabel encryptttl1;
    private javax.swing.JTextField encryptttxt;
    // End of variables declaration//GEN-END:variables
}
