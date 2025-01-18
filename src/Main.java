package src;
public class MyApplication {
    public static void main(String[] args) {
        // Create Employees and Students
        List<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Engineer", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.8));


        // Print Data
        printData(people);
    }

    public static void printData(Iterable<Payable> iterable) {
        for (Payable payable : iterable) {
            Person person = (Person) payable;
            System.out.printf("%s earns %.2f tenge%n", person.toString(), payable.getPaymentAmount());
        }
    }
}