package model;

public class Indomie implements Menu {
    private double quantity;

    public Indomie(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        return quantity * 3000;
    }
}
