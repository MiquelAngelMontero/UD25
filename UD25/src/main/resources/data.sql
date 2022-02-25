DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos(
codigo long,
nombre nvarchar(100),
presupuesto int,
PRIMARY KEY(codigo)
);

CREATE TABLE Empleados(
id int,
dni varchar(9) NOT NULL UNIQUE,
nombre nvarchar(100),
apellidos nvarchar(255),
Departamento long,
PRIMARY KEY (id),
CONSTRAINT FK_1 FOREIGN KEY (Departamento) REFERENCES Departamentos (codigo)
);

INSERT Departamentos (codigo, nombre, presupuesto) VALUES (1, "Eloy", 100);
INSERT Departamentos (codigo, nombre, presupuesto) VALUES (2, "Jordi", 260);
INSERT Departamentos (codigo, nombre, presupuesto) VALUES (3, "Joan", 550);
INSERT Departamentos (codigo, nombre, presupuesto) VALUES (4, "Miquel Angel", 300);

INSERT Empelados (id, dni, nombre, apellidos, Departamento) VALUES (1, "23456789L", "Eloy", "Altozano", 1);
INSERT Empelados (id, dni, nombre, apellidos, Departamento) VALUES (2, "23456789L", "Jordi", "Ribellas", 2);