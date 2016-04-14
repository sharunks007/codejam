#include <iostream>
#include <fstream>
#define out(x) cout<<x; file<<x

using namespace std;

int main(int argc, char const *argv[])
{
	ofstream file;
	file.open("test.txt");
	out("Hello"<<" World");
	return 0;
}