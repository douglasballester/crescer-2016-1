 /*1) Fa�a uma consulta (query) que retorne o nome dos empregados exibindo em ordem de admiss�o. 
2) Fa�a uma consulta que retorne o nome dos empregados e o sal�rio anual, onde o cargo seja Atendente ou que o sal�rio anual seja inferior a R$ 18.500,00. 
3) Retornar o ID da cidade de Uberl�ndia. 
4) Exibir todas as cidades (ID e nome) do estado do Rio Grande do Sul.*/

-- 1 retornar o nome dos empregados exibidos em ordem de admissao
select nomeempregado as Nome from empregado
order by dataadmissao
 
-- 2 retornar nome dos empregados e salario anual onde cargo seja atendente ou que salario anual seja inferio a 18.500
select nomeempregado, (salario*12) as salarioAnual  from empregado 
	where cargo = 'Atendente'
	or (salario*12) < 18500

-- 3 retorna ID da cidade uberlandia
select  idcidade from cidade
	where nome = 'Uberl�ndia' 

-- 4 retornar id e nome de todas cidades do Rs
select idcidade, nome from cidade
	where uf like '%rs'