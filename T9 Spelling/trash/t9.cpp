#include <iostream>
#include <stdio.h>
#include <string.h>

#define F0(i,n) for(i=0;i<n;i++)
#define F1(i,n) for(i=1;i<=n;i++)

using namespace std;

int main(int argc, char const *argv[])
{
	int i,j,k,l,m,n;
	string temp;
	cin>>n;
	getline(cin,temp);
	string kbd[10] = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	F1(i,n) {
		string str;
		string op = "";
		//cin>>str;
		getline(str);
		string prev_find;
		F0(j,str.length()) {
			F0(k,10) {
				int found = kbd[k].find(str[j]);
				if(found >= 0) {
					F0(l,found+1) op += (char)('0' + k);
					break;
				}
			}
		}
		cout<<"Case #"<<i<<": "<<op<<endl;
	}

	return 0;
}