#include <iostream>
#include <string.h>
#include <stdlib.h>
#include <math.h>

using namespace std;

class jcoin {
public:
	int a[16];
	int len;
	jcoin(const char str[]) {
		int i;
		len = strlen(str);
		for(i=0;i<len;i++)
			a[i] = str[i] - '0';
	}

	void eval() {
		int i,j,k;
		for(i=0;len;i++) cout<<a[i];
		cout<<" ";
		for(i=2; i<=10; i++ ) {
			int sum=0,p=0;
			for(j=len-1;j>=0;j--)
				sum += pow(i,p++);
			cout<<sum<<" ";
		}
	}
};


int main(int argc, char const *argv[])
{
	jcoin x("100011\0");
	x.eval();
	return 0;
}