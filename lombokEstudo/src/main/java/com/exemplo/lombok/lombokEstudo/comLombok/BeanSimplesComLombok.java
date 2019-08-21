package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.Getter;
import lombok.Setter;

/*
Com estas anotações não se faz mais necessária a criação dos métodos de
recuperação e configuração das propriedades das classes.
 */
@Getter
@Setter
public class BeanSimplesComLombok {

    private String nome;
    private String telefone;
    private int idade;
    private BeanSimplesComLombok beanSimplesComLombok;

}
