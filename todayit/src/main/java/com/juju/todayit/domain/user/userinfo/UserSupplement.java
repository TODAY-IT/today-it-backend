package com.juju.todayit.domain.user.userinfo;

import com.juju.todayit.domain.daily.DailyMeal;
import com.juju.todayit.domain.daily.DailySupplement;
import com.juju.todayit.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "user_supplement")
public class UserSupplement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
//  private Long user_id;

  private int targetCount;

  @OneToMany(mappedBy = "userSupplement", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<DailySupplement> dailySupplementList = new ArrayList<>();
}
