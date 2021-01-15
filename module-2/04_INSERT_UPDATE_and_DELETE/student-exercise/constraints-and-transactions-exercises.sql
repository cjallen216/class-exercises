-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor
( first_name, last_name )
VALUES
( 'HAMPTON', 'AVENUE')
        , ( 'LISA', 'BYWAY' );

SELECT *
FROM actor;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

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
FROM film
WHERE title ILIKE 'EUCLIDEAN PI';


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor
( actor_id, film_id)
VALUES ( 201, 1001 )
        , ( 202, 1001 );

SELECT *
FROM film_actor;


-- 4. Add Mathmagical to the category table.

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


/*film_ids
EGG IGBY = 274
KARATE MOON = 494
RANDOM GO = 714
YOUNG LANGUAGE = 996
'EUCLIDEAN PI' = 1001
*/

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

SELECT *
FROM film_category;

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

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

SELECT *
FROM film_category;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

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

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

SELECT *
FROM film;

-- 7. Add a copy of "Euclidean PI" to all the stores.

        -- film_id 1001

INSERT INTO inventory
(
        film_id
        , store_id
)
SELECT 1001
        , store_id
FROM store;

INSERT INTO inventory
(
        film_id
        , store_id
)
SELECT 1001
        , store_id
FROM store;

SELECT f.title
        , f.film_id
        , i.inventory_id
        , s.store_id
FROM film AS f
INNER JOIN inventory as i
        ON f.film_id = i.film_id
INNER JOIN store AS s
        ON i.store_id = s.store_id
WHERE f.title ILIKE 'EUCLIDEAN PI';

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)

        /*<YOUR ANSWER HERE : No, UPDATE or DELETE violates the foreign key constraint for the film_actor table,
        becuase the film_id is referenced from this table>
        */
        
BEGIN TRANSACTION;

DELETE FROM film
WHERE film_id = 1001;

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

        /*<YOUR ANSWER HERE : No, it violates another foreign key constraint for the film_category table>
        */

BEGIN TRANSACTION;

DELETE FROM category
WHERE category_id = 17;

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)

        /* <YOUR ANSWER HERE : YES, becuase there aren't any dependencies on category_id>
        */

BEGIN TRANSACTION;

DELETE FROM film_category
WHERE category_id = 17;

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
        
        /* <YOUR ANSWER HERE>
                YES - Mathmagical was deleted because the dependency on film_category was removed with the deletion above. 
                NO - Retrying to delete the film still failed because there are still foreign key constraints for film_actor table
        */

BEGIN TRANSACTION;

DELETE FROM category
WHERE category_id = 17;

DELETE FROM film
WHERE film_id = 1001;

--ROLLBACK TRANSACTION;
COMMIT TRANSACTION;

SELECT *
FROM category;

SELECT *
FROM film;

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

        /*Remove film_id from 1) film_actor and 2) inventory to release the foreign key constraints, removing the dependencies
        on those to tables
        */ 

SELECT *
FROM film
WHERE film_id = 1001;

SELECT *
FROM film_actor
WHERE film_id = 1001;

SELECT *
FROM inventory
WHERE film_id = 1001;
