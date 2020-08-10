package com.igorwojda.string.capitalizesentence

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun capitalizeSentence(str: String): String {
    var capitalizedString = "" + when(str[0]) {
        in 'a'..'z', in 'A'..'Z' -> str[0].toUpperCase()
        else -> str[0]
    }

    for (i in 1 until str.length) {
        capitalizedString += if (str[i] in 'a'..'z' || str[i] in 'A'..'Z') {
            if (str[i - 1] in " ") {
                str[i].toUpperCase()
            } else {
                str[i]
            }
        } else {
            str[i]
        }
    }
    return capitalizedString
}

class CapitalizeSentenceTest {
    @Test
    fun `"flower" is capitalized to "Flower"`() {
        capitalizeSentence("flower") shouldEqual "Flower"
    }
    //    @Test
//    fun `"" is capitalized to ""`() {
//        capitalizeSentence("") shouldEqual ""
//    }
    @Test
    fun `"this is a house" is capitalised to "This Is A House"`() {
        capitalizeSentence("this is a house") shouldEqual "This Is A House"
    }

    @Test
    fun `"this 123 !is 12a house" is capitalised to "This 123 !is 12a House"`() {
        capitalizeSentence("this 123 !is 12a house") shouldEqual "This 123 !is 12a House"
    }

    @Test
    fun `"9this 123 !is 12a house" is capitalised to "9this 123 !is 12a House"`() {
        capitalizeSentence("9this 123 !is 12a house") shouldEqual "9this 123 !is 12a House"
    }
}