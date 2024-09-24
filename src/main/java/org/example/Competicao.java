package org.example;

import java.util.ArrayList;

public class Competicao {
    private String nome, cidade;
    private ArrayList<Atleta> competidores = new ArrayList<Atleta>();

    public Competicao() {
        nome = "A";
        cidade = "B";
    }

    public Competicao(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Competicao clone(){
        Competicao n = new Competicao();
        n.setNome(getNome());
        n.setCidade(getCidade());
        n.setCompetidores(getCompetidores());
        return n;
    }
    
    public int compareTo(Competicao o){
        if (getCompetidores().size() > o.getCompetidores().size())
            return 1;
        else if (getCompetidores().size() == o.getCompetidores().size())
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return getNome()+ " " + getCidade() + " " + competidores.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Atleta> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(ArrayList<Atleta> competidores) {
        this.competidores = competidores;
    }
}
