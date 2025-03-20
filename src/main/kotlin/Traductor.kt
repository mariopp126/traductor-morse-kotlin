class Traductor {
    var palabras = arrayOf("A", "B", "C","D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"
        , "Q", "R", "S", "T", "U", "V","W", "X", "Y", "Z")
    var morse = arrayOf("· −","— · · ·","— · — ·", "— · ·","·", "· · — ·", "— — ·","· · · ·"
        ,"· ·","· — — —","— · —", "· — · ·", "— —", "— ·", "— — —", "· — — ·", "— — · —", "· — ·",
        "· · ·", "—", "· · —", "· · · —", "· — —","— · · —", "— · — —", "— — · ·")

    fun Traducir(dato:String){
        var traduccion = ""
        var letra = ""

        var mayuscula = dato.toUpperCase()

        for (i in 1..dato.length)
            letra = mayuscula.substring(i-1,i)

            for (j in 1..palabras.lastIndex)

                if (letra.equals(palabras[j]))
                    traduccion = traduccion + morse[j] + " | "


    }
}