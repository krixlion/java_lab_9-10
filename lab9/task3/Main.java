public class Main {
    public static void main(String[] args) {
        Account account = new Account("Konstanty Cyran", 500, "98765430000212983629746");

        try {
            account.transfer(60000000);
        } catch (NotEnoughMoneyException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}
