package com.exemplo.lombok.lombokEstudo.semLombok;

import java.util.Objects;

public class EqualsAndHashCodeSemLombok {

    private String nome;

    private String telefone;

    private int idade;

    private BeanSimplesSemLombok beanSimplesSemLombok;

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

    public BeanSimplesSemLombok getBeanSimplesSemLombok() {
        return beanSimplesSemLombok;
    }

    public void setBeanSimplesSemLombok(BeanSimplesSemLombok beanSimplesSemLombok) {
        this.beanSimplesSemLombok = beanSimplesSemLombok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EqualsAndHashCodeSemLombok)) return false;
        EqualsAndHashCodeSemLombok that = (EqualsAndHashCodeSemLombok) o;
        return idade == that.idade &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(telefone, that.telefone) &&
                Objects.equals(beanSimplesSemLombok, that.beanSimplesSemLombok);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, idade, beanSimplesSemLombok);
    }
}
