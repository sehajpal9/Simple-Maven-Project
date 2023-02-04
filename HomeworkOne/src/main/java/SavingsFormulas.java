import java.lang.Math;

public class SavingsFormulas {

	public static double futureValueLumpSum(double cash, double interest, int years) {
		return cash * Math.pow(1 + interest, years);
	}
	
	
//	public static double futureValueLS_VariableInterest(double cash, double values[]) {
//		for(int i = 0; i < values.length; i++) {
//			cash *= (1 + values[i]);
//		}
//		return cash;
//	}
	private static double helper(double cash, double val) {
		return cash * (1 + val);
	}
	public static double futureValueLS_VariableInterest(double cash, double values[], int i) {
		if (i == values.length) {
			return cash;
		}
		return futureValueLS_VariableInterest(helper(cash, values[i]), values, i + 1);
	}

	
	public static double compoundSavingsConstant(double cash, double interest, int years) {
		double total = 0;
		for(int i = 0; i < years; i++) {
			total += cash * (Math.pow(1 + interest, i));
		}
		return total;
	}
	
	public static double compoundSavingsVariable(double values[], double interest) {
		double futureVal = values[0];
		for(int i = 1; i < values.length; i++) {
			futureVal += (futureVal * interest) + values[i];
		}
		return futureVal;
	}

}
