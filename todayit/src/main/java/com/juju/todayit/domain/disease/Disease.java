package com.juju.todayit.domain.disease;

import com.juju.todayit.domain.user.userinfo.UserDisease;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "disease")
public class Disease {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "disease", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<UserDisease> userDiseaseList = new ArrayList<>();
  // userDisease의 user TODO:
}
