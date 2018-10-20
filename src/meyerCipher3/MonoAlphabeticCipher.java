package meyerCipher3;

public class MonoAlphabeticCipher implements Cipher{
	
	private String secretAlphabet;
	
	public MonoAlphabeticCipher() {
			this.secretAlphabet = "abcdefghijklmnopqrstuvwxyz����";
		
	}
	public String getSecretAlphabet() {
		return this.secretAlphabet;
	}
	
	protected void setSecretAlphabet(String sAlphabet) throws ExceptionsMeyer {
			this.secretAlphabet = testSecret(sAlphabet); 
		
	}
	@Override
	public String encrypt(String text) {
		String encryptText ="";
		text = text.toLowerCase();
		
		String normalA ="abcdefghijklmnopqrstuvwxyz����";
		
		for(int i=0; i<text.length(); i++) {
            int in = normalA.indexOf(text.charAt(i));
            
            if(in != -1) {
                char c = this.secretAlphabet.charAt(in); 
                encryptText = encryptText + c;
                
            }else {
                encryptText = encryptText + text.charAt(i);
            }
        }
		return encryptText;
		
		
	}
	@Override
	public String decrypt(String text) {
		String decryptText ="";
		text = text.toLowerCase();
		
		String normalA ="abcdefghijklmnopqrstuvwxyz����";
		
		for(int i=0; i<text.length(); i++) {
			int in = this.secretAlphabet.indexOf(text.charAt(i));
			
			if(in != -1) {
				char c = normalA.charAt(in);
				decryptText = decryptText + c;
				
			}else {
				decryptText = decryptText + text.charAt(i);
			}
		}
		
		return decryptText;
	}
	
	public String testSecret(String sAlphabet) throws ExceptionsMeyer{
		sAlphabet = sAlphabet.toLowerCase();
		//30
		if(sAlphabet.length() > 30) {
			throw new ExceptionsMeyer("its too long");
		}else {
			
		}
		
		if(sAlphabet.length() < 30) {
			throw new ExceptionsMeyer("its too short");
		}else {
			
		}
		//just 1 time
		for(int i=0; i<sAlphabet.length(); i++) {
			int help = 0;
			for(int j=0; j<sAlphabet.length(); j++) {
				if(sAlphabet.charAt(i) == sAlphabet.charAt(j)) {
					help++;
					if(help > 1) {
						throw new ExceptionsMeyer("there are two same Letters");
					}
				}
			}
		}
		
		//correct Symbols
		String correct="abcdefghijklmnopqrstuvwxyz����";
        int help2 = 0;
        for(int i=0; i<sAlphabet.length(); i++) {
            for(int j=0; j<sAlphabet.length(); j++) {
                char a = correct.charAt(i);
                char b = sAlphabet.charAt(j);
                if(a == b) {
                    help2++;
                }
            }
        }
        if(help2 == 30) {

        }else {
            throw new ExceptionsMeyer("it contains wrong symbols"); 
        }
		
		
		return sAlphabet;
	}
}
