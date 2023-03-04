package com.juju.todayit.domain.user.userinfo;

import com.juju.todayit.domain.daily.DailyMeal;
import com.juju.todayit.domain.daily.DailySupplement;
import com.juju.todayit.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 사용자가 설정한 영양제 섭취량(기준)
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

  private int target_count;

  @OneToMany(mappedBy = "user_supplement", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<DailySupplement> dailySupplementList = new ArrayList<>();
}
