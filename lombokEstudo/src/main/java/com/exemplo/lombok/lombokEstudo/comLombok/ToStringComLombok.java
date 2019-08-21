package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/*
Não há mais necessidade de iniciar um debugger para ver os campos. Basta deixar que o lombok gere o toString()
 */
@Getter
@Setter
@ToString
public class ToStringComLombok {

    private String nome;

    private String telefone;

    private int idade;
}
