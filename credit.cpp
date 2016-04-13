#include <iostream>
#include <fstream>

using namespace std;

//Store credit problem

int main(int argc, char const *argv[])
{
	ofstream opfile;
	opfile.open("credit.op");
	int n; cin>>n; //no. of test cases
	for(int in=0;in<n;in++) {
		int c; cin>>c; //credit
		int l; cin>>l; //no. of items in store
		int p[2000];
		int i,j;
		for (i = 0; i < l; ++i)
		{
			cin>>p[i];
		}
		int in1,in2;
		for (i = 0; i < l; ++i)
		{
			for (j = 0; j < l; ++j)
			{
				if(p[i]+p[j]==c && i!=j) {
					in1 = i < j ? i+1 : j+1;
					in2 = i > j ? i+1 : j+1;
					break;
				}
			}
		}
		opfile<<"Case #"<<in+1<<": "<<in1<<" "<<in2<<endl;
	}
	return 0;
}