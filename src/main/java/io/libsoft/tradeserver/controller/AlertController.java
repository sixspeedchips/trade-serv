package io.libsoft.tradeserver.controller;


import io.libsoft.tradeserver.model.dao.AlertRepository;
import io.libsoft.tradeserver.model.entity.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerts")
public class AlertController {


  private final AlertRepository alertRepository;

  @Autowired
  public AlertController(AlertRepository alertRepository) {
    this.alertRepository = alertRepository;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Alert> addAlert(@RequestBody Alert alert) {
    return ResponseEntity.accepted().body(alertRepository.save(alert));
  }

  @GetMapping
  public ResponseEntity<Void> connectionTest() {
    System.out.println("AlertController.connectionTest");
    return ResponseEntity.ok().build();
  }
}
