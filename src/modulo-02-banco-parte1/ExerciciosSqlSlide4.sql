/*1) Faça uma consulta (query) que retorne apenas o primeiro nome do Associado (tabela associado) – verifique as funções SQL Server.
2) Faça uma consulta que retorne o nome dos associados e a idade de cada um (em anos, exibir um número inteiro).
3) Faça uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982. Exibir também o total de meses de trabalho até a data de 31/12/2000.
4) Qual o cargo (tabela empregado) possuir mais empregados?
6) Faça uma consulta que retorne o nome do associado e a data de quando cada completará (ou completou) 50 anos, liste também o dia da semana.
7) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?
8) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.
9) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).
10)Limpe a tabela CidadeAux, e insira somente as cidades com nomes e UF’s distintos, considere somente o menor código ID das cidades duplicadas.*/

-- 1) Faça uma consulta (query) que retorne apenas o primeiro nome do Associado (tabela associado) – verifique as funções SQL Server.
select substring(nome,0,  CHARINDEX(' ', nome)) as PrimeiroNome  
from associado

-- 2) Faça uma consulta que retorne o nome dos associados e a idade de cada um (em anos, exibir um número inteiro).
select nome, year(getdate()) - year(datanascimento) as idade from Associado

-- 3) Faça uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982. Exibir também o total de meses de trabalho até a data de 31/12/2000.
select * 
	from empregado
	where dataadmissao between '05/01/1980' and '01/20/1982'

	--Select Cargo, IDGerente, COUNT(1) as Total From Empregado Group By Cargo, IDGerente;

-- 4) Qual o cargo (tabela empregado) possuir mais empregados?
select top 1 cargo from empregado
group by (cargo)
order by count(cargo) desc

-- 6) Faça uma consulta que retorne o nome do associado e a data de quando cada completará (ou completou) 50 anos, liste também o dia da semana.

select nome , dateadd(year, 50, datanascimento)  as data50 from Associado
select * from associado


-- 7) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?

select   count(uf) as QuantidadeCidade  from cidade
group by UF 


--8) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.

SELECT Nome, UF  FROM cidade
GROUP BY Nome, UF
HAVING Count(*) > 1

-- 9) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).

select max(idassociado) + 1 from associado


-- 10)Limpe a tabela CidadeAux, e insira somente as cidades com nomes e UF’s distintos, considere somente o menor código ID das cidades duplicadas.*/
select * from cidadeAux
delete cidadeAux
insert into CidadeAux select min(IDCidade), nome, uf from Cidade group by Nome,UF

-- 11)Altere todas cidades duplicadas (nome e uf iguais), acrescente no ínicio do nome um asterisco (*).

update cidade set nome = '*' + nome where IDCidade not in (select max(IDCidade) from Cidade group by Nome,UF) ;
select * from cidade

-- 12)Faça uma consulta que liste o nome do Associado e a descrição da coluna Sexo, informando: Masculino ou Feminino.
SELECT Nome,                                                                                     
CASE WHEN sexo = 'M' THEN 'Masculino' 
WHEN sexo = 'F' THEN 'Feminino'
End as 'Sexo' from Associado;

/*13)Faça uma consulta que mostre o nome do empregado, o Salario e percentual a ser descontado do Imposto de Renda, considerando a tabela abaixo:
Até R$ 1.164,00 = 0%De R$ 1.164,00 a R$ 2.326,00 = 15%
Acima de R$ 2.326,00 = 27,5%.*/

select NomeEmpregado , salario,
case when salario < 1164 then 'Não tem desconto'
	when salario between 1164 and 2326 then '15% desconto'
	else '27,5% desconto'
	end DescontoSalario 
	from empregado

-- 14)Elimine as cidades duplicadas (mantendo 1 registro para cada –com menor IDCidade).
delete from cidade where IDCidade not in( select min(IDCidade) from cidade group by Nome,UF)

-- 15)Adicione uma regra que impeça exista mais de uma cidade com o mesmo nome em um estado.
alter table cidade add constraint UK_Nome_UF UNIQUE (Nome,UF)