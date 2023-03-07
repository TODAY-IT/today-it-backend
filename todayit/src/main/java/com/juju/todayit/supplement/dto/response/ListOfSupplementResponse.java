package com.juju.todayit.supplement.dto.response;

import com.juju.todayit.domain.user.User;
import com.juju.todayit.domain.user.userinfo.UserSupplementStandard;
import lombok.Getter;

import java.util.List;

@Getter
public class ListOfSupplementResponse {

  private List<UserSupplementStandard> list;

  public ListOfSupplementResponse(User user) {
    this.list = user.getUserSupplementStandardsList();
  }
}
