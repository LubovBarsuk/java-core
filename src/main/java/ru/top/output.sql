select * from department order by id desc;

select concat(name,' - ', rating) as groups_name_and_rating from groups;

select surname, salary/(salary + premium)*100 as salary_part,
premium/(salary + premium)*100 as premium_part from teacher;

select concat('Декан факультета ', name,' это ', dean) from faculty;

select name, salary from teacher where is_professor = 1::bit
and salary > 30000::money;

select name, financing from department where financing < 400000::money
or financing > 450000::money;

select name from faculty where name != 'Высшая математика';

select surname, position from teacher where is_professor = 0::bit;

select surname, position, salary, premium from teacher where is_assistant = 1::bit
and premium between 2000::money and 10000::money;

select surname, salary from teacher where is_assistant = 1::bit;

select surname, position from teacher where employmentdate < '2001-01-01';

select name as name_of_department from department order by name asc;

select surname, salary+premium from teacher where is_assistant = 1::bit
and salary+premium < 30000::money;

select name, rating from groups where year = 5 and rating between 2 and 4;

select surname from teacher where is_assistant = 1::bit
and (salary < 30000::money or premium < 10000::money);