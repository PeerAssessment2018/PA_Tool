
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khushboo
 */
public class lms3 extends javax.swing.JFrame {

    /**
     * Creates new form lms3
     */
    public lms3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        n34 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Peer Assessment");

        jLabel2.setText("Assessing for:");

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jLabel3.setText("User's Response:");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel4.setText("Evaluate for Criterion:");

        cb3.setToolTipText("jkfhsdkjfh");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rd1);
        rd1.setText("Option 1");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        jPanel1.add(rd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buttonGroup1.add(rd2);
        rd2.setText("Option 2");
        jPanel1.add(rd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        buttonGroup1.add(rd3);
        rd3.setText("Option 3");
        jPanel1.add(rd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        buttonGroup1.add(rd4);
        rd4.setText("Option 4");
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });
        jPanel1.add(rd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 23, -1, -1));

        buttonGroup1.add(rd5);
        rd5.setText("Option 5");
        rd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd5ActionPerformed(evt);
            }
        });
        jPanel1.add(rd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 49, -1, -1));

        n34.setText("Next");
        n34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n34ActionPerformed(evt);
            }
        });

        jButton2.setText("Prev");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Next will only be activated when you assess the min no. of responses.");

        jLabel6.setText("Assessor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n34))
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb2, 0, 113, Short.MAX_VALUE)
                                .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n34)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        lms2 frame=new lms2();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void n34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n34ActionPerformed
        // TODO add your handling code here:
        lms4 frame=new lms4();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_n34ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
        DataBase_Handler db=new DataBase_Handler();
        db.lms3_f2(1,"course 1","sample prompt");
    }//GEN-LAST:event_cb2ActionPerformed

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        n34.setEnabled(false);
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        DataBase_Handler db=new DataBase_Handler();
        int r=db.count_no_of_students();
        for(int i=1;i<=r;i++)
            cb1.addItem(""+i);
        db.lms3_f(1,"course 1","sample prompt");
    }//GEN-LAST:event_formWindowOpened

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        rd1.setVisible(false);
        rd2.setVisible(false);
        rd3.setVisible(false);
        rd4.setVisible(false);
        rd5.setVisible(false);
        DataBase_Handler db=new DataBase_Handler();
        db.lms3_f1(1,"course 1","sample prompt");
    }//GEN-LAST:event_cb3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int assessor_id=Integer.parseInt((String)cb1.getSelectedItem());
        int user_id=Integer.parseInt((String)cb2.getSelectedItem());
        String q_id="sample prompt";
        String cri=(String)cb3.getSelectedItem();
        StringTokenizer option=new StringTokenizer("");
        if(rd1.isSelected()==true)
            option=new StringTokenizer(rd1.getText());
        else if(rd2.isSelected()==true)
            option=new StringTokenizer(rd2.getText());
        else if(rd3.isSelected()==true)
            option=new StringTokenizer(rd3.getText());
        else if(rd4.isSelected()==true)
            option=new StringTokenizer(rd4.getText());
        else if(rd5.isSelected()==true)
            option=new StringTokenizer(rd5.getText());
        String s1=option.nextToken();
        int points=Integer.parseInt(option.nextToken());
        DataBase_Handler db=new DataBase_Handler();
        db.insert_pa_grade(user_id,assessor_id,q_id,"course1",cri,points);
        cb3.removeItem(cri);
        if(cb3.getItemCount()==0)
            cb2.removeItem(user_id);
        if(cb2.getItemCount()==0)
        {
            cb1.removeItem(assessor_id);
            n34.setEnabled(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lms3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lms3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cb1;
    public static javax.swing.JComboBox<String> cb2;
    public static javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton n34;
    public static javax.swing.JRadioButton rd1;
    public static javax.swing.JRadioButton rd2;
    public static javax.swing.JRadioButton rd3;
    public static javax.swing.JRadioButton rd4;
    public static javax.swing.JRadioButton rd5;
    public static javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}