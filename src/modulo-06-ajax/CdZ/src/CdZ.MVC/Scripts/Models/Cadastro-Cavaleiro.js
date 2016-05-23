'use strict'


$(function(){

    $('#txtDtNascimento').datepicker({
        dateFormat: 'dd/mm/yy',
        changeYear: true,
        yearRange: "1900:2016"
    });

    var $frmNovoCavaleiro = $('#frmNovoCavaleiro');

    $frmNovoCavaleiro.submit(function (e) {

        console.log(convertCavaleiro());
        $.ajax({
            url: '/Cavaleiro/Post',
            type: 'POST',
            data: convertCavaleiro()
        }).done(function (res) {
            console.log('cadastrou');
        });

        return e.preventDefault();
    });    
});

function convertCavaleiro($form) {

    var formData = new formData($form[0]);

    var data = $('#txtDtNascimento').datepicker('getDate');


    var golpes = [];
    $('#novosGolpes').each(function () {
        golpes.push({
            Nome: $(this).find('input [name= golpe]').val()
        })
    });

    var imagens = [];
    $('#novasImagens').each(function () {
        imagens.push({
            Url: $(this).find('input [name= urlImagem]').val(),
            isThumb: $(this).find('input[name=isThumb]').is(':checked')
        })
    });

    return {
        Nome: $('input[name=nome]').val(),
        //AlturaCm: $('#nbAlturaMetros').val()
        //Signo: $('#slSigno').val(),
        //TipoSanguineo: $('#slTipoSanguineo').val(),
        //DataNascimento: txtDtNascimento.toISOString(),
        //Golpes: golpes,
        //LocalNascimento: {
        //    Texto: $('txtLocalNascimento').val()
        //},
        //LocalTreinamento: {
        //    Texto: $('#txtLocalTreinamento').val()
        //},
        //Imagens: imagens
    };
};