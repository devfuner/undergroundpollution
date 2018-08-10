create table home.home
(
	id serial not null
		constraint home_pkey
			primary key,
	address varchar(512) not null
)
;

