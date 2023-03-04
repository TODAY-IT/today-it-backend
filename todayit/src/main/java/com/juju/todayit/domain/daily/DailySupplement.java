package com.juju.todayit.domain.daily;

import com.juju.todayit.domain.user.userinfo.UserSupplement;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "daily_supplement")
public class DailySupplement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "id", nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_supplement_id")
  private UserSupplement userSupplement;
//  private Long supplement_id;

  private LocalDate date;

  private int actualCount;
}
