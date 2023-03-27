package reverse

import org.junit.Assert.assertEquals
import org.junit.Test

class ExampleTest {
    @Test
    fun fixedTest() {
        assertEquals(listOf("!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"),
            reverse(listOf("I", "like", "big", "butts", "and", "I", "cannot", "lie!")))

        assertEquals(
            listOf("How", "many", "shrimp", "do", "you", "have", "to", "eat","before", "your", "skin", "starts", "to", "turn", "pink?"),
            reverse(listOf("?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer", "ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH")))
    }
}