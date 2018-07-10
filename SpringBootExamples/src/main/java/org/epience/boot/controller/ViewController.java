package org.epience.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

  @GetMapping(path="/")
  public String getIndexView() {
    return "index";
  }
}
