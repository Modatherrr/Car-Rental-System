
package carrentalsystem;


import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Modather
 */
public class TheSystem extends javax.swing.JFrame {
    InformationSave save = new InformationSave(); // Call Class
    Garage g = new Garage(5); // Creates 5 Cars (Call Class)
    DayHandler DHandler = new DayHandler(); // Call Day Handler
    int Count = 5; // Useless
    int SelectedRow; // Selected Row when click on table
    
    
    public TheSystem(){
    initComponents();
    }
    public TheSystem(String StrName) {
        initComponents(); 
        this.Count = 2;
        save.SetCarCount(2);
        save.SetStoreName(StrName);
        DayLabel.setText(Integer.toString(DHandler.CurrentDay));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ModelLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RentPriceLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RentStatusCheckbox = new javax.swing.JCheckBox();
        StartRent = new javax.swing.JButton();
        EndRent = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DayLabel = new javax.swing.JLabel();
        StartDays = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DuePriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Rental System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car ID", "Car Name", "Rent Price", "Currently Rented", "Day Started", "Day Ended", "Price Due"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Car Information");

        jLabel3.setText("Car Model");

        ModelLabel.setText("Car Model");

        jLabel4.setText("Rent Price");

        RentPriceLabel.setText("Rent");

        jLabel5.setText("Rent Status");

        RentStatusCheckbox.setText("Rented");
        RentStatusCheckbox.setEnabled(false);

        StartRent.setText("Start Rent");
        StartRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartRentMouseClicked(evt);
            }
        });

        EndRent.setText("End Rent");
        EndRent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndRentMouseClicked(evt);
            }
        });

        jLabel6.setText("Day :");

        DayLabel.setText("1");

        StartDays.setText("Start Days");
        StartDays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartDaysMouseClicked(evt);
            }
        });

        jLabel7.setText("Rent Price Due");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RentPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ModelLabel)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RentStatusCheckbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(DuePriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StartRent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EndRent))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartDays)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DayLabel)
                    .addComponent(StartDays))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ModelLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(RentPriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RentStatusCheckbox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(DuePriceLabel))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StartRent)
                            .addComponent(EndRent))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*----------------------------------------------------------------------------*/
    public void InsertCreatedCars(){
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        for(int i = 0; i < 5; i++){
            table.addRow(new Object[]{(i+1), g.Vehicle[i].CarName,g.Vehicle[i].RentalPrice,g.Vehicle[i].IsCurrentlyRented});
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel1.setText(save.GetStoreName());
        g.CreateVehicles();
        
        InsertCreatedCars();
    }//GEN-LAST:event_formWindowOpened
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        SelectedRow = jTable1.getSelectedRow();
        TableModel table = jTable1.getModel();
        
        ModelLabel.setText(table.getValueAt(SelectedRow,1).toString());
        RentPriceLabel.setText(table.getValueAt(SelectedRow,2).toString());
        RentStatusCheckbox.setSelected(Boolean.valueOf(table.getValueAt(SelectedRow,3).toString()));
        if (table.getValueAt(SelectedRow,6) == null){
            DuePriceLabel.setText("0");
        }else{
            DuePriceLabel.setText(table.getValueAt(SelectedRow,6).toString());
        }        
        //SelectedRow = -1; //Useless for now.
    }//GEN-LAST:event_jTable1MouseClicked

    private void StartRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartRentMouseClicked
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        if (DHandler.isDayRunning){
            if(RentStatusCheckbox.isSelected() == false){
                table.setValueAt(ModelLabel.getText(), SelectedRow, 1);
                table.setValueAt(RentPriceLabel.getText(), SelectedRow, 2);
                table.setValueAt("true", SelectedRow, 3);
                RentStatusCheckbox.setSelected(true);
                table.setValueAt(DHandler.CurrentDay, SelectedRow, 4);
            }else{
                JOptionPane.showMessageDialog(null, "This car is already rented" , "Error", JOptionPane.ERROR_MESSAGE);
            }
             //table.setValueAt(DHandler.CurrentDay, SelectedRow, 5); //Useless Right now
        }else{
            JOptionPane.showMessageDialog(null, "You need to start the day counter first." , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_StartRentMouseClicked

    private void StartDaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartDaysMouseClicked
        Timer timer = new Timer();
        if(DHandler.isDayRunning == false){
            StartDays.setText("Puase Days");
            DHandler.ToggleStart();
            
            timer.schedule( new TimerTask() {
                @Override
                public void run() {
                    if (DHandler.isDayRunning){
                        DHandler.CurrentDay = DHandler.CurrentDay + 1;
                         //System.out.println(DHandler.CurrentDay); // Debugging
                         DayLabel.setText(Integer.toString(DHandler.CurrentDay));
                    }else{
                        timer.cancel();
                        timer.purge();
                    }
                }
             }, 0, 60*1000);
        } else {
            StartDays.setText("Start Days");
            DHandler.ToggleStart();
            
        }
    }//GEN-LAST:event_StartDaysMouseClicked

    private void EndRentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndRentMouseClicked
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int RentPriceDue;
        if (DHandler.isDayRunning){
            if(RentStatusCheckbox.isSelected()){
                table.setValueAt(DHandler.CurrentDay, SelectedRow, 5);
                RentPriceDue = (int)(Double.parseDouble(table.getValueAt(SelectedRow,5).toString()) - Double.parseDouble(table.getValueAt(SelectedRow,4).toString())) * (int)Double.parseDouble(table.getValueAt(SelectedRow,2).toString());
                //RentPriceDue = (int)(Double.parseDouble(table.getValueAt(SelectedRow, 5).toString()));
                table.setValueAt(RentPriceDue, SelectedRow, 6);
                DuePriceLabel.setText(String.valueOf(RentPriceDue));
                table.setValueAt("false", SelectedRow, 3);
                RentStatusCheckbox.setSelected(false);
            }else{
                JOptionPane.showMessageDialog(null, "This car is already un-rented" , "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "You need to start the day counter first." , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EndRentMouseClicked

    

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
            java.util.logging.Logger.getLogger(TheSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DayLabel;
    private javax.swing.JLabel DuePriceLabel;
    private javax.swing.JButton EndRent;
    private javax.swing.JLabel ModelLabel;
    private javax.swing.JLabel RentPriceLabel;
    private javax.swing.JCheckBox RentStatusCheckbox;
    private javax.swing.JButton StartDays;
    private javax.swing.JButton StartRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
