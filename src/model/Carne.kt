package model

class Carne(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList:Array<String> = arrayOf<String>("Huevo","Chuleta","Bisteck","Frijol","Cacahuate","Pollo","Lenteja","Pezcado")

    init {
        println("Ingresa el id del ingrediente deseado")
        println(show(ingredientList, ::showListWithLines))
    }
}