--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2023-03-05 14:40:45

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: pg_database_owner
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO pg_database_owner;

--
-- TOC entry 3338 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 16399)
-- Name: appuser; Type: TABLE; Schema: public; Owner: user
--

CREATE TABLE public.appuser (
    id integer NOT NULL,
    age integer,
    bloodstream_sugar double precision,
    daily_insulin double precision,
    height integer,
    name character varying(255),
    sex smallint,
    weight integer
);


ALTER TABLE public.appuser OWNER TO "user";

--
-- TOC entry 217 (class 1259 OID 16414)
-- Name: appuser_seq; Type: SEQUENCE; Schema: public; Owner: user
--

CREATE SEQUENCE public.appuser_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.appuser_seq OWNER TO "user";

--
-- TOC entry 215 (class 1259 OID 16404)
-- Name: food; Type: TABLE; Schema: public; Owner: user
--

CREATE TABLE public.food (
    name character varying(255) NOT NULL,
    amount_of_carbs double precision,
    amount_of_fats double precision,
    amount_of_proteins double precision
);


ALTER TABLE public.food OWNER TO "user";

--
-- TOC entry 216 (class 1259 OID 16409)
-- Name: food_intake; Type: TABLE; Schema: public; Owner: user
--

CREATE TABLE public.food_intake (
    id character varying(255) NOT NULL,
    meal_time smallint
);


ALTER TABLE public.food_intake OWNER TO "user";

--
-- TOC entry 3329 (class 0 OID 16399)
-- Dependencies: 214
-- Data for Name: appuser; Type: TABLE DATA; Schema: public; Owner: user
--

INSERT INTO public.appuser VALUES (1, 28, 0, 0, 183, 'user1', 0, 85);
INSERT INTO public.appuser VALUES (2, 90, 0, 0, 160, 'user2', 1, 70);


--
-- TOC entry 3330 (class 0 OID 16404)
-- Dependencies: 215
-- Data for Name: food; Type: TABLE DATA; Schema: public; Owner: user
--

INSERT INTO public.food VALUES ('bread', 14, 5, 5);
INSERT INTO public.food VALUES ('oil', 1, 95, 2);


--
-- TOC entry 3331 (class 0 OID 16409)
-- Dependencies: 216
-- Data for Name: food_intake; Type: TABLE DATA; Schema: public; Owner: user
--



--
-- TOC entry 3339 (class 0 OID 0)
-- Dependencies: 217
-- Name: appuser_seq; Type: SEQUENCE SET; Schema: public; Owner: user
--

SELECT pg_catalog.setval('public.appuser_seq', 51, true);


--
-- TOC entry 3182 (class 2606 OID 16403)
-- Name: appuser appuser_pkey; Type: CONSTRAINT; Schema: public; Owner: user
--

ALTER TABLE ONLY public.appuser
    ADD CONSTRAINT appuser_pkey PRIMARY KEY (id);


--
-- TOC entry 3186 (class 2606 OID 16413)
-- Name: food_intake food_intake_pkey; Type: CONSTRAINT; Schema: public; Owner: user
--

ALTER TABLE ONLY public.food_intake
    ADD CONSTRAINT food_intake_pkey PRIMARY KEY (id);


--
-- TOC entry 3184 (class 2606 OID 16408)
-- Name: food food_pkey; Type: CONSTRAINT; Schema: public; Owner: user
--

ALTER TABLE ONLY public.food
    ADD CONSTRAINT food_pkey PRIMARY KEY (name);


-- Completed on 2023-03-05 14:40:46

--
-- PostgreSQL database dump complete
--

