package com.exemplo.lombok.lombokEstudo.comLombok;

import com.exemplo.lombok.lombokEstudo.semLombok.BeanSimplesSemLombok;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
	Método equals e hashCode são gerados automaticamente para os campos do objeto de forma fácil e simples
 */
@Getter
@Setter
@EqualsAndHashCode
public class EqualsAndHashCodeComLombok {

    private String nome;

    private String telefone;

    private int idade;

    private BeanSimplesSemLombok beanSimplesSemLombok;
}
