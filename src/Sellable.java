import creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, double price) throws Exception;
}
