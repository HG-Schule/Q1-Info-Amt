package de.hufeisen_games.repo.q1_info_amt;

public class SuM {

    public static void main(String[] args) {

        Buero buero = new Buero();

        buero.hintenAnstellen(new Buero.Person("Test"));

        buero.einlassen();

        buero.sprechstundeBeenden();

    }

}
