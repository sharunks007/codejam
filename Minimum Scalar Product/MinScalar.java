import java.util.Scanner;
import java.util.ArrayList;

class MinScalar {

	static int getLeast(ArrayList<Integer> x) {
		int least = x.get(0);
		for(int y : x) if(y<least) least=y;
		x.remove(x.indexOf(least));
		return least;
	}

	static int getLarge(ArrayList<Integer> x) {
		int large = x.get(0);
		for(int y : x) if(y>large) large = y;
		x.remove(x.indexOf(large));
		return large;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> sol = new ArrayList<Integer>();
		int t = in.nextInt();
		for (int tt=0; tt<t; tt++) {
			int n = in.nextInt();
			for (int i=0; i<n; i++) {
				a.add(in.nextInt());
			}
			for (int j=0; j<n; j++) {
				b.add(in.nextInt());
			}
			int prod = 0;
			for (int k=0; k<n; k++) {
				prod += getLeast(a) * getLarge(b);
			}
			sol.add(prod);
		}
		int num=1;
		for (int x : sol) {
			System.out.printf("Case #%d: %d\n",num++,x);
		}
	}
}