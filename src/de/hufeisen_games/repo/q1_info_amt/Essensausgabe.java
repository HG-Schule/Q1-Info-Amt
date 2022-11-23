package de.hufeisen_games.repo.q1_info_amt;

import de.hufeisen_games.repo.q1_info_amt.utils.Queue;
import de.hufeisen_games.repo.q1_info_amt.utils.Stack;

public class Essensausgabe {


    private boolean passend = true;

    private Queue<Biber> biberQueue;
    private Stack<Teller> tellerStack;

    public Essensausgabe() {

        this.biberQueue = new Queue<>();
        this.tellerStack = new Stack<>();

    }

    public void biberAnstellen(Biber biber) {
        biberQueue.enqueue(biber);
    }

    public void tellerStapeln(Teller teller) {
        tellerStack.push(teller);
    }

    public void biberWollenTeller() {

        while ((!tellerStack.isEmpty() && !biberQueue.isEmpty()) && passend) {
            ueberpruefePassend();
        }

        if(tellerStack.isEmpty() && !biberQueue.isEmpty()) {
            System.out.println("\u001B[31mLeider gibt es nicht genügend Teller auf dem Tellerstapel :(\u001B[0m");
            return;
        } else if(!tellerStack.isEmpty() && biberQueue.isEmpty()) {
            System.out.println("\u001B[33mEs sind immer noch Teller auf dem Stapel!\u001B[0m");
        }

        if(passend) System.out.println("\u001B[32mAlle Biber haben einen passenden Teller bekommen :)\u001B[0m");
        else System.out.println("\u001B[31mEs haben nicht alle Biber einen passenden Teller erhalten.\u001B[0m");

    }

    public void ueberpruefePassend() {

        if(biberQueue.front().getGroesse().equals(tellerStack.top().getGroesse())) {
            System.out.println("Der erste Biber in der Queue hat einen passenden Teller und geht!");
            biberQueue.dequeue();
            tellerStack.pop();
        } else {
            System.out.println("\u001B[31mDer erste Biber in der Queue hat keinen passenden Teller :(\u001B[0m");
            passend = false;
        }

    }


}
