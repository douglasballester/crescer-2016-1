-- 1)Selecione o nome do empregado e nome do departamento que cada um está relacionado.
select e.NomeEmpregado, d.NomeDepartamento  from Empregado e
	inner join Departamento d
		on e.IDDepartamento = d.IDDepartamento;
		
-- 2)Exibir o nome do associado e sua cidade, exibir também associados sem Cidade relacionada.

select a.Nome, c.Nome from Associado a
	left join Cidade c
		on a.IDCidade = c.IDCidade
		
	
 /*3)Lista os estados (UF) e total de cidades, exibir apenas as cidades que não possuem associados relacionados.
Exemplo:UFTotal_Cidades
RS10
SP5*/

select UF, count(IDCidade)
 	from Cidade 
 	where IDcidade not in(select IDCidade from Associado 
	where IDCidade is not null)
 group by UF


-- 4)Faça uma consulta que liste o nome do associado, o nome da cidade, e uma coluna que indique se a cidade é da região SUL (RS, SC, PR), se for imprimir *** (3 asteriscos), senão imprimir nulo.

select a.Nome, c.Nome,
		case when c.uf in('RS', 'SC' , 'PR') then '***'
		else null
		end RegiaoSul
		from associado a
		inner join cidade c
		on a.IDCidade = c.IDCidade

-- 5)Liste o nome do empregado, o nome do gerente, e o departamento de cada um.
select e.NomeEmpregado , d.NomeDepartamento , g.nomeEmpregado Gerente , d.nomedepartamento 
	from empregado e
	left join Departamento d   --and empregado g
		on d.iddepartamento = e.iddepartamento --and d.IDDepartamento = g.idempregado

	left join empregado g
		on e.idgerente = g.idempregado

	left join departamento d2
		on g.iddepartamento = d2.iddepartamento


--6)Faça uma cópia da tabela Empregado e altere o salário de todos os empregados (Empregado) que o departamento fique na localidade de SAO PAULO, faça um reajuste de 14,5%
drop table Empregado
delete empregado
delete copiaempregado
drop table copiaempregado


select * into copiaempregado from empregado
select * from copiaEmpregado

select c.nomeempregado, c.salario, e.NomeEmpregado, e.Salario from copiaempregado c
	inner join empregado e
	on e.IDEmpregado = c.IDEmpregado
	where c.IDDepartamento in ( select c.IDDepartamento from  Departamento where Localizacao = 'Sao Paulo')

begin transaction
update empregado set salario = salario * 1.145 
where IDDepartamento in ( select IDDepartamento from Departamento where Localizacao = 'Sao Paulo')

rollback transaction


-- 7)Liste a diferença que representará o reajuste aplicado no item anterior no somatório dos salários de todos os empregados.

Select (sum(e.salario) - sum(c.Salario))
 	from copiaempregado c
 	inner join empregado  e
 	on c.IDEmpregado = e.IDEmpregado

--	8)Liste o departamento com o empregado de maior salário.

select top 1 nomedepartamento Departamento, nomeempregado Empregado from empregado e
	inner join Departamento d 
	on d.IDDepartamento = e.iddepartamento
	where e.iddepartamento is not null
	order by salario desc

-- 9)Faça uma consulta para exibir o nome de cada associado e sua cidade e juntamente com os empregados (nome) e a cidade (localidade) de seu departamento, isto deve ser exibido em uma consulta.

select a.nome, c.nome cidade from Associado  a
 	inner join cidade c
 	on a.IDCidade = c.IDCidade

 union all

 select e.NomeEmpregado , d.Localizacao 
 	from Empregado e
 	inner join Departamento d
 	on e.IDDepartamento = d.IDDepartamento

--10)Lista as cidades que tenham associado relacionados. Exibr: Nome e UF apenas
select nome, uf from cidade 
 	where idcidade in (
 		select idcidade 
 		From Associado
 		where idcidade is not null) 
