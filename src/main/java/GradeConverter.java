import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GradeConverter {
    public static final String PATTERN_GRADE = "([A-Za-z]+ [A-Za-z]+) (\\d+)";


    private final String input;

    public GradeConverter(String input) {
        this.input = input;
    }

    public  String convertGrades(String input) {

        Pattern regex = Pattern.compile(PATTERN_GRADE);
        Matcher matcher = regex.matcher(input);

        if (matcher.matches()) {
            String name = matcher.group(1);
            int grade = Integer.parseInt(matcher.group(2));

            if (grade >= 0 && grade <= 25) {
                return name + " - EXPEL";
            } else if (grade >= 26 && grade <= 49) {
                return name + " - COMMISSION";
            } else if (grade >= 50 && grade <= 70) {
                return name + " - SATISFACTORY";
            } else if (grade >= 71 && grade <= 87) {
                return name + " - GOOD";
            } else if (grade >= 88 && grade <= 100) {
                return name + " - EXCELLENT";
            } else {
                return "Invalid grade for " + name;
            }
        } else {
            return "Invalid input format.";
        }
    }
}
