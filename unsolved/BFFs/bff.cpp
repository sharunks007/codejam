#include <iostream>
#include <set>
#include <stdlib.h>

#define FOR(i,n) for (i = 0; i < n; ++i)
#define FOR1(i,n) for(i=1; i<=n; i++)

using namespace std;


class edge {
	int start;
	int end;
public:
	edge(int x, int y) {
		start = x;
		end = y;
	}
};

int main(int argc, char const *argv[])
{
	int i,j,k,l,m;
	int tt,t,n;
	cin>>t;
	FOR1(tt,t) {
		int n; cin>>n;
		int s[1005];
		FOR1(i,n) {
			cin>>s[i];
		}
		int ans=0;
		int checked[1005];
		int partners[1005];
		FOR1(i,n) {
			FOR1(m,1005) {checked[m] = 0; partners[m] = 0;}
			int k=1;
			j=i;
			checked[j]=1;
			do {
				checked[s[j]] = 1;
				j=s[j];
				k++;
			} while(!checked[s[j]]);
			ans=max(ans,k);
		}
		cout<<"Case #"<<tt<<": "<<ans<<endl;
	}
	return 0;
}