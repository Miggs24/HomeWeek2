// TODO3_DrinkNameGenerator.kt

// TODO 3: Generate programmer-friendly drink names
// Function name: createDrinkName
// Parameters: baseType (String), vararg modifiers (String)
// Return: String (formatted drink name)
// Format: "The $baseType" + each modifier with "with extra" prefix
// Example: createDrinkName("Debugger", "sugar", "hope") → "The Debugger with extra sugar with extra hope"

fun createDrinkName(baseType: String, vararg modifiers: String): String {
    var result = "The $baseType"

    for (modifier in modifiers) {
        result += " with extra $modifier"
    }

    return result
}
