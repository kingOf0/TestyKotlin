package com.kingOf0.testy

class FixedArray<T>(private val length: Int) : ArrayList<T>() {

    override fun add(element: T): Boolean {
        while (size >= length) {
            removeAt(lastIndex)
        }
        return super.add(element)
    }

}