
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 1; i <= 10; i++)
        {
            employees.add(new Employee(i, "name" + i));
        }
        System.out.println(employees);

        try
        {
            FileWriter myWriter = new FileWriter("names.txt");
            for (Employee e: employees) {
                myWriter.write(e.toString());
            }
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
