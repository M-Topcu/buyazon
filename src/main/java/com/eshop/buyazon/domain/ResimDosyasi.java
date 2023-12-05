package com.eshop.buyazon.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Builder(toBuilder = true)
public class ResimDosyasi {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid")
    private  String id;

    private String name;

    private String type;

    private byte[] data;

    public ResimDosyasi(String name, String type,byte[] data) {
        this.name=name;
        this.type=type;
        this.data=data;
    }
}
