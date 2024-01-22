package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name="tb_gameList")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String name;

    public GameList() {

    }

    public GameList(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //comparam por id se um gamelist é igual a outro


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameList gameList)) return false;
        return getId() == gameList.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
