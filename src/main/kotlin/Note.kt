class Note (
    override var name: String,
    var text: String
        ): Creatable {

    companion object Factory {
        fun produce(): Note {
            println("Создание новой заметки")

            println("Введите, пожалуйста, название новой заметки.")
            val name: String = TextEditor.textInput()

            println("Введите, пожалуйста, текст заметки.")
            val text: String = TextEditor.textInput()

            return Note(name, text)
        }
    }

    fun show() {
        println(this.text)
    }

}