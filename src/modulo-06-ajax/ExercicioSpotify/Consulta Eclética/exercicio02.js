'use strict'

$(document).ready(function(){
      var jaAdicionado = [];
      $('#btnPesquisar').click(function(nomeArtista){
           pesquisaArtista($('#pesqEcletica').val()).done(function(res){
                 res
                 //terminar de pegar detalhes
           });
      });
});

//https://api.spotify.com/v1/search?q=%C3%A9%20o%20tchan&type=artist


var pesquisaArtista = function(nomeArtista){
      
     return $.ajax({
         url: 'https://api.spotify.com/v1/search?q='+nomeArtista+'&type=artist',
         type: 'GET'   
      });
}

var detalhes = function(id){
      return $.ajax({
            url : 'https://api.spotify.com/v1/artists/'+id+'/albums?limit=50',
            Type: 'GET'
      })
      
}