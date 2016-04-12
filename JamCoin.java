import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Coin {
	int[] digits = new int[16];
	int length;
	String s;
	HashMap<Integer,Long> value = new HashMap<Integer,Long>();
	Coin(String str) {
		s=str;
		length = str.length();
		digits = new int[length];
		for(int i=0; i<length;i++)
			digits[i] = Integer.parseInt(""+ str.charAt(i));
	}
	Coin(int[] dig, int l) {
		System.arraycopy(dig,0,digits,0,length);
		length = l;
		long sum;
		int p=0;
		for(int base=2;base<=10;base++) {
			sum = 0; p = 0;
			for(int i=length-1;i>=0;i--) {
				sum+= digits[i] * Math.pow(base,p);
			}
			value.put(base,sum);
		}
	}
	boolean hasNext() {
		for(int i=0;i<length;i++) {
			if(digits[i]==0) return true;
		}
		return false;
	}
	Coin next() {
		int[] d = new int[length];
		System.arraycopy(digits,0,d,0,length);
		boolean carry = false;
		int n=length-2;
		do {
			d[n] += 1;
			if(d[n]==2) {
				d[n] = 0;
				carry = true;
				n--;
				if(n==0) break;
			}
			else {
				carry = false;
			}
		} while(carry);
		return new Coin(d,length);
	}
	void print() {
		for(int i=0;i<length;i++) {
			System.out.print(i);
		}
		System.out.print("\n");
	}
}




class JamCoin {
	static HashMap<Long,Boolean> primes = new HashMap<Long,Boolean>();
	static boolean prime(long n) {
		try {
			return primes.get(n);
		}
		catch (Exception e) {
			for(long i=0;i<=n/2;i++) {
				if(n%i==0) {
					primes.put(n,false);
					return false;
				}
			}
			primes.put(n,true);
			return true;
		}
	}
	static boolean isJamCoin(Coin c) {
		if(c.digits[0] == 1 && c.digits[c.length-1] == 1) {
			for(int i=2;i<=10;i++) {
			if(prime(c.value.get(i)))
				return false;
			}
			return true;
		}
		return false;
		
	}
	static ArrayList<Coin> generateCoins(int n) {
		ArrayList<Coin> c = new ArrayList<Coin>();
		int[] digits = new int[n];
		digits[0] = digits[n-1] = 1;
		Coin tempCoin = new Coin(digits,n);
		if(isJamCoin(tempCoin)) c.add(tempCoin);
		//tempCoin.print();

		while(tempCoin.hasNext()) {
			tempCoin = tempCoin.next();
			if(isJamCoin(tempCoin)) c.add(tempCoin);
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n = in.nextInt();
		int j = in.nextInt();
		ArrayList<Coin> c = new ArrayList<Coin>();
		c = generateCoins(n);
		for(Coin x : c) {
			x.print();
		}
	}
	static void echo(String s) {
		System.out.print(s);
	}
}