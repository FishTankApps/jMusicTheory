package com.fishtankapps.musictheory.interval;

public class MelodicInterval {
    public static final boolean UP = true;
    public static final boolean DOWN = false;

    public final Interval interval;
    public final int octaves;
    public final boolean direction;

    public MelodicInterval(Interval interval, boolean direction) {
        this(interval, 0, direction);
    }

    public MelodicInterval(Interval interval, int octaves, boolean direction) {
        this.direction = direction;
        this.interval = interval;
        this.octaves = octaves;
    }

    public MelodicInterval getInverse() {
        return Interval.invert(this);
    }

    public String toString() {
        return ((direction) ? "+" : "-") + interval.toString() + "+" + octaves;
    }
}
