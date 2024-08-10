import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        HamletParser hammy = new HamletParser();
        boolean actual = hammy.changeTheHam("HAMLET", "LEON");

        boolean matches = hammy.getHamletData().contains("HAMLET");

        Assert.assertFalse(matches);
        Assert.assertTrue(actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser hammy = new HamletParser();
        boolean actual = hammy.changeTheHam("HORATIO", "TARIQ");

        boolean matches = hammy.getHamletData().contains("HORATIO");

        Assert.assertFalse(matches);
        Assert.assertTrue(actual);

    }

    @Test
    public void testFindHoratio() {
        HamletParser hammy = new HamletParser();

        boolean matches = hammy.getHamletData().contains("HORATIO");

        Assert.assertTrue(matches);
    }

    @Test
    public void testFindHamlet() {
        HamletParser hammy = new HamletParser();

        boolean matches = hammy.getHamletData().contains("HAMLET");

        Assert.assertTrue(matches);



    }
}