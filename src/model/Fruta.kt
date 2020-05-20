package model

class Fruta(cantidad: Int): Ingredient(), IIngredient {

    init {
        val message = """ 
            Ingresa el nombre de un ingrediente
            1. Fresa
            2. Platano
            3. Uvas
            4. Manzana
            5. Naranja
            7. Cereza
        """.trimIndent()
        println(message)
    }

    override fun messageSuccess(ingredientName: String) {
        println("La fruta $ingredientName ha sido agregada")
    }

}