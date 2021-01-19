/*
DDL - Data Defination Language
CREATE database, table
DROP database, table
ALTER table
*/

--connected to postgres database when you are creating another db

SELECT pg_terminate_backend(pid) FROM pg_stat_activity WHERE datname = 'projects';

DROP DATABASE projects;

CREATE DATABASE projects;