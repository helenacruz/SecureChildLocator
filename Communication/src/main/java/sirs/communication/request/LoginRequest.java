package sirs.communication.request;

public class LoginRequest extends Request
{
    private String email;
    private String password;

    public LoginRequest(String email, String password)
    {
        super("LoginRequest");
        this.email = email;
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
