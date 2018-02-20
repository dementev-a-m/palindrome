import org.junit.Assert;
import org.junit.Test;
import ru.dementev.palindrome.Palindrome;

/**
 * Created by Антон Дементьев on 20.02.2018.
 */
public class PalindromeTest {
    @Test
    public void testPalindrome() {

        Assert.assertEquals(Palindrome.check(2345), 1);
        Assert.assertEquals(Palindrome.check(65), 1);
        Assert.assertEquals(Palindrome.check(189), 2);
        Assert.assertEquals(Palindrome.check(1), 0);
        Assert.assertEquals(Palindrome.check(121), 0);
        Assert.assertEquals(Palindrome.check(10), 1);

    }
    @Test
    public void testForNegativeNumber() {
        Assert.assertEquals(Palindrome.check(-121),0);
        Assert.assertEquals(Palindrome.check(-1315125),3);
    }

    @Test(expected = RuntimeException.class)
    public void testForCounterMore20() {
        Palindrome.check(237377345);
    }
}
