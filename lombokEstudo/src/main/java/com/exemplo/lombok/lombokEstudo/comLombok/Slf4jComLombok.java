package com.exemplo.lombok.lombokEstudo.comLombok;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/*
Isso é tão comum que os desenvolvedores do Lombok se preocuparam em simplificá-lo para nós:
 */
@Slf4j
public class Slf4jComLombok {
	
	
    // Existem outras anotações para log falta testar @Log e @CommonsLog

    public  void logTeste(){
        log.info("teste");
    }
}
