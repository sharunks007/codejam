var fs = require('fs');

var input = fs.readFileSync(process.argv[2],"utf-8");

input = input.split('\n');
input.shift();
input.pop();
for(var i=0; i<input.length; i++) {
	var x = input[i].split(' ').pop();
	//console.log(x);
	console.log("Case #"+(i+1)+":",check(toIntArray(x)));
}

function toIntArray(x) {
	var y = [];
	for(var i=0; i<x.length; i++) y.push(parseInt(x[i]));
	return y;
}

function max(x,y) {
	return x > y ? x : y;
}

function check(x) {
	var guests = 0;
	for (var i = x.length - 1; i >= 0; i--) {
		var sum = 0;
		if (x[i] > 0) {			
			for (j = i - 1; j >= 0; j--) {
				sum += x[j];
			}
			if(sum < i) {
				guests = max(guests,i-sum)
			}
		}
	}
	return guests;
};