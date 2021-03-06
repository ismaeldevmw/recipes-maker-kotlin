import com.sun.xml.internal.fastinfoset.util.StringArray
import model.*
import kotlin.system.exitProcess

var ingredients = arrayListOf<String>()

fun main() {
    val menu: String = """
        Selecciona la opción deseada:
        1. Hacer una receta
        2. Ver mis recetas
        3. salir
    """.trimIndent()

    do {
        println(menu)
        val opcionSeleccionada:String? = readLine()

        when (opcionSeleccionada) {
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> exitProcess(0)
            else -> {
                println("Selecciona una opción valida")
            }
        }
    } while (opcionSeleccionada != "3")
}

fun makeRecipe() {
    val message: String = """
        ----------Hacer receta----------
        Selecciona por categoría el ingrediente que buscas
    """.trimIndent()
    println(message)

    var categories: Array<String> = arrayOf<String>("Agua","Lacteos","Carnes, legumbres y huevos","Granos","Aceites","Verduras","Frutas")
    val showCategories = {categories: Array<String> ->
        for ((index, categorie) in categories.withIndex()) {
            println("$index - $categorie")
        }
    }(categories)

    showCategories
    val categorieSelected: String = readLine() ?: "0"

    if (categorieSelected.toInt() >= categories.size) {
        println("Opción incorrecta")
    }else{
        println("-----${categories[categorieSelected.toInt()]}-----")
        println("Ingresa la cantidad...")

        val cantidad: String = readLine() ?: "0"
        var ingredientSelected: String = ""

        when(categories[categorieSelected.toInt()]) {
            "Frutas" ->  {
                val fruta = Fruta(cantidad.toInt())
                ingredientSelected = readLine() ?: ""
                if(fruta.validateSelectedElement(fruta.ingredientList, ingredientSelected.toInt())){
                    ingredientSelected = fruta.ingredientList[ingredientSelected.toInt()]
                    fruta.add(ingredients, ingredientSelected)
                    fruta.messageSuccess(ingredientSelected)
                }
            }
            "Verduras" -> {
                val verdura = Verdura(cantidad.toInt())
                ingredientSelected = readLine() ?: ""
                ingredientSelected = verdura.ingredientList[ingredientSelected.toInt()]
                verdura.add(ingredients, ingredientSelected)
            }
            "Agua" -> {
                val agua = Agua(cantidad.toInt())
                ingredientSelected = agua.ingredientList[0]
                agua.add(ingredients, ingredientSelected)
            }
            "Lacteos" -> {
                val lacteo = Lacteo(cantidad.toInt())
                ingredientSelected = readLine() ?: "0"
                ingredientSelected = lacteo.ingredientList[ingredientSelected.toInt()]
                lacteo.add(ingredients, ingredientSelected)
            }
            "Carnes, legumbres y huevos" -> {
                val carne = Carne(cantidad.toInt())
                ingredientSelected = readLine() ?: "0"
                ingredientSelected = carne.ingredientList[ingredientSelected.toInt()]
                carne.add(ingredients, ingredientSelected)
            }
            "Granos" -> {
                val grano = Grano(cantidad.toInt())
                ingredientSelected = readLine() ?: "0"
                ingredientSelected = grano.ingredientList[ingredientSelected.toInt()]
                grano.add(ingredients, ingredientSelected)
            }
            "Aceites" -> {
                val aceite = Aceite(cantidad.toInt())
                ingredientSelected = aceite.ingredientList[0]
                aceite.add(ingredients, ingredientSelected)
            }
        }
    }
}

fun viewRecipe() {
    println("""
        ----------Ver mis recetas----------
              -----Ingredientes-----
    """.trimIndent())

    for (ingredient in ingredients) {
        println("Ingrediente - $ingredient")
    }
}