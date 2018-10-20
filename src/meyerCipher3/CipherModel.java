package meyerCipher3;

public class CipherModel {
	private String output;
	private SubstitutionCipher su1;
	private ShiftCipher sh1;
	private int which;
	
	
	public CipherModel() {
		this.which = 1;
		this.output = "N.A.";
		
		try {
			this.su1 = new SubstitutionCipher("abcdefghijklmnopqrstuvwxyzäöüß");
			this.sh1 = new ShiftCipher(0);
		}catch(ExceptionsMeyer e) {
			
		}
	}
	public void setSubCipher(String alpha) throws ExceptionsMeyer {

			this.su1.setSecretAlphabet(alpha);
	}
	
	public void setShiftCipher(int value)  {
		try {
			this.sh1.setShiftValue(value);
		}catch(ExceptionsMeyer e) {
			
		}
			
	}
	
	public void setEncryptText(String t) {
		switch(this.which) {
			case 1: this.output = this.su1.encrypt(t);
				break;
			case 2: this.output = this.sh1.encrypt(t);
				break;
			default: 
				break;
		}
	}
	
	public void setDecryptText(String t) {
		switch(this.which) {
		case 1: this.output = this.su1.decrypt(t);
			break;
		case 2: this.output = this.sh1.decrypt(t);
			break;
		default: 
			break;
		}
	}
	
	public String getOutput() {
		return this.output;
	}
	
	
	public void setWhich(int i) {
		this.which = i;
	}
	
	public int getWhich() {
		return this.which;
	}
}
