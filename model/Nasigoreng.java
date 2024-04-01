package model;

public class Nasigoreng implements Menu {
    private double quantity;

    public Nasigoreng(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        return quantity * 10000;
    }
}
