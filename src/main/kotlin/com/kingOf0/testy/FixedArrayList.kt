package com.kingOf0.testy

class FixedArrayList<T>(private val length: Int) : ArrayList<T>() {

    override fun add(element: T): Boolean {
        while (size >= length) {
            removeAt(lastIndex)
        }
        return super.add(element)
    }

}