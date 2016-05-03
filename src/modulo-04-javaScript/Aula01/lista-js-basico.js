'use strict'
//Exercicio 01
var daisyGame = function(nPetalas){

    return nPetalas % 2 === 0 ? 'Love me not' : 'Love me';

}
//----------------------------------------------------------
//Exercicio 02
function maiorTexto(palavras) {
  var maiorPalavra = '';
  for(var i=0; i < palavras.length; i++ ){
    if (maiorPalavra.length < palavras[i].length)
      maiorPalavra = palavras[i];
  }
    return(maiorPalavra);
}
//-------------------------------------------------------------
//Exercicio 03
var imprime = function(arrayString,fn)
{
    if(typeof fn === 'function'){
      for(var i = 0;  i < arrayString.length; i++){
        fn(arrayString[i]);
      }
    }
}
//--------------------------------------------------------------

//Exercicio 04

function adicionar(valor1){
  return function(valor2){
    return valor1 + valor2;
  }
}

//--------------------------------------------------------------
//Exercicio 05
var fiboSum = function(n, usarRecursao) {

  if (usarRecursao) {
    if (n === 1) return 1;
    return fibonacci(n, true) + fiboSum(n-1, true);
  }

  var calcularIterativo = function() {
    var anterior = 0, atual = 1, soma = 0, prox;
    for (var i = 0; i < n; i++) {
      prox = anterior + atual;
      soma += atual;
      anterior = atual;
      atual = prox;
    }
    return soma;
  };

  return calcularIterativo();

};
//--------------------------------------------------------------
//Exercicio 06
function queroCafe(mascada, precos){
  if(precos.constructor === Array){
    for(var i = 0; i < precos.length; i++){
      if(mascada < precos[i]){
        precos.splice(i, 1);
        i--;
      }
    }
    return precos.sort().toString();
  }
}


//Exercicio 07
function contarPorTipo (objeto, tipo) { // REVER

  // inspirado em http://stackoverflow.com/a/13467007/5194966
  function getType(v) {
    return v === null ? 'null' : typeof v !== 'undefined' && v.constructor === Array ? 'array' : typeof v;
  }

  var count = 0;
  for (var campo in objeto) {
    if (getType(objeto[campo]) === tipo) count++;
  }

  return count;
}

//Exercicio 08
