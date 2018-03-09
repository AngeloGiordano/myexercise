drop database IF EXISTS bike;
create database bike;

create table bike.users(
  username varchar(50)  NOT NULL,
  password varchar(50),
  nome varchar(50),
  cognome varchar(50),
  dataDiNascita date,
  codiceFiscale varchar(50),
  CAP varchar(50),
  citta varchar(30),
  indirizzo varchar(50),
  telefono varchar(20),
  ruolo varchar(20),
  PRIMARY KEY (username)
);

create table bike.bici(
tipo varchar(50),
nome varchar(50),
brand varchar(50),
disponibilita float ,
prezzo float,
codice varchar (50)	not null,
misura varchar (50),
cambio varchar (50),
tipoCambio varchar (50),
colore varchar (50),
tipoTelaio varchar (50),
coperture varchar (50),
motore varchar (50),
potenzaMotore float,
tensioneMotore float,
batteria varchar (50),
tempoRicarica float,
coppiaMax float,
maxVelocita float,
deragliatore varchar(50),
primary key (codice)
);


insert into bike.users (username,password,nome,cognome ,dataDiNascita ,codiceFiscale,CAP ,citta ,indirizzo ,telefono ,ruolo)
values ('admin','admin','Angelo','Giordano','1987-09-04','grdngl87','84015','Nocera Superiore','Via Castellani','0815143456','admin');
insert into bike.bici(tipo,nome,brand,disponibilita,prezzo,codice,misura,cambio,tipoCambio,colore,tipoTelaio,coperture,motore,potenzaMotore,tensioneMotore,batteria,tempoRicarica,coppiaMax,maxVelocita,deragliatore)
values('eBIKE','E-RUN','Atala',2,881.10,'0115262900','S','6','Shimano Tourney TZ50','crema','alluminio',' 26”x1,75”','Brushless',250,6,'Li-Ion 36 V 8.8 Ah',8,25,25 ,'n.d'),
	  ('MOUNTAINBIKE','REPLAY 27.5 VB','Atala',1,279.65,'0115241700','S','21','Shimano Tourney RD-TY300 7V','verde','alluminio','27.5"x1.95"','none',0,0,'none',0,0,0,' Shimano Tourney FD-TY300 31.8mm'),
      ('TREKKINGBIKE','DISCOVERY S4 ULTRAL.','Atala',1,479.20,'0115230500','S4','24','Shimano Acera RD-M360 8V','bianca','alluminio','700x35','none',0,0,'',0,0,0,'Shimano FD-M191 31,8mm'),
      ('CITYBIKE','SAUK ULT','Whistle',)
