#include <iostream>
#include <fstream>
#define PARALLEL(x,y,a,b) (x < a && y < b || x > a && y > b)

using namespace std;

int main(int argc, char const *argv[])
{
	ofstream file; file.open("intranet.op.txt");
	int t; cin>>t;
	for (int cno = 1; cno <= t; ++cno)
	{
		int n,a[1000],b[1000];
		cin>>n;
		int sum=0; //intersections
		for (int i = 0; i < n; ++i)
		{
			cin>>a[i]>>b[i];
			for (int j = 0; j < i; ++j)
			{
				if(!PARALLEL(a[i],b[i],a[j],b[j])) sum ++;
			}
		}
		file<<"Case #"<<cno<<": "<<sum<<endl;
	}
	return 0;
}