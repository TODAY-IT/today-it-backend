package com.juju.todayit.supplement;

import com.juju.todayit.domain.daily.DailySupplement;
import com.juju.todayit.domain.user.userinfo.UserSupplementStandard;
import com.juju.todayit.supplement.dto.request.DailySupplementRequest;
import com.juju.todayit.supplement.dto.request.SupplementRecordRequest;
import com.juju.todayit.supplement.dto.request.SupplementRegisterRequest;
import com.juju.todayit.supplement.dto.response.DailySupplementResponse;
import com.juju.todayit.supplement.dto.response.ListOfSupplementResponse;
import com.juju.todayit.supplement.service.SupplementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplement")
public class SupplementController {
  private final SupplementService supplementService;

  public SupplementController(SupplementService supplementService) {
    this.supplementService = supplementService;
  }

  // 먹는 영양제 등록
  @PostMapping("/register")
  public void registerSupplement(@RequestBody SupplementRegisterRequest request) {
    supplementService.registerSupplement(request);
  }

  @PostMapping("/record")
  public void recordSupplement(@RequestBody SupplementRecordRequest request) {
    supplementService.recordSupplement(request);
  }

  @GetMapping("/report/list")
  public ListOfSupplementResponse listOfUserSupplement(@RequestParam long userId) {
    return supplementService.listOfUserSupplement(userId);
  }

  @GetMapping("/report/record/{date}")
  public DailySupplementResponse reportOfDailySupplement(@RequestBody DailySupplementRequest request) {
    return supplementService.reportOfDailySupplement(request);
  }
}
