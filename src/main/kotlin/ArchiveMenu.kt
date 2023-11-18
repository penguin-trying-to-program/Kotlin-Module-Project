class ArchiveMenu(var archive: Archive,
                  override var counterMenuItems: Int = 0,
                  val mainMenu: MainMenu) : Menu(archive.notes, "Список заметок", "заметку") {

    override fun createMenuItem() {
        archive.notes.add(Note.produce())
        counterMenuItems++
    }

    override fun exitMenu() {
        println("Возвращаемся в главное меню.")
        mainMenu.showMenu()
    }

    fun showNote(note: Note) {
        note.show()
        showMenu()
    }

}