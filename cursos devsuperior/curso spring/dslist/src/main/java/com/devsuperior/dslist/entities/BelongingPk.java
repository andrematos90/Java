package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id") // Especifica o nome da coluna de junção
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id") // Especifica o nome da coluna de junção
    private GameList list;

    public BelongingPk() {

    }

    public BelongingPk(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPk that)) return false;
        return Objects.equals(getGame(), that.getGame()) && Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGame(), getList());
    }
}


/*OBS:
@ManyToOne
frequentemente utilizada em conjunto com outras anotações para representar
um relacionamento muitos-para-um entre entidades.
 é usada para mapear o relacionamento entre Game e GameList.
  Isso indica que muitos games podem estar associados a uma unica lista de games
  O atributo cliente representa a parte "muitos" do relacionamento.


A anotação @JoinColumn em JPA é usada para especificar detalhes sobre a coluna

de junção (join column) quando há um relacionamento entre entidades.
Ela geralmente é usada em conjunto com anotações como @ManyToOne ou @OneToOne
para personalizar como as colunas de junção devem ser mapeadas no banco de dados.


@Embeddable
é usada para marcar uma classe cujos objetos serão incorporados como
 componentes de outra entidade. Ela é frequentemente usada em conjunto com
 a anotação @EmbeddedId ou @Embedded.
 */