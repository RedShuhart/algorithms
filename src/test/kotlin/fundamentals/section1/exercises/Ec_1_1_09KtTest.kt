package fundamentals.section1.exercises
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Ec_1_1_09KtTest {

    @Test
    fun test() {
        val expected = "100000"
        assertEquals(expected, toBinary(32))
    }
}