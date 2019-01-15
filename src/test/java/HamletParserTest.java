import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
       hamletParser.replaceHamlet();
        Assert.assertFalse(hamletParser.findHamlet());
    }

    @Test
    public void testChangeHoratioToTariq() {
      hamletParser.replaceHoratio();
      Assert.assertFalse(hamletParser.findHoratio());
    }
//
    @Test
    public void testFindHoratio() {

        Assert.assertTrue(hamletParser.findHoratio());

    }

    @Test
    public void testFindHamlet() {

        Assert.assertTrue(hamletParser.findHamlet());

    }
}