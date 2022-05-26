-- SISTEMA DE MONITORAMENTO BAYER

CREATE TABLE t_sm_cidade (
    cd_cidade             NUMBER(4) NOT NULL,
    t_sm_estado_cd_estado NUMBER(2) NOT NULL,
    nm_cidade             VARCHAR2(40) NOT NULL
);

ALTER TABLE t_sm_cidade ADD CONSTRAINT t_sm_cidade_pk PRIMARY KEY ( cd_cidade );

CREATE TABLE t_sm_contagio (
    cd_contagio           NUMBER(11) NOT NULL,
    t_sm_doenca_cd_doenca NUMBER(3) NOT NULL,
    t_sm_pessoa_cd_pessoa NUMBER(10) NOT NULL,
    dt_contagio           DATE NOT NULL
);

ALTER TABLE t_sm_contagio ADD CONSTRAINT t_sm_contagio_pk PRIMARY KEY ( cd_contagio );

CREATE TABLE t_sm_doenca (
    cd_doenca NUMBER(3) NOT NULL,
    nm_doenca VARCHAR2(100) NOT NULL
);

ALTER TABLE t_sm_doenca ADD CONSTRAINT t_sm_doenca_pk PRIMARY KEY ( cd_doenca );

CREATE TABLE t_sm_estado (
    cd_estado             NUMBER(2) NOT NULL,
    t_sm_regiao_cd_regiao NUMBER(1) NOT NULL,
    nm_estado             VARCHAR2(40) NOT NULL,
    ds_abreviacao         CHAR(2) NOT NULL
);

ALTER TABLE t_sm_estado ADD CONSTRAINT t_sm_estado_pk PRIMARY KEY ( cd_estado );

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
    t_sm_cidade_cd_cidade NUMBER(4) NOT NULL,
    nm_pessoa             VARCHAR2(100) NOT NULL,
    nr_renda_familiar     NUMBER(6) NOT NULL,
    nr_rg                 NUMBER(11),
    nr_cpf                NUMBER(11)
);

ALTER TABLE t_sm_pessoa ADD CONSTRAINT t_sm_pessoa_pk PRIMARY KEY ( cd_pessoa );

CREATE TABLE t_sm_regiao (
    cd_regiao         NUMBER(1) NOT NULL,
    t_sm_pais_cd_pais NUMBER(3) NOT NULL,
    nm_regiao         VARCHAR2(50) NOT NULL
);

ALTER TABLE t_sm_regiao ADD CONSTRAINT t_sm_regiao_pk PRIMARY KEY ( cd_regiao );

ALTER TABLE t_sm_cidade
    ADD CONSTRAINT t_sm_cidade_t_sm_estado_fk FOREIGN KEY ( t_sm_estado_cd_estado )
        REFERENCES t_sm_estado ( cd_estado );

ALTER TABLE t_sm_contagio
    ADD CONSTRAINT t_sm_contagio_t_sm_doenca_fk FOREIGN KEY ( t_sm_doenca_cd_doenca )
        REFERENCES t_sm_doenca ( cd_doenca );

ALTER TABLE t_sm_contagio
    ADD CONSTRAINT t_sm_contagio_t_sm_pessoa_fk FOREIGN KEY ( t_sm_pessoa_cd_pessoa )
        REFERENCES t_sm_pessoa ( cd_pessoa );

ALTER TABLE t_sm_estado
    ADD CONSTRAINT t_sm_estado_t_sm_regiao_fk FOREIGN KEY ( t_sm_regiao_cd_regiao )
        REFERENCES t_sm_regiao ( cd_regiao );

ALTER TABLE t_sm_pessoa
    ADD CONSTRAINT t_sm_pessoa_t_sm_cidade_fk FOREIGN KEY ( t_sm_cidade_cd_cidade )
        REFERENCES t_sm_cidade ( cd_cidade );

ALTER TABLE t_sm_regiao
    ADD CONSTRAINT t_sm_regiao_t_sm_pais_fk FOREIGN KEY ( t_sm_pais_cd_pais )
        REFERENCES t_sm_pais ( cd_pais );


-- SEQUENCES AUTO INCREMENT

CREATE SEQUENCE SQ_SM_PESSOA INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SQ_SM_CONTAGIO INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SQ_SM_DOENCA INCREMENT BY 1 START WITH 1;


-- CREATE TABLE                             7
-- ALTER TABLE                             13
-- CREATE SEQUENCES                         3
-- ERRORS                                   0
-- WARNINGS                                 0