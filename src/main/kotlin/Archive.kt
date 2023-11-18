class Archive (
    override var name: String,
    var notes: ArrayList<Note>
        ): Creatable {

    companion object Factory {
        fun produce(): Archive {
            var name: String = ""

            println("Введите, пожалуйста, название нового архива.")
            name = TextEditor.textInput()

            return Archive(name, arrayListOf())
        }
    }

}