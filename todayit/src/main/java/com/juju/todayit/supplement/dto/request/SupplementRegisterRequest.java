package com.juju.todayit.supplement.dto.request;

import com.juju.todayit.domain.user.User;
import lombok.Getter;

@Getter
public class SupplementRegisterRequest {
  private String name;
  private int targetCount;
  private User user;  // TODO: user를 알아야 그 user의 supplementlist에 넣을 수 있지 않나? 근데 user를 프엔에서 어떻게 보내주지?
}
