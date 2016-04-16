#include <iostream>

#define FOR(i,n) for (int i = 0; i < n; ++i)

using namespace std;

int main(int argc, char const *argv[])
{
	int i,j,k;
	int tt,t,n;
	cin>>t;
	int mem[2501];
	FOR(tt,t) {
		FOR(k,2501) {
			mem[k] = 0;
		}
		cin>>n;
		FOR(i,2*n-1) {
			FOR(j,n) {
				int temp;
				cin>>temp;
				mem[temp] = !mem[temp];
			}
		}
		cout<<"Case #"<<tt+1<<":";
		FOR(k,2501) {
			if(mem[k])	cout<<" "<<k;
		}
		cout<<endl;
	}
	return 0;
}