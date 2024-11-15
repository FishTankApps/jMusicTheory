package com.fishtankapps.musictheory.pitch;

public enum PitchClass {

	A_DOUBLE_FLAT(NoteName.A, Accidental.DOUBLE_FLAT, 7),  A_FLAT(NoteName.A, Accidental.FLAT, 8),  A_NATURAL(NoteName.A, Accidental.NATURAL, 9),  A_SHARP(NoteName.A, Accidental.SHARP, 10), A_DOUBLE_SHARP(NoteName.A, Accidental.DOUBLE_SHARP, 11),
	B_DOUBLE_FLAT(NoteName.B, Accidental.DOUBLE_FLAT, 9),  B_FLAT(NoteName.B, Accidental.FLAT, 10), B_NATURAL(NoteName.B, Accidental.NATURAL, 11), B_SHARP(NoteName.B, Accidental.SHARP, 12),  B_DOUBLE_SHARP(NoteName.B, Accidental.DOUBLE_SHARP, 13),
	C_DOUBLE_FLAT(NoteName.C, Accidental.DOUBLE_FLAT, -2), C_FLAT(NoteName.C, Accidental.FLAT, -1), C_NATURAL(NoteName.C, Accidental.NATURAL, 0),  C_SHARP(NoteName.C, Accidental.SHARP, 1),  C_DOUBLE_SHARP(NoteName.C, Accidental.DOUBLE_SHARP, 2),
	D_DOUBLE_FLAT(NoteName.D, Accidental.DOUBLE_FLAT, 0),  D_FLAT(NoteName.D, Accidental.FLAT, 1),  D_NATURAL(NoteName.D, Accidental.NATURAL, 2),  D_SHARP(NoteName.D, Accidental.SHARP, 3),  D_DOUBLE_SHARP(NoteName.D, Accidental.DOUBLE_SHARP, 4),
	E_DOUBLE_FLAT(NoteName.E, Accidental.DOUBLE_FLAT, 2),  E_FLAT(NoteName.E, Accidental.FLAT, 3),  E_NATURAL(NoteName.E, Accidental.NATURAL, 4),  E_SHARP(NoteName.E, Accidental.SHARP, 5),  E_DOUBLE_SHARP(NoteName.E, Accidental.DOUBLE_SHARP, 6),
	F_DOUBLE_FLAT(NoteName.F, Accidental.DOUBLE_FLAT, 3),  F_FLAT(NoteName.F, Accidental.FLAT, 4),  F_NATURAL(NoteName.F, Accidental.NATURAL, 5),  F_SHARP(NoteName.F, Accidental.SHARP, 6),  F_DOUBLE_SHARP(NoteName.F, Accidental.DOUBLE_SHARP, 7),
	G_DOUBLE_FLAT(NoteName.G, Accidental.DOUBLE_FLAT, 5),  G_FLAT(NoteName.G, Accidental.FLAT, 6),  G_NATURAL(NoteName.G, Accidental.NATURAL, 7),  G_SHARP(NoteName.G, Accidental.SHARP, 8),  G_DOUBLE_SHARP(NoteName.G, Accidental.DOUBLE_SHARP, 9);
	
	public final Accidental accidental;
	public final NoteName noteName;
	public final int integerValue;

	PitchClass(NoteName note, Accidental accidental, int integerValue) {
		this.accidental = accidental;
		this.noteName = note;
		this.integerValue = integerValue;
	}

	public int getCorrectedIntegerValue() {
		return (integerValue + 12) % 12;
	}

	public String toString() {
		return noteName.name() + accidental.textSymbol;
	}


	public static PitchClass getPitchClass(NoteName noteName, Accidental accidental) {
		for(PitchClass aa : PitchClass.values())
			if(aa.noteName.equals(noteName) && aa.accidental.equals(accidental))
				return aa;
		
		throw new RuntimeException("Error applying accidental - Reached \"unreachable\" code.");
	}
	public static PitchClass getPitchClass(NoteName noteName, int integerValue) {
		integerValue = integerValue % 12;
		int halfSteps = (integerValue - PitchClass.getPitchClass(noteName, Accidental.NATURAL).integerValue);
		return getPitchClass(noteName, Accidental.getAccidental(halfSteps));
	}
}
