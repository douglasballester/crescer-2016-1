'use strict';

  describe('Ex 1. Doadores de sangue', function() {

    it('obterDoadores retorna cavaleiros com tipo sanguíneo O', function() {
      var doadores = JSON.parse('[{"id":5,"nome":"Aiolia","dataNascimento":"1967-08-16T03:00:00.000Z","alturaCm":185,"pesoLb":187.392923,"signo":"Leão","tipoSanguineo":"O","localNascimento":"Grécia","localTreinamento":"Santuário, Grécia","golpes":["Cápsula do Poder","Pata do Leão","Relâmpago de Plasma"],"imagens":[{"url":"https://cloud.githubusercontent.com/assets/526075/14900613/c4ba42f0-0d67-11e6-9c0e-e79c2278ab0b.png","isThumb":true}]},{"id":9,"nome":"Aiolos","dataNascimento":"1960-11-30T03:00:00.000Z","alturaCm":187,"pesoLb":187.392923,"signo":"Sagitário","tipoSanguineo":"O","localNascimento":"Grécia","localTreinamento":"Santuário, Grécia","golpes":["Trovão Atômico","Flecha da Justiça"],"imagens":[{"url":"https://cloud.githubusercontent.com/assets/526075/14901061/e5fe3b90-0d69-11e6-9a78-2449055be1fa.png","isThumb":true}]},{"id":12,"nome":"Afrodite","dataNascimento":"1965-03-10T03:00:00.000Z","alturaCm":183,"pesoLb":158.732829,"signo":"Peixes","tipoSanguineo":"O","localNascimento":"Suécia","localTreinamento":"Groelândia","golpes":["Rosas Diabólicas Reais","Rosas Piranhas","Rosa Branca"],"imagens":[{"url":"https://cloud.githubusercontent.com/assets/526075/14901259/f4a0b3ca-0d6a-11e6-89b1-59855cabc43d.png","isThumb":true}]}]');
      expect(doadores).toEqual(obterDoadores());
      });
});

  describe('Ex 2. Cavaleiro com maior número de golpes', function() {
    it('obter cavaleiro com maior numero de golpes', function() {
     expect(obterCavaleiroComMaisGolpes().nome).toEqual('Shaka');
    });
  });

  describe('Ex 3. Aniversários', function() {
    it('obterMesesComMaisAniversarios retorna Março, Maio e Novembro', function() {
      var esperado = [ 'Março', 'Maio', 'Novembro' ];
      expect(esperado).toEqual(obterMesesComMaisAniversarios());
    });
  });

   describe('Ex 4.Altura Média dos Cavaleiros', function() {
    it('obter Altura Média dos Cavaleiros', function() {
     expect(obterAlturaMedia()).toEqual(1.86);
    });
  });

  describe('Ex 5.Altura Mediana dos Cavaleiros', function() {
    it('obter Altura Mediana dos Cavaleiros', function() {
     expect(obterAlturaMediana()).toEqual(1.85);
    });
  });

  describe('Ex 6.Peso Médio dos Cavaleiros', function() {
    it('obter Peso Médio dos Cavaleiros', function() {
     expect(obterPesoMedio(goldSaints)).toEqual(84.46);
    });

    it('obter Peso Médio dos Cavaleiros doadores de Sangue', function() {
     expect(obterPesoMedioDoadores()).toEqual(80.85);
    });

  });

  describe('Ex 7. Obter IMC de todos os cavaleiros', function(){
    it ("quando informa o json disponibilizado, deve retornar os IMCS:[ '22.46', '29.24', '24.42', '24.03', '24.64', '20.37', '24.35', '24.11', '23.80', '22.27', '21.33' ] ", function(){
        expect(obterIMC()).toEqual(['22.46', '29.24', '24.42', '24.03', '24.64', '20.37', '24.35', '24.11', '23.80', '22.27', '21.33']);
    });
});

  describe('Ex 8. Obter cavaleiros com sobre peso', function(){
    it ('quando informa o json disponibilizado, deve retornar o cavaleiro com id 2', function(){
        expect(obterSobrepeso()[0].id).toEqual(2);
    });
})
