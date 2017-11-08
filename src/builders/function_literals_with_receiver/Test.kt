package builders.function_literals_with_receiver

import koans.util.inEquals
import org.junit.Assert
import org.junit.Test

class TestExtensionFunctionLiterals {
    @Test
    fun testIsOddAndIsEven() {
        Assert.assertEquals("The functions 'isOdd' and 'isEven' should be implemented correctly".inEquals(),
                listOf(false, true, true), task())

    }
}