import java.util.*;

class EmployeeWarge
{
    public static void main(String arg[])
    {
        System.out.println("Welcome to EmployeeWarge..");

        Random random = new Random();
        int attendance = random.nextInt(2);

        if(attendance == 1)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}