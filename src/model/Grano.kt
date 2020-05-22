package model

class Grano(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList: Array<String> = arrayOf("Maiz","Arroz","Pan","Trigo")

    init {
        println("Ingresa el id del ingrediente deseado")
        println(show(ingredientList, ::showListWithLines))
    }
}