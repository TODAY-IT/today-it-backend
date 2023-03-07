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

//  @Enumerated(EnumType.STRING)
//  private MealType mealType;
  private String mealType;
  // 근데 어차피 mealType을 디비에 저장할 때는 enum값중 하나만 넣을거니까 이렇게 둬야하지 않나? 라는 생각이....

  private LocalDateTime mealDatetime;

  @OneToOne
  @JoinColumn(name = "meal_nutrition_facts_id")
  private MealNutritionFacts mealNutritionFacts;
}
