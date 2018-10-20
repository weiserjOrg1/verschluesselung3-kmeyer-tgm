package meyerCipher3;

import javax.swing.JOptionPane;

public class KeywordCipher extends MonoAlphabeticCipher{
	
	
	public KeywordCipher(String keyword) throws ExceptionsMeyer{
		this.setKeyword(keyword);
	}
	public void setKeyword(String keyword) throws ExceptionsMeyer{
		String sAlpha = "";
		String alpha ="abcdefghijklmnopqrstuvwxyz����";
		keyword = keyword.toLowerCase();
		
        for(int i=0; i<keyword.length(); i++) {
                char a = keyword.charAt(i);
                if(a > 'a'-1 && a < 'z'+1 || a == '�' || a == '�' || a == '�' || a == '�') {
                            
                }else {
                	throw new ExceptionsMeyer("it contains wrong symbols"); 
                }
        }
        boolean[] ga = new boolean[30];
        for(int i = 0; i< ga.length; i++) {
        	ga[i] = false;
        }
        for(int i=0; i<keyword.length(); i++) {
        	for(int j=0; j<alpha.length(); j++) {
        		if(keyword.charAt(i) == alpha.charAt(j) && ga[j]==false) {
        			ga[j] = true;
        			sAlpha = sAlpha + keyword.charAt(i);
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
