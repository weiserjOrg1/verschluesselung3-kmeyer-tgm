package meyerCipher3;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class CipherController implements ActionListener {
	private CipherModel m1;
	private CipherView v1;
	
	public CipherController() {
		this.m1 = new CipherModel();
		this.v1 = new CipherView(this, this.m1);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(this.v1.isDePressed(e)) {
			if(this.v1.isSuChecked()) {
				this.m1.setWhich(1);
				try {
					this.m1.setSubCipher(this.v1.getSAlpha());
				}catch(ExceptionsMeyer e1) {
					JOptionPane.showMessageDialog(null, e1.toString(), "Secret-Alphabet-Exception", JOptionPane.ERROR_MESSAGE);
				}
				this.m1.setDecryptText(this.v1.getText());
			}
			
			if(this.v1.isShChecked()) {
				this.m1.setWhich(2);
				try {
					int value = Integer.parseInt(this.v1.getValue());
					this.m1.setShiftCipher(value);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "The Value has to be a numeric number", "Number-Exception", JOptionPane.ERROR_MESSAGE);
				}
				this.m1.setDecryptText(this.v1.getText());
			}
		}
		if(this.v1.isEnPressed(e)) {
			if(this.v1.isSuChecked()) {
				this.m1.setWhich(1);
				try {
					this.m1.setSubCipher(this.v1.getSAlpha());
				}catch(ExceptionsMeyer e1) {
					JOptionPane.showMessageDialog(null, e1.toString(), "Secret-Alphabet-Exception", JOptionPane.ERROR_MESSAGE);
				}
				this.m1.setEncryptText(this.v1.getText());
			}
			if(this.v1.isShChecked()) {
				this.m1.setWhich(2);
				try {
					int value = Integer.parseInt(this.v1.getValue());
					this.m1.setShiftCipher(value);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "The Value has to be a numeric number", "Number-Exception", JOptionPane.ERROR_MESSAGE);
				}
				this.m1.setEncryptText(this.v1.getText());
			}
		}
		this.v1.refresh();
	}
}
