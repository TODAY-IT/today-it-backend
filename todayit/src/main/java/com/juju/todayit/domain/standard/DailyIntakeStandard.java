package com.juju.todayit.domain.standard;

import com.juju.todayit.domain.user.User;
import com.juju.todayit.domain.utils.embedded.NutritionFacts;
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

  @Embedded
  private NutritionFacts nutritionFacts;

  private Long userId;

  @OneToMany(mappedBy = "dailyIntakeStandard", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<User> userList = new ArrayList<>();
}
