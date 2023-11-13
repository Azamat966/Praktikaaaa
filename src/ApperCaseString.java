import java.text.Format;

public class ApperCaseString implements Formater {

    @Override
    public String format(String input) {

        return input.toUpperCase();

    }
    static class LowerCaseFormat implements Formater {


        @Override
        public String format(String input) {
            return input.toLowerCase();
        }
    }
    }
