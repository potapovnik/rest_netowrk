create table dim_users
(
	id bigserial not null
		constraint users_pkey
			primary key,
	name varchar(255),
	surname varchar(255),
	last_name varchar(255),
	login varchar(255),
	password varchar(1024),
	email varchar(255),
	phone_number varchar(30)
);

alter table dim_users owner to postgres;

create table post
(
	id bigserial not null
		constraint post_pkey
			primary key,
	title varchar(300),
	description varchar(500),
	lat double precision,
	lot double precision,
	creator_id integer
		constraint post_users_id_fk
			references dim_users,
	created_date timestamp,
	start_date timestamp,
	finish_date timestamp
);

alter table post owner to postgres;

create table dim_post_type
(
	id bigserial not null
		constraint post_type_pkey
			primary key,
	name varchar(100)
);

alter table dim_post_type owner to postgres;

create table rel_post_users
(
	id bigserial not null
		constraint post_users_pkey
			primary key,
	post_id integer
		constraint post_users_post_id_fk
			references post,
	user_id integer
		constraint post_users_users_id_fk
			references dim_users
);

alter table rel_post_users owner to postgres;

create table rel_post_type
(
	id bigserial not null
		constraint post_type_relation_pkey
			primary key,
	post_id integer
		constraint post_type_relation_post_id_fk
			references post,
	type_id integer
		constraint post_type_relation_post_type_id_fk
			references dim_post_type
);

alter table rel_post_type owner to postgres;

