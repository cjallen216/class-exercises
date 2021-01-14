-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

SELECT f.title
        , a.first_name || ' ' || a.last_name AS actor_name
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
WHERE a.first_name ILIKE 'Nick'
        AND a.last_name ILIKE 'Stallone';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT f.title
        , a.first_name || ' ' || a.last_name AS actor_name
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
WHERE a.first_name ILIKE 'Rita'
        AND a.last_name ILIKE 'Reynolds';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT f.title
        , a.first_name || ' ' || a.last_name AS actor_name
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
WHERE a.last_name ILIKE 'Dean';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT f.title
        , c.name AS category
FROM film AS f
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE c.name ILIKE 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT f.title
        , c.name AS category
FROM film AS f
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE c.name ILIKE 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT f.title
        , c.name AS category
        , f.rating
FROM film AS f
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE c.name ILIKE 'Children'
        AND f.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT f.title
        , c.name AS category
        , f.rating
        , f.length
FROM film AS f
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE c.name ILIKE 'Family'
        AND f.rating = 'G'
        AND f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT f.title
        , a.first_name || ' ' || a.last_name AS actor_name
        , f.rating
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
WHERE a.first_name ILIKE 'Matthew'
        AND a.last_name ILIKE 'Leigh'
        AND f.rating = 'G';


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT f.title
        , c.name AS category
        , f.release_year
FROM film AS f
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE c.name ILIKE 'Sci-Fi';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT f.title
        , a.first_name || ' ' || a.last_name AS actor_name
        , c.name AS category
FROM actor AS a
INNER JOIN film_actor AS fa
        ON a.actor_id = fa.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
INNER JOIN film_category as fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON fcat.category_id = c.category_id
WHERE a.first_name ILIKE 'Nick'
        AND a.last_name ILIKE 'Stallone'
        AND c.name ILIKE 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address AS street_address
        , city
        , a.district
        , c.country
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN city
        ON a.city_id = city.city_id
INNER JOIN country AS c
        ON city.country_id = c.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT s.store_id
        , a.address
        , staff.first_name || ' ' || staff.last_name AS store_manager
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN city
        ON a.city_id = city.city_id
INNER JOIN country AS c
        ON city.country_id = c.country_id
INNER JOIN staff
        ON s.manager_staff_id = staff.staff_id;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)

SELECT c.first_name || ' ' || c.last_name AS customer_name
        , COUNT(c.customer_id) AS rentals
FROM customer AS c
INNER JOIN payment AS p
        ON p.customer_id = c.customer_id
GROUP BY customer_name
ORDER BY rentals DESC
LIMIT 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)

SELECT c.first_name || ' ' || c.last_name AS customer_name
        , SUM (p.amount) AS dollars
FROM customer AS c
INNER JOIN payment AS p
        ON p.customer_id = c.customer_id
GROUP BY customer_name
ORDER BY dollars DESC
LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments),
-- and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT s.store_id
        , address
        , COUNT (r.rental_id) AS total_rentals
        , SUM (amount) as total_sales
        , AVG (amount) as average_sales
FROM store AS s
INNER JOIN address AS a
        ON s.address_id = a.address_id
INNER JOIN inventory AS i
        ON s.store_id = i.store_id
INNER JOIN rental AS r
        ON i.inventory_id = r.inventory_id
INNER JOIN payment AS p
        ON r.rental_id = p.rental_id
GROUP BY s.store_id
        , address;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)

SELECT f.title
        , COUNT(r.*) AS rentals
FROM film AS f
INNER JOIN inventory AS i
        ON i.film_id = f.film_id
INNER JOIN rental AS r
        ON r.inventory_id = i.inventory_id
GROUP BY f.title
ORDER BY rentals DESC
LIMIT 10;

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)

SELECT c.name AS category
        , COUNT(r.*) AS rentals
FROM film AS f
INNER JOIN inventory AS i
        ON i.film_id = f.film_id
INNER JOIN rental AS r
        ON r.inventory_id = i.inventory_id
INNER JOIN film_category AS fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON c.category_id = fcat.category_id
GROUP BY c.name
ORDER BY rentals DESC
LIMIT 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT f.title
        , COUNT(r.*) AS rentals
FROM film AS f
INNER JOIN inventory AS i
        ON i.film_id = f.film_id
INNER JOIN rental AS r
        ON r.inventory_id = i.inventory_id
INNER JOIN film_category AS fcat
        ON fcat.film_id = f.film_id
INNER JOIN category c
        ON c.category_id = fcat.category_id
GROUP BY f.title
ORDER BY rentals DESC
LIMIT 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)

SELECT a.first_name || ' ' || a.last_name AS actor_name
        , COUNT(r.*) AS rentals
FROM actor AS a
INNER JOIN film_actor AS fa
        ON fa.actor_id= a.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
INNER JOIN inventory AS i
        ON i.film_id = f.film_id
INNER JOIN rental AS r
        ON r.inventory_id = i.inventory_id
GROUP BY actor_name
        , a.actor_id
ORDER BY rentals DESC
LIMIT 10;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name || ' ' || a.last_name AS actor_name
        , COUNT(r.*) AS rentals
FROM actor AS a
INNER JOIN film_actor AS fa
        ON fa.actor_id= a.actor_id
INNER JOIN film AS f
        ON f.film_id = fa.film_id
INNER JOIN inventory AS i
        ON i.film_id = f.film_id
INNER JOIN rental AS r
        ON r.inventory_id = i.inventory_id
INNER JOIN film_category AS fcat
        ON fcat.film_id = f.film_id
INNER JOIN category AS c
        ON c.category_id = fcat.category_id
WHERE c.name = 'Comedy'
GROUP BY actor_name
ORDER BY rentals DESC
LIMIT 5;
