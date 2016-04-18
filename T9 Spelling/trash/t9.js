var fs = require('fs');

var input = fs.readFileSync(process.argv[2]).split('\n');
input.pop();

var T9 = {
	'a' : '2',
	'b' : '22',
	'c' : '222',
	'd' : '3',
	'e' : 
}

String.prototype.replaceAll = function(search, replacement) {
    var target = this;
    return target.replace(new RegExp(search, 'g'), replacement);
};

var n = parseInt(input.shift());

for(var i=1;i<=n;i++) {

}