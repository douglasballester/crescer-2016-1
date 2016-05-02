console.log('Outro Script!!!');
console.log(hello);


function somar(a,b) {return a + b;};
var sub = function(a , b) {
  return a - b;
};


var funcoes = [ somar(1,1), sub];
console.log(funcoes[1](3,2));
