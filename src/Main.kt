// Main.kt

// Test your coffee shop management skills!
fun main() {
    println("☕ WELCOME TO COFFEE & CODE! ☕")
    println("Serving caffeinated programmers since 2025\n")

    // Test calculateCaffeineLevel
    println("Dev worked 12 hours, found 8 bugs, feeling zombie:")
    println("☕ Recommended: ${calculateCaffeineLevel(12, 8, "zombie")}")

    // Test canFulfillOrder
    val available = listOf("coffee", "milk", "sugar", "vanilla", "wifi")
    val order = listOf("coffee", "milk", "wifi")
    println("\n📦 Can fulfill order $order? ${canFulfillOrder(order, available)}")

    // Test createDrinkName
    println("\n🍺 New drink: '${createDrinkName("NullPointer", "caffeine", "desperation", "prayers")}'")
}
