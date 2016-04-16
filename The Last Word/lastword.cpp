#include <iostream>
#include <string.h>
#include <fstream>

#define out(x) cout<<x; file<<x;

using namespace std;

int main(int argc, char const *argv[])
{
	int n;
	cin>>n;
	ofstream file;
	file.open("output.txt");
	for(int t=1;t<=n;t++) {
		string str, op;
		cin>>str;
		for (int i = 0; i < str.length(); ++i)
		{
			op = max(str[i]+op,op+str[i]);
		}
		out("Case #"<<t<<": "<<op<<endl);
	}

	return 0;
}