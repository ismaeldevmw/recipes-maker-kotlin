package model

class Lacteo(cantidad: Int): Ingredient() {
    init {
        println("""
            Ingresa el nombre de un ingrediente
            1. Leche
            2. Yoghurt
            3. Queso
            4. Mantequilla
        """.trimIndent())
    }
}
