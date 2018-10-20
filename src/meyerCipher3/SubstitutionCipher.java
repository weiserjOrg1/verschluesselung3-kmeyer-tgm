package meyerCipher3;

public class SubstitutionCipher extends MonoAlphabeticCipher{
	public SubstitutionCipher(String secretAlphabet) throws ExceptionsMeyer {
		super.setSecretAlphabet(secretAlphabet);
	}
	
	public void setSecretAlphabet(String secretAlphabet) throws ExceptionsMeyer {
		super.setSecretAlphabet(secretAlphabet);
	}
}
