
fun main() {
    val archives: ArrayList<Archive> = arrayListOf()
    val mainMenu = MainMenu(archives)
    archives.add(Archive("first", arrayListOf(Note("Погода", "Сегодня облачно"), Note("Настроение", "Хочется мороженого"))))
    archives.add(Archive("second", arrayListOf()))
    mainMenu.showMenu()
}

