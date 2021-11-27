-- This script was generated by a beta version of the ERD tool in pgAdmin 4.
-- Please log an issue at https://redmine.postgresql.org/projects/pgadmin4/issues/new if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE IF NOT EXISTS public.paciente
(
    id serial,
    nome character varying(255),
    idade integer,
    endereco character varying(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.vacina
(
    id serial,
    nome character varying(255),
    ano integer,
    imunidade_duracao integer,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.paciente_vacina
(
    id_paciente integer,
    id_vacina integer,
    vacinacao_date date
);

ALTER TABLE IF EXISTS public.paciente_vacina
    ADD CONSTRAINT paciente_forkey FOREIGN KEY (id_paciente)
    REFERENCES public.paciente (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public.paciente_vacina
    ADD CONSTRAINT vacina_forkey FOREIGN KEY (id_vacina)
    REFERENCES public.vacina (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;

END;