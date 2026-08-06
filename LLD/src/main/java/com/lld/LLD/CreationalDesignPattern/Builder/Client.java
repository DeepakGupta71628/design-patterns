package com.lld.LLD.CreationalDesignPattern.Builder;

public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder("fullMainDish","fullSideDish","fullDrink");
        Meal fullMeal=mealBuilder.setDessert("fullDessert").setAppetizer("fullAppetizer").build();


        System.out.println("Full Meal Summary:");

        // TODO: Print the summary of the constructed full meal.
        fullMeal.printMealSummary();

    }
}
