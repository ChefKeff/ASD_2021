class User {
    private String userID;
    private String[] requests; 
    private String[] matches; 
    private String[] leftSwipes; 
    private int ssn; 
    private int userHeuristic; 


    public User(String userID, int ssn) {
        this.userID = userID;
        this.requests = [];
        this.matches = [];
        this.leftSwipes = [];
        this.ssn = ssn;
        this.userHeuristic = 0; 
    }
}

public boolean logIn() {
    return true; 
}

public boolean deleteUser() {
    return true;
}

public String[] getProfileInfo() {
    return [];
} 

public string[] getPreferences() {
    return [];
}