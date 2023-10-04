CREATE DATABASE tienda;
USE tienda;
DROP TABLE IF EXISTS  `productos`;
DROP TABLE IF EXISTS  `pedidos`;

CREATE TABLE `productos` (`codigo_producto` INT NOT NULL,`producto` VARCHAR(255) NOT NULL,`precioUnitario` DOUBLE NOT NULL ,`stock` INT NOT NULL,PRIMARY KEY (`codigo_producto`));
CREATE TABLE `pedidos` (`id_pedido` INT NOT NULL,`codigoProducto` INT NOT NULL,`unidades` INT NOT NULL ,`total` DOUBLE NOT NULL, `fecha` DATETIME NOT NULL,PRIMARY KEY (`id_pedido`));



INSERT INTO `productos` (`codigo_producto`, `producto`, `precioUnitario`, `stock`) VALUES (0, 'lapices', 1.0, 40);
