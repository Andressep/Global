DROP DATABASE IF EXISTS globalgtc;
CREATE DATABASE IF NOT EXISTS globalgtc;
USE globalgtc;

CREATE TABLE cotizacion(
id_cotizacion INT PRIMARY KEY UNIQUE NOT NULL,
id_vendedor INT NOT NULL,
id_cliente INT NOT NULL,
fecha DATE NOT NULL,
id_detalle INT UNIQUE NOT NULL
);
CREATE TABLE vendedor(
id_vendedor INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(25) NOT NULL
);
CREATE TABLE cliente(
id_cliente INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(25) NOT NULL,
rut VARCHAR(25),
direccion VARCHAR(25), ## evaluar hacer otra tabla
telefono VARCHAR(25),
correo_electronico VARCHAR(25) NOT NULL
);
CREATE TABLE detalle_cotizacion(
id_detalle INT PRIMARY KEY UNIQUE NOT NULL,
id_productos INT NOT NULL ## Listado de productos
);
CREATE TABLE producto(
id_producto INT PRIMARY KEY UNIQUE NOT NULL,
medidas VARCHAR(15) NOT NULL,
nombre VARCHAR(45) NOT NULL UNIQUE,
id_proveedor INT NOT NULL,
precio INT NOT NULL,
categoria VARCHAR(15),
peso INT NOT NULL,
cantidad INT NOT NULL
);
CREATE TABLE proveedor (
id_proveedor INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(25) NOT NULL,
direccion_planta VARCHAR(25) NOT NULL
);
ALTER TABLE cotizacion 
ADD FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
ADD FOREIGN KEY (id_vendedor) REFERENCES vendedor(id_vendedor),
ADD FOREIGN KEY (id_detalle) REFERENCES detalle_cotizacion(id_detalle)
;
ALTER TABLE detalle_cotizacion 
ADD FOREIGN KEY (id_productos) REFERENCES producto(id_producto)
;
ALTER TABLE producto 
ADD FOREIGN KEY (id_proveedor) REFERENCES proveedor(id_proveedor)
;


