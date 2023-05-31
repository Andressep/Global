DROP DATABASE IF EXISTS globalgtc;
CREATE DATABASE IF NOT EXISTS globalgtc;
USE globalgtc;

CREATE TABLE cotizacion(
id INT PRIMARY KEY UNIQUE NOT NULL,
vendedor INT NOT NULL,
cliente INT NOT NULL,
fecha DATE NOT NULL,
detalle_cotizacion INT UNIQUE NOT NULL,
FOREIGN KEY (cliente) REFERENCES cliente(id),
FOREIGN KEY (vendedor) REFERENCES vendedor(id),
FOREIGN KEY (detalle_cotizacion) REFERENCES detalle_cotizacion(id)
);
CREATE TABLE vendedor(
id INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(25) NOT NULL
);
CREATE TABLE cliente(
id INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(25) NOT NULL,
rut VARCHAR(25),
direccion VARCHAR(25),
telefono VARCHAR(25),
correo_electronico VARCHAR(25) NOT NULL
);
CREATE TABLE detalle_cotizacion(
id INT PRIMARY KEY UNIQUE NOT NULL,
productos INT NOT NULL
);
CREATE TABLE producto(
id INT PRIMARY KEY UNIQUE NOT NULL,
nombre VARCHAR(45) NOT NULL UNIQUE,
precio INT NOT NULL,
peso INT NOT NULL,
medidas VARCHAR(15) NOT NULL
);
ALTER TABLE cotizacion
ADD FOREIGN KEY (cliente) REFERENCES cliente(id),
ADD FOREIGN KEY (vendedor) REFERENCES vendedor(id),
ADD FOREIGN KEY (detalle_cotizacion) REFERENCES detalle_cotizacion(id);