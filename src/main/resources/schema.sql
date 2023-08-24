CREATE TABLE IF NOT EXISTS camplist (
  id varchar(8) primary key,
  number varchar(8),
  name varchar(16),
  address varchar(16),
  detail varchar(255)
);

CREATE TABLE IF NOT EXISTS detaillist (
  id varchar(8) primary key,

  telephone varchar(16),
  camp_url varchar(255)
);
