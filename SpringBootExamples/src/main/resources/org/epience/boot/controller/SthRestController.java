package org.epience.boot.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SthRestController {

  @PostMapping(value="/", consumes={"application/json"})
  public ResponseEntity<Map<String, Object>> sthPrint(@RequestBody Map<String, Object> param) {

      System.out.println("Request Received Successfully!"); 

      param.entrySet().stream()
        .forEach(map -> System.out.println(map.getKey() + " : " + map.getValue()));

      return new ResponseEntity<Map<String, Object>>(param, HttpStatus.OK);
  }
}
