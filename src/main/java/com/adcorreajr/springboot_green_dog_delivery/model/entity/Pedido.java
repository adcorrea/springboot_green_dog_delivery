package com.adcorreajr.springboot_green_dog_delivery.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = true)
    private Cliente cliente;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Item> itens = new ArrayList<Item>();

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date data;

    @Min(1)
    private Double valorTotal;

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", cliente=" + cliente + ", itens=" + itens + ", data=" + data + ", valorTotal=" + valorTotal + "]";
    }


}
