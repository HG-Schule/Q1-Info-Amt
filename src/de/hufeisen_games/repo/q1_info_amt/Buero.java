package de.hufeisen_games.repo.q1_info_amt;

import java.util.LinkedList;
import java.util.Queue;

public class Buero {

    private Queue<Person> queue;

    public Buero() {
        this.queue = new LinkedList<>();
    }

    public void hintenAnstellen(Person person) {

        queue.add(person);

    }

    public void einlassen() {

        queue.remove();

    }

    public void sprechstundeBeenden() {

        queue.clear();

    }

    public static class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
