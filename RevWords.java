import java.util.*;
import java.io.*;

class RevWords {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		FileWriter fw = new FileWriter("RevWords.op");
		int n = in.nextInt();
		in.nextLine();
		for(int cno=1;cno<=n;cno++) {
			fw.write("Case #"+cno+":");
			String[] words = in.nextLine().split(" ");
			for(int i=words.length-1;i>=0;i--)
				fw.write(" "+words[i]);
			fw.write("\n");
		}
		fw.flush();
		fw.close();
	}
}