package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import org.springframework.beans.BeanUtils;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO() {}

    //intancia um objeto dto copiando os dados da classe Game
    public GameMinDTO(Game entity) {
        this.id = entity.getId(); // id de Game é salvo no id de GameMinDto
        title = entity.getTitle(); // o uso do this nao é necessasrio pois nao possuia ambiguidade no nomes
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    //copoas os dados como no método contrutor acima mas o paramtro recebido é GameMinProjection
    public GameMinDTO(GameMinProjection projection) {
        BeanUtils.copyProperties(projection, this);
    }

    //apenas os métodos getters sao necessarios no dto
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getShortDescription() {
        return shortDescription;
    }


}
