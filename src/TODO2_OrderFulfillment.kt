// TODO2_OrderFulfillment.kt

// TODO 2: Check if order is possible
// Function name: canFulfillOrder
// Parameters: orderItems (List<String>), availableIngredients (List<String>)
// Return: Boolean (true if all order items are available)

fun canFulfillOrder(orderItems: List<String>, availableIngredients: List<String>): Boolean {
    // Check each item in the order
    for (item in orderItems) {
        if (item !in availableIngredients) {
            return false  // If any item is missing, the order cannot be fulfilled
        }
    }
    return true  // All items are available
}
