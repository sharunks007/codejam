import java.util.*;

class T9 {
	public static String T9Code(String c) {
			String r = "";
			for(int i=0; i<c.length(); i++) {
				for(int j=0; j<T9.length; j++) {
					if(T9[j].contains(c.charAt(i)+"")) {
						if(r.endsWith(j+"")) r+=' ';
						for(int k=0;k<=T9[j].indexOf(c.charAt(i)); k++)
							r += j;
						break;
					}
				}
			}
			return r;
		}
	public static	String[] T9 = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		for(int tt = 1; tt <= n; tt++) {
			String str = in.nextLine();
			out("Case #"+tt+": "+T9Code(str));
		}
	}
	public static void out(String str) {
		System.out.println(str);
	}
}