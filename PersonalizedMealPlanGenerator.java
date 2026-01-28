// MealPlan interface
interface MealPlan {
    String getMealType();
}

// Meal types
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void displayMeal() {
        System.out.println("Meal Plan: " + plan.getMealType());
    }
}

// Main Program
public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> meal1 = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> meal2 = new Meal<>(new VeganMeal());

        meal1.displayMeal();
        meal2.displayMeal();
    }
}
