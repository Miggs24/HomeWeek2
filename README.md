# HomeWeek2 - Kotlin Programming Assignment

This repository contains solutions for Week 2 homework assignments in Kotlin, focused on coffee shop management functions for programmers.

# HomeWeek2 - Kotlin Programming Assignment

This repository contains solutions for Week 2 homework assignments in Kotlin, focused on coffee shop management functions for programmers.


## Functions Overview

### TODO 1: Caffeine Level Calculator (`calculateCaffeineLevel`)
**Purpose**: Determines the appropriate coffee strength based on work conditions.

**Parameters**:
- `hoursWorked` (Int) - Number of hours worked
- `bugsFound` (Int) - Number of bugs discovered
- `energy` (String = "tired") - Current energy level ("tired", "awake", "zombie")

**Logic**:
- Score = hoursWorked + (bugsFound × 2) + energy bonus
- Energy bonuses: tired=5, awake=0, zombie=10
- Returns: "light" (0-5), "medium" (6-10), "strong" (11-15), "rocket fuel" (16+)

### TODO 2: Order Fulfillment Checker (`canFulfillOrder`)
**Purpose**: Validates if all ordered items are available in inventory.

**Parameters**:
- `orderItems` (List<String>) - Items requested by customer
- `availableIngredients` (List<String>) - Items currently in stock

**Logic**: Returns `true` if all order items exist in available ingredients, `false` otherwise.

### TODO 3: Drink Name Generator (`createDrinkName`)
**Purpose**: Creates programmer-themed drink names with customizable modifiers.

**Parameters**:
- `baseType` (String) - Base drink name
- `vararg modifiers` (String) - Variable number of drink modifiers

**Format**: "The [baseType]" + " with extra [modifier]" for each modifier

## How to Run

1. **Open the project** in IntelliJ IDEA
2. **Navigate to** `Main.kt`
3. **Run the main function** to test all implementations


## Key Kotlin Concepts Demonstrated

- **Default parameters** and function overloading
- **List operations** and membership checking (`in` operator)
- **Variable arguments** (`vararg`)
- **String templates** and concatenation
- **When expressions** for conditional logic
- **Boolean logic** and early returns
- **For loops** and iteration

## TODO Progress
- [x] TODO 1: Caffeine Level Calculator - ✅ Complete
- [x] TODO 2: Order Fulfillment Checker - ✅ Complete
- [x] TODO 3: Drink Name Generator - ✅ Complete

## Author
Miguel Pinto - Week 2 Kotlin Assignment


