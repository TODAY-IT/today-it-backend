package com.juju.todayit.domain.user;

import com.juju.todayit.domain.daily.DailyBloodSugar;
import com.juju.todayit.domain.daily.DailyMeal;
import com.juju.todayit.domain.standard.DailyIntakeStandard;
import com.juju.todayit.domain.user.userinfo.UserDisease;
import com.juju.todayit.domain.user.userinfo.UserSupplementStandard;
import com.juju.todayit.domain.utils.enums.Gender;
import com.juju.todayit.domain.utils.enums.PurposeOfUse;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private Long id;

  private String kakaoId;

  private String name;

  private int age;

  private double height;

  private double weight;

  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Enumerated(EnumType.STRING)
  private PurposeOfUse purpose;

  @ManyToOne
  @JoinColumn(name = "daily_intake_standard_id")
  private DailyIntakeStandard dailyIntakeStandard;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<DailyBloodSugar> bloodSugarList = new ArrayList<>();

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserDisease> userDiseaseList = new ArrayList<>();

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<DailyMeal> dailyMealList = new ArrayList<>();

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserSupplementStandard> userSupplementList = new ArrayList<>();
}
