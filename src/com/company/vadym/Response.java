package com.company.vadym;

public class Response {

    private int country_id;
    private String country_name;
    private int league_id;
    private String league_name;

    public Response(int country_id, String country_name, int league_id, String league_name) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.league_id = league_id;
        this.league_name = league_name;
    }

    @Override
    public String toString() {
        return "Response{" +
                "country_id=" + country_id +
                ", country_name='" + country_name + '\'' +
                ", league_id=" + league_id +
                ", league_name='" + league_name + '\'' +
                '}';
    }

}
