#include <iostream>

using namespace std;

int main(int argc, char const *argv[])
{
	int t;
	cin>>t;
	int solutions[1000]; //Given constraint
	for (int tt = 0; tt < t; ++tt)
	{
		int n; cin>>n;
		int a[8],b[8];
		int visited_a[8],visited_b[8];
		for (int i1 = 0; i1 < n; ++i1) {
			cin>>a[i1];
			visited_a[i1]=0;
		}
		for (int i2 = 0; i2 < n; ++i2) {
			visited_b[i2]=0;
			cin>>b[i2];
		}
		int scalar_product = 0;
		for (int i = 0; i < n; ++i)
		{
			int small_a=0,large_b=0;
			for (int j1 = 1; j1 < n; ++j1)
			{
				if(a[j1]<a[small_a] && !visited_a[j1]) {
					small_a=j1;
				}
				visited_a[small_a] = 1;
				if(b[j1]>b[large_b] && !visited_b[j1]) {
					large_b=j1;
				}
				visited_b[large_b] = 1;
			}
			scalar_product += a[small_a] * b[large_b];
		}


	}
	return 0;
}