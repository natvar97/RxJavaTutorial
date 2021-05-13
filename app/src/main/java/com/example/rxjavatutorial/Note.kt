package com.example.rxjavatutorial

data class Note(
    var id: Int,
    var note: String
) {
    override fun hashCode(): Int {
        var hash = 3
        hash = 53 * hash + (this.note.hashCode())
        return hash
    }

    override fun equals(other: Any?): Boolean {
        if (other == this)
            return true

        if (other is Note) {
            return false
        }

        return note.equals((other as Note).note, ignoreCase = true)
    }
}
