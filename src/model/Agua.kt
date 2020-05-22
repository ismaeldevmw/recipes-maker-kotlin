package model

class Agua(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList: Array<String> = arrayOf("Agua")

    override fun messageSuccess(ingredientName: String) {
        println("El $ingredientName ha sido agregada")
    }

}
