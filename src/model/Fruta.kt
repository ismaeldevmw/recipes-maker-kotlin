package model

class Fruta(cantidad: Int): Ingredient(), IIngredient {

    override val ingredientList: Array<String> = arrayOf("Fresa","Platano","Uvas","Manzana","Naranja","Cereza")

    init {
        println("Ingresa el id del ingrediente deseado")
        println(show(ingredientList, ::showListWithPipes))
    }

    override fun messageSuccess(ingredientName: String) {
        println("La fruta $ingredientName ha sido agregada")
    }

}