/*1) Faça uma consulta (query) que retorne apenas o primeiro nome do Associado (tabela associado) – verifique as funções SQL Server.
2) Faça uma consulta que retorne o nome dos associados e a idade de cada um (em anos, exibir um número inteiro).
3) Faça uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982. Exibir também o total de meses de trabalho até a data de 31/12/2000.
4) Qual o cargo (tabela empregado) possuir mais empregados?
6) Faça uma consulta que retorne o nome do associado e a data de quando cada completará (ou completou) 50 anos, liste também o dia da semana.
7) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?
8) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.
9) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).
10)Limpe a tabela CidadeAux, e insira somente as cidades com nomes e UF’s distintos, considere somente o menor código ID das cidades duplicadas.*/

-- 1
select substring(nome,0,  CHARINDEX(' ', nome)) as PrimeiroNome  
from associado

-- 2
select nome, year(getdate()) - year(datanascimento) as idade from Associado

-- 3
select * 
	from empregado
	where dataadmissao between '05/01/1980' and '01/20/1982'

	--Select Cargo, IDGerente, COUNT(1) as Total From Empregado Group By Cargo, IDGerente;

-- 4
select top 1 cargo from empregado
group by (cargo)
order by count(cargo) desc

-- 6) Faça uma consulta que retorne o nome do associado e a data de quando cada completará (ou completou) 50 anos, liste também o dia da semana.

select nome , DataNascimento as idade from Associado
where getDate() - DataNascimento

-- 7) Liste a quantidade de cidades agrupando por UF – quantas cidades cada estado possuí ?

select   count(uf) as QuantidadeCidade  from cidade
group by UF 


--8) Liste as cidades que possuem o mesmo nome e UF – cidades duplicadas.

SELECT nome, uf  FROM cidade
GROUP BY nome, uf
HAVING Count(*) > 1

-- 9) Identifique qual deve ser o próximo ID para a criação de um novo registro na tabela Associado (maior + 1).

select max(idassociado) + 1 from associado


-- 10)Limpe a tabela CidadeAux, e insira somente as cidades com nomes e UF’s distintos, considere somente o menor código ID das cidades duplicadas.*/
