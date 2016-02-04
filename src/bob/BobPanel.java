package bob;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MUSTA
 */
public class BobPanel extends javax.swing.JFrame {

    /**
     * Creates new form bob
     */
    public BobPanel() {
        initComponents();
    }
    private class TheHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			Object action = event.getSource();
			if (action == decryptMessage) {
				messageShowing.setText("Decrypting is gonna be worked soon");
			} else if(action == showMessage){
				messageShowing.setText("ShowMessage is gonna be worked soon");
			} else if(action == exit){
				System.exit(1);
			}
		}
    	
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

    	TheHandler handler = new TheHandler();
        decryptedMessage = new javax.swing.JLabel();
        decryptMessage = new javax.swing.JButton();
        showMessage = new javax.swing.JButton();
        messageShowing = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        decryptedMessage.setText("Encrypted Message");

        decryptMessage.setText("Decrypt Message");
        decryptMessage.addActionListener(handler);
        
        showMessage.setText("Show Message");
        showMessage.addActionListener(handler);
        
        messageShowing.setText("             Show");
        
        exit.setText("Exit");
        exit.addActionListener(handler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decryptMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(messageShowing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decryptedMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(decryptedMessage)
                .addGap(18, 18, 18)
                .addComponent(decryptMessage)
                .addGap(18, 18, 18)
                .addComponent(showMessage)
                .addGap(18, 18, 18)
                .addComponent(messageShowing)
                .addGap(30, 30, 30)
                .addComponent(exit)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton decryptMessage;
    private javax.swing.JLabel decryptedMessage;
    private javax.swing.JButton exit;
    private javax.swing.JLabel messageShowing;
    private javax.swing.JButton showMessage;
    // End of variables declaration                   
}
