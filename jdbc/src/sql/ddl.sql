craete database if not exists jdbc;

create table jdbc.user {
    ID int auto_increment primary key,
    EMAIL varchar(255),
    PASSWORD varchar(100),
    NAME varchar(100),
    REGDATE datetime,
} engine=InnoDB character set = utf8;
