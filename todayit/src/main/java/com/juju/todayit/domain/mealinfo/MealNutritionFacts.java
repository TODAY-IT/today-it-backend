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
  private DailyMeal dailyMeal;
//  private Long daily_meal_id;

  private double total_calories;

  private double carbohydrate;

  private double protein;

  private double fat;

  private double saturated_fat;

  private double trans_fat;

  private double sugars;

  private double sodium;

  private double cholesterol;
}
