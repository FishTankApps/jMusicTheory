package com.fishtankapps.musictheory.pitch;

public enum Accidental {

	DOUBLE_FLAT("bb", -2), FLAT("b", -1), NATURAL("", 0), SHARP("#", 1), DOUBLE_SHARP("x", 2);
	
	public final String textSymbol;
	public final int halfSteps;
	
	Accidental(String textSymbol, int halfSteps) {
		this.textSymbol = textSymbol;
		this.halfSteps = halfSteps;
	}
	
	public String toString() {
		return textSymbol;
	}

	public static Accidental getAccidental(int halfSteps) {
		halfSteps = (12 + halfSteps % 12) % 12;

		for(Accidental a : Accidental.values())
			if(halfSteps == a.halfSteps || halfSteps == 12 + a.halfSteps)
				return a;

		throw new RuntimeException("Unreactable Code: Accidental.getAccidental: halfSteps=" + halfSteps);
	}
}
