class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Insufficient funds.");
    }
}
