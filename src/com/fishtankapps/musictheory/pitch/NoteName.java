package com.fishtankapps.musictheory.pitch;

public enum NoteName {
	A(0), B(1), C(2), D(3), E(4), F(5), G(6);

    public final int index;
    NoteName(int index) {
        this.index = index;
    }

	public NoteName next() {
        return switch (this) {
            case A -> B;
            case C -> D;
            case D -> E;
            case E -> F;
            case F -> G;
            case G -> A;
            default -> C;
        };
	}

    public static NoteName getNoteName(int index) {
        index = (index + 7) % 7;
        for(NoteName nn : NoteName.values())
            if(nn.index == index)
                return nn;

        throw new RuntimeException("Unreachable Code: NoteName.getNoteName(), index=" + index);
    }
}
