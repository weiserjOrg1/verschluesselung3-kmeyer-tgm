package meyerCipher3;

import javax.swing.JOptionPane;

public class KeywordCipher extends MonoAlphabeticCipher{
	
	
	public KeywordCipher(String keyword) throws ExceptionsMeyer{
		this.setKeyword(keyword);
	}
	public void setKeyword(String keyword) throws ExceptionsMeyer{
		String sAlpha = "";
		String alpha ="abcdefghijklmnopqrstuvwxyzäöüß";
		keyword = keyword.toLowerCase();
		
        for(int i=0; i<keyword.length(); i++) {
                char a = keyword.charAt(i);
                if(a > 'a'-1 && a < 'z'+1 || a == 'ä' || a == 'ö' || a == 'ü' || a == 'ß') {
                            
                }else {
                	throw new ExceptionsMeyer("it contains wrong symbols"); 
                }
	
        }
        for(int i=0; i<alpha.length(); i++) {
        	for(int j=0; j<keyword.length(); j++) {
        		if(keyword.charAt(j) == alpha.charAt(i)) {
        			sAlpha = sAlpha + keyword.charAt(j);
        			break;
        		}
        	}
        }
	    
        for(int i=0; i<alpha.length(); i++) {
        	boolean exist = false;
        	for(int j=0; j<sAlpha.length(); j++) {
        		if(alpha.charAt(i) == sAlpha.charAt(j)){
        			exist = true;
        			break;
        		}
        	}
        	if(exist == true) {
    			
    		}else {
    			sAlpha = sAlpha + alpha.charAt(i);
    		}
        	
        }
        super.setSecretAlphabet(sAlpha);
	}
}
