show databases ;
create database fifarestapi;

use fifarestapi;

create table user
(
    id   integer      not null auto_increment
        primary key,
    login varchar(100) not null,
    pwd  varchar(100) not null
);

create table championnat
(
    id        integer      not null auto_increment
        primary key,
    nom       varchar(255) not null,
    saison    varchar(255) not null,
    nb_equipe integer      not null,
    dateDebut date         not null,
    dateFin   date         not null,
    fk_user   integer      not null,
    foreign key (fk_user) references user (id)
        on update cascade on delete no action
);

create table equipe
(
    id    integer auto_increment
        primary key,
    nom   varchar(255) not null,
    ch_id integer      not null,
    constraint nom
        unique (nom),
    constraint equipe_ibfk_1
        foreign key (ch_id) references championnat (id)
            on update cascade
);

create table joueur
(
    id     integer auto_increment
        primary key,
    prenom varchar(255) not null,
    nom    varchar(255) not null,
    poste  varchar(255) not null,
    eq_id  integer default 0,
        foreign key (eq_id) references equipe (id)
            on update cascade
);

create index eq_id
    on joueur (eq_id);

create table resultat
(
    id               integer not null auto_increment
        primary key,
    vainqueur        integer not null,
    perdant          integer not null,
    matchs_nul       integer not null,
    buteurs          integer not null,
    sanctionnes      integer not null,
    points_vainqueur integer not null,
    points_vaincu    integer not null,
    foreign key (vainqueur) references equipe (id)
        on update cascade,
    foreign key (perdant) references equipe (id)
        on update cascade,
    foreign key (buteurs) references joueur (id)
        on update cascade,
    foreign key (sanctionnes) references joueur (id)
        on update cascade
);

create table classement
(
    id    int auto_increment
        primary key,
    re_id int not null,
    foreign key (re_id) references resultat (id)
        on update cascade
);

create index re_id
    on classement (re_id);

create table semestre
(
    id         int auto_increment
        primary key,
    nom        varchar(255) not null,
    date_debut date         not null,
    date_fin   date         not null,
    ch_id      int          not null,
    constraint semestre_ibfk_1
        foreign key (ch_id) references championnat (id)
            on update cascade
);

create index ch_id
    on semestre (ch_id);

create table sanction
(
    id      int auto_increment
        primary key,
    libelle varchar(255) not null,
    jo_id   int          not null,
    se_id   int          not null,

        foreign key (jo_id) references joueur (id)
            on update cascade,

        foreign key (se_id) references semestre (id)
            on update cascade
);

create index jo_id
    on sanction (jo_id);

create index se_id
    on sanction (se_id);

create table buts
(
    id    int auto_increment
        primary key,
    jo_id int not null,
    constraint buts_ibfk_1
        foreign key (jo_id) references joueur (id)
            on update cascade
);

create index jo_id
    on buts (jo_id);

create table matche
(
    id     int auto_increment
        primary key,
    date   timestamp default CURRENT_TIMESTAMP null,
    se_id  int                                 not null,
    eq1_id int                                 not null,
    eq2_id int                                 not null,
    sa_id  int                                 not null,
    bu_id  int                                 not null,
    jo_id  int                                 not null,
    constraint matche_ibfk_1
        foreign key (jo_id) references joueur (id)
            on update cascade,
    constraint matche_ibfk_2
        foreign key (eq1_id) references equipe (id)
            on update cascade,
    constraint matche_ibfk_3
        foreign key (eq2_id) references equipe (id)
            on update cascade,
    constraint matche_ibfk_4
        foreign key (bu_id) references buts (id)
            on update cascade,
    constraint matche_ibfk_5
        foreign key (sa_id) references sanction (id)
            on update cascade
);

create index bu_id
    on matche (bu_id);

create index eq1_id
    on matche (eq1_id);

create index eq2_id
    on matche (eq2_id);

create index jo_id
    on matche (jo_id);

create index sa_id
    on matche (sa_id);


##-----------insert---------
insert into user (login, pwd) VALUES ('chris','12345');
insert into user (login, pwd) VALUES ('greg','12345');
insert into user (login, pwd) VALUES ('bris','12345');
insert into user (login, pwd) VALUES ('johan','12345');
insert into user (login, pwd) VALUES ('valentine','12345');


insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('liga','2019-2020',10,current_date,current_date+100,1);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('liga','2019-2020',10,current_date,current_date+100,2);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('liga','2019-2020',10,current_date,current_date+100,3);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('liga','2019-2020',10,current_date,current_date+100,4);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('liga','2019-2020',10,current_date,current_date+100,5);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('premier league','2019-2020',10,current_date,current_date+100,1);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('premier league','2019-2020',10,current_date,current_date+100,2);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('premier league','2019-2020',10,current_date,current_date+100,3);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('premier league','2019-2020',10,current_date,current_date+100,4);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('premier league','2019-2020',10,current_date,current_date+100,5);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('bundesliga','2019-2020',10,current_date,current_date+100,1);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('bundesliga','2019-2020',10,current_date,current_date+100,2);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('bundesliga','2019-2020',10,current_date,current_date+100,3);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('bundesliga','2019-2020',10,current_date,current_date+100,4);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('bundesliga','2019-2020',10,current_date,current_date+100,5);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('ligue 1','2019-2020',10,current_date,current_date+100,1);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('ligue 1','2019-2020',10,current_date,current_date+100,2);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('ligue 1','2019-2020',10,current_date,current_date+100,3);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('ligue 1','2019-2020',10,current_date,current_date+100,4);
insert into championnat (nom, saison, nb_equipe, dateDebut, dateFin,fk_user)
values ('ligue 1','2019-2020',10,current_date,current_date+100,5);


insert into equipe (nom,ch_id) values ('fc barcelone',1 );
insert into equipe (nom,ch_id) values ('real madrid',1 );
insert into equipe (nom,ch_id) values ('fc seville',1 );
insert into equipe (nom,ch_id) values ('Arsenal',2 );
insert into equipe (nom,ch_id) values ('Manchester',2 );
insert into equipe (nom,ch_id) values ('Liverpool',2 );
insert into equipe (nom,ch_id) values ('Bayern',3 );
insert into equipe (nom,ch_id) values ('Dortmund',3 );
insert into equipe (nom,ch_id) values ('Leverkusen',3 );
insert into equipe (nom,ch_id) values ('Paris St Germain',4 );
insert into equipe (nom,ch_id) values ('Olympique de Marseille',4 );
insert into equipe (nom,ch_id) values ('Olympique Lyonnais',4 );
insert into equipe (nom,ch_id) values ('valence',1 );
insert into equipe (nom,ch_id) values ('chelsea',2 );
insert into equipe (nom,ch_id) values ('Lille',4 );


insert into joueur (prenom, nom, poste, eq_id)
values ('lionel','messi','attaquant',1);
insert into joueur (prenom, nom, poste, eq_id)
values ('christiano','ronaldo','attaquant',2);
insert into joueur (prenom, nom, poste, eq_id)
values ('ter','stegen','gardien',1);
insert into joueur (prenom, nom, poste, eq_id)
values ('luka','modric','milieu',2);
insert into joueur (prenom, nom, poste, eq_id)
values ('mo','salah','attaquant',6);
insert into joueur (prenom, nom, poste, eq_id)
values ('sadio','mane','attaquant',6);
insert into joueur (prenom, nom, poste, eq_id)
values ('nabil','fekir','attaquant',3);
insert into joueur (prenom, nom, poste, eq_id)
values ('samir','nasri','milieu',3);
insert into joueur (prenom, nom, poste, eq_id)
values ('p.e.','aubameyang','attaquant',4);
insert into joueur (prenom, nom, poste, eq_id)
values ('petre','Cech','gardien',4);
insert into joueur (prenom, nom, poste, eq_id)
values ('markus','Rashford','attaquant',5);
insert into joueur (prenom, nom, poste, eq_id)
values ('paul','pogba','milieu',5);
insert into joueur (prenom, nom, poste, eq_id)
values ('k','coman','attaquant',6);
insert into joueur (prenom, nom, poste, eq_id)
values ('benjamin','pavard','defenseur',6);
insert into joueur (prenom, nom, poste, eq_id)
values ('j','sancho','attaquant',7);
insert into joueur (prenom, nom, poste, eq_id)
values ('axel','witsel','milieu',7);
insert into joueur (prenom, nom, poste, eq_id)
values ('kylian','mbappe','attaquant',9);
insert into joueur (prenom, nom, poste, eq_id)
values ('','haland','attaquant',8);
insert into joueur (prenom, nom, poste, eq_id)
values ('jr','neymar','attaquant',9);
insert into joueur (prenom, nom, poste, eq_id)
values ('steve','mandanda','gardien',10);
insert into joueur (prenom, nom, poste, eq_id)
values ('tanguy','ndongbele','milieu',11);
insert into joueur (prenom, nom, poste, eq_id)
values ('eden','hazard','attaquant',13);
insert into joueur (prenom, nom, poste, eq_id)
values ('nicolas','pepe','attaquant',14);
insert into joueur (prenom, nom, poste, eq_id)
values ('c','ndongobia','attaquant',12);