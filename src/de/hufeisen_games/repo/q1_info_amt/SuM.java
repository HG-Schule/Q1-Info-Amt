package de.hufeisen_games.repo.q1_info_amt;

public class SuM {

    public static void main(String[] args) {

        Essensausgabe essensausgabe = new Essensausgabe();

        essensausgabe.biberAnstellen(new Biber("groß"));
        essensausgabe.biberAnstellen(new Biber("klein"));
        essensausgabe.biberAnstellen(new Biber("groß"));
        essensausgabe.biberAnstellen(new Biber("groß"));

        essensausgabe.tellerStapeln(new Teller("groß"));
        essensausgabe.tellerStapeln(new Teller("groß"));
        essensausgabe.tellerStapeln(new Teller("klein"));
        essensausgabe.tellerStapeln(new Teller("groß"));

        essensausgabe.biberWollenTeller();
    }

}
