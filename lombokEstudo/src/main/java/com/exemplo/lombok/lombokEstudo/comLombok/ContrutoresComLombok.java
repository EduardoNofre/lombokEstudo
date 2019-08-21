package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// construtor default
@NoArgsConstructor
// construtor com argumentos
@AllArgsConstructor
@Getter
@Setter
public class ContrutoresComLombok {

    private String nome;

    private String telefone;

    private int idade;

    private ContrutoresComLombok contrutoresComLombok;
}
