package com.ciklum.roshambostats.service;

import com.ciklum.roshambostats.model.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {

  @Autowired
  Stats stats;

  public void incrementTotalRoundsPlayed() {
    stats.getTotalRoundsPlayed().incrementAndGet();
  }

  public void incrementP2Wins() {
    stats.getTotalWinsP2().incrementAndGet();
  }

  public void incrementDraws() {
    stats.getTotalDraws().incrementAndGet();
  }

  public void incrementP1Wins() {
    stats.getTotalWinsP1().incrementAndGet();
  }

  public Stats getStats() {
    return stats;
  }
}
