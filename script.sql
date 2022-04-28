
create table area
(
    id   bigint auto_increment
        primary key,
    name varchar(255) null
);



create table shop
(
    id      bigint auto_increment
        primary key,
    name    varchar(255) null,
    area_id bigint       not null,
    constraint FKh3yi008wvrvqq1g7us3ykfb8x
        foreign key (area_id) references area (id)
);


