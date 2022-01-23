package com.ciklum.roshambostats.service.impl;

import com.ciklum.roshambostats.model.Stats;
import com.ciklum.roshambostats.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsServiceImpl implements StatsService {

  @Autowired
  Stats stats;

  @Override
  public void incrementTotalRoundsPlayed() {
    stats.getTotalRoundsPlayed().incrementAndGet();
  }

  @Override
  public void incrementP2Wins() {
    stats.getTotalWinsP2().incrementAndGet();
  }

  @Override
  public void incrementDraws() {
    stats.getTotalDraws().incrementAndGet();
  }

  @Override
  public void incrementP1Wins() {
    stats.getTotalWinsP1().incrementAndGet();
  }

  @Override
  public Stats getStats() {
    return stats;
  }
}
