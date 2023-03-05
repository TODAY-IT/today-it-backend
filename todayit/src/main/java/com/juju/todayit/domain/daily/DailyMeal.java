package com.juju.todayit.domain.daily;

import com.juju.todayit.domain.mealinfo.MealNutritionFacts;
import com.juju.todayit.domain.user.User;
import com.juju.todayit.domain.utils.enums.MealType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "daily_meal")
public class DailyMeal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  private String image;

  @Enumerated(EnumType.STRING)
  private MealType mealType;

  private LocalDateTime mealDatetime;

  @OneToOne
  @JoinColumn(name = "meal_nutrition_facts_id")
  private MealNutritionFacts mealNutritionFacts;
}
