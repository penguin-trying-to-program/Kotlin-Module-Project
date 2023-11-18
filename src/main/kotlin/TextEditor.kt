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
                    if ((menuItem >= menu.menuMap.size) || (menuItem < 0)) {
                        return -1
                    }
                } catch (e: Exception) {
                    return -1
                }
            }
            return menuItem
        }
    }
}