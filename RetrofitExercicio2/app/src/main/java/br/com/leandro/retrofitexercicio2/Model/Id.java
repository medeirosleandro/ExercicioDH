package br.com.leandro.retrofitexercicio2.Model;

public class Id {

    public int trakt;
    public String slug;
    public String imdb;
    public int tmdb;

    public Id(int trakt, String slug, String imdb, int tmdb) {
        this.trakt = trakt;
        this.slug = slug;
        this.imdb = imdb;
        this.tmdb = tmdb;
    }

    public int getTrakt() {
        return trakt;
    }

    public void setTrakt(int trakt) {
        this.trakt = trakt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public int getTmdb() {
        return tmdb;
    }

    public void setTmdb(int tmdb) {
        this.tmdb = tmdb;
    }
}
