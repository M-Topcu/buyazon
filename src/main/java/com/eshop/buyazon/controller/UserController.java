package com.eshop.buyazon.controller;

import com.eshop.buyazon.dto.StatusResponse;
import com.eshop.buyazon.dto.UserKayitIstegi;
import com.eshop.buyazon.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    @RequestMapping("/kaydet")
    public ResponseEntity<StatusResponse> userKaydet(@Valid @RequestBody UserKayitIstegi userKayitIstegi) {

        userService.userKaydet(userKayitIstegi);

        StatusResponse response=new StatusResponse();
        response.setMessage("Urun Kaydedildi");
        response.setSuccess(true);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }



}
