package Tuluyen;

public class Customer {
    private long id;
    private String fristName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private int age;

    public void setId(long id) {
        this.id = id;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public long getId() {
        return id;
    }
}


