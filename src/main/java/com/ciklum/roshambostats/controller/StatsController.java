package com.ciklum.roshambostats.controller;


import com.ciklum.roshambostats.model.Stats;
import com.ciklum.roshambostats.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatsController
{

  @Autowired
  StatsService statsService;

  @GetMapping("/stats")
  public ResponseEntity<Stats> stats() {
    return ResponseEntity.ok(statsService.getStats());
  }

  @GetMapping("/incrementp1")
  public ResponseEntity incrementP1Wins() {
    statsService.incrementP1Wins();
    return ResponseEntity.ok().build();
  }

  @GetMapping("/incrementp2")
  public ResponseEntity incrementP2Wins() {
    statsService.incrementP2Wins();
    return ResponseEntity.ok().build();
  }

  @GetMapping("/incrementdraw")
  public ResponseEntity incrementDraw() {
    statsService.incrementDraws();
    return ResponseEntity.ok().build();
  }

  @GetMapping("/incrementtotal")
  public ResponseEntity incrementTotal() {
    statsService.incrementTotalRoundsPlayed();
    return ResponseEntity.ok().build();
  }
}
