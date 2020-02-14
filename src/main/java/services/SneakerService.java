package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {
    private static int nextId = 1;  // (1)


    public static ArrayList<Sneaker> inventory = new ArrayList<>();  // (2)

    // (1)
    public static Sneaker create(String name, String brand, String sport, int quantity, float price) {

        // (2)
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, quantity, price);

        // (3)
        inventory.add(createdSneaker);

        // (4)
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (Sneaker.getId(inventory.get(i)) == id) {
                return inventory.get(i);
            }
        }
        return new Sneaker(0, "fake", "fake", "fake", 0, 0);


    }

    //read all
    public Sneaker findAll() {
        for (int i = 0; i < inventory.size(); i++) {
            return inventory.get(i);
        }
        return null;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        for (int i = 0; i < inventory.size(); i++) {


            if (id == Sneaker.getId(inventory.get(i))) {
                inventory.remove(i);
                return true;

            }
        }
            return false;


    }
}