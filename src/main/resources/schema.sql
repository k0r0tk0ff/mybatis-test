DROP TABLE IF EXISTS city;
CREATE SEQUENCE if not exists simple_seq;
CREATE TABLE city
(
    id      integer PRIMARY KEY default nextval('simple_seq'),
    name    varchar,
    state   varchar,
    country varchar
);

