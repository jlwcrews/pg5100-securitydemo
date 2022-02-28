create table users
(
    user_id       serial primary key,
    user_username varchar(50) not null,
    user_password varchar(50) not null,
    user_enabled  boolean not null,
    user_role varchar(10) not null
);

insert into users(user_username, user_password, user_enabled, user_role)
values ('jimbob', 'pirate', true, 'ADMIN');

insert into users(user_username, user_password, user_enabled, user_role)
values ('joebob', 'pirate', true, 'USER');