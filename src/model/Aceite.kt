package model

class Aceite(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList: Array<String> = arrayOf("Aceite")

    override fun messageSuccess(ingredientName: String) {
        println("El $ingredientName ha sido agregada")
    }
}