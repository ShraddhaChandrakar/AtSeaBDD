package RestPractice.Pojo;

public class CreateUserBody {

    String customerId;
    String name;
    String address;
    String email;
    String phone;
    String username;
    String password;
    String enabled;
    String role;

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEnabled() {
        return enabled;
    }

    public String getRole() {
        return role;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
                "customerId:'" + customerId + '\'' +
                ", name:'" + name + '\'' +
                ", address:'" + address + '\'' +
                ", email:'" + email + '\'' +
                ", phone:'" + phone + '\'' +
                ", username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                ", enabled:'" + enabled + '\'' +
                ", role:'" + role + '\'' +
                '}';
    }
}
