insert into department (financing, name)
        values (500000, 'экономика'),
        (400000, 'юриспруденция'),
        (350000, 'математика'),
        (450000, 'филология');
insert into faculty (dean, name)
		values ('Иванов', 'Банковское дело'),
		('Петров','Гражданское право'),
		('Сидоров', 'Высшая математика'),
		('Николаева','Лингвистика'),
		('Кузьменко','Экономика предприятия'),
		('Бойко','Механико-математический');
insert into groups (name, rating, year)
		values ('БД-1', 5, 1),
		('БД-2', 4, 2),
		('БД-3', 3, 3),
		('БД-4', 5, 4),
		('ГП-1', 4, 1),
		('ГП-2', 5, 2),
		('ГП-3', 3, 3),
		('ГП-4', 4, 4),
		('ГП-5', 5, 5),
		('ВМ-1', 5, 1),
		('ВМ-2', 4, 2),
		('ВМ-3', 3, 3),
		('ВМ-4', 4, 2),
		('ВМ-5', 4, 5),
		('ЛИ-1', 5, 1),
		('ЛИ-2', 4, 2),
		('ЛИ-3', 5, 3),
		('ЭП-1', 4, 1),
		('ЭП-2', 5, 2),
		('ЭП-3', 3, 3),
		('ЭП-4', 5, 4),
		('ММ-1', 5, 1),
		('ММ-2', 4, 2),
		('ММ-3', 5, 3),
		('ММ-4', 4, 4),
		('ММ-5', 3, 5);
insert into teacher
		values (1, 'Иван', 'Иванов', 'Декан', '2000-11-12', 0::bit, 1::bit, 30000, 10000),
		(2, 'Петр', 'Петров', 'Декан', '1999-08-22', 0::bit, 1::bit, 31000, 8000),
		(3, 'Олег', 'Сидоров', 'Декан', '2001-04-25', 0::bit, 1::bit, 29000, 11000),
		(4, 'Ольга', 'Николаева', 'Декан', '2002-12-01', 0::bit, 1::bit, 32000, 8000),
		(5, 'Алиса', 'Кузьменко', 'Декан', '2000-06-10', 0::bit, 1::bit, 28000, 0),
		(6, 'Иван', 'Бойко', 'Декан', '1998-05-17', 0::bit, 1::bit, 33000, 0),
		(7, 'Ирина', 'Александрова', 'Учитель', '2002-07-23', 1::bit, 0::bit, 20000, 5000);