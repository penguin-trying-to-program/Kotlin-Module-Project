import java.util.Scanner

class TextEditor {
    companion object {
        fun textInput(): String {
            val scanner = Scanner(System.`in`)
            var string = ""
            while (string.isEmpty()) {
                string = scanner.nextLine()
                if (string.isEmpty()) println("Строка не должна быть пустой.")
            }
            return string
        }

        fun chosenMenuItem(menu: Menu): Int {
            val scanner = Scanner(System.`in`)
            var menuItem: Int? = null
            while (menuItem == null) {
                try {
                    menuItem = scanner.nextInt()
                    if (menuItem > menu.menuMap.size - 1 || menuItem < 0) {
                        println("Введите, пожалуйста, номер выбранного пункта меню.")
                        menu.showMenu()
                    }
                } catch (e: Exception) {
                    println("Введите, пожалуйста, номер выбранного пункта меню.")
                    menu.showMenu()
                }
            }
            return menuItem
        }
    }
}