package ReqresTests;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class EqualToIgnoringCaseAndWhitespace extends TypeSafeMatcher<String> {
    private final String expected;

    public EqualToIgnoringCaseAndWhitespace(String expected) {
        this.expected = expected.trim();
    }

    @Override
    protected boolean matchesSafely(String actual) {
        return actual != null && actual.trim().equalsIgnoreCase(expected);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a string equal to (ignoring case and whitespace) ").appendValue(expected);
    }

    public static EqualToIgnoringCaseAndWhitespace equalToIgnoringCaseAndWhitespace(String expected) {
        return new EqualToIgnoringCaseAndWhitespace(expected);
    }
}
