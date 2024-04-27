package src.domain;

/**
 * Представляє сутність менеджера, яка є підкласом класу Employee.
 */
public class Manager extends Employee {

    /**
     * Створює нового менеджера з вказаним списком підлеглих працівників, ім'ям, посадою, рівнем та відділом.
     *
     * @param employees список підлеглих працівників менеджера
     * @param name      ім'я менеджера
     * @param jobTitle  посада менеджера
     * @param level     рівень менеджера
     * @param dept      відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядок, що представляє об'єкт менеджера, включаючи інформацію про його працівників.
     *
     * @return рядок із даними про менеджера та його працівників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює нового менеджера з вказаним списком підлеглих працівників.
     *
     * @param employees список підлеглих працівників менеджера
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює нового менеджера з порожнім списком підлеглих працівників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок із іменами підлеглих працівників менеджера.
     *
     * @return рядок із іменами підлеглих працівників менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих працівників менеджера.
     *
     * @param employees список підлеглих працівників менеджера
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив підлеглих працівників менеджера.
     *
     * @return масив підлеглих працівників менеджера
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

}
