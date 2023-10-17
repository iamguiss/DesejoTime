package br.com.etecia.desejotime;

public class Api {

    private static final String ROOT_URL = "http://localhost/WistList/v1/api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createDesejos";
    public static final String URL_READ_HEROES = ROOT_URL + "getDesejos";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehDesejos";
    public static final String URL_DELETE_HERO = ROOT_URL + "deleteDesejos&id=";
}