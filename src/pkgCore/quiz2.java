package pkgCore;

public class quiz2 {
	
	private double CarCost;
	private double DownPayment;
	private double LengthLoan;
	private double InterestRate;
	
    //Constructor
    public quiz2(double cc,double dp,double ll,double ir) {

         CarCost = cc;
         DownPayment = dp;
         LengthLoan = ll;
         InterestRate = ir;
    }
	
	public double MonthlyCarPayment() {
	
		double MonthlyPayment = ((InterestRate/12)*(CarCost-DownPayment))/(1-Math.pow((1+(InterestRate/12)),(-LengthLoan)));
		return MonthlyPayment;
	}
	
	public double TotalInterest() {
		double TotalInterest = (MonthlyCarPayment() * LengthLoan) - (CarCost-DownPayment);
		return TotalInterest;
	}

}
