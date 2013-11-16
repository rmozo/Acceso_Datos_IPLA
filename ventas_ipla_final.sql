/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.5.8-log : Database - ventas_ipla_final
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ventas_ipla_final` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `ventas_ipla_final`;

/*Table structure for table `categorias` */

DROP TABLE IF EXISTS `categorias`;

CREATE TABLE `categorias` (
  `cat_codigo` int(3) NOT NULL AUTO_INCREMENT,
  `cat_nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cat_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `categorias` */

insert  into `categorias`(`cat_codigo`,`cat_nombre`) values (1,'Eléctronica'),(2,'Computación'),(4,'Categoria 2');

/*Table structure for table `comunas` */

DROP TABLE IF EXISTS `comunas`;

CREATE TABLE `comunas` (
  `com_codigo` int(3) NOT NULL AUTO_INCREMENT,
  `com_nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `com_cod_area` int(3) NOT NULL,
  PRIMARY KEY (`com_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `comunas` */

insert  into `comunas`(`com_codigo`,`com_nombre`,`com_cod_area`) values (1,'Curico',1);

/*Table structure for table `contacto_empresa` */

DROP TABLE IF EXISTS `contacto_empresa`;

CREATE TABLE `contacto_empresa` (
  `per_rut` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `prov_codigo` int(4) NOT NULL,
  PRIMARY KEY (`per_rut`,`prov_codigo`),
  KEY `FK_contacto_empresa` (`prov_codigo`),
  CONSTRAINT `FK2_contacto_empresa` FOREIGN KEY (`per_rut`) REFERENCES `personas` (`per_rut`),
  CONSTRAINT `FK_contacto_empresa` FOREIGN KEY (`prov_codigo`) REFERENCES `proveedores` (`prov_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `contacto_empresa` */

/*Table structure for table `marcas` */

DROP TABLE IF EXISTS `marcas`;

CREATE TABLE `marcas` (
  `mar_codigo` int(3) NOT NULL AUTO_INCREMENT,
  `mar_nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`mar_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `marcas` */

insert  into `marcas`(`mar_codigo`,`mar_nombre`) values (1,'Lenovo'),(2,'Samsung'),(4,'Marca1'),(5,'khgkhgkhghk');

/*Table structure for table `perfiles` */

DROP TABLE IF EXISTS `perfiles`;

CREATE TABLE `perfiles` (
  `pf_codigo` int(3) NOT NULL AUTO_INCREMENT,
  `pf_nombre` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pf_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `perfiles` */

insert  into `perfiles`(`pf_codigo`,`pf_nombre`) values (1,'Administrador'),(2,'Vendedor');

/*Table structure for table `personas` */

DROP TABLE IF EXISTS `personas`;

CREATE TABLE `personas` (
  `per_rut` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `per_password` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_nombres` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_apellidop` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_apellidom` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_telefono` varchar(13) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_telefono1` varchar(13) COLLATE utf8_unicode_ci DEFAULT NULL,
  `per_email` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pf_codigo` int(3) DEFAULT NULL,
  `com_codigo` int(3) DEFAULT NULL,
  PRIMARY KEY (`per_rut`),
  KEY `FK_personas` (`pf_codigo`),
  KEY `FK2_personas` (`com_codigo`),
  CONSTRAINT `FK2_personas` FOREIGN KEY (`com_codigo`) REFERENCES `comunas` (`com_codigo`),
  CONSTRAINT `FK_personas` FOREIGN KEY (`pf_codigo`) REFERENCES `perfiles` (`pf_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `personas` */

insert  into `personas`(`per_rut`,`per_password`,`per_nombres`,`per_apellidop`,`per_apellidom`,`per_telefono`,`per_telefono1`,`per_email`,`pf_codigo`,`com_codigo`) values ('14.050.760-1','123456','Rodrigo','Mozo','Diaz','2432139','84445123','rmozo@auroraa.cl',1,1);

/*Table structure for table `producto_proveedor` */

DROP TABLE IF EXISTS `producto_proveedor`;

CREATE TABLE `producto_proveedor` (
  `pro_codigo_barra` varchar(36) COLLATE utf8_unicode_ci NOT NULL,
  `pro_codigo_interno` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `prov_codigo` int(4) NOT NULL,
  PRIMARY KEY (`pro_codigo_barra`,`pro_codigo_interno`,`prov_codigo`),
  KEY `FK3_producto_proveedor` (`prov_codigo`),
  CONSTRAINT `FK3_producto_proveedor` FOREIGN KEY (`prov_codigo`) REFERENCES `proveedores` (`prov_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `producto_proveedor` */

insert  into `producto_proveedor`(`pro_codigo_barra`,`pro_codigo_interno`,`prov_codigo`) values ('123456789','123',1);

/*Table structure for table `productos` */

DROP TABLE IF EXISTS `productos`;

CREATE TABLE `productos` (
  `pro_codigo_interno` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `pro_codigo_barra` varchar(36) COLLATE utf8_unicode_ci NOT NULL,
  `pro_nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `pro_descripcion` varchar(1024) COLLATE utf8_unicode_ci NOT NULL,
  `pro_precio_c` float NOT NULL,
  `pro_margen_utilidad_ma` float NOT NULL,
  `pro_margen_utilidad_me` float NOT NULL,
  `pro_precio_venta_ma` int(9) NOT NULL,
  `pro_precio_venta_me` int(9) NOT NULL,
  `pro_stock_ma` int(3) NOT NULL,
  `pro_stock_min` int(2) NOT NULL,
  `mar_codigo` int(3) NOT NULL,
  `cat_codigo` int(3) NOT NULL,
  `tipo_codigo` int(3) NOT NULL,
  PRIMARY KEY (`pro_codigo_interno`,`pro_codigo_barra`),
  UNIQUE KEY `FK4_productos` (`pro_codigo_barra`),
  KEY `FK_productos` (`mar_codigo`),
  KEY `FK2_productos` (`cat_codigo`),
  CONSTRAINT `FK2_productos` FOREIGN KEY (`cat_codigo`) REFERENCES `categorias` (`cat_codigo`),
  CONSTRAINT `FK4_productos` FOREIGN KEY (`pro_codigo_barra`) REFERENCES `producto_proveedor` (`pro_codigo_barra`),
  CONSTRAINT `FK_productos` FOREIGN KEY (`mar_codigo`) REFERENCES `marcas` (`mar_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `productos` */

insert  into `productos`(`pro_codigo_interno`,`pro_codigo_barra`,`pro_nombre`,`pro_descripcion`,`pro_precio_c`,`pro_margen_utilidad_ma`,`pro_margen_utilidad_me`,`pro_precio_venta_ma`,`pro_precio_venta_me`,`pro_stock_ma`,`pro_stock_min`,`mar_codigo`,`cat_codigo`,`tipo_codigo`) values ('123','123456789','producto1','producto uno de prueba',6000,3000,2500,3000,2000,5000,3,1,2,1);

/*Table structure for table `proveedores` */

DROP TABLE IF EXISTS `proveedores`;

CREATE TABLE `proveedores` (
  `prov_codigo` int(4) NOT NULL AUTO_INCREMENT,
  `prov_razon_social` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prov_nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `prov_direccion` varchar(70) COLLATE utf8_unicode_ci NOT NULL,
  `com_codigo` int(3) NOT NULL,
  `prov_telefono1` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `prov_telefono2` varchar(13) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prov_email` varchar(36) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prov_web` varchar(25) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`prov_codigo`),
  KEY `FK_proveedores` (`com_codigo`),
  CONSTRAINT `FK_proveedores` FOREIGN KEY (`com_codigo`) REFERENCES `comunas` (`com_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `proveedores` */

insert  into `proveedores`(`prov_codigo`,`prov_razon_social`,`prov_nombre`,`prov_direccion`,`com_codigo`,`prov_telefono1`,`prov_telefono2`,`prov_email`,`prov_web`) values (1,'Proveedor de','proveedor 1','camilo henriquez 84',1,'1234567','9876543','aa@bb.cc','www.proveedor.cl');

/*Table structure for table `tipo` */

DROP TABLE IF EXISTS `tipo`;

CREATE TABLE `tipo` (
  `tipo_codigo` int(3) NOT NULL AUTO_INCREMENT,
  `tipo_nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`tipo_codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tipo` */

insert  into `tipo`(`tipo_codigo`,`tipo_nombre`) values (1,'Tipo1'),(2,'Tipo2'),(3,'Tipo3');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
