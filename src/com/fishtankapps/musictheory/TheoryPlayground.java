package com.fishtankapps.musictheory;

import com.fishtankapps.musictheory.interval.Interval;
import com.fishtankapps.musictheory.pitch.Pitch;

public class TheoryPlayground {

	public static void main(String[] args) {
		System.out.println(Interval.measureInterval(Pitch.B_NATURAL_4, Pitch.F_NATURAL_5));
	}
}