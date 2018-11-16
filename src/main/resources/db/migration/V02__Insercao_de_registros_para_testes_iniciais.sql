INSERT INTO cliente (id_cliente, nome) VALUES (1, 'José');
INSERT INTO cliente (id_cliente, nome) VALUES (2, 'Maria');
INSERT INTO cliente (id_cliente, nome) VALUES (3, 'Sandra');

INSERT INTO produto (id_produto, descricao, preco) VALUES (1, 'Martelo BLACK&DECKER', 10.00);
INSERT INTO produto (id_produto, descricao, preco) VALUES (2, 'Fone de ouvido AKG K404', 150.00);
INSERT INTO produto (id_produto, descricao, preco) VALUES (3, 'Caixa de som JBL', 200.00);
INSERT INTO produto (id_produto, descricao, preco) VALUES (4, 'Televisor LG 50 polegadas', 3010.00);

INSERT INTO venda (id_venda, valor_frete, valor_total, data_cadastro, cliente_id) VALUES (1, 38.00, 48.00, sysdate(), 1); 
INSERT INTO venda (id_venda, valor_frete, valor_total, data_cadastro, cliente_id) VALUES (2, 20.00, 420.00, sysdate(), 2); 
INSERT INTO venda (id_venda, valor_frete, valor_total, data_cadastro, cliente_id) VALUES (3, 25.00, 6045.00, sysdate(), 3);
INSERT INTO venda (id_venda, valor_frete, valor_total, data_cadastro, cliente_id) VALUES (4, 50.00, 500.00, sysdate(), 2);

INSERT INTO item_vendido (id_item_vendido, quantidade, produto_id, venda_id) VALUES (1, 1, 1, 1);
INSERT INTO item_vendido (id_item_vendido, quantidade, produto_id, venda_id) VALUES (2, 2, 3, 2);
INSERT INTO item_vendido (id_item_vendido, quantidade, produto_id, venda_id) VALUES (3, 2, 4, 3);
INSERT INTO item_vendido (id_item_vendido, quantidade, produto_id, venda_id) VALUES (4, 3, 2, 4);