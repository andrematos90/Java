package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Objects;


public class GameDTO {

    //PROPRIEDADES

    private Long id;
    private String title;

    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;


    private String shortDescription;


    private String longDescription;

    //MÉTODO CONSTRUTOR SEM PARAMETROS DE ENTRADA
    public GameDTO() {
    }

    //MÉTODO CONSTRUTOR COM PARAMETROS DE ENTRADA
    public GameDTO(Game entity) {
        /*
        pode se setar cada propriedade como em:
        GameMinDTO(Game entity) {
        this.id = entity.getId();
        title = entity.getTitle()
        por exempplo ou utilizar a classe BeanUtils
         passando a entidade que sera copiada
        e para onde. tambem e necessaario os getter e setters
        * */
        BeanUtils.copyProperties(entity, this);
    }

    //MÉTODOS GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    //MÉTODOS HASCODE E EQUALS PARA COMPARAR DOIS GAMES PELO ID

}
