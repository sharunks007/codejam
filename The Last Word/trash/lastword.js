//Highly Complex - Scrapped
var fs = require('fs');
var ipfile = 'sample.txt';
if (process.argv[2]) {
	ipfile = process.argv[2];
}

var opfile = "output.txt";

fs.unlinkSync(opfile);

var input = fs.readFileSync(ipfile, "utf-8").split('\n');
input.shift();
input.pop();
var cno = 1;
while (input.length > 0) {
	var str = input[0];
	test_case(cno++, str);
	input.shift();
}

function out(str) {
	console.log(str);
	fs.appendFile(opfile, str + '\n');
}

function test_case(cno, str) {
	str = str.split('');
	var maxlen = str.length;
	var x = [str[0]];
	str.shift();
	var y = [];
	while(str.length > 0) {
		var c = str.shift();
		var len = x.length;
		for(var i=0;i<len;i++) {
			var a = x[i] + c;
			var b = c + x[i];
			if(a.length == maxlen) y.push(a);
			else x.push(a);
			if(b.length == maxlen) y.push(b);
			else x.push(b);
		}
	}
	y.sort();
	out("Case #" + cno + ": " + y.pop());
}