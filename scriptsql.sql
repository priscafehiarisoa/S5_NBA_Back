create table equipe
(
    id_equipe  bigserial
        primary key,
    nom_equipe varchar(255)
);

alter table equipe
    owner to drh;

create table joueur
(
    id_joueur bigserial
        primary key,
    nom       varchar(255),
    id_equipe bigint
        constraint fke01drc12gbo7mcgckvpdrxo7j
            references equipe
);

alter table joueur
    owner to drh;

create table saison
(
    id_saison  bigserial
        primary key,
    datde_fin  timestamp(6),
    date_debut timestamp(6)
);

alter table saison
    owner to drh;

create table match
(
    id_match   bigserial
        primary key,
    id_equipe1 bigint
        constraint fkoydkql0ptqyf5w18lychyvn3k
            references equipe,
    id_equipe2 bigint
        constraint fk41u4uux8cwfm2u0plakjie2a
            references equipe,
    id_saison  bigint
        constraint fkaif2r8tcck916wvp4bydte9ac
            references saison
);

alter table match
    owner to drh;

create table type_action
(
    id_type_action bigserial
        primary key,
    nom_action     varchar(255),
    points         double precision not null
);

alter table type_action
    owner to drh;

create table action
(
    id_action      bigserial
        primary key,
    heure          timestamp(6),
    resultat       integer not null,
    id_joueur      bigint
        constraint fkhyj8stsji5pqp2hc8is65go5e
            references joueur,
    id_match       bigint
        constraint fko40wepftxrdw7q2ku2p7xjoop
            references match,
    id_type_action bigint
        constraint fk1jaf8ts3w6d4gegqimms1tu1p
            references type_action
);

alter table action
    owner to drh;

