package br.com.matheusmota.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class FirstController {

  @GetMapping("/firstMethod/{id}")
  public String firstMethod(@PathVariable String id) {
    return "First method called with id: " + id;
  }

  @GetMapping("/secondMethod")
  public String secondMethod(@RequestParam String id) {
    return "Second method called with id: " + id;
  }

  @GetMapping("/thirdMethod")
  public String thirdMethod(@RequestParam Map<String, String> allParams) {
    return "Second method called with id: " + allParams.entrySet();
  }

  @PostMapping("/fourthMethod")
  public String fourthMethod(@RequestBody Usuario usuario) {
    return "Second method called with id: " + usuario.username();
  }

  @PostMapping("/fifthMethod")
  public String fifthMethod(@RequestHeader Map<String, String> header) {
    return "Second method called with id: " + header.get("authorization");
  }

  @PostMapping("/sixthMethod")
  public ResponseEntity<Object> sixthMethod() {
    var usuario = new Usuario("matheus", "123");
    if (usuario.username().equals("Matheus")) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuário não autorizado");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
  }

  record Usuario(String username, String password) {
  }

}
