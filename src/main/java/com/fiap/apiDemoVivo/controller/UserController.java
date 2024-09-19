package com.fiap.apiDemoVivo.controller;

import com.fiap.apiDemoVivo.model.UserModel;
import com.fiap.apiDemoVivo.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    @Autowired
	public UserRepository userRepository;

    @GetMapping(value = "/users/{id}/products")
    @Operation(summary = "Retorna os produtos contratados de um cliente")
    @ApiResponse(
            responseCode = "200",
            description = "Sucesso"
    )
    public ResponseEntity<UserModel> findById(@PathVariable("id") long id) {
        return new ResponseEntity(userRepository.findById(id).get(), HttpStatus.OK);
    }


}