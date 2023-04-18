create database sales;

create table user (
	id int primary key not null auto_increment,
    username varchar(10) not null,
    password varchar(20) not null,
    salt varchar(6) not null,
    email varchar(50) not null,
    role int not null not null,
    add_user varchar(10) not null,
    create_date datetime not null,
    update_date datetime not null,
    version_update datetime,
    cancel_date datetime
);

create table information (
	id int primary key not null auto_increment,
    email varchar(50) not null,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    phone varchar(20) not null,
    hashpass varchar(255) not null,
    image varchar(255),
    address varchar(255),
    date_of_birth datetime not null,
    add_user varchar(10) not null,
    create_date datetime not null,
    update_date datetime not null,
    version_update datetime,
    cancel_date datetime
)