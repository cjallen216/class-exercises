-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor
(
        first_name
        , last_name
)
VALUES
(
        'HAMPTON'
        , 'AVENUE'
);

INSERT INTO actor
(
        first_name
        , last_name
)
VALUES
(
        'LISA'
        , 'BYWAY'
);

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

SELECT COUNT(*)
FROM film;

INSERT INTO film
(
        title
        , description 
        , release_year
        , language_id
        , length
)
VALUES
(
        'EUCLIDEAN PI'
        , 'The epic story of Euclid as a pizza delivery boy in ancient Greece' 
        , 2008
        , 1
        , 198
);

SELECT *
FROM film;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

SELECT *
FROM film_actor;

actor_id
film_id

--film_id = 1001
--actor_id = 201 - HAMPTON AVENUE
--actor_id = 202 - LISA BYWAY

SELECT *
FROM film
WHERE film_id = 1001;

SELECT *
FROM actor
WHERE actor_id = 201
        OR actor_id = 202;
        
INSERT INTO film_actor
(
        actor_id
        , film_id
)
VALUES
(
        201
        , 1001
);
INSERT INTO film_actor
(
        actor_id
        , film_id
)
VALUES
(
        202
        , 1001
);

SELECT *
FROM film_actor
WHERE film_id = 1001;

-- 4. Add Mathmagical to the category table.

SELECT *
FROM category;

INSERT INTO category
(
        name
)
VALUES
(
        'Mathmagical'
);

SELECT *
FROM category;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

SELECT *
FROM category;
-- Mathmagical - category_id = 17

SELECT *
FROM film
WHERE title = 'EGG IGBY'
        OR title = 'KARATE MOON'
        OR title = 'RANDOM GO'
        OR title = 'YOUNG LANGUAGE'
        OR title = 'EUCLIDEAN PI';

/*film_id
EGG IGBY = 274
KARATE MOON = 494
RANDOM GO = 714
YOUNG LANGUAGE = 996
'EUCLIDEAN PI' = 1001
*/

SELECT *
FROM film_category;
-- film_id
-- category_id

INSERT INTO film_category
(
        film_id
        , category_id
)
VALUES
(
        1001
        , 17
);

BEGIN TRANSACTION;

UPDATE film_category
SET category_id = 17
WHERE film_id = 274;

UPDATE film_category
SET category_id = 17
WHERE film_id = 494;

UPDATE film_category
SET category_id = 17
WHERE film_id = 714;

UPDATE film_category
SET category_id = 17
WHERE film_id = 996;

SELECT *
FROM film_category;


ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
/*
EGG IGBY = 274
KARATE MOON = 494
RANDOM GO = 714
YOUNG LANGUAGE = 996
'EUCLIDEAN PI' = 1001
*/

SELECT title
        , rating
FROM film
WHERE film_id = 274;

BEGIN TRANSACTION;

UPDATE film
SET rating = 'G'
WHERE film_id = 274;

UPDATE film
SET rating = 'G'
WHERE film_id = 494;

UPDATE film
SET rating = 'G'
WHERE film_id = 714;

UPDATE film
SET rating = 'G'
WHERE film_id = 996;

UPDATE film
SET rating = 'G'
WHERE film_id = 1001;

ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- 7. Add a copy of "Euclidean PI" to all the stores.



-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
