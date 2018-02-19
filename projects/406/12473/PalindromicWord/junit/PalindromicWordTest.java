
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromicWordTest {

	@Test
	public void testIsPalindromicWord() {
		assertEquals(true,PalindromicWord.isPalindromicWord("Aba"));
		assertEquals(false,PalindromicWord.isPalindromicWord("Abac"));
		assertEquals(true,PalindromicWord.isPalindromicWord("Abc,s ,cBa"));
		assertEquals(false,PalindromicWord.isPalindromicWord("abc,  c  ,"));
	}

}
