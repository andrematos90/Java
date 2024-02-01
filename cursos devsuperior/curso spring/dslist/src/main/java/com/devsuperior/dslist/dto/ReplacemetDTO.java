// Pacote onde a classe está localizada
package com.devsuperior.dslist.dto;

// Definição de uma classe DTO (Objeto de Transferência de Dados) chamada ReplacemetDTO
public class ReplacemetDTO {

    // Atributo para armazenar o índice de origem
    private Integer sourceIndex;

    // Atributo para armazenar o índice de destino
    private Integer destinationIndex;


    // Método para obter o índice de origem
    public Integer getSourceIndex() {
        return sourceIndex;
    }

    // Método para definir o índice de origem
    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    // Método para obter o índice de destino
    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    // Método para definir o índice de destino
    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
