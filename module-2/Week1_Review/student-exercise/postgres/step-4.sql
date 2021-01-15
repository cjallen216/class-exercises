-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name

SELECT p.name AS park_name
        , c.name AS campground_name
        , c.open_from_mm
        , c.open_to_mm
        , c.daily_fee
FROM campground AS c
INNER JOIN park AS p
        ON c.park_id = p.park_id
ORDER BY p.name
        , c.name;

-- select the park name and the total number of campgrounds for each park ordered by park name

SELECT p.name AS park_name
        , COUNT (p.park_id)
FROM campground AS c
INNER JOIN park AS p
        ON c.park_id = p.park_id
GROUP BY p.name
ORDER BY p.name;

-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name
-- is 'Blackwoods'

SELECT p.name AS park_name
        , c.name AS campground_name
        , s.site_number
        , s.max_occupancy
        , s.accessible
        , s.max_rv_length
        , s.utilities
FROM campground AS c
INNER JOIN park AS p
        ON c.park_id = p.park_id
INNER JOIN site AS s
        ON c.campground_id = s.campground_id
WHERE c.name ILIKE 'Blackwoods';

/*
  select park name, campground, total number of sites (column alias 'number_of_sites') ordered by park
  -------------------------------------------------
    Acadia	Blackwoods	276
    Acadia	Seawall	198
    Acadia	Schoodic Woods	92
    Arches	"Devil's Garden"	49
    Arches	Canyon Wren Group Site	1
    Arches	Juniper Group Site	1
    Cuyahoga Valley	The Unnamed Primitive Campsites	5
  -------------------------------------------------
*/

SELECT p.name AS park_name
        , c.name AS campground_name
        , COUNT (s.site_id)
FROM campground AS c
INNER JOIN park AS p
        ON c.park_id = p.park_id
INNER JOIN site AS s
        ON c.campground_id = s.campground_id
GROUP BY p.name
        , c.name
ORDER BY p.name;


-- select site number, reservation name, reservation from and to date ordered by reservation from date

SELECT s.site_number
        , r.name
        , r.from_date
        , r.to_date
FROM reservation AS r
INNER JOIN site AS s
        ON r.site_id = s.site_id
ORDER BY r.from_date;

/*
  select campground name, total number of reservations for each campground ordered by total reservations desc
  -------------------------------------------------
    Seawall	13
    Blackwoods	9
    "Devil's Garden"	7
    Schoodic Woods	7
    The Unnamed Primitive Campsites	5
    Canyon Wren Group Site	4
    Juniper Group Site	4
  -------------------------------------------------
*/

SELECT c.name
        , COUNT (r.reservation_id) AS total_reservations
FROM campground AS c
INNER JOIN site AS s
        ON c.campground_id = s.campground_id
INNER JOIN reservation AS r
        ON s.site_id = r.site_id
GROUP BY c.name
ORDER BY total_reservations DESC;
