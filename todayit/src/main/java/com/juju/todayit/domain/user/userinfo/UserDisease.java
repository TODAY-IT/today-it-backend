package com.juju.todayit.domain.user.userinfo;

import com.juju.todayit.domain.disease.Disease;
import com.juju.todayit.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user_disease")
public class UserDisease {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
//  private Long user_id;

  @ManyToOne
  @JoinColumn(name = "disease_id")
  private Disease disease;
//  private Long disease_id;
}
