/*ProdutoModel é a entidade do banco de dados é que sera comunicado entre o service
e o repository,
 entre o service e qualquer outra camada é usado o DTO/*
 */

package com.aula.projeto.model;


import jakarta.persistence.*;



@Entity
@Table(name = "products")
public class ProdutoModel {
    @Id // transforma esse campo em primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // gera ids automaticamente
    private Integer id;
    private String nomeProduto;
    private Integer quantidade;
    private double valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
