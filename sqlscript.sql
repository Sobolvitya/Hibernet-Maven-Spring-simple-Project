create database DB;
use DB;

create table Team(
	id Int not null auto_increment,
    name VARCHAR (50) not null,
    city varchar (50) not null,
    primary key(id)
    );
create table Coach (
	id Int not null auto_increment,
    name VARCHAR (50) not null,   
    teamID int ,
    primary key (id),
    foreign key (teamID )
    REFERENCES  Team(id)
    );
    
create table Country (
	name varchar(50) not null,
    rate  TINYINT UNSIGNED,
    primary key (name)
    );

create table Agent (
	id int not null auto_increment,
    name varchar(50) not null,
    primary key(id)
);

create table Player(
	id int not null auto_increment,
    name varchar (50) not null,
    clubID int,
    countryName varchar(50) not null,
    agentID int,
    primary key (id),
    foreign key (clubID) references Team(id),
    foreign key (countryName) references Country (name),
    foreign key (agentID)  references Agent (id)
    
);

insert into Team values(1,'Barcelona','Barcelona');
insert into Team values(2,'Arsenal','London');
insert into Team values(3,'Real Madrid','Madrid');
insert into Team values(4,'Bavaria','Munich');
insert into Team values(5,'PSG','Paris');

insert into Coach values(1,'Enrice',1);
insert into Coach values(2,'Zidan',3);
insert into Coach values(3,'Guardiola',4);
insert into Coach values(4,'Blan',5);
insert into Coach values(5,'Venger',2);

insert into Country values ('England',4);
insert into Country values ('Spain',5);
insert into Country values ('Germany',10);

insert into Agent values (1, 'Alves');
insert into Agent values (2, 'Obama');
insert into Agent values (3, 'Norris');

insert into Player values (1,'Messi',1,'Spain',1);
insert into Player values (2,'Neymar',1,'Spain',2);
insert into Player values (3,'Mascerano',1,'Spain',1);
insert into Player values (4,'Ribery',4,'Germany',3);
insert into Player values (5,'Robbin',4,'Germany',2);
insert into Player values (6,'Pepe',3,'Spain',1);








