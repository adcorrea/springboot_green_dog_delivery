package com.adcorreajr.springboot_green_dog_delivery.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
    private String nome;

    @NotNull
    @Length(min=2, max=300,message="O tamanho do endereço deve ser entre {min} e {max} caracteres")
    private String endereco;

    @OneToMany(mappedBy = "cliente",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    public void novoPedido (Pedido pedido){
        if(this.pedidos == null)
            this.pedidos = new ArrayList<>();

        this.pedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
    }
}
