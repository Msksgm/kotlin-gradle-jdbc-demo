DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
  id SERIAL,
  last_name VARCHAR(255),
  first_name VARCHAR(255)
);

INSERT INTO customer ( last_name, first_name ) VALUES
  ( 'Jimmy', 'Butler' )
  , ( 'LeBron', 'James' )
  , ( 'Stephen', 'Curry' )
;
