insert into teams values('Liverpool',1892,'Anfield', 'Fenway Sports Group');
insert into teams values('Chelsea',1905,'Stamford Bridge','Roman Abramovich');
insert into teams values('Arsenal',1886,'Emirates Stadium', 'Arsenal Holdings plc');
insert into teams values('Manchester United',1878,'Old Trafford', 'Manchester United plc');
insert into teams values('Manchester City',1894,'City of Manchester Stadium','City Football Group');
insert into teams values('Tottenham Hotspur',1882,'White Hart Lane', 'ENIC International Ltd.');
insert into teams values('Everton',1878,'Goodison Park', 'Farhad Moshiri');


insert into players values('Simon Mignolet', 22, 'Liverpool', 'Belgium', 'GoalKeeper');
insert into players values('Nathaniel Clyne', 2, 'Liverpool', 'England', 'Defender');
insert into players values('Dejan Lovren', 6, 'Liverpool', 'Croatia', 'Defender');
insert into players values('Joseph Gomez', 5, 'Liverpool', 'England', 'Defender');
insert into players values('Alberto Moreno', 18, 'Liverpool', 'Spain', 'Defender');
insert into players values('James Milner', 7, 'Liverpool', 'England', 'Midfielder');
insert into players values('Phillippe Coutinho', 10, 'Liverpool', 'Brazil', 'Midfielder');

insert into competitions values('Premier League', 2008, 'Manchester United', 'league');
insert into competitions values('Premier League', 2009, 'Chelsea', 'league');
insert into competitions values('Premier League', 2010, 'Manchester United', 'league');
insert into competitions values('Premier League', 2011, 'Manchester City', 'league');
insert into competitions values('Premier League', 2012, 'Manchester United', 'league');
insert into competitions values('Premier League', 2013, 'Manchester City', 'league');

insert into competitions values('FA Cup', 2015, 'Arsenal', 'cup');

insert into games values (1,'Manchester City', 'Liverpool', '2017:03:20', 59.5,'Anfield','Ref', 13, 13,3,4,563,383,'draw', 20000);
insert into games values (2,'Manchester United', 'Liverpool', '2017:03:13', 69.5,'Old Trafford','Ref', 10, 9,5,2,200,783,'away', 25000);
insert into games values (3,'Everton', 'Chelsea', '2017:03:06', 49.5,'Goodison Park','Ref', 20, 14,10,7,863,183,'home', 30000);
insert into games values (4,'Manchester City', 'Arsenal', '2017:03:20', 59.5,'City of Manchester Stadium','Ref', 20, 5,3,1,500,500,'draw', 20300);
insert into games values (5,'Manchester City', 'Tottenham Hotspur', '2017:03:13', 79,'White Hart Lane','Ref', 1, 13,0,8,670,450,'away', 10000);
insert into games values (6,'Everton', 'Liverpool', '2017:03:06', 50.5,'Goodison Park','Ref', 8, 13,3,7,520,380,'home', 26000);

insert into events values (1,1,'Simon Mignolet', 22, "Liverpool", 'yellow card');
insert into events values (2,60,'Nathaniel Clyne', 2, "Liverpool", 'yellow card');
insert into events values (6,40,'Dejan Lovren', 6, "Liverpool", 'sub out');
insert into events values (1,50,'James Milner', 7, "Liverpool", 'goal');
insert into events values (1,75,'Alberto Moreno', 18, "Liverpool", 'red card');
