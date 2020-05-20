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
}