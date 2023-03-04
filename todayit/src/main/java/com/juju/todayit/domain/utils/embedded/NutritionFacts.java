package com.juju.todayit.domain.utils.embedded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NutritionFacts {
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
