class MathSet {
    private val items: MutableList<Int> = mutableListOf()

    val itemsCount: Int
        get() = items.size

    fun isEmpty() = itemsCount == 0

    fun addItem(item: Int): Boolean {
        items.add(item)
        return true
    }

}