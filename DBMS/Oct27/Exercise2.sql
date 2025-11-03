
// 1. Count the bookings per customer – 2 columns should be displayed : customer id and the number of bookings for that customer
SELECT bkg_cst_id, count(bkg_id)
FROM booking_bkg 
GROUP BY bkg_cst_id;

//2. Display the lowest price per show – 2 columns should be displayed : show id and the lowest price for that show, only for shows that have at least 2 prices entered
select hpr_shw_id, min(hpr_seat_price)
from has_price_hpr 
group by hpr_shw_id
having count(*)>=2;

select * from has_price_hpr

//3. List the total number of seats booked per show (shw_id)
select sum(bkg_total_seat), bkg_shw_id
from booking_bkg
group by bkg_shw_id;

//4. List customers first and last names and the shows they have booked (show title)
select cst_first_name, cst_last_name, show_shw.shw_title
from customer_cst 
inner join booking_bkg on bkg_cst_id = cst_id
inner join show_shw on shw_id = bkg_shw_id;


//5. List shows (title, date) and the type of show (type name). 
select shw_title, shw_date, tsh_name
from show_shw 
inner join type_show_tsh on shw_tsh_id = tsh_id;

//6. List shows (title, date) and the type of show (type name) only for the dance and music types
select shw_title, shw_date, tsh_name
from show_shw 
inner join type_show_tsh on shw_tsh_id = tsh_id
where tsh_name like 'Dance' or tsh_name like 'Music';

//7. List number of shows per type of show name. The result should look like this : 
select tsh_name, count(*)
from show_shw 
inner join type_show_tsh on shw_tsh_id = tsh_id
group by tsh_name

//8. List type of shows (type name) with show title and date. All types should be listed, even if there is no corresponding show.
select tsh_name, shw_title, shw_date
from show_shw 
outer right join type_show_tsh on tsh_id = shw_tsh_id;

//9. List shows (title, date), and their bookings (date, total number of seats booked). Print as well title and date of shows with no bookings
select shw_title, shw_date, bkg_date, bkg_total_seat
from show_shw outer left join booking_bkg on bkg_shw_id = shw_id;

