// TODO1_CaffeineCalculator.kt

// TODO 1: Calculate coffee strength needed
// Function name: calculateCaffeineLevel
// Parameters: hoursWorked (Int), bugsFound (Int), energy (String = "tired")
// Return: String ("light", "medium", "strong", "rocket fuel")
// Logic: score = hoursWorked + (bugsFound * 2) + energy bonus (tired=5, awake=0, zombie=10)
// light: 0-5, medium: 6-10, strong: 11-15, rocket fuel: 16+ fun calculateCaffeineLevel(/* Add parameters here */): String {
// Your implementation here TODO("Determine coffee strength needed")

/*The function name followed by Parameters*/
fun calculateCaffeineLevel(hoursWorked: Int, bugsFound: Int, energy: String = "tired"): String {

    /*Bonus calculation dependent on energy level*/
    val energyBonus = when (energy) {
        "tired" -> 5
        "awake" -> 0
        "zombie" -> 10
        else -> 0 /*default value when the energy is not known*/
    }

    /*given formula for calculation*/
    val score = hoursWorked + (bugsFound * 2) + energyBonus

    /*given ranges*/
    return when (score) {
        in 0..5 -> "light"
        in 6..10 -> "medium"
        in 11..15 -> "strong"
        else -> "rocket fuel"  // 16+
    }
}
