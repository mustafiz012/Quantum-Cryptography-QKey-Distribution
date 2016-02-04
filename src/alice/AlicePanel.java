package alice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AlicePanel extends JFrame {
	
	private JTextArea Qkey = new JTextArea();
	private JButton encryptMessage = new JButton();
	private JButton exit = new JButton();
	private JScrollPane jScrollPane1 = new JScrollPane();
	private JScrollPane jScrollPane2 = new JScrollPane();
	private JTextArea message = new JTextArea();
	private JButton sendToPublic = new JButton();
	private JButton sendToQuantum = new JButton();
	private JButton showEncryptedMessage = new JButton();
	private JLabel showMessage = new JLabel();
	
	public AlicePanel() {
		initComponents();
	}
	private class TheHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			Object action = event.getSource();
			if (action == encryptMessage) {
				showMessage.setText(message.getText().toString()+ "is gonna be encrypted soon");
			} else if(action == exit){
				System.exit(0);
			} else if(action == sendToPublic){
				showMessage.setText(message.getText().toString());
			} else if(action == sendToQuantum){
				showMessage.setText(Qkey.getText().toString());
			} else if(action == showEncryptedMessage){
				showMessage.setText(message.getText().toString()+ "is gonna be encrypted and shown");
			} else{
				
			}
		}
		
	}
	
	private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TheHandler handler = new TheHandler();
        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        sendToPublic.setText("Send to Public");
        sendToPublic.addActionListener(handler);

        Qkey.setColumns(20);
        Qkey.setRows(5);
        jScrollPane2.setViewportView(Qkey);

        sendToQuantum.setText("Send to Quantum");
        sendToQuantum.addActionListener(handler);
        
        encryptMessage.setText("Encrypt");
        encryptMessage.addActionListener(handler);

        showEncryptedMessage.setText("Show");
        showEncryptedMessage.addActionListener(handler);

        showMessage.setText("ShowMessage");

        exit.setText("Exit");
        exit.addActionListener(handler);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendToPublic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendToQuantum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(encryptMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showMessage)
                            .addComponent(showEncryptedMessage))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(sendToPublic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendToQuantum)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18)
                .addComponent(encryptMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showEncryptedMessage)
                .addGap(18, 18, 18)
                .addComponent(showMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(exit))
        );

        pack();
	}

}

