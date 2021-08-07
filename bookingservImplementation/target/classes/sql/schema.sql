
DROP TABLE IF EXISTS address;
create table address (
 id integer not null auto_increment primary key,
 line1 varchar(255),
 line2 varchar(255),
 city varchar(255),
 state varchar(255),
 country varchar(64),
 zipcode varchar(6),
);

DROP TABLE IF EXISTS bookings;
create table bookings (
 id integer not null auto_increment primary key,
 first_Name varchar(255),
 last_Name varchar(255),
 date_of_birth varchar(10),
 checkin date,
 checkout date,
 totalprice decimal(8,2),
 deposit decimal(8,2),
 address_id integer,
 FOREIGN KEY (address_id) REFERENCES address(id)
);
