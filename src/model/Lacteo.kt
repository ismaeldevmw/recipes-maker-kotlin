package model

class Lacteo(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList: Array<String> = arrayOf<String>("Leche","Yoghurt","Queso","Mantequilla")

    init {
        println("Ingresa el id del ingrediente deseado")
        println(show(ingredientList, ::showListWithPipes))
    }
}
