'use strict'

 $(document).ready(function(){
   var jaAdicionado = [];
  
   $.ajax({
           url:'https://api.spotify.com/v1/artists/6mdiAmATAx73kdxrNrnlao/albums?limit=50', 
           Type: 'GET'
         }).done(function(res){
         res.items.forEach(function(i){
             if(jaAdicionado.indexOf(i.name.toLowerCase()) === -1){
               $('#lista-albuns').append(
                 '<br>').append(
                   i.name).append(
                     '<br>').append(
                 $('<li>').append(
                   $('<img>').attr
                   ('src' , i.images[1].url)));
             console.log(i.name);
             jaAdicionado.push(i.name.toLowerCase());  
           }
         });
     });
});