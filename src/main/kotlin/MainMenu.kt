open class MainMenu(var archives: ArrayList<Archive>,
               var counterMenuItems: Int = 0) : Menu(archives, "Список архивов", "архив" ) {

    override fun createMenuItem() {
        archives.add(Archive.produce())
        counterMenuItems++
    }

    override fun exitMenu() {
        println("Всего доброго!")
    }

    fun showArchiveMenu(archive: Archive) {
        val archiveMenu = ArchiveMenu(archive, mainMenu = this)
        archiveMenu.showMenu()
    }

}