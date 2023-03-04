package com.juju.todayit.domain.standard;

import com.juju.todayit.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "daily_intake_standard")
public class DailyIntakeStandard {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private double total_calories;

  private double carbohydrate;

  private double protein;

  private double fat;

  private double saturated_fat;

  private double trans_fat;

  private double sugars;

  private double sodium;

  private double cholesterol;

  private Long userId;

  @OneToMany(mappedBy = "dailyIntakeStandard", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<User> userList = new ArrayList<>();
}
