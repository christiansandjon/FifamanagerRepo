create table user
(
    id   integer      not null auto_increment
        primary key,
    login varchar(100) not null,
    pwd  varchar(100) not null
);