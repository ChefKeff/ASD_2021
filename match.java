class Match {
    private String requesterID;
    private String responderID;

    public Match(String requesterID, String responderID) {
        this.requesterID = requesterID;
        this.responderID = responderID; 
    }
}

public boolean isMatch() {
    return true;
}

public boolean assignRequest() {
    return true;
}

public String writeFeedback() {
    return "";
}

public boolean blockUser() {
    return true; 
}