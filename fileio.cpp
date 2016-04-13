#include <fstream>

using namespace std;

int main(int argc, char const *argv[])
{
	ofstream opfile;
	opfile.open("output.txt");
	opfile<<"Hello world!\n";
	return 0;
}