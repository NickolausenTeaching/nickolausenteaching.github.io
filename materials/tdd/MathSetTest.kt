import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class MathSetTest {

    @Test
    fun `should create an empty set`() {
        assertDoesNotThrow { MathSet() }
    }

    @Test
    fun `set must be empty when created`() {
        // arrange
        val set = MathSet()

        // act
        val isEmpty = set.isEmpty()
        val itemsCount = set.itemsCount

        // assert
        assertEquals(true, isEmpty)
        assertTrue(isEmpty)
        assertEquals(0, itemsCount)
    }

    @Test
    @DisplayName("should be able to add an element")
    fun addItem_mustAddItem() {
        // arrange
        val set = MathSet()

        // act
        val success: Boolean = set.addItem(2)

        // assert
        assertTrue(success)
    }

    @Test
    fun `isEmpty - when adding an item to the set isEmpty should be false`() {
        // arrange
        val set = MathSet()

        // act
        set.addItem(2)
        val isEmpty = set.isEmpty()
        val itemsCount = set.itemsCount

        // assert
        assertFalse(isEmpty)
        assertEquals(1, itemsCount)
    }
}