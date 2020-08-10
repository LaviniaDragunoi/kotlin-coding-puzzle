package com.igorwojda.integer.addupto

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun addUpTo(n: Int): Int {
    var added = 0;
    for (i in 0..n){
        added += i
    }
    return added
}

class AddUpToTest {
    @Test
    fun `add up to 1`() {
        addUpTo(1) shouldEqual 1
    }

    @Test
    fun `add up to 3`() {
        addUpTo(3) shouldEqual 6
    }

    @Test
    fun `add up to 10`() {
        addUpTo(10) shouldEqual 55
    }
}