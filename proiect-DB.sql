create database if not exists proiect;

use proiect;

drop table if exists componente_pc;

CREATE TABLE `componente_pc` (
`cod_produs` int(11) NOT NULL AUTO_INCREMENT,
`marca` varchar(45) NOT NULL,
`garantie` varchar(45) NOT NULL,
`an_fabricatie` varchar(45) NOT NULL,
`tara_provenienta` varchar(45) NOT NULL,
`producator` varchar(45) NOT NULL,
`pret` varchar (45) NOT NULL,
`stoc` int(10) NOT NULL,
PRIMARY KEY (`cod_produs`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;