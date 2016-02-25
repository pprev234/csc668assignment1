/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jie
 * Description: this is a GUI for Post.
 * GUITransactionReader needs to register PostGUI, in order to get transaction information from user interface.
 */
public class PostGUI extends javax.swing.JFrame {
    
    private GUITransactionReader guiTransactionReader;
    /**
     * Creates new form PostGUI
     */
    public PostGUI(GUITransactionReader t) throws FileNotFoundException, IOException {
        initComponents();
        this.guiTransactionReader = t;
        //initialize the ProductCatalog once. This can be initialized in Store. 
        //ProductCatalog.getProductCatelog("products.txt").setProductCatelog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Product_Panel = new javax.swing.JPanel();
        upc_Label = new javax.swing.JLabel();
        upc_ComboBox = new javax.swing.JComboBox();
        enter_Button = new javax.swing.JButton();
        quantity_Label = new javax.swing.JLabel();
        quantity_ComboBox = new javax.swing.JComboBox();
        invoice_Panel = new javax.swing.JPanel();
        invoice_ScrollPanel = new javax.swing.JScrollPane();
        invoice_TextArea = new javax.swing.JTextArea();
        invoice_item_Label = new javax.swing.JLabel();
        invoice_qty_Label = new javax.swing.JLabel();
        invoice_unit_price_Label = new javax.swing.JLabel();
        extended_price_Label = new javax.swing.JLabel();
        invoice_total_Label = new javax.swing.JLabel();
        invoice_total_amount = new javax.swing.JLabel();
        dollar_Label = new javax.swing.JLabel();
        customerName_Label = new javax.swing.JLabel();
        customerName_TextField = new javax.swing.JTextField();
        payment_Panel = new javax.swing.JPanel();
        payemntType_Label = new javax.swing.JLabel();
        paymentType_ComboBox = new javax.swing.JComboBox();
        amount_Label = new javax.swing.JLabel();
        amount_TextField = new javax.swing.JTextField();
        pay_Button = new javax.swing.JButton();
        time_Label = new javax.swing.JLabel();
        start_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PostGUI");

        Product_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        upc_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        upc_Label.setText("UPC");

        upc_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        upc_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1001", "1002", "1003", "1004", "1005", "1006", "1007" }));

        enter_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        enter_Button.setText("ENTER");
        enter_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_ButtonActionPerformed(evt);
            }
        });

        quantity_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        quantity_Label.setText("Quantity");

        quantity_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        quantity_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        quantity_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Product_PanelLayout = new javax.swing.GroupLayout(Product_Panel);
        Product_Panel.setLayout(Product_PanelLayout);
        Product_PanelLayout.setHorizontalGroup(
            Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_PanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_PanelLayout.createSequentialGroup()
                        .addComponent(upc_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upc_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantity_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Product_PanelLayout.createSequentialGroup()
                        .addComponent(enter_Button)
                        .addGap(97, 97, 97))))
        );
        Product_PanelLayout.setVerticalGroup(
            Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Product_PanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Product_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upc_Label)
                    .addComponent(upc_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity_Label)
                    .addComponent(quantity_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enter_Button)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Product_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {quantity_Label, upc_Label});

        invoice_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        invoice_TextArea.setColumns(20);
        invoice_TextArea.setRows(5);
        invoice_ScrollPanel.setViewportView(invoice_TextArea);

        invoice_item_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        invoice_item_Label.setText("ITEM");

        invoice_qty_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        invoice_qty_Label.setText("QTY");

        invoice_unit_price_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        invoice_unit_price_Label.setText("UNIT_PRICE");

        extended_price_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        extended_price_Label.setText("EXTENDED_PRICE");

        invoice_total_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        invoice_total_Label.setText("TOTAL");

        invoice_total_amount.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        dollar_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dollar_Label.setText("$");

        javax.swing.GroupLayout invoice_PanelLayout = new javax.swing.GroupLayout(invoice_Panel);
        invoice_Panel.setLayout(invoice_PanelLayout);
        invoice_PanelLayout.setHorizontalGroup(
            invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoice_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoice_PanelLayout.createSequentialGroup()
                        .addComponent(invoice_ScrollPanel)
                        .addContainerGap())
                    .addGroup(invoice_PanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(invoice_item_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoice_qty_Label)
                        .addGap(50, 50, 50)
                        .addComponent(invoice_unit_price_Label)
                        .addGap(31, 31, 31)
                        .addComponent(extended_price_Label)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoice_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(invoice_total_Label)
                .addGap(18, 18, 18)
                .addComponent(dollar_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoice_total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        invoice_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {invoice_total_Label, invoice_unit_price_Label});

        invoice_PanelLayout.setVerticalGroup(
            invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoice_PanelLayout.createSequentialGroup()
                .addGroup(invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extended_price_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(invoice_item_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(invoice_qty_Label)
                        .addComponent(invoice_unit_price_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invoice_ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoice_total_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(invoice_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(invoice_total_Label)
                        .addComponent(dollar_Label)))
                .addContainerGap())
        );

        customerName_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        customerName_Label.setText("Customer Name");

        customerName_TextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        customerName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerName_TextFieldActionPerformed(evt);
            }
        });

        payment_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        payemntType_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        payemntType_Label.setText("Payment type");

        paymentType_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        paymentType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CASH", "CREDIT", "CHECK", " " }));
        paymentType_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentType_ComboBoxActionPerformed(evt);
            }
        });

        amount_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        amount_Label.setText("Amount");

        amount_TextField.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        amount_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_TextFieldActionPerformed(evt);
            }
        });

        pay_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pay_Button.setText("Pay");
        pay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payment_PanelLayout = new javax.swing.GroupLayout(payment_Panel);
        payment_Panel.setLayout(payment_PanelLayout);
        payment_PanelLayout.setHorizontalGroup(
            payment_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(payemntType_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(amount_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(amount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payment_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pay_Button)
                .addGap(127, 127, 127))
        );
        payment_PanelLayout.setVerticalGroup(
            payment_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payment_PanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(payment_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payemntType_Label)
                    .addComponent(paymentType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_Label)
                    .addComponent(amount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pay_Button)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        time_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        time_Label.setText("TIME");

        start_Button.setText("START");
        start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoice_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerName_Label)
                            .addComponent(customerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(Product_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(time_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {customerName_Label, customerName_TextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(customerName_Label)
                        .addGap(10, 10, 10)
                        .addComponent(customerName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Product_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoice_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payment_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(time_Label)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void quantity_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void enter_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        // Get the message from GUI -> "upc"+"quantity"
        String transactionItem = (String)this.upc_ComboBox.getSelectedItem() 
                + " "+ (String)this.quantity_ComboBox.getSelectedItem();
        // send the message to the controller/TransactionReader
        this.guiTransactionReader.setTransactionItem(transactionItem);
        // Get the description of currrentTransaction  -> "description" + "unit price" + "qty" + "extended_price"
        String currentTransactionItem = this.guiTransactionReader.getCurrentTransaction().getCurrentTransactionItem().toString();
        // display the currentTransaction to the invoice panel;
        this.invoice_TextArea.append(currentTransactionItem + "\n");
        // update the total value in the invoice_total_amount
        this.invoice_total_amount.setText(""+this.guiTransactionReader.getCurrentTransaction().getTotalPrice());
        
        
    }                                            

    private void customerName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                       


    }                                                      

    private void amount_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void pay_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Set the payment when the user hit the "Pay" button
        // payment format example: "CASH" + " "+ "amount"
        String payment = (String)this.paymentType_ComboBox.getSelectedItem()
                  + " " + this.amount_TextField.getText();
        this.guiTransactionReader.setPayment(payment);
        //clear GUI
        this.customerName_TextField.setText("");//clear customer name
        this.upc_ComboBox.setSelectedIndex(0);//clear upc box
        this.quantity_ComboBox.setSelectedIndex(0);//clear quantity box
        this.invoice_TextArea.setText("");//clear invoice panel
        this.invoice_total_amount.setText("");//clear total price in invoice
        this.paymentType_ComboBox.setSelectedIndex(0);//clear payment method
        this.amount_TextField.setText("");//clear payment amount
        this.amount_Label.setText("Amount");
        
    }                                          

    private void paymentType_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // When user hit the button, there's no more transactionItems to process
        // display the payment panel according to the payment type
        String paymentType = (String)this.paymentType_ComboBox.getSelectedItem();
        if(paymentType == "CREDIT"){
            this.amount_Label.setText("Card number");
            this.amount_TextField.setText("");
        }else if(paymentType == "CHECK"){
            this.amount_Label.setText("");
            this.amount_TextField.setText("");
        }else{
            this.amount_Label.setText("Amount");
            this.amount_TextField.setVisible(true);
            this.amount_TextField.setText("");
        }
        
    }                                                    

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //get name of customer
        String customerName = this.customerName_TextField.getText();
        //this.guiTransactionReader.setCustomerName(customerName);
        this.guiTransactionReader.setCurrentTransaction(customerName);
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        //Set the product catalog
        ProductCatalog.getProductCatelog("products.txt").setProductCatelog();
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
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        final GUITransactionReader t =  new GUITransactionReader();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PostGUI(t).setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(PostGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PostGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel Product_Panel;
    private javax.swing.JLabel amount_Label;
    private javax.swing.JTextField amount_TextField;
    private javax.swing.JLabel customerName_Label;
    private javax.swing.JTextField customerName_TextField;
    private javax.swing.JLabel dollar_Label;
    private javax.swing.JButton enter_Button;
    private javax.swing.JLabel extended_price_Label;
    private javax.swing.JPanel invoice_Panel;
    private javax.swing.JScrollPane invoice_ScrollPanel;
    private javax.swing.JTextArea invoice_TextArea;
    private javax.swing.JLabel invoice_item_Label;
    private javax.swing.JLabel invoice_qty_Label;
    private javax.swing.JLabel invoice_total_Label;
    private javax.swing.JLabel invoice_total_amount;
    private javax.swing.JLabel invoice_unit_price_Label;
    private javax.swing.JButton pay_Button;
    private javax.swing.JLabel payemntType_Label;
    private javax.swing.JComboBox paymentType_ComboBox;
    private javax.swing.JPanel payment_Panel;
    private javax.swing.JComboBox quantity_ComboBox;
    private javax.swing.JLabel quantity_Label;
    private javax.swing.JButton start_Button;
    private javax.swing.JLabel time_Label;
    private javax.swing.JComboBox upc_ComboBox;
    private javax.swing.JLabel upc_Label;
    // End of variables declaration                   
}