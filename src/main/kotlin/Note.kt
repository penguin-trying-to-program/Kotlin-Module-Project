class Note (
    override var name: String,
    var text: String
        ): Creatable {

    companion object Factory {
        fun produce(): Note {
            var name: String = ""
            var text: String = ""

            println("Создание новой заметки")

            println("Введите, пожалуйста, название новой заметки.")
            name = TextEditor.textInput()

            println("Введите, пожалуйста, текст заметки.")
            text = TextEditor.textInput()

            return Note(name, text)
        }
    }

    fun show() {
        println(this.text)
    }

}