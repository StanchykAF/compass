package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        throw new UnsupportedOperationException();
    }

    public static Direction closestToDegrees(int degrees) {
        throw new UnsupportedOperationException();
    }

    public Direction opposite() {
        throw new UnsupportedOperationException();
    }

    public int differenceDegreesTo(Direction direction) {
        throw new UnsupportedOperationException();
    }
}
