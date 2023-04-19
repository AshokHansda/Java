import java.util.Scanner;
import java.util.TreeSet;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("TreeSet: " + numbers);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        boolean isPresent = numbers.contains(searchNumber);
        System.out.println("Number " + searchNumber + " is" + (isPresent ? " " : " not ") + "present in the list");
        System.out.print("Enter an element to remove: ");
        int removeNumber = scanner.nextInt();
        boolean isRemoved = numbers.remove(removeNumber);
        System.out.println("Number " + removeNumber + (isRemoved ? " was " : " was not ") + "removed from the list");
        System.out.println("Updated TreeSet: " + numbers);}}
