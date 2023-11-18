class MainMenu(private var archives: ArrayList<Archive>,
               override var counterMenuItems: Int = 0) : Menu(archives, "Список архивов", "архив" ) {

    companion object {
        const val exitMessage: String = "Всего доброго!"
    }

    override fun createMenuItem() {
        archives.add(Archive.produce())
        counterMenuItems++
    }

    override fun exitMenu() {
        println(exitMessage)
    }

    fun showArchiveMenu(archive: Archive) {
        val archiveMenu = ArchiveMenu(archive, mainMenu = this)
        archiveMenu.showMenu()
    }

}