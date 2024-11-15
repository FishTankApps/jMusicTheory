package com.fishtankapps.musictheory.interval;

import com.fishtankapps.musictheory.pitch.NoteName;
import com.fishtankapps.musictheory.pitch.Pitch;
import com.fishtankapps.musictheory.pitch.PitchClass;

public enum Interval {

	d1(11,0),          P1(0,0),  A1(1,0),
	d2(0,1),  m2(1,1), M2(2,1),  A2(3,1),
	d3(2,2),  m3(3,2), M3(4,2),  A3(5,2),
	d4(4,3),           P4(5,3),  A4(6,3),
	d5(6,4),           P5(7,4),  A5(8,4),
	d6(7,5), m6(8,5),  M6(9,5),  A6(10,5),
	d7(9,6), m7(10,6), M7(11,6), A7(12,6),
	P8(12, 7),
	HALF_STEP(1, 1), WHOLE_STEP(2, 1);
	
	public final int halfSteps;
	public final int pitchClassSteps;


	Interval(int halfSteps, int pitchClassSteps) {
		this.halfSteps = halfSteps;
		this.pitchClassSteps = pitchClassSteps;
	}
	
	public String toString() {
		return this.name();
	}

	public Interval getInverse() {
		return invert(this);
	}


	public static Interval invert(Interval interval) {
		int halfSteps = 12 - interval.halfSteps;
		int pitchClassSteps = 7 - interval.pitchClassSteps;

		return getInterval(halfSteps, pitchClassSteps);
	}
    public static MelodicInterval invert(MelodicInterval interval) {
        return new MelodicInterval(interval.interval.getInverse(), interval.octaves, !interval.direction);
    }

	public static PitchClass derivePitch(PitchClass pitch, Interval interval) {
		return derivePitch(pitch, interval, true);
	}
	public static PitchClass derivePitch(PitchClass pitch, Interval interval, boolean up) {

        NoteName noteName;
        int integerValue;

        if(up) {
            noteName = NoteName.getNoteName(pitch.noteName.index + interval.pitchClassSteps);
            integerValue = pitch.integerValue + interval.halfSteps;
        } else {
            noteName = NoteName.getNoteName(pitch.noteName.index - interval.pitchClassSteps);
            integerValue = pitch.integerValue - interval.halfSteps;
        }

        return PitchClass.getPitchClass(noteName, integerValue);
    }

    public static Pitch derivePitch(Pitch pitch, Interval interval) {
        return derivePitch(pitch, interval, true);
    }
    public static Pitch derivePitch(Pitch pitch, Interval interval, boolean up) {
        if(interval == Interval.P1)
            return pitch;

        PitchClass pc = derivePitch(pitch.pitchClass, interval, up);

        int octave = pitch.octave;
        if(up && pitch.pitchClass.integerValue >= pc.integerValue) octave++;
        if(!up && pitch.pitchClass.integerValue <= pc.integerValue) octave--;

        return Pitch.getPitch(pc, octave);
    }

	public static Interval measureIntervalUp(PitchClass pitch1, PitchClass pitch2) {
		int halfSteps = (pitch2.integerValue - pitch1.integerValue + 12) % 12;
		int pitchSteps = (pitch2.noteName.index - pitch1.noteName.index + 7) % 7;
		return getInterval(halfSteps, pitchSteps);
	}
	public static Interval measureIntervalDown(PitchClass pitch1, PitchClass pitch2) {
		return measureIntervalUp(pitch1, pitch2).getInverse();
	}
	public static Interval measureIntervalAbsolute(PitchClass pitch1, PitchClass pitch2) {
		Interval up = measureIntervalUp(pitch1, pitch2);
		Interval down = up.getInverse();

		return (up.halfSteps < down.halfSteps) ? up : down;
	}

    public static MelodicInterval measureInterval(Pitch pitch1, Pitch pitch2) {
        // TODO: ¡No es buena!
        boolean direction;
        Interval interval;
        int octave;

        if(pitch1.isLowerThan(pitch2)) {
            interval = measureIntervalUp(pitch1.pitchClass, pitch2.pitchClass);
            direction = MelodicInterval.UP;
            octave = pitch2.octave - pitch1.octave;
        } else {
            interval = measureIntervalDown(pitch1.pitchClass, pitch2.pitchClass);
            direction = MelodicInterval.DOWN;
            octave = pitch1.octave - pitch2.octave;
        }

        return new MelodicInterval(interval, octave, direction);
    }

	private static Interval getInterval(int halfSteps, int pitchClassSteps) {
		for(Interval i : Interval.values())
			if(i.halfSteps == halfSteps && i.pitchClassSteps == pitchClassSteps)
				return i;

		throw new RuntimeException("Unreachable Code: Interval.invert(): halfSteps=" + halfSteps
				+ ", pitchClassSteps=" + pitchClassSteps);
	}
}
