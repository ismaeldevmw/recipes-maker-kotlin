package model

class Verdura(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList:Array<String> = arrayOf<String>("Zanahoria","Jitomate","Coliflor","Espinaca","Ejote","Cebolla","Chile")

    init {
        println("Ingresa el id del ingrediente deseado")
        println(show(ingredientList, ::showListWithLines))
    }
}