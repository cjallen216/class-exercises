/* DDL - Data Driven Language
CREATE table
DROP table
ALTER table
*/

--1 drop all tables
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS job;

-- 2. create all tables
CREATE TABLE employee
(
        employee_id SERIAL NOT NULL PRIMARY KEY
        , job_id INTEGER NOT NULL
        , department_id INTEGER NOT NULL
        , last_name VARCHAR(50) NOT NULL
        , first_name VARCHAR(50) NOT NULL
        , gender CHAR(1) NULL
        , birth_date DATE NOT NULL
        , hire_date DATE NOT NULL
);

CREATE TABLE department
(
        department_id SERIAL NOT NULL PRIMARY KEY
        , name VARCHAR(50) NOT NULL
);

CREATE TABLE project
(
        project_id SERIAL NOT NULL PRIMARY KEY
        , department_id INTEGER NOT NULL
        , name VARCHAR(50) NOT NULL
        , start_date DATE NOT NULL
);

CREATE TABLE job
(
        job_id SERIAL NOT NULL PRIMARY KEY
        , title VARCHAR(100) NOT NULL
);

--3. add relationships

ALTER TABLE employee
ADD CONSTRAINT fk_employee_department
FOREIGN KEY (department_id)
REFERENCES department (department_id);

ALTER TABLE employee
ADD CONSTRAINT fk_job_employee
FOREIGN KEY (job_id)
REFERENCES job (job_id);

--4. populate the tables

INSERT INTO department
( name )
VALUES
( 'Maintenance' )
        , ( 'Water Safety' )
        , ( 'Managerial' );
        
SELECT *
FROM department;

INSERT INTO project
( name, department_id, start_date )
VALUES
( 'guard pool', 2, '2021-05-24' )
        , ( 'clean poolhouse', 1, '2021-03-10' )
        , ( 'teach Lessons', 2, '2021-05-25' )
        , ( 'patron check-in', 3, '2021-05-24' );

INSERT INTO job
( title )
VALUES
( 'Lifeguard' )
        ,( 'Pool Cleaner' )
        ,( 'Swim Instructor' )
        ,( 'Pool Manager' );
        
INSERT INTO employee
( job_id, department_id, last_name, first_name, gender, birth_date, hire_date )
VALUES
( 2, 1, 'Roberts', 'Blake', 'F', '2001-01-28', '2019-11-04' )
        , ( 1, 2, 'Reid', 'Everett', 'M', '2000-03-15', '2016-10-15' )
        , ( 4, 3, 'Walsh', 'Andrea', 'F', '1999-9-12', '2019-11-04' )
        , ( 2, 1, 'Clarke', 'Ray', 'M', '2000-5-5', '2017-05-12' )
        , ( 1, 2, 'Li', 'Misty', 'F', '1997-7-12', '2018-10-28' )
        , ( 1, 2, 'Smith', 'Leo', 'M', '2002-4-28', '2019-11-04' )
        , ( 1, 2, 'Ryan', 'Phyllis', 'F', '2003-11-05', '2020-01-12' )
        , ( 3, 2, 'Brooks', 'Alton', 'M', '1999-6-25', '2018-08-29' );
        
SELECT *
FROM employee;

SELECT *
FROM department;

SELECT *
FROM project;

SELECT *
FROM job;