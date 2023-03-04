package com.juju.todayit.domain.mealinfo;

import com.juju.todayit.domain.daily.DailyMeal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "meal_nutrition_facts")
public class MealNutritionFacts {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(mappedBy = "mealNutritionFacts")
  @JoinColumn(name = "daily_meal_id")
  private DailyMeal dailyMeal;

  private double totalCalories;

  private double carbohydrate;

  private double protein;

  private double fat;

  private double saturatedFat;

  private double transFat;

  private double sugars;

  private double sodium;

  private double cholesterol;
}
