package ru.tetris.demo.helper

object HelperFunctions {

     fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray> = Array(sizeOuter) {
        ByteArray(sizeInner)
    }
}