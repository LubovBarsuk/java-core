create table groups (
ID serial not null primary key,
name varchar(10) not null unique check(name !=' '),
rating int not null check(rating >=0 and rating <=5),
year int not null check(year >=1 and year <=5)
);
create table departments (
ID serial not null primary key,
financing money not null check(financing >='0'::money) default 0,
name varchar(100) not null unique check(name !=' ')
);
create table faculties (
ID serial not null primary key,
name varchar(100) not null unique check(name !=' ')
);
create table teacher (
ID serial not null primary key,
name varchar not null check(name !=' '),
surname varchar not null check(name !=' '),
employmentdate date not null check(employmentdate >= '1990-01-01'),
salary money not null check(salary >'0'::money),
premium money not null check(premium >='0'::money) default 0
);