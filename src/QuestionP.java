
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author InfoEnum-1010
 */
public class QuestionP extends javax.swing.JFrame {

    /**
     * Creates new form QuestionP
     */
    public QuestionP() {
        initComponents();
        
        
        table2.setAutoResizeMode(table2.AUTO_RESIZE_OFF);
        table2.getColumnModel().getColumn(0).setPreferredWidth(25);
        table2.getColumnModel().getColumn(1).setPreferredWidth(1000);
        table2.getColumnModel().getColumn(2).setPreferredWidth(200);
            table2.getColumnModel().getColumn(3).setPreferredWidth(200);
            table2.getColumnModel().getColumn(4).setPreferredWidth(200);
            table2.getColumnModel().getColumn(5).setPreferredWidth(200);
            table2.getColumnModel().getColumn(6).setPreferredWidth(200);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ques = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        option2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_update = new javax.swing.JButton();
        txt_update15 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        option1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        option3 = new javax.swing.JTextField();
        option4 = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("VIT ENTRANCE EXAM AAPLICATION ");

        jLabel5.setText("PERFORM OPERATION ON QUESTION  TABLE");

        jLabel2.setText("QUESTION");

        ques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesActionPerformed(evt);
            }
        });

        jLabel1.setText("OPTION C");

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_update.setText("UPDATE");
        txt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateActionPerformed(evt);
            }
        });

        txt_update15.setText("DELETE");
        txt_update15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_update15MouseClicked(evt);
            }
        });
        txt_update15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_update15ActionPerformed(evt);
            }
        });

        jLabel3.setText("ENTER SNO FOR DELETION AND UPDATION");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "sno", "ques", "a", "b", "c", "d", "ans"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table2);

        jButton3.setText("SHOW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("OPTION A");

        jLabel7.setText("OPTION B");

        jLabel8.setText("OPTION D");

        jLabel9.setText("ANSWER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_update15)
                                            .addGap(163, 163, 163)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(155, 155, 155)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(option3)
                                                    .addGap(151, 151, 151)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(148, 148, 148)
                                .addComponent(txt_update)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(38, 38, 38)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ques, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(txt_update)
                        .addComponent(txt_update15)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(552, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Connection conn;
		Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionP.class.getName()).log(Level.SEVERE, null, ex);
        }
		try
		{
		 
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
			//STEP 3: Execute a query
			
                        
        String a = ques.getText();
        
        String b = option1.getText();
        String c = option2.getText();
        String d = option3.getText();
        String e = option4.getText();
        String f= ans.getText();
        
                        
                          
                        
                        
                        st = conn.createStatement();
                        String stmt="INSERT INTO question(ques,a,b,c,d,ans)"+ "VALUES ("+"\'"+a+"\',"+"\'"+b+"\',"+"\'"+c+"\',"+"\'"+d+"\',"+"\'"+e+"\',"+"\'"+f+"\')";
                        
                         
                        st.executeUpdate(stmt);
                     
                        System.out.println("saved!");
                          
                        
                        
                        
                 
                        
                        ques.setText("");
                        option1.setText("");
                        option2.setText("");
                        option3.setText("");
                        option4.setText("");
                        ans.setText("");
                                

                            
                        }
                        
                        
			
		
		catch(SQLException se)
		{
                    //Handle errors for JDBC

		}
		catch(Exception e)
		{
                    //Handle errors for Class.forName

		}       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateActionPerformed
             Connection conn;
		Statement st;
 
               System.out.println("working1");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionP.class.getName()).log(Level.SEVERE, null, ex);
        }
                    try{
                         
                         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
                        
                       
                        
                        String a=sno.getText();
                        String b=ques.getText();
                        String c=option1.getText();
                        String d=option2.getText();
                        String e=option3.getText();
                        String f=option4.getText();
                        
                       
                        System.out.println("working2");
                         st = conn.createStatement();
                        String sql="UPDATE question SET  sno='"+a+"',ques='"+b+"',a='"+c+"',b='"+d+"',c='"+e+"',d='"+f+"'where sno='"+a+"'";
                        System.out.println("working3");
                          
                       
                         st.executeUpdate(sql);
                         
                        
                         
                         
                           ques.setText("");
                        option1.setText("");
                        option2.setText("");
                        option3.setText("");
                        option4.setText("");
                        ans.setText("");
                           sno.setText("");
                         
                         
                         
                             
                     
                         
                         
               }catch(SQLException se)
		{
                    //Handle errors for JDBC

		}

         

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_updateActionPerformed

    private void txt_update15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_update15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_update15MouseClicked

    private void txt_update15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_update15ActionPerformed
        
          Connection conn;
		
                  
              
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionP.class.getName()).log(Level.SEVERE, null, ex);
        }

                    try{
                         
                        
                       
                          String sql = "DELETE FROM question WHERE sno =?";
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
              PreparedStatement   pst = conn.prepareStatement(sql);
            pst.setString(1,sno.getText());
            pst.executeUpdate();
                         
                         
                        
                        
                        
                     
                       
                       
                        
                        
                         
                          ques.setText("");
                        option1.setText("");
                        option2.setText("");
                        option3.setText("");
                        option4.setText("");
                        ans.setText("");
                           sno.setText("");
                          
                         
                         
                         
                             
                             
                     
                         
                         
               }catch(SQLException se)
		{
                    //Handle errors for JDBC

		}
        
        
        
        
               // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  Connection conn;
		Statement st;
               
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionP.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
              PreparedStatement ps= conn.prepareStatement("select * from examiner");
              ResultSet rs=ps.executeQuery();
              DefaultTableModel tm= (DefaultTableModel)table2.getModel();
              tm.setRowCount(0);
              while(rs.next()){
                  Object Obj[]={rs.getInt("sno"),rs.getString("username"),rs.getString("password")};
                  tm.addRow(Obj);
                  
              }
            
            
        }
         catch(SQLException se)
		{
                    //Handle errors for JDBC

		}
		catch(Exception e)
		{
                    //Handle errors for Class.forName

		}
        

    }//GEN-LAST:event_txt_update15ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked

    }//GEN-LAST:event_table2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  Connection conn;
		Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuestionP.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
        try{
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
              PreparedStatement ps= conn.prepareStatement("select * from question");
               
              ResultSet rs=ps.executeQuery();
              DefaultTableModel tm= (DefaultTableModel)table2.getModel();
              tm.setRowCount(0);
              
              while(rs.next()){
                  Object Obj[]={rs.getInt("sno"),rs.getString("ques"),rs.getString("a"),rs.getString("b"),rs.getString("c"),rs.getString("d"),rs.getString("ans")};
                  tm.addRow(Obj);
                 
              }
             ques.setText("");
                        option1.setText("");
                        option2.setText("");
                        option3.setText("");
                        option4.setText("");
                        ans.setText("");
                           sno.setText("");
                           
              
            
        }
         catch(SQLException se)
		{
                    //Handle errors for JDBC

		}
		catch(Exception e)
		{
                    //Handle errors for Class.forName
                    
		}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void quesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quesActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField option1;
    private javax.swing.JTextField option2;
    private javax.swing.JTextField option3;
    private javax.swing.JTextField option4;
    private javax.swing.JTextField ques;
    private javax.swing.JTextField sno;
    private javax.swing.JTable table2;
    private javax.swing.JButton txt_update;
    private javax.swing.JButton txt_update15;
    // End of variables declaration//GEN-END:variables
}
