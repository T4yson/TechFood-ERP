package com.techfood.legacy.solucao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Prato {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private float peso;
    private float preco;
}
