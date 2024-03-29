package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import org.springframework.web.servlet.tags.form.TextareaTag;

import java.util.Objects;

    // anotation  @Entity configura a classe para que ela seja equivalente
// a uma tabela do bando relacional
    @Entity
// define o nome da tabela a ser criada
    @Table(name = "tb_game")
    public class Game {

        //configura o id para ser a chave primária
        @Id
        // para o id ser autoincrementado
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        //altera o nome do campo a ser criado pq a palavra year é reservada do banco de dados
        @Column(name = "game_year")
        private Integer year;
        private String genre;
        private String platforms;
        private Double score;
        private String imgUrl;
        //para que a JPA gere o campo como um texto pq nesse caso tem que ser marior que VARCHAR 255
        @Column(columnDefinition = "TEXT")
        private String shortDescription;

        //para que a JPA gere o campo como um texto pq nesse caso tem que ser marior que VARCHAR 255
        @Column(columnDefinition = "TEXT")
        private String longDescription;

        public Game() {
        }

        public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
            this.id = id;
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.platforms = platforms;
            this.score = score;
            this.imgUrl = imgUrl;
            this.shortDescription = shortDescription;
            this.longDescription = longDescription;
        }

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

        //métodos equals e hascode servem para comparar dois games, no caso através do id
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Game game)) return false;
            return Objects.equals(getId(), game.getId());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }
    }

