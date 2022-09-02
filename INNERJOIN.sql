CREATE TABLE TIPO_M(
ID_TIPO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
ESTATUS NUMBER(1)
);

INSERT INTO TIPO_M VALUES(1, 'RUSTICO', 1);
INSERT INTO TIPO_M VALUES(2, 'MODERNO', 1);
INSERT INTO TIPO_M VALUES(3, 'FUTURISTA', 1);
INSERT INTO TIPO_M VALUES(4, 'CLASICO', 1);

CREATE TABLE MATERIAL_M(
ID_MATERIAL NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100)
);

INSERT INTO MATERIAL_M VALUES(1, 'EBANO');
INSERT INTO MATERIAL_M VALUES(2, 'NOGAL');
INSERT INTO MATERIAL_M VALUES(3, 'PINO');
INSERT INTO MATERIAL_M VALUES(4, 'BARATO');

CREATE TABLE PROVEDOR_M(
     ID_PROVEDOR NUMBER PRIMARY KEY,
     NOMBRE NVARCHAR2(100),
     TELEFONO NUMBER,
     CORREO NVARCHAR2(100),
     STATUS NUMBER(1)
);

INSERT INTO PROVEDOR_M VALUES (1, 'DICO', 1234, 'DICO.COM', 1);
INSERT INTO PROVEDOR_M VALUES (2, 'COYOACAN', 3214, 'SASAKS@ASA.COM', 1);
INSERT INTO PROVEDOR_M VALUES (3, 'DEL NORTE', 4354, 'DADSA.COM', 1);
INSERT INTO PROVEDOR_M VALUES (4, 'MOBIL', 7564, 'SASAS.COM', 0);

CREATE TABLE MARCA_M(
     ID_MARCA NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(100),
     PAIS NVARCHAR2(100),
     ESTADO NUMBER(1)
);

INSERT INTO MARCA_M VALUES (1, 'SAUL', 'MEXICO', 1);
INSERT INTO MARCA_M VALUES (2, 'DICOSA', 'USA', 1);
INSERT INTO MARCA_M VALUES (3, 'MUEBLOSOS', 'JAPON', 0);
INSERT INTO MARCA_M VALUES (4, 'TRONCOSO', 'MEXICO', 1);

CREATE TABLE MUEBLES(
 ID_MUEBLE NUMBER PRIMARY KEY,
 MODELO NVARCHAR2(100),
 PRECIO NUMBER,
 ID_MARCA NUMBER,
 ID_PROVEDOR NUMBER,
 ID_TIPO NUMBER,
 ID_MATERIAL NUMBER,
 TAMANO NUMBER,
 FECHA_CREACION DATE,
CONSTRAINT FK_MARCA FOREIGN KEY(ID_MARCA) REFERENCES MARCA_M(ID_MARCA),
CONSTRAINT FK_PROVEDOR FOREIGN KEY(ID_PROVEDOR) REFERENCES PROVEDOR_M(ID_PROVEDOR),
CONSTRAINT FK_TIPO FOREIGN KEY(ID_TIPO) REFERENCES TIPO_M(ID_TIPO),
CONSTRAINT FK_MATERIAL FOREIGN KEY(ID_MATERIAL) REFERENCES MATERIAL_M(ID_MATERIAL)
 );
 
INSERT INTO MUEBLES VALUES(1, 'SOFA', 1234, 1, 4, 2, 3,1, '02/04/2005');
INSERT INTO MUEBLES VALUES(2, 'MESA', 7328, 2, 3, 3, 4,2, '02/04/2005');
update muebles set fecha_creacion = '02/06/2007' where id_mueble = 2;
update muebles set fecha_creacion = '02/06/2009' where id_mueble = 3;
update muebles set fecha_creacion = '02/06/2022' where id_mueble = 4;
update muebles set fecha_creacion = '02/06/2012' where id_mueble = 5;
update muebles set fecha_creacion = '02/06/2004', PRECIO = 8923 where id_mueble = 6;
update muebles set fecha_creacion = '02/06/2008', PRECIO = 2736  where id_mueble = 7;
INSERT INTO MUEBLES VALUES(3, 'CAMA', 2389, 3, 2, 4, 1,3, '02/04/2005');
INSERT INTO MUEBLES VALUES(4, 'SILLON', 1370, 4, 1, 1, 2,4, '02/04/2005');
INSERT INTO MUEBLES VALUES(5, 'SILLA', 9238, 3, 1, 1, 1,2, '02/04/2005');
INSERT INTO MUEBLES VALUES(6, 'SILLA', 9238, 2, 1, 1, 1,3, '02/04/2005');
INSERT INTO MUEBLES VALUES(7, 'SILLA', 9238, 4, 1, 1, 1,4, '02/04/2005');


/*   Mostrar los muebles con sus inner join -->deben mostrar 5 muebles + case de tama�o + ordernarlos en base a su precio*/

SELECT MUEBLES.ID_MUEBLE ID_M, MUEBLES.MODELO MODEL_M, MUEBLES.PRECIO PRECIO_M, MUEBLES.TAMANO TAMANO_M, 
(
CASE TAMANO
WHEN 1 THEN 'CHICO'
WHEN 2 THEN 'MEDIANO'
WHEN 3 THEN 'GRANDE'
WHEN 4 THEN 'EXTRA GRANDE'
ELSE 'SIN TAMA�O' END
)AS DETALLE_TAMANO, MUEBLES.FECHA_CREACION FECHA_M,
TIPO_M.ID_TIPO ID_T, TIPO_M.NOMBRE NOMBRE_T, TIPO_M.ESTATUS ESTATUS_T,
MATERIAL_M.ID_MATERIAL ID_MAT, MATERIAL_M.NOMBRE NOM_MAT, 
PROVEDOR_M.ID_PROVEDOR ID_PRO, PROVEDOR_M.NOMBRE NOM_PRO, PROVEDOR_M.CORREO CORR_PRO, PROVEDOR_M.TELEFONO TEL_PRO, PROVEDOR_M.STATUS STAT_PRO,
MARCA_M.ID_MARCA ID_MARC, MARCA_M.NOMBRE NOM_MARC, MARCA_M.PAIS PAIS_MARC, MARCA_M.ESTADO EDO_MARC
FROM MUEBLES
INNER JOIN TIPO_M
ON TIPO_M.ID_TIPO = MUEBLES.ID_TIPO
INNER JOIN MATERIAL_M
ON MATERIAL_M.ID_MATERIAL = MUEBLES.ID_MATERIAL
INNER JOIN PROVEDOR_M
ON PROVEDOR_M.ID_PROVEDOR = MUEBLES.ID_PROVEDOR
INNER JOIN MARCA_M
ON MARCA_M.ID_MARCA = MUEBLES.ID_MARCA order by precio;



/
*   Contar cuantos muebles tengo de cada marca
/
SELECT COUNT(ID_mueble) CONTADOR, ID_MARCA 
FROM MUEBLES GROUP BY ID_MARCA;

SELECT COUNT(MUEBLES.ID_MUEBLE) CONTADOR, MARCA_M.NOMBRE MARCA
FROM MUEBLES 
LEFT JOIN MARCA_M
ON MARCA_M.ID_MARCA = MUEBLES.ID_MARCA 
GROUP BY MARCA_M.NOMBRE;
/
*   mostrar los muebles que su marca sea del estado PMEX
/
SELECT MUEBLES.ID_MUEBLE ID_M, MUEBLES.MODELO MODEL_M, MUEBLES.PRECIO PRECIO_M, MUEBLES.TAMANO TAMANO_M, 
(
CASE TAMANO
WHEN 1 THEN 'CHICO'
WHEN 2 THEN 'MEDIANO'
WHEN 3 THEN 'GRANDE'
WHEN 4 THEN 'EXTRA GRANDE'
ELSE 'SIN TAMA�O' END
)AS DETALLE_TAMANO, MUEBLES.FECHA_CREACION FECHA_M,
TIPO_M.ID_TIPO ID_T, TIPO_M.NOMBRE NOMBRE_T, TIPO_M.ESTATUS ESTATUS_T,
MATERIAL_M.ID_MATERIAL ID_MAT, MATERIAL_M.NOMBRE NOM_MAT, 
PROVEDOR_M.ID_PROVEDOR ID_PRO, PROVEDOR_M.NOMBRE NOM_PRO, PROVEDOR_M.CORREO CORR_PRO, PROVEDOR_M.TELEFONO TEL_PRO, PROVEDOR_M.STATUS STAT_PRO,
MARCA_M.ID_MARCA ID_MARC, MARCA_M.NOMBRE NOM_MARC, MARCA_M.PAIS PAIS_MARC, MARCA_M.ESTADO EDO_MARC
FROM MUEBLES
INNER JOIN TIPO_M
ON TIPO_M.ID_TIPO = MUEBLES.ID_TIPO
INNER JOIN MATERIAL_M
ON MATERIAL_M.ID_MATERIAL = MUEBLES.ID_MATERIAL
INNER JOIN PROVEDOR_M
ON PROVEDOR_M.ID_PROVEDOR = MUEBLES.ID_PROVEDOR
INNER JOIN MARCA_M
ON MARCA_M.ID_MARCA = MUEBLES.ID_MARCA 
WHERE MARCA_M.PAIS = 'MEXICO';


/
*   sumar la cantidad de precio de los muebles que su fecha de creaci�n este entre 2000 y 2010
/
SELECT SUM(PRECIO) SUMA_PRECIO FROM MUEBLES WHERE FECHA_CREACION BETWEEN '01/01/2005' AND '31/12/2009';
/
*   buscar el mueble mas caro
*/
SELECT MUEBLES.ID_MUEBLE ID_M, MUEBLES.MODELO MODEL_M, MUEBLES.PRECIO PRECIO_M, MUEBLES.TAMANO TAMANO_M, 
(
CASE TAMANO
WHEN 1 THEN 'CHICO'
WHEN 2 THEN 'MEDIANO'
WHEN 3 THEN 'GRANDE'
WHEN 4 THEN 'EXTRA GRANDE'
ELSE 'SIN TAMA�O' END
)AS DETALLE_TAMANO, MUEBLES.FECHA_CREACION FECHA_M,
TIPO_M.ID_TIPO ID_T, TIPO_M.NOMBRE NOMBRE_T, TIPO_M.ESTATUS ESTATUS_T,
MATERIAL_M.ID_MATERIAL ID_MAT, MATERIAL_M.NOMBRE NOM_MAT, 
PROVEDOR_M.ID_PROVEDOR ID_PRO, PROVEDOR_M.NOMBRE NOM_PRO, PROVEDOR_M.CORREO CORR_PRO, PROVEDOR_M.TELEFONO TEL_PRO, PROVEDOR_M.STATUS STAT_PRO,
MARCA_M.ID_MARCA ID_MARC, MARCA_M.NOMBRE NOM_MARC, MARCA_M.PAIS PAIS_MARC, MARCA_M.ESTADO EDO_MARC
FROM MUEBLES
INNER JOIN TIPO_M
ON TIPO_M.ID_TIPO = MUEBLES.ID_TIPO
INNER JOIN MATERIAL_M
ON MATERIAL_M.ID_MATERIAL = MUEBLES.ID_MATERIAL
INNER JOIN PROVEDOR_M
ON PROVEDOR_M.ID_PROVEDOR = MUEBLES.ID_PROVEDOR
INNER JOIN MARCA_M
ON MARCA_M.ID_MARCA = MUEBLES.ID_MARCA 
WHERE PRECIO = (SELECT MAX(PRECIO) PRECIO_MAXIMO FROM MUEBLES);

CREATE TABLE PAISSEC(
id_pais number primary key,
NOMBRE NVARCHAR2(100),
EXTENSION NUMBER,
NUM_ESTADOS NUMBER
);