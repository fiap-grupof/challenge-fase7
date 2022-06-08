-- INSERINDO DADOS NA TABELA T_SM_ENSINO
INSERT INTO T_SM_ENSINO
 SELECT 1, 'Nao informado' FROM dual 
 UNION ALL
 SELECT 2, 'Analfabeto' FROM dual 
 UNION ALL
 SELECT 3, 'Ensino Fundamental' FROM dual 
 UNION ALL
 SELECT 4, 'Ensino Medio' FROM dual
 UNION ALL
 SELECT 5, 'Ensino Superior' FROM dual;