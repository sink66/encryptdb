# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigint auto_increment not null,
  name                          varbinary(255),
  mail                          varbinary(255),
  password                      varbinary(255),
  create_date                   datetime(6) not null,
  update_date                   datetime(6) not null,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists user;

