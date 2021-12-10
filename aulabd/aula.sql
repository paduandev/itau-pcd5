-- isso é um comentário

-- criar uma nova "Base de Dados"
create database bd_itau;

-- marcar o BD como padrão
use bd_itau;

-- criar uma nova tabela no BD
-- [nome coluna][tipo de dados][qualificadores]
-- not null = estacoluna não pode ser deixada em branco
-- auto_increment = numeração será gerada pelo próprio BD (1, 2, 3, 4, ...)
-- varchar(x) = campo de texto com tamanho máximo x
-- constraint é uma regra (restrição)
-- primary key = chave primária (identificador na tabela), não pode repetir

create table cliente ( 
	codigo integer not null auto_increment,
    nome varchar(120) not null,
    telefone varchar(20),
    constraint pk_cliente primary key(codigo)
);

-- CUIDADO!!!! apaga a estrutura da tabela e TODOS os dados junto
-- drop table cliente;

-- descrever os detalhes da tabela
desc cliente;

-- inserir dados na tabela
insert into cliente (codigo, nome, telefone) values (null, 'Carlos Augusto', '(11) 98765-4321');
insert into cliente (codigo, nome, telefone) values (null, 'Amanda Souza', '(11) 94444-4321');
insert into cliente (codigo, nome, telefone) values (null, 'Ricardo Santos', '(12) 91111-2222');
insert into cliente (codigo, nome, telefone) values (null, 'Felipe Prado', '(19) 87878-4446');

-- buscar as informações no banco de dados
-- select [quais colunas] from [qual tabela] where [qual condição]

-- buscar todas as informações de todos os clientes
select *
from cliente;

-- buscar o nome e o telefone do cliente com código 2
select nome, telefone -- busque apenas nome e telefone
from cliente          -- na tabela cliente
where codigo = 2;     -- onde o código seja igual a 2

-- apagando dados
-- apagar o cliente que tem código 3
delete from cliente where codigo > 3;

-- atualizar dados
update cliente
set telefone = '(21)12345-1234'
where codigo = 3;

-- criar tabela veiculo
-- foreign key = chave extrangeira, ligar coma outra tabela
-- references = indica com qual tabela e campo a ligação é feita

create table veiculo(
	codigo integer not null auto_increment,
    marca varchar(20),
    modelo varchar(40),
    proprietario integer,
	constraint pk_veiculo primary key(codigo),
    constraint fk_veiculo_cliente foreign key (proprietario) references cliente(codigo)
);

-- inserir dados de veiculos
insert into veiculo values (null, 'VW', 'Gol', 1);
insert into veiculo values (null, 'Chevrolet', 'Astra', 1);
insert into veiculo values (null, 'BMW', 'X1', 2);

-- buscar todos os dados de todos os veículos
select *
from veiculo;

-- quais os nomes dos proprietarios de cada veiculo?
-- inner join = junção das tabelas onde os caompos são iguais

select marca, modelo, nome
from veiculo inner join cliente on veiculo.proprietario = cliente.codigo;
