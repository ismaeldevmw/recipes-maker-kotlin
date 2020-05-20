package model

class Grano(cantidad: Int): Ingredient() {
    init {
        println("""
            Ingresa el nombre de un ingrediente
            1. Maiz
            2. Arroz
            3. Pan
            4. Trigo 
        """.trimIndent())
    }
}