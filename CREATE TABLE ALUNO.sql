-- Table: public.alunos

-- DROP TABLE public.alunos;

CREATE TABLE public.alunos
(
    matricula integer NOT NULL,
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    idade character varying(3) COLLATE pg_catalog."default",
    sexo character varying(1) COLLATE pg_catalog."default",
    turma character varying(1) COLLATE pg_catalog."default",
    uf character varying(2) COLLATE pg_catalog."default",
    cidade character varying(100) COLLATE pg_catalog."default",
    periodo character varying(6) COLLATE pg_catalog."default",
    fk_curso integer,
    CONSTRAINT alunos_pkey PRIMARY KEY (matricula)
)

TABLESPACE pg_default;

ALTER TABLE public.alunos
    OWNER to postgres;