import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

class MinScalarLarge {

	static BigInteger getLeast(ArrayList<BigInteger> x) {
		BigInteger least = x.get(0);
		for(BigInteger y : x) if(y.compareTo(least) <= 0) least=y;
		x.remove(x.indexOf(least));
		return least;
	}

	static BigInteger getLarge(ArrayList<BigInteger> x) {
		BigInteger large = x.get(0);
		for(BigInteger y : x) if(y.compareTo(large) >= 0) large = y;
		x.remove(x.indexOf(large));
		return large;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<BigInteger> a = new ArrayList<BigInteger>();
		ArrayList<BigInteger> b = new ArrayList<BigInteger>();
		ArrayList<BigInteger> sol = new ArrayList<BigInteger>();
		int t = in.nextInt();
		for (int tt=0; tt<t; tt++) {
			long n = in.nextLong();
			for (long i=0; i<n; i++) {
				a.add(new BigInteger(in.next()));
			}
			for (long j=0; j<n; j++) {
				b.add(new BigInteger(in.next()));
			}
			BigInteger prod = new BigInteger("0");
			for (int k=0; k<n; k++) {
				prod =  new BigInteger(prod.add(getLeast(a).multiply(getLarge(b))).toByteArray());
			}
			sol.add(prod);
		}
		int num=1;
		for (BigInteger x : sol) {
			System.out.printf("Case #%d: %d\n",num++,x);
		}
	}
}