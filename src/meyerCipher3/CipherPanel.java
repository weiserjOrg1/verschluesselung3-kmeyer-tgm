package meyerCipher3;
import java.awt.*;
import javax.swing.*;

public class CipherPanel extends JPanel{
	private CipherModel m1;
	public CipherPanel(CipherModel m) {
		this.m1 = m;
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(this.m1.getOutput(),10, 10);
	}
}
