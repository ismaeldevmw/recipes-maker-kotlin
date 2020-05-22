package model

abstract class Ingredient {
    fun add(ingredients: ArrayList<String>, ingredientName: String): String {
        ingredients.add(ingredientName)
        return ingredientName
    }

    fun delete(ingredients: ArrayList<String>, ingredientName: String): String {
        ingredients.remove(ingredientName)
        return  ingredientName
    }

    fun validateSelectedElement(ingredients: Array<String>, elementSelected: Int): Boolean {
        var result = if (elementSelected >= ingredients.size) false else  true
        return result
    }
}