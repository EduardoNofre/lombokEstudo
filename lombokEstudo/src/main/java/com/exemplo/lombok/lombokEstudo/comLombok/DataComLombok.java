package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.Data;

/*
Todos juntos agora: Um atalho para @ToString, @EqualsAndHashCode,@Getter em todos os campos, e @Setter
em todos os campos não-finais. Você ainda pode obter um construtor livre para inicializar seus campos finals!
 */
@Data
public class DataComLombok {

    private String nome;
    private String telefone;
    private int idade;
    private DataComLombok dataComLombok;

}
