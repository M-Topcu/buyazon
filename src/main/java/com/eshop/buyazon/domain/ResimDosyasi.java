package com.eshop.buyazon.domain;


import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder(toBuilder = true)
public class ResimDosyasi {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private  String id;

    private String name;

    private String type;

    private byte[] data;

    /*
    public ResimDosyasi(String name, String type,byte[] data) {
        this.name=name;
        this.type=type;
        this.data=data;
    }
     */
}
