package model

class Aceite(cantidad: Int): Ingredient(), IIngredient {
    override fun messageSuccess(ingredientName: String) {
        println("El $ingredientName ha sido agregada")
    }
}