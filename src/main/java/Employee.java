public class Employee {
    private int id=0;
    private  String name;
    private double salary ;

    public  Employee (int id , String name )
    {
        this.id=id;
        this.name = name ;
        this.salary = id*1000; ;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary =salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}' + '\n';
    }
}
