package model

interface IIngredient {

    val ingredientList: Array<String>

    fun messageSuccess(ingredientName: String) {
        println("El ingrediente $ingredientName ha sido agregado")
    }

    fun show(list: Array<String>, showInList:(Array<String>) -> String): String  {
        return  showInList(list)
    }

    fun showListWithLines(ingredients: Array<String>): String {
        var messageList: String = ""
        for ((index, ingredient) in ingredients.withIndex()) {
            messageList += " -----$index -> $ingredient----- "
        }
        return messageList
    }

    fun showListWithPipes(ingredients: Array<String>): String {
        var messageList: String = ""
        for ((index, ingredient) in ingredients.withIndex()) {
            messageList += " |||||$index -> $ingredient||||| "
        }
        return messageList
    }
}