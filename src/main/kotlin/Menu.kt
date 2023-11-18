abstract class Menu (
    private var items: ArrayList<out Creatable>?,
    private val menuName: String,
    private val menuType: String
        ) {

    open var counterMenuItems: Int = 0
    var menuMap: MutableMap<Int, String> = mutableMapOf()

    private fun fillMenu() {
        clearMenu()
        addMenuItem("Создать ${menuType}")
        items?.forEach { item ->
            addMenuItem(item.name)
        }
        addMenuItem("Выход")
    }

    private fun addMenuItem(name: String) {
        menuMap[counterMenuItems] = name
        counterMenuItems++
    }

    abstract fun createMenuItem()

    fun showMenu() {
        fillMenu()
        printMenu()
        when (val chosenItem = TextEditor.chosenMenuItem(this)) {
            -1 -> {
                println("Введите, пожалуйста, номер выбранного пункта меню.")
                showMenu()
            }
            0 -> {
                clearMenu()
                createMenuItem()
                showMenu()
            }
            counterMenuItems - 1 -> exitMenu()
            else -> {
                if (this is MainMenu) this.showArchiveMenu(items!![chosenItem - 1] as Archive)
                if (this is ArchiveMenu) this.showNote(this.archive.notes[chosenItem - 1])
            }
        }
    }

    private fun printMenu() {
        println("$menuName:")
        if (menuMap.isNotEmpty()) {
            for (item in menuMap) {
                println("${item.key}. ${item.value}")
            }
        }
    }

    private fun clearMenu() {
        menuMap.clear()
        counterMenuItems = 0
    }

    abstract fun exitMenu()

}