## SQL code
create database if not exists CollegeFest_DBMS;

use CollegeFest_DBMS;

insert into `roles` values(1,"ADMIN");

insert into `roles` values(2,"USER");

insert into `users` values(1,"$2a$12$AQUByh7Rlp/.cyerPM72v.Fk1JG2A2a3yfM8EBdZgEo4AefztfVIe","admin");

insert into `users` values(2,"$2a$12$DmSIhO4JB6neQkoo9by9..bA6U93SPLbnHE7ssNe6YvgvHUvlUAyi","user");

insert into `user_roles` values(1, 1);

insert into `user_roles` values(2, 2);


### User Credentials

Admin - Admin123

User - User123
