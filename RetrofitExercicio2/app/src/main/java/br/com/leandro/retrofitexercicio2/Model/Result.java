package br.com.leandro.retrofitexercicio2.Model;

import java.util.List;

public class Result {

    private String title;
    private int year;
    private Id ids;

    public Id getIds() {
        return ids;
    }

    public void setIds(Id ids) {
        this.ids = ids;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}


