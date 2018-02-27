package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.quiz2;

class quiz2Test {

	@Test
	void test() {
		quiz2 i = new quiz2(35000,0,60,0.10);
		
		double MonthlyPaymentRound = Math.round(i.MonthlyCarPayment()*100.0)/100.0;
		double TotalInterestRound = Math.round(i.TotalInterest()*100.0)/100.0;
		assertTrue((MonthlyPaymentRound==743.65));
		assertTrue((TotalInterestRound==9618.79));
	}

}




