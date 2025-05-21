public class Employee extends person {
    float salary = 4000f;
    String name = "Dian";
    int age = 23;

    public Employee(String string, int i, float f) {
        // TODO Auto-generated constructor stub
    }

    public void ShowInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("age:" + super.age);
        System.out.println("Salary: $" + salary);
    }
}
