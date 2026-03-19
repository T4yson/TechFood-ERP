package com.techfood.legacy.solucao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Pedido {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int prato_id;
    private String tempPreparo;

}
