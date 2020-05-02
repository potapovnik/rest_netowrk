insert into users(name, surname, last_name, login, password, email, phone_number)
values ('Иван','Солнышкин','Петрович','ivan','ivan','ivan@gmail.com','88003535');

insert into post(title, description, lat, lot, creator_id, created_date, start_date, finish_date)
values ('Наша встреча','самая крутая из всех','12.12','12.12',1,now(),now(),now());

insert into post_users (post_id, user_id)
values (1,1);
