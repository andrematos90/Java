package com.devsuperior.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {


    @EmbeddedId
    private BelongingPk id  = new BelongingPk();
    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPk getId() {
        return id;
    }

    public void setId(BelongingPk id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

/*
OBS:

@EmbeddedId é utilizada em conjunto com JPA (Java Persistence API) para representar
 uma chave primária incorporada em uma entidade. Quando uma entidade possui uma chave
  primária composta por múltiplos campos, é possível encapsular esses campos em uma
  classe auxiliar e marcá-la com @Embeddable. A classe que contém essa chave primária
   composta utiliza @EmbeddedId para indicar que a chave está incorporada na própria
    classe.
 */
