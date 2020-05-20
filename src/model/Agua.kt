package model

class Agua(cantidad: Int): Ingredient(), IIngredient {

    override fun messageSuccess(ingredientName: String) {
        println("El $ingredientName ha sido agregada")
    }

}
