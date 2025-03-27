import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Question 1: Convert list of strings to uppercase using map()
class ConvertToUpperCase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}

// Question 2: Filter non-empty strings from a list
class FilterNonEmptyStrings {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Non-empty Strings: " + nonEmptyStrings);
    }
}

// Question 3: Filter students whose names start with 'A'
class FilterStudentsWithA {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anna", "David", "Alex", "Eve", "Ava", "John");
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Students with names starting with 'A': " + studentsWithA);
    }
}

// Question 4: Calculate age based on birthdate
class CalculateAge {
    public static void main(String[] args) {
        String birthDateString = "1990-05-15";
        LocalDate birthDate = LocalDate.parse(birthDateString);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
    }
}
