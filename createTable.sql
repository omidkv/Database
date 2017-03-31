DROP TABLE IF EXISTS teams,
     	      	     players,
		     games,
		     competitions,
		     events;

create table teams (
teamName varchar(30) Not Null,
yearEstablished int,
stadiumName varchar(30),
owner varchar(30),
Primary Key (teamName)
);

create table players (
playerName varchar(30) Not Null,
playerNum int Not Null,
playerTeam varchar(30) references team(teamName),
nationality varchar(30),
positionPlayed varchar(30)
);

create table games (
gameID int Not Null,
homeTeam varchar(30) references team(teamName),
awayTeam varchar(30) references team(teamName),
gameDate date,
possession decimal(4,2),
stadium varchar(30),
referee varchar(30),
shotsH int, shotsA int,
shotsOnTargetH int,
shotsOnTargetA int,
passesH int,
passesA int,
gameResult ENUM('home','away','draw'),
attendence int,
Primary Key (gameID)
);

create table competitions (
compName varchar(30) Not Null,
startYear year Not Null,
winner varchar(30),
compType ENUM('cup', 'league', 'friendly')
);

create table events (
timeOccur int check (timeOccur <= 140),
gameID int references games(gameID),
playerName varchar(30) references player(playerName),
playerNumber int references player(playerNum),
playerTeamName varchar(30) references player(playerTeam),
eventType ENUM('goal', 'yellow card', 'red card','sub in', 'sub out'),
Primary Key (gameID)
);



