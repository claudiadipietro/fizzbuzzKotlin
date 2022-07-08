import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertEquals

internal class fizzbuzzTest{

    private val fizzBuzzClass: fizzbuzz = fizzbuzz()

    @Test
    fun fizzTestTrue(){
        val expected = true
        assertEquals(expected, fizzBuzzClass.isFizz(3))
    }

    @Test
    fun fizzTestFalse(){
        val expected = false
        assertEquals(expected, fizzBuzzClass.isFizz(4))
    }

    @Test
    fun buzzTestTrue(){
        val expected = true
        assertEquals(expected, fizzBuzzClass.isBuzz(10))
    }

    @Test
    fun buzzTestFalse(){
        val expected = false
        assertEquals(expected, fizzBuzzClass.isBuzz(12))
    }

    @Test
    fun buzzfizzTrue(){
        val expected = true
        assertEquals(expected, fizzBuzzClass.isFizzbuzz(150))
    }

    @Test
    fun buzzfizzFalse(){
        val expected = false
        assertEquals(expected, fizzBuzzClass.isFizzbuzz(124))
    }

    @Test
    fun compareResultFizz(){
        val expected = "fizz"
        assertEquals(expected, fizzBuzzClass.getFizzBuzz(3))
    }

    @Test
    fun compareResultBuzz(){
        val expected = "buzz"
        assertEquals(expected, fizzBuzzClass.getFizzBuzz(5))
    }

    @Test
    fun compareResultFizzBuzz(){
        val expected = "fizzbuzz"
        assertEquals(expected, fizzBuzzClass.getFizzBuzz(15))
    }

    @Test
    fun compareResultsNoMatch(){
        val expected = ""
        assertEquals(expected, fizzBuzzClass.getFizzBuzz(101))
    }

}