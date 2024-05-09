public class SimpleInterest {
    double simpleInterest(double principleAmount, double rate, int years) {
		return principleAmount*rate*years/100;
	}
    public static void main(String[] args) {
        double principleAmount = 10000;
        double rate = 12.5;
        int years = 5;
        SimpleInterest obj = new SimpleInterest();
        double sp = obj.simpleInterest(principleAmount, rate, years);
        System.out.println("Simple Interst : "+sp);
    }
}