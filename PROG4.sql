create database reportsl;
use reportsl;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    passW VARCHAR(60)
);
insert into usuario(nombre,passW) values("Juan","123juan");
CREATE TABLE alumnos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  estado VARCHAR(50) NOT NULL,
  nombres VARCHAR(100) NOT NULL,
  apellidos VARCHAR(100) NOT NULL,
  edad VARCHAR(3) NULL,
  carrera VARCHAR(100) NOT NULL
);

INSERT INTO alumnos (estado, nombres, apellidos, edad, carrera)
VALUES
  ('Carabobo', 'Juan', 'Pérez', 20, 'Ingeniería en Sistemas'),
  ('Distrito Capital', 'María', 'García', 22, 'Licenciatura en Derecho'),
  ('Zulia', 'Pedro', 'Martínez', 25, 'Ingeniería en Electrónica'),
  ('Miranda', 'Ana', 'Rodríguez', 21, 'Medicina'),
  ('Aragua', 'Carlos', 'Hernández', 24, 'Ingeniería en Mecánica'),
  ('Bolivar', 'Luis', 'González', 23, 'Geología'),
  ('Táchira', 'Rosa', 'Díaz', 26, 'Licenciatura en Educación'),
  ('Falcón', 'Jesús', 'Ramírez', 27, 'Ingeniería en Química'),
  ('Lara', 'Gabriela', 'Torres', 20, 'Comunicación Social'),
  ('Sucre', 'Daniel', 'Mendoza', 22, 'Ingeniería en Informática');

INSERT INTO alumnos (estado, nombres, apellidos, edad, carrera) VALUES
  ('California', 'John', 'Smith', 21, 'Computer Science'), 
  ('New York', 'Emily', 'Johnson', 20, 'Business Administration'),
  ('Texas', 'Michael', 'Williams', 23, 'Engineering'),
  ('Florida', 'Sarah', 'Jones', 22, 'Nursing'),
  ('Illinois', 'David', 'Brown', 25, 'Mathematics');
  
  select * from alumnos;