
//17-November-2025
//1. Show all information about the longest show – Do not use a JOIN here
SELECT *
FROM show_shw
WHERE shw_duration = (SELECT MAX(shw_duration) FROM show_shw )
 
 //2. List show title and show duration for all shows of type ‘Musique’ – Do not use a JOIN here
SELECT shw_title, shw_duration 
FROM show_shw 
WHERE shw_tsh_id IN (SELECT tsh_id FROM type_show_tsh WHERE tsh_name LIKE 'Music%');

//3. List customers (id, first and last names) who have booked at least one show that Mr NELSON  also booked. Do not list Mr NELSON.
not complete
  
  SELECT cst_id, cst_first_name, cst_last_name FROM customer_cst
WHERE exists (select bkg_id from booking_bkg where cst_id = bkg_cst_id and bkg_shw_id in(select bkg_shw_id from booking_bkg where bkg_cst_id in(select cst_id from booking+bkg where cst_last_name = 'NELSON')));


//4. List shows (id, title) that do not have any booking
SELECT S.shw_id, S.shw_title 
FROM show_shw S WHERE 
NOT EXISTS (SELECT B.bkg_id FROM booking_bkg B WHERE B.bkg_shw_id = S.shw_id);

//5. List shows (id, title) that have a duration greater than all average durations per type of shows
SELECT shw_id, shw_title
FROM show_shw 
WHERE shw_duration > ALL(SELECT AVG(shw_duration) FROM show_shw );

//6. List music shows that have a price greater than at least one show of type Theater


//7. List shows that have a duration that is higher than the average duration of shows of the same type
SELECT *
FROM show_shw outer
WHERE outer.shw_duration >
 (SELECT AVG(inner.shw_duration)
 FROM show_shw inner
 WHERE inner.shw_tsh_id = outer.shw_tsh_id);
