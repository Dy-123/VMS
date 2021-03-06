
package visitor.management.system;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VisitorList extends javax.swing.JApplet {
    VisitorManagementSystem vos;
VisitorDetailsObjects model;
    public VisitorList(VisitorManagementSystem vos)  {
        this.vos = vos;
    }
    
    
    
    /**
     * Initializes the applet VisitorList
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(VisitorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    
                   
                    
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
         
                    
                   
                 
                    
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        addVisitor = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("VISITOR MANAGEMENT SYSTEM(IITA)");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("VISITOR LIST");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VISITOR ID", "NAME", "PHONE", "HOST NAME", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        addVisitor.setText("Add New Visitor");
        addVisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitorActionPerformed(evt);
            }
        });

        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addVisitor)
                        .addGap(81, 81, 81)
                        .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(addVisitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitorActionPerformed
        // TODO add your handling code here:
        
        vos.visitorDetailFrame = new JFrame("Visitor Details");
        vos.visitorDetailFrame.setContentPane(vos.v);
        vos.visitorDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vos.visitorDetailFrame.pack();              
      
        vos.visitorDetailFrame.setVisible(true);
       vos.visitorListFrame.setVisible(false); 
        
        
    }//GEN-LAST:event_addVisitorActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        // TODO add your handling code here:
        vos.visitorListFrame.setVisible(false);
    }//GEN-LAST:event_quitBtnActionPerformed

public void set(VisitorDetailsObjects vos)
    {
        this.model=vos;
       
       
         
          try
          {
               ArrayList list1= model.data;
               System.out.println("size"+list1.size());
                    ArrayList al=new ArrayList();
                    ArrayList al2;
                    
                   for(int i=0;i<list1.size();i++)
                   {
                       al2= new ArrayList();
                      
                       al2.add(((VisitorDetailModel)list1.get(i)).getVis_id_number());
                        al2.add(((VisitorDetailModel)list1.get(i)).getVis_name());
                        al2.add(((VisitorDetailModel)list1.get(i)).getVis_contact());
                         al2.add(((VisitorDetailModel)list1.get(i)).getHost_name());
                          al2.add(((VisitorDetailModel)list1.get(i)).getDate());
                           
                          al.add(al2);
                       
                   }   
                    DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
                    dtm.setRowCount(0);
                    for (Object al1 : al) {
                        dtm.addRow(((ArrayList) al1).toArray());
                        System.out.println("dat" + ((ArrayList) al1).toArray());
                    }
          }
          catch(Exception e)
          {
            DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
                String data[]={"","","No Data to Display!","",""};
                dtm.addRow(data);    
          }
          
                    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVisitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton quitBtn;
    // End of variables declaration//GEN-END:variables
}
