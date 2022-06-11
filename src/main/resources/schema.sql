create table expanses
(
    id           int auto_increment primary key,
    departments  varchar(250)   not null,
    project_name varchar(250)   not null,
    amount       numeric(20, 2) not null,
    date         date           not null,
    member_name  varchar(250)   not null
);
