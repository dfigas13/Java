package pl.coderslab.cflowcontrol;

import com.google.common.base.CharMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.CoreMatchers.containsString;
public class Main06Test {

    private static final String EXPECTED_OUTPUT = "0 - gerade" + System.lineSeparator() +
            "1 - ungerade" + System.lineSeparator() +
            "2 - gerade" + System.lineSeparator() +
            "3 - ungerade" + System.lineSeparator() +
            "4 - gerade" + System.lineSeparator() +
            "5 - ungerade" + System.lineSeparator() +
            "6 - gerade" + System.lineSeparator() +
            "0 - gerade" + System.lineSeparator() +
            "1 - ungerade" + System.lineSeparator() +
            "2 - gerade" + System.lineSeparator() +
            "3 - ungerade" + System.lineSeparator() +
            "4 - gerade" + System.lineSeparator() +
            "5 - ungerade" + System.lineSeparator() +
            "6 - gerade";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main06.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_OddEvenMessage() {
        Assert.assertThat(CharMatcher.whitespace().removeFrom(output), containsString(
               CharMatcher.whitespace().removeFrom(EXPECTED_OUTPUT)));
    }
}
