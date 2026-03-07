class Car_details
{
    int car_cost;
    String car_model_name;
    String car_type;

    Car_details(int car_cost, String car_model_name, String car_type)
    {
        this.car_cost = car_cost;
        this.car_model_name = car_model_name;
        this.car_type = car_type;
    }

    public static void main(String[] args)
    {
        Car_details c1 = new Car_details(800000,"Swift","Petrol");

        System.out.println("Car model name is " + c1.car_model_name);
        System.out.println("Car type is " + c1.car_type);
        System.out.println("Car cost is " + c1.car_cost);
    }
}



class School_details
{
    String school_name;
    String school_grade;
    int school_strength;

    School_details(String school_name, String school_grade, int school_strength)
    {
        this.school_name = school_name;
        this.school_grade = school_grade;
        this.school_strength = school_strength;
    }

    public static void main(String[] args)
    {
        School_details s1 = new School_details("Vidya School","A",1200);

        System.out.println("School name is " + s1.school_name);
        System.out.println("School grade is " + s1.school_grade);
        System.out.println("School strength is " + s1.school_strength);
    }
}


class TV_details
{
    int tv_cost;
    String tv_brand;
    String tv_type;

    TV_details(int tv_cost,String tv_brand,String tv_type)
    {
        this.tv_cost = tv_cost;
        this.tv_brand = tv_brand;
        this.tv_type = tv_type;
    }

    public static void main(String[] args)
    {
        TV_details t1 = new TV_details(45000,"Samsung","LED");

        System.out.println("TV brand is " + t1.tv_brand);
        System.out.println("TV type is " + t1.tv_type);
        System.out.println("TV cost is " + t1.tv_cost);
    }
}




class Bike_details
{
    int bike_cost;
    String bike_brand;
    String bike_color;

    Bike_details(int bike_cost,String bike_brand,String bike_color)
    {
        this.bike_cost = bike_cost;
        this.bike_brand = bike_brand;
        this.bike_color = bike_color;
    }

    public static void main(String[] args)
    {
        Bike_details b1 = new Bike_details(120000,"Yamaha","Black");

        System.out.println("Bike brand is " + b1.bike_brand);
        System.out.println("Bike color is " + b1.bike_color);
        System.out.println("Bike cost is " + b1.bike_cost);
    }
}



class Laptop_details
{
    String laptop_name;
    int laptop_cost;
    String laptop_brand;

    Laptop_details(String laptop_name,int laptop_cost,String laptop_brand)
    {
        this.laptop_name = laptop_name;
        this.laptop_cost = laptop_cost;
        this.laptop_brand = laptop_brand;
    }

    public static void main(String[] args)
    {
        Laptop_details l1 = new Laptop_details("Inspiron",65000,"Dell");

        System.out.println("Laptop name is " + l1.laptop_name);
        System.out.println("Laptop cost is " + l1.laptop_cost);
        System.out.println("Laptop brand is " + l1.laptop_brand);
    }
}



class Cloth_details
{
    String cloth_color;
    int cloth_cost;
    String cloth_size;

    Cloth_details(String cloth_color, int cloth_cost, String cloth_size)
    {
        this.cloth_color = cloth_color;
        this.cloth_cost = cloth_cost;
        this.cloth_size = cloth_size;
    }

    public static void main(String[] args)
    {
        Cloth_details c1 = new Cloth_details("Blue", 1200, "L");

        System.out.println("Cloth color is " + c1.cloth_color);
        System.out.println("Cloth cost is " + c1.cloth_cost);
        System.out.println("Cloth size is " + c1.cloth_size);
    }
}


class Employee_details
{
    int emp_id;
    double emp_sal;
    String emp_grade;

    Employee_details(int emp_id, double emp_sal, String emp_grade)
    {
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
        this.emp_grade = emp_grade;
    }

    public static void main(String[] args)
    {
        Employee_details e1 = new Employee_details(101, 35000, "A");

        System.out.println("Employee id is " + e1.emp_id);
        System.out.println("Employee salary is " + e1.emp_sal);
        System.out.println("Employee grade is " + e1.emp_grade);
    }
}


class Home_details
{
    String home_name;
    int home_cost;
    String home_color;

    Home_details(String home_name, int home_cost, String home_color)
    {
        this.home_name = home_name;
        this.home_cost = home_cost;
        this.home_color = home_color;
    }

    public static void main(String[] args)
    {
        Home_details h1 = new Home_details("Dream Villa", 5000000, "White");

        System.out.println("Home name is " + h1.home_name);
        System.out.println("Home cost is " + h1.home_cost);
        System.out.println("Home color is " + h1.home_color);
    }
}

class Course_details
{
    String course_name;
    String univer_name;
    int exam_cost;

    Course_details(String course_name, String univer_name, int exam_cost)
    {
        this.course_name = course_name;
        this.univer_name = univer_name;
        this.exam_cost = exam_cost;
    }

    public static void main(String[] args)
    {
        Course_details c1 = new Course_details("Computer Science", "VTU", 1500);

        System.out.println("Course name is " + c1.course_name);
        System.out.println("University name is " + c1.univer_name);
        System.out.println("Exam cost is " + c1.exam_cost);
    }
}
class Mobile_details
{
    int mobile_cost;
    String mobile_color;
    String mobile_m_name;

    Mobile_details(int mobile_cost, String mobile_color, String mobile_m_name)
    {
        this.mobile_cost = mobile_cost;
        this.mobile_color = mobile_color;
        this.mobile_m_name = mobile_m_name;
    }

    public static void main(String[] args)
    {
        Mobile_details m1 = new Mobile_details(29000, "Red", "Vivo");

        System.out.println("Mobile name is " + m1.mobile_m_name);
        System.out.println("Mobile color is " + m1.mobile_color);
        System.out.println("Mobile cost is " + m1.mobile_cost);
    }
}



