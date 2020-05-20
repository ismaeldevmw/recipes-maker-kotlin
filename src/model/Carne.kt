package model

class Carne(cantidad: Int): Ingredient() {
    init {
        println("""
            Ingresa el nombre de un ingrediente
            1. Huevo
            2. Chuleta
            3. Bisteck
            4. Frijol
            5. Cacahuate
            6. Pollo
            7. Lenteja
            8. Pezcado
        """.trimIndent())
    }
}