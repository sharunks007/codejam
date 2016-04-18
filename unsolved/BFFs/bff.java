import java.util.*;

class edge {
	int start;
	int end;
	boolean marked;
	public edge(int x, int y) {
		start = x;
		end = y;
		marked = false;
	}
	public void mark() {
		marked = true;
	}
	public boolean relatesTo(edge e) {
		return start == e.end || end == e.start;
	}
	public edge findNext(Set<edge> e) {
		edge find;
		for(edge x : e) {
			if(this.relatesTo(x)) {
				find = x;
				break;
			}
		}
		e.remove(find);
		return find;
	}
}

class bff {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tt=1; tt<=t;tt++ ) {
			Set<edge> e = new TreeSet<edge>();
			int n = in.nextInt();
			for (int i=1; i <= n; i++) {
				e.add(new edge(i,in.nextInt()));
			}
			int ans = 0;

		}
	}
}