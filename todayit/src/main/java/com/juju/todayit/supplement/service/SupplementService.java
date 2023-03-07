package com.juju.todayit.supplement.service;

import com.juju.todayit.domain.daily.DailySupplement;
import com.juju.todayit.domain.user.User;
import com.juju.todayit.domain.user.userinfo.UserSupplementStandard;
import com.juju.todayit.repository.user.UserRepository;
import com.juju.todayit.supplement.dto.request.DailySupplementRequest;
import com.juju.todayit.supplement.dto.request.SupplementRecordRequest;
import com.juju.todayit.supplement.dto.request.SupplementRegisterRequest;
import com.juju.todayit.supplement.dto.response.DailySupplementResponse;
import com.juju.todayit.supplement.dto.response.ListOfSupplementResponse;
import com.juju.todayit.supplement.repository.DailySupplementRepository;
import com.juju.todayit.supplement.repository.SupplementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplementService {
  private final SupplementRepository supplementRepository;
  private final DailySupplementRepository dailySupplementRepository;
  private final UserRepository userRepository;

  public SupplementService(SupplementRepository supplementRepository, DailySupplementRepository dailySupplementRepository, UserRepository userRepository) {
    this.supplementRepository = supplementRepository;
    this.dailySupplementRepository = dailySupplementRepository;
    this.userRepository = userRepository;
  }

//  public SupplementService(SupplementRepository supplementRepository) {
//    this.supplementRepository = supplementRepository;
//  }

  public void registerSupplement(SupplementRegisterRequest request) {
    supplementRepository.save(new UserSupplementStandard(request.getName(), request.getUser(), request.getTargetCount()));
  }

  public void recordSupplement(SupplementRecordRequest request) {
    dailySupplementRepository.save(new DailySupplement());
  }

  public ListOfSupplementResponse listOfUserSupplement(long userId) {
    User user = userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
    return new ListOfSupplementResponse(user);
  }

  public DailySupplementResponse reportOfDailySupplement(DailySupplementRequest request) {
    DailySupplement dailySupplement = dailySupplementRepository.findByDate(request.getDate())
            .orElseThrow(IllegalArgumentException::new);
    return new DailySupplementResponse(dailySupplement);
  // TODO: 만약에 등록 안하면 어떻게 되는 거지?
  }
}
