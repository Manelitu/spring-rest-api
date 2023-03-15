package com.restapi.restapijava.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapijava.domain.model.Client;

@RestController
public class ClientController {

  @GetMapping("/clients")
  public List<Client> listar() {
    var firstClient = new Client(1L, "John", "Any@mail.com", "123456789");
    var secondClient = new Client(2L, "Mary", "AnyEmail@mail.com", "987654321");

    return Arrays.asList(firstClient, secondClient);
  }
}
