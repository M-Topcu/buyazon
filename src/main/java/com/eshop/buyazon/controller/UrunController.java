package com.eshop.buyazon.controller;

import com.eshop.buyazon.dto.StatusResponse;
import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.service.UrunService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/urun")
@AllArgsConstructor
public class UrunController {


    private UrunService urunService;

    @PostMapping
    public ResponseEntity<StatusResponse> urunKaydet(@Valid @RequestBody UrunKayitIstegi urunKayitIstegi) {

        urunService.urunKaydet(urunKayitIstegi);

        StatusResponse response=new StatusResponse();
        response.setMesage("Urun Kaydedildi");
        response.setSuccess(true);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}



