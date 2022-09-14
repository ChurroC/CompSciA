public class Influencer {
    private int numFollowers, numFollowing, latestPostLikes;
    private String titleOfLastPost, username;

    public Influencer(String usernameInput) {
        username = usernameInput;
    }
    public Influencer(String usernameInput, int numFollowersInput) {
        username = usernameInput;
        numFollowers = numFollowersInput;
    }
    public Influencer(String usernameInput, int numFollowersInput, int numFollowingInput) {
        username = usernameInput;
        numFollowers = numFollowersInput;
        numFollowing = numFollowingInput;
    }
}