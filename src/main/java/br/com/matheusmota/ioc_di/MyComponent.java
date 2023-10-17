package br.com.matheusmota.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MyComponent {
  private String message;

  public MyComponent() {
    this.message = "Teste";
  }

  public String call() {
    return this.message;
  }
}
