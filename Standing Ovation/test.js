var fs = require('fs');

var input = fs.readFileSync(process.argv[2],"utf-8");

input = input.split('\n');

console.log(input[1].split(' ').pop());