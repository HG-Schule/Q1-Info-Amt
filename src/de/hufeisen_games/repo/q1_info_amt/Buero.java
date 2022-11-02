package de.hufeisen_games.repo.q1_info_amt;

public class Buero {

    private Queue<Person> queue;

    public Buero() {
        this.queue = new Queue<>();
    }

    public void hintenAnstellen(Person person) {

        queue.enqueue(person);

    }

    public void einlassen() {

        queue.dequeue();

    }

    public void sprechstundeBeenden() {

        while(!queue.isEmpty()) queue.dequeue();

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
