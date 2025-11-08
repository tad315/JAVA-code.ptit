public class User {
    private String userName;
    private String passWord;
    private int successCnt;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.successCnt = 0;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getSuccessCnt() {
        return successCnt;
    }

    public void increaseSuccessCnt() {
        this.successCnt++;
    }

    public boolean check(String u, String p) {
        return this.userName.equals(u) && this.passWord.equals(p);
    }
}
