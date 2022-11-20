package com.adcorreajr.springboot_green_dog_delivery.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30,
            message="O tamanho do nome deve ser entre {min} e {max} caracteres")
    private String nome;

    @NotNull
    @Min(value=20,message="O valor mínimo deve ser {value} reais")
    private Double preco;

    @Override
    public String toString() {
        return "Item [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }


}
