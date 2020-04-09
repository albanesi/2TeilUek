package ch.lambdaCourse.lambdaprojects;

public class User {
    private int salary;

    public User(int s){
    salary=s;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
