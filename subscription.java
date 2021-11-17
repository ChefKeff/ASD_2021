class Subscription {
    private String[] tiers;

    public Subscription(String[] tiers) {
        this.tiers = tiers; 
    }
}

public boolean verifySubscription() {
    return true; 
}

public boolean editSubscription() {
    return true; 
}

public int getPrice(String[] tiers) {
    return 1;
}

