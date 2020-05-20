package model

class Verdura(cantidad: Int): Ingredient(), IIngredient {
    init {
        val message = """ 
            Ingresa el nombre de un ingrediente
            1. Zanahoria
            2. Jitomate
            3. Coliflor
            4. Espinaca
            5. Ejote
            7. Cebolla
            8. Chile
        """.trimIndent()
        println(message)
    }

    override fun messageSuccess(ingredientName: String) {
        println("La verdura $ingredientName ha sido agregada")
    }

}