package com.example.helio.android_praticas;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by helio on 05/11/2017.
 */

public class Estudante implements Serializable {

    private String nome;
    private String telefone;
    private String curso;
    private String disciplina;

    public Estudante(String nome, String telefone, String curso, String disciplina) {
        this.nome = nome;
        this.telefone = telefone;
        this.curso = curso;
        this.disciplina = disciplina;
    }

    protected Estudante(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        curso = in.readString();
        disciplina = in.readString();
    }

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return nome + " : " + telefone + " : " + curso + " : " + disciplina;
    }
}
