package com.juju.todayit.domain.mealinfo;

import com.juju.todayit.domain.daily.DailyMeal;
import com.juju.todayit.domain.utils.embedded.NutritionFacts;
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

  @Embedded
  private NutritionFacts nutritionFacts;
}
