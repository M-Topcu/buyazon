package com.eshop.buyazon.controller;

import com.eshop.buyazon.dto.UrunKayitIstegi;
import com.eshop.buyazon.service.UrunService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/urun")
@AllArgsConstructor
public class UrunController {


    private UrunService urunService;

    @PostMapping
    public ResponseEntity<String> urunKaydet(@PathVariable @Valid @RequestBody UrunKayitIstegi urunKayitIstegi){

        urunService.urunKaydet(urunKayitIstegi);

        return
    }


}



