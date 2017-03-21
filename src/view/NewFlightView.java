/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Formation
 */
public class NewFlightView extends javax.swing.JPanel {

    /**
     * Creates new form NewFlightView
     */
    public NewFlightView() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        departureCity = new javax.swing.JComboBox<>();
        arrivalCity = new javax.swing.JComboBox<>();
        departureDate = new javax.swing.JTextField();
        departureTime = new javax.swing.JTextField();
        flightDuration = new javax.swing.JTextField();
        flightPrice = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Nouveau vol");
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        add(jLabel2, gridBagConstraints);

        jLabel3.setText("Ville de départ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(jLabel3, gridBagConstraints);

        jLabel8.setText("Ville d'arrivée");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(jLabel8, gridBagConstraints);

        jLabel4.setText("Date de départ (jj/mm/aaaa)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(jLabel4, gridBagConstraints);

        jLabel5.setText("Heure de départ (hh:mm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(jLabel5, gridBagConstraints);

        jLabel6.setText("Durée du vol (> 9 min)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(jLabel6, gridBagConstraints);

        jLabel7.setText("Tarif  en euros au format _,xx");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(jLabel7, gridBagConstraints);

        departureCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departureCity.setPreferredSize(new java.awt.Dimension(150, 25));
        departureCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureCityActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.7;
        add(departureCity, gridBagConstraints);

        arrivalCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        arrivalCity.setPreferredSize(new java.awt.Dimension(150, 25));
        arrivalCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalCityActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(arrivalCity, gridBagConstraints);

        departureDate.setText("jTextField2");
        departureDate.setPreferredSize(new java.awt.Dimension(150, 25));
        departureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureDateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        add(departureDate, gridBagConstraints);

        departureTime.setText("jTextField3");
        departureTime.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        add(departureTime, gridBagConstraints);

        flightDuration.setText("jTextField4");
        flightDuration.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        add(flightDuration, gridBagConstraints);

        flightPrice.setText("jTextField5");
        flightPrice.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(flightPrice, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void departureCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureCityActionPerformed

    private void arrivalCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalCityActionPerformed

    private void departureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arrivalCity;
    private javax.swing.JComboBox<String> departureCity;
    private javax.swing.JTextField departureDate;
    private javax.swing.JTextField departureTime;
    private javax.swing.JTextField flightDuration;
    private javax.swing.JTextField flightPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
