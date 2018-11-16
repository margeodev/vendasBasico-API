CREATE TABLE cliente (
	id_cliente BIGINT(20) AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL,
	PRIMARY KEY (id_cliente)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE produto (
	id_produto BIGINT(20) AUTO_INCREMENT,
	descricao VARCHAR(45) NOT NULL,
	preco DECIMAL(10,2) NOT NULL,
	PRIMARY KEY (id_produto)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE venda (
	id_venda BIGINT(20) AUTO_INCREMENT,
	valor_frete DECIMAL(10,2) NOT NULL,
	valor_total DECIMAL(10,2),
	data_cadastro DATE,
	cliente_id BIGINT(20) NOT NULL,
	PRIMARY KEY (id_venda),
	FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente)	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE item_vendido (
	id_item_vendido BIGINT(20) AUTO_INCREMENT,
	quantidade int NOT NULL,
	produto_id BIGINT(20) NOT NULL,
	venda_id BIGINT(20) NOT NULL,
	PRIMARY KEY (id_item_vendido),
	FOREIGN KEY (produto_id) REFERENCES produto(id_produto),
	FOREIGN KEY (venda_id) REFERENCES venda(id_venda)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;