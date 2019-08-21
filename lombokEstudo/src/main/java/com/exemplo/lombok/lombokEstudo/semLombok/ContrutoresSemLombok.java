package com.exemplo.lombok.lombokEstudo.semLombok;

import com.exemplo.lombok.lombokEstudo.comLombok.BeanSimplesComLombok;

public class ContrutoresSemLombok {

    public ContrutoresSemLombok() {
    }

    public ContrutoresSemLombok(String nome, String telefone, int idade, ContrutoresSemLombok contrutoresSemLombok) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.contrutoresSemLombok = contrutoresSemLombok;
    }

    private String nome;

    private String telefone;

    private int idade;

    private ContrutoresSemLombok contrutoresSemLombok;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ContrutoresSemLombok getContrutoresSemLombok() {
        return contrutoresSemLombok;
    }

    public void setContrutoresSemLombok(ContrutoresSemLombok contrutoresSemLombok) {
        this.contrutoresSemLombok = contrutoresSemLombok;
    }
}
