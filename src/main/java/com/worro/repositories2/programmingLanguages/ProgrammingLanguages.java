package com.worro.repositories2.programmingLanguages;

import jakarta.persistence.*;


@Entity
public class ProgrammingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String languageName;

    private int firstAppereance;

    @Column(nullable = false)
    private String inventor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public int getFirstAppereance() {
        return firstAppereance;
    }

    public void setFirstAppereance(int firstAppereance) {
        this.firstAppereance = firstAppereance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public ProgrammingLanguages(long id, String languageName, int firstAppereance, String inventor) {
        this.id = id;
        this.languageName = languageName;
        this.firstAppereance = firstAppereance;
        this.inventor = inventor;
    }
    public ProgrammingLanguages(){}
}
