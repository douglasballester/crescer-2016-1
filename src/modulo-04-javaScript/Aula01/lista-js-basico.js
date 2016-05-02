'use strict'
var daisyGame = function(nPetalas){
    if(nPetalas % 2 === 0){
      return console.log('love me not');
    }
    else{
      return console.log('love me');};
  };

var bM = daisyGame(4);
bM = daisyGame(3);

var maiorTexto = function(palavras){
  var varMaiorPalavra;
  var ndexMaiorPalavra;
    for (var i = 0; i < palavras.length; i++) {
      if(i = 0){
        varMaiorPalavra = palavras[i];
         ndexMaiorPalavra = i;
      }
      if(varMaiorPalavra < palavras[i]){
        varMaiorPalavra = palavras[i];
        indexMaiorPalavra = i;
      }
      return console.log(varMaiorPalavra);
    }
};

maiorTexto('oi', 'teste', 'sei la', '1', '33');
