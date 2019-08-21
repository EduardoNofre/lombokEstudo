package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.Builder;

/*
Podemos utilizar o padrão de projeto builder que é ideal nesse tipo de situação, ele vai nos prover uma
maneira de criar objetos sem precisarmos de construtores e sem métodos setters em nossas classes.
Para que o Lombok gere o código para a gente basta adicionar a anotação @Builder no topo da classe.
 */

@Builder
public class BuilderComLombok {

    private String nome;
    private String telefone;
    private int idade;
}
