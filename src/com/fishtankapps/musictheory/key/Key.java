package com.fishtankapps.musictheory.key;

import com.fishtankapps.musictheory.interval.Interval;
import com.fishtankapps.musictheory.pitch.Accidental;
import com.fishtankapps.musictheory.pitch.NoteName;
import com.fishtankapps.musictheory.pitch.PitchClass;

@SuppressWarnings("unused")
public enum Key {

	A_FLAT_MAJOR, A_MAJOR, A_SHARP_MAJOR, 
	B_FLAT_MAJOR, B_MAJOR, B_SHARP_MAJOR, 
	C_FLAT_MAJOR, C_MAJOR, C_SHARP_MAJOR, 
	D_FLAT_MAJOR, D_MAJOR, D_SHARP_MAJOR, 
	E_FLAT_MAJOR, E_MAJOR, E_SHARP_MAJOR, 
	F_FLAT_MAJOR, F_MAJOR, F_SHARP_MAJOR, 
	G_FLAT_MAJOR, G_MAJOR, G_SHARP_MAJOR, 
	
	A_FLAT_NATURAL_MINOR, A_NATURAL_MINOR, A_SHARP_NATURAL_MINOR,
	B_FLAT_NATURAL_MINOR, B_NATURAL_MINOR, B_SHARP_NATURAL_MINOR,
	C_FLAT_NATURAL_MINOR, C_NATURAL_MINOR, C_SHARP_NATURAL_MINOR,
	D_FLAT_NATURAL_MINOR, D_NATURAL_MINOR, D_SHARP_NATURAL_MINOR,
	E_FLAT_NATURAL_MINOR, E_NATURAL_MINOR, E_SHARP_NATURAL_MINOR,
	F_FLAT_NATURAL_MINOR, F_NATURAL_MINOR, F_SHARP_NATURAL_MINOR,
	G_FLAT_NATURAL_MINOR, G_NATURAL_MINOR, G_SHARP_NATURAL_MINOR,
	
	A_FLAT_IONIAN, A_IONIAN, A_SHARP_IONIAN, 
	B_FLAT_IONIAN, B_IONIAN, B_SHARP_IONIAN, 
	C_FLAT_IONIAN, C_IONIAN, C_SHARP_IONIAN, 
	D_FLAT_IONIAN, D_IONIAN, D_SHARP_IONIAN, 
	E_FLAT_IONIAN, E_IONIAN, E_SHARP_IONIAN, 
	F_FLAT_IONIAN, F_IONIAN, F_SHARP_IONIAN, 
	G_FLAT_IONIAN, G_IONIAN, G_SHARP_IONIAN, 
	
	A_FLAT_DORIAN, A_DORIAN, A_SHARP_DORIAN, 
	B_FLAT_DORIAN, B_DORIAN, B_SHARP_DORIAN, 
	C_FLAT_DORIAN, C_DORIAN, C_SHARP_DORIAN, 
	D_FLAT_DORIAN, D_DORIAN, D_SHARP_DORIAN, 
	E_FLAT_DORIAN, E_DORIAN, E_SHARP_DORIAN, 
	F_FLAT_DORIAN, F_DORIAN, F_SHARP_DORIAN, 
	G_FLAT_DORIAN, G_DORIAN, G_SHARP_DORIAN, 
	
	A_FLAT_PHRYGIAN, A_PHRYGIAN, A_SHARP_PHRYGIAN,
	B_FLAT_PHRYGIAN, B_PHRYGIAN, B_SHARP_PHRYGIAN, 
	C_FLAT_PHRYGIAN, C_PHRYGIAN, C_SHARP_PHRYGIAN, 
	D_FLAT_PHRYGIAN, D_PHRYGIAN, D_SHARP_PHRYGIAN, 
	E_FLAT_PHRYGIAN, E_PHRYGIAN, E_SHARP_PHRYGIAN, 
	F_FLAT_PHRYGIAN, F_PHRYGIAN, F_SHARP_PHRYGIAN, 
	G_FLAT_PHRYGIAN, G_PHRYGIAN, G_SHARP_PHRYGIAN, 
	
	A_FLAT_LYDIAN, A_LYDIAN, A_SHARP_LYDIAN, 
	B_FLAT_LYDIAN, B_LYDIAN, B_SHARP_LYDIAN, 
	C_FLAT_LYDIAN, C_LYDIAN, C_SHARP_LYDIAN, 
	D_FLAT_LYDIAN, D_LYDIAN, D_SHARP_LYDIAN, 
	E_FLAT_LYDIAN, E_LYDIAN, E_SHARP_LYDIAN, 
	F_FLAT_LYDIAN, F_LYDIAN, F_SHARP_LYDIAN, 
	G_FLAT_LYDIAN, G_LYDIAN, G_SHARP_LYDIAN, 
	
	A_FLAT_MIXOLYDIAN, A_MIXOLYDIAN, A_SHARP_MIXOLYDIAN,
	B_FLAT_MIXOLYDIAN, B_MIXOLYDIAN, B_SHARP_MIXOLYDIAN, 
	C_FLAT_MIXOLYDIAN, C_MIXOLYDIAN, C_SHARP_MIXOLYDIAN, 
	D_FLAT_MIXOLYDIAN, D_MIXOLYDIAN, D_SHARP_MIXOLYDIAN, 
	E_FLAT_MIXOLYDIAN, E_MIXOLYDIAN, E_SHARP_MIXOLYDIAN, 
	F_FLAT_MIXOLYDIAN, F_MIXOLYDIAN, F_SHARP_MIXOLYDIAN, 
	G_FLAT_MIXOLYDIAN, G_MIXOLYDIAN, G_SHARP_MIXOLYDIAN, 
	
	A_FLAT_AEOLIAN, A_AEOLIAN, A_SHARP_AEOLIAN, 
	B_FLAT_AEOLIAN, B_AEOLIAN, B_SHARP_AEOLIAN, 
	C_FLAT_AEOLIAN, C_AEOLIAN, C_SHARP_AEOLIAN, 
	D_FLAT_AEOLIAN, D_AEOLIAN, D_SHARP_AEOLIAN, 
	E_FLAT_AEOLIAN, E_AEOLIAN, E_SHARP_AEOLIAN, 
	F_FLAT_AEOLIAN, F_AEOLIAN, F_SHARP_AEOLIAN, 
	G_FLAT_AEOLIAN, G_AEOLIAN, G_SHARP_AEOLIAN, 
	
	A_FLAT_LOCRIAN, A_LOCRIAN, A_SHARP_LOCRIAN,
	B_FLAT_LOCRIAN, B_LOCRIAN, B_SHARP_LOCRIAN, 
	C_FLAT_LOCRIAN, C_LOCRIAN, C_SHARP_LOCRIAN, 
	D_FLAT_LOCRIAN, D_LOCRIAN, D_SHARP_LOCRIAN, 
	E_FLAT_LOCRIAN, E_LOCRIAN, E_SHARP_LOCRIAN, 
	F_FLAT_LOCRIAN, F_LOCRIAN, F_SHARP_LOCRIAN, 
	G_FLAT_LOCRIAN, G_LOCRIAN, G_SHARP_LOCRIAN;
	
	
	public enum Type {
		MAJOR             (Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.WHOLE_STEP,  Interval.HALF_STEP),
		NATURAL_MINOR     (Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP,  Interval.WHOLE_STEP),
		IONIAN            (Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.WHOLE_STEP,  Interval.HALF_STEP), 
		DORIAN            (Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,   Interval.WHOLE_STEP), 
		PHRYGIAN          (Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP,  Interval.WHOLE_STEP), 
		LYDIAN            (Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP,  Interval.HALF_STEP), 
		MIXOLYDIAN        (Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,   Interval.WHOLE_STEP),
		AEOLIAN           (Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP,  Interval.WHOLE_STEP),
		LOCRIAN           (Interval.HALF_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP, Interval.HALF_STEP,  Interval.WHOLE_STEP,  Interval.WHOLE_STEP, Interval.WHOLE_STEP);
		
		
		private final Interval[] intervals;
		Type(Interval... intervals) {
			this.intervals = intervals;
		}
	}
	
	public final PitchClass[] pitchSet;
	public final Type type;
	
	Key() {

        Type type1;
        String[] nameArray = this.name().split("_");

		NoteName nn = NoteName.valueOf(nameArray[0]);
		Accidental accidental;

		try {
			accidental = Accidental.valueOf(nameArray[1]);

			if(nameArray.length == 4)
				type1 = Type.valueOf(nameArray[2] + "_" + nameArray[3]);
			else
				type1 = Type.valueOf(nameArray[2]);

		} catch (Throwable e) {
			accidental = Accidental.NATURAL;

			if (nameArray.length == 3)
				type1 = Type.valueOf(nameArray[1] + "_" + nameArray[2]);
			else
				type1 = Type.valueOf(nameArray[1]);
		}

        type = type1;
        pitchSet = new PitchClass[type.intervals.length];
		pitchSet[0] = PitchClass.getPitchClass(nn, accidental);
		
		for(int index = 1; index < pitchSet.length; index++)
			pitchSet[index] = Interval.derivePitch(pitchSet[index - 1], type.intervals[index - 1]);
	}

	public String toString() {
		return name().replace('_', ' ');
	}

	public String getNotesInKey() {
		StringBuilder notes = new StringBuilder();

		for(int index = 0; index < pitchSet.length - 1; index++) {
			notes.append(pitchSet[index]).append(" ");
		}

		notes.append(pitchSet[pitchSet.length - 1]);
		return notes.toString();
	}

	public Key transpose(Interval interval) {
		return transposeKey(this, interval);
	}


	public static Key getKey(PitchClass root, Type type) {
		return Key.valueOf(root.name().replace("_NATURAL", "") + "_" + type.name());
	}

	public static Key transposeKey(Key key, Interval interval) {
		return getKey(Interval.derivePitch(key.pitchSet[0], interval), key.type);
	}
}