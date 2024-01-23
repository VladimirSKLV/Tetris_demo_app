package ru.tetris.demo.models;

import android.graphics.Color;
import android.graphics.Point;

public class Block {
    private int shapeIndex;
    private int frameNumber;
    private BlockColor color;
    private Point position;

    public enum BlockColor {
        PINK(Color.rgb(255, 105, 180), (byte) 2),
        GREEN(Color.rgb(255, 105, 180), (byte) 2),
        ORANGE(Color.rgb(255, 105, 180), (byte) 2),
        YELLOW(Color.rgb(255, 105, 180), (byte) 2),
        CYAN(Color.rgb(255, 105, 180), (byte) 2);

        BlockColor(int rgbValue, byte value) {
            this.rgbValue = rgbValue;
            this.value = value;
        }

        private final int rgbValue;
        private final int value;
    }
}
