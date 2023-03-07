package com.juju.todayit.supplement.dto.response;

import com.juju.todayit.domain.daily.DailySupplement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DailySupplementResponse {
  private LocalDate date;
  private int actualCount;

  public DailySupplementResponse(DailySupplement dailySupplement) {
    this.date = dailySupplement.getDate();
    this.actualCount = getActualCount();
  }

}
