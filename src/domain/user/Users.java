package domain.user;

public class Users {

    private Integer id;

    private String login;
    private String password;

    private String fullName;

    public Users() {
    }

    public Users(Integer id, String login, String password, String fullName) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
