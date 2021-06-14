import enums.Gender;

import java.util.Objects;

public class User implements Comparable<User> {

    private static int userCounter = 0;

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    //    private boolean isAdult;
    private Gender gender;

    public User(String firstName, String lastName, String email, int age, Gender gender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        userCounter++;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Incorrect email address");
        } else {
            this.email = email;
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public boolean isAdult() {
//        return isAdult;
//    }
//
//    public void setAdult(boolean adult) {
//        isAdult = adult;
//    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
//                ", isAdult=" + isAdult +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
//                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, gender);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.getLastName());
        }
        return compareResult;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
