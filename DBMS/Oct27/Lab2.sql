
// 1. Count the bookings per customer – 2 columns should be displayed : customer id and the number of bookings for that customer
SELECT bkg_cst_id, COUNT(bkg_id)
FROM booking_bkg 
GROUP BY bkg_cst_id;

//2. Display the lowest price per show – 2 columns should be displayed : show id and the lowest price for that show, only for shows that have at least 2 prices entered
SELECT hpr_shw_id, MIN(hpr_seat_price)
FROM has_price_hpr 
GROUP BY hpr_shw_id
HAVING COUNT(*)>=2;

SELECT * FROM has_price_hpr

//3. List the total number of seats booked per show (shw_id)
SELECT SUM(bkg_total_seat), bkg_shw_id
FROM booking_bkg
GROUP BY bkg_shw_id;

//4. List customers first and last names and the shows they have booked (show title)
SELECT cst_first_name, cst_last_name, show_shw.shw_title
FROM customer_cst 
INNER JOIN booking_bkg ON bkg_cst_id = cst_id
INNER JOIN show_shw ON shw_id = bkg_shw_id;


//5. List shows (title, date) and the type of show (type name). 
SELECT shw_title, shw_date, tsh_name
FROM show_shw 
INNER JOIN type_show_tsh ON shw_tsh_id = tsh_id;

//6. List shows (title, date) and the type of show (type name) only for the dance and music types
SELECT shw_title, shw_date, tsh_name
FROM show_shw 
INNER JOIN type_show_tsh ON shw_tsh_id = tsh_id
WHERE tsh_name LIKE 'Dance' OR tsh_name LIKE 'Music';

//7. List number of shows per type of show name. The result should look like this : 
SELECT tsh_name, COUNT(*)
FROM show_shw 
INNER JOIN type_show_tsh ON shw_tsh_id = tsh_id
GROUP BY tsh_name

//8. List type of shows (type name) with show title and date. All types should be listed, even if there is no corresponding show.
SELECT tsh_name, shw_title, shw_date
FROM show_shw 
OUTER RIGHT JOIN type_show_tsh ON tsh_id = shw_tsh_id;

//9. List shows (title, date), and their bookings (date, total number of seats booked). Print as well title and date of shows with no bookings
SELECT shw_title, shw_date, bkg_date, bkg_total_seat
FROM show_shw OUTER LEFT JOIN booking_bkg ON bkg_shw_id = shw_id;


//10. List all possible combinations of shows (title) and type of shows (name of type)
SELECT shw_title, tsh_name
FROM show_shw
CROSS JOIN type_show_tsh ;

//11. No. There is no common attribute in the tables

//12. List shows (title, date), the type of show (type name), the price per seat, and the type of price  (type name).
SELECT shw_title, shw_date, tsh_name, hpr_seat_price, tpr_name
FROM show_shw INNER JOIN type_show_tsh ON tsh_id = shw_tsh_id
INNER JOIN has_price_hpr ON hpr_shw_id = shw_id
INNER JOIN type_price_tpr ON tpr_id = hpr_tpr_id;

//13. List shows (title, date), the type of show (type name) the price per seat, the type of price (type name). Shows with missing price should be listed as well.
SELECT shw_title, shw_date, tsh_name, hpr_seat_price, tpr_name
FROM show_shw LEFT OUTER JOIN type_show_tsh ON tsh_id = shw_tsh_id
LEFT OUTER JOIN has_price_hpr ON hpr_shw_id = shw_id
LEFT OUTER JOIN type_price_tpr ON tpr_id = hpr_tpr_id;

//14. List shows (id, title, date) as well as the title and dates of shows being scheduled before each of them. Use aliases for column names when necessary.
SELECT show_shw.shw_id, show_shw.shw_title, show_shw.shw_date ,old_shw.shw_title AS old_show,old_shw.shw_date AS old_date
FROM show_shw CROSS JOIN show_shw old_shw
WHERE show_shw.shw_date>old_shw.shw_date;
