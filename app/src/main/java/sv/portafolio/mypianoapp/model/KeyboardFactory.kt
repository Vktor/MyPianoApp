package sv.portafolio.mypianoapp.model


class KeyboardFactory {
    fun createDefaultKeyboard(): Keyboard {
        val mutableList = mutableListOf<Key>()
        for (i in 0..11) mutableList.add(Key(i))
        return Keyboard(mutableList.toTypedArray())
    }
}