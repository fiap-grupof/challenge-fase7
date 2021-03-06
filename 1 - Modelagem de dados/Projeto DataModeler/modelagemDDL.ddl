-- Gerado por Oracle SQL Developer Data Modeler 21.2.0.183.1957
--   em:        2022-06-06 19:54:48 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_sm_cidade (
    cd_cidade             NUMBER(4) NOT NULL,
    t_sm_estado_cd_estado NUMBER(2) NOT NULL,
    nm_cidade             VARCHAR2(40) NOT NULL,
    nr_agente             NUMBER(3)
);

ALTER TABLE t_sm_cidade ADD CONSTRAINT t_sm_cidade_pk PRIMARY KEY ( cd_cidade );

CREATE TABLE t_sm_contagio (
    cd_contagio                 NUMBER(11) NOT NULL,
    t_sm_doenca_cd_doenca       NUMBER(3) NOT NULL,
    t_sm_pessoa_cd_pessoa       NUMBER(10) NOT NULL,
    dt_contagio                 DATE NOT NULL,
    t_sm_gravidade_cd_gravidade NUMBER(3) NOT NULL
);

ALTER TABLE t_sm_contagio ADD CONSTRAINT t_sm_contagio_pk PRIMARY KEY ( cd_contagio );

CREATE TABLE t_sm_doenca (
    cd_doenca NUMBER(3) NOT NULL,
    nm_doenca VARCHAR2(100) NOT NULL,
    bl_vacina CHAR(1)
);

ALTER TABLE t_sm_doenca ADD CONSTRAINT t_sm_doenca_pk PRIMARY KEY ( cd_doenca );

CREATE TABLE t_sm_escolaridade (
    cd_escolaridade NUMBER(2) NOT NULL,
    nm_escolaridade VARCHAR2(40) NOT NULL
);

ALTER TABLE t_sm_escolaridade ADD CONSTRAINT t_sm_escolaridade_pk PRIMARY KEY ( cd_escolaridade );

CREATE TABLE t_sm_estado (
    cd_estado             NUMBER(2) NOT NULL,
    t_sm_regiao_cd_regiao NUMBER(1) NOT NULL,
    nm_estado             VARCHAR2(40) NOT NULL,
    ds_abreviacao         CHAR(2) NOT NULL
);

ALTER TABLE t_sm_estado ADD CONSTRAINT t_sm_estado_pk PRIMARY KEY ( cd_estado );

CREATE TABLE t_sm_gravidade (
    cd_gravidade NUMBER(3) NOT NULL,
    ds_tipo      VARCHAR2(50)
);

ALTER TABLE t_sm_gravidade ADD CONSTRAINT t_sm_gravidade_pk PRIMARY KEY ( cd_gravidade );

CREATE TABLE t_sm_idh (
    cd_idh                NUMBER(5) NOT NULL,
    t_sm_regiao_cd_regiao NUMBER(1) NOT NULL,
    nr_indice             NUMBER(5) NOT NULL,
    dt_periodo            DATE NOT NULL
);

ALTER TABLE t_sm_idh ADD CONSTRAINT t_sm_idh_pk PRIMARY KEY ( cd_idh );

CREATE TABLE t_sm_pais (
    cd_pais       NUMBER(3) NOT NULL,
    nm_pais       VARCHAR2(40) NOT NULL,
    ds_abreviacao CHAR(2),
    ds_iso_alpha3 CHAR(3),
    nr_ddi        NUMBER(3)
);

ALTER TABLE t_sm_pais ADD CONSTRAINT t_sm_pais_pk PRIMARY KEY ( cd_pais );

CREATE TABLE t_sm_pessoa (
    cd_pessoa             NUMBER(10) NOT NULL,
    t_sm_cidade_cd_cidade NUMBER NOT NULL,
    t_sm_escol_cd_escol   NUMBER(4) NOT NULL,
    nm_pessoa             VARCHAR2(100) NOT NULL,
    nr_renda_familiar     NUMBER(6) NOT NULL,
    nr_rg                 NUMBER(11),
    nr_cpf                NUMBER(11),
    dt_nasc               DATE NOT NULL
);

ALTER TABLE t_sm_pessoa ADD CONSTRAINT t_sm_pessoa_pk PRIMARY KEY ( cd_pessoa );

CREATE TABLE t_sm_pessoa_vacina (
    cd_relacao            NUMBER(3) NOT NULL,
    t_sm_pessoa_cd_pessoa NUMBER(10) NOT NULL,
    t_sm_vacina_cd_vacina NUMBER(3) NOT NULL
);

ALTER TABLE t_sm_pessoa_vacina ADD CONSTRAINT t_sm_pessoa_vacina_pk PRIMARY KEY ( cd_relacao );

CREATE TABLE t_sm_regiao (
    cd_regiao         NUMBER(1) NOT NULL,
    t_sm_pais_cd_pais NUMBER(3) NOT NULL,
    nm_regiao         VARCHAR2(50) NOT NULL
);

ALTER TABLE t_sm_regiao ADD CONSTRAINT t_sm_regiao_pk PRIMARY KEY ( cd_regiao );

CREATE TABLE t_sm_vacina (
    cd_vacina             NUMBER(10) NOT NULL,
    t_sm_doenca_cd_doenca NUMBER(3) NOT NULL,
    nm_vacina             VARCHAR2(40) NOT NULL,
    nm_laboratorio        VARCHAR2(50) NOT NULL
);

ALTER TABLE t_sm_vacina ADD CONSTRAINT t_sm_vacina_pk PRIMARY KEY ( cd_vacina );

ALTER TABLE t_sm_cidade
    ADD CONSTRAINT t_sm_cid_t_sm_est_fk FOREIGN KEY ( t_sm_estado_cd_estado )
        REFERENCES t_sm_estado ( cd_estado );

ALTER TABLE t_sm_contagio
    ADD CONSTRAINT t_sm_contag_t_sm_doenca_fk FOREIGN KEY ( t_sm_doenca_cd_doenca )
        REFERENCES t_sm_doenca ( cd_doenca );

ALTER TABLE t_sm_contagio
    ADD CONSTRAINT t_sm_contag_t_sm_grav_fk FOREIGN KEY ( t_sm_gravidade_cd_gravidade )
        REFERENCES t_sm_gravidade ( cd_gravidade );

ALTER TABLE t_sm_contagio
    ADD CONSTRAINT t_sm_contag_t_sm_pes_fk FOREIGN KEY ( t_sm_pessoa_cd_pessoa )
        REFERENCES t_sm_pessoa ( cd_pessoa );

ALTER TABLE t_sm_estado
    ADD CONSTRAINT t_sm_est_t_sm_reg_fk FOREIGN KEY ( t_sm_regiao_cd_regiao )
        REFERENCES t_sm_regiao ( cd_regiao );

ALTER TABLE t_sm_idh
    ADD CONSTRAINT t_sm_idh_t_sm_reg_fk FOREIGN KEY ( t_sm_regiao_cd_regiao )
        REFERENCES t_sm_regiao ( cd_regiao );

ALTER TABLE t_sm_pessoa
    ADD CONSTRAINT t_sm_pes_t_sm_cid_fk FOREIGN KEY ( t_sm_escol_cd_escol )
        REFERENCES t_sm_cidade ( cd_cidade );

ALTER TABLE t_sm_pessoa
    ADD CONSTRAINT t_sm_pes_t_sm_escol_fk FOREIGN KEY ( t_sm_escol_cd_escol )
        REFERENCES t_sm_escolaridade ( cd_escolaridade );

ALTER TABLE t_sm_pessoa_vacina
    ADD CONSTRAINT t_sm_pes_vac_t_sm_pes_fk FOREIGN KEY ( t_sm_pessoa_cd_pessoa )
        REFERENCES t_sm_pessoa ( cd_pessoa );

ALTER TABLE t_sm_pessoa_vacina
    ADD CONSTRAINT t_sm_pes_vac_t_sm_vac_fk FOREIGN KEY ( t_sm_vacina_cd_vacina )
        REFERENCES t_sm_vacina ( cd_vacina );

ALTER TABLE t_sm_regiao
    ADD CONSTRAINT t_sm_reg_t_sm_pais_fk FOREIGN KEY ( t_sm_pais_cd_pais )
        REFERENCES t_sm_pais ( cd_pais );

ALTER TABLE t_sm_vacina
    ADD CONSTRAINT t_sm_vac_t_sm_doenca_fk FOREIGN KEY ( t_sm_doenca_cd_doenca )
        REFERENCES t_sm_doenca ( cd_doenca );



-- Relat?rio do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            12
-- CREATE INDEX                             0
-- ALTER TABLE                             24
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
