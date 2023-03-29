import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	Money myMoney = new Money(500, "Rs");
	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void moneyTest() {
		assertEquals(myMoney.getMoneyValue(),500);
	}

	@Test
	void currencyTest() {
		assertEquals(myMoney.getMoneyCurrency(),"Rs");
	}
	
	@Test
	void testCompare() {
		assertEquals(myMoney.compareMoney("more"),"more");
	}
	
}
