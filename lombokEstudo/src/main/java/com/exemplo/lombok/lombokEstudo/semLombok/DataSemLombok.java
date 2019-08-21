package com.exemplo.lombok.lombokEstudo.semLombok;

import java.util.Objects;

public class DataSemLombok {

    private String nome;

    private String telefone;

    private int idade;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataSemLombok)) return false;
        DataSemLombok that = (DataSemLombok) o;
        return getIdade() == that.getIdade() &&
                Objects.equals(getNome(), that.getNome()) &&
                Objects.equals(getTelefone(), that.getTelefone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getTelefone(), getIdade());
    }

    @Override
    public String toString() {
        return "DataSemLombok{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
