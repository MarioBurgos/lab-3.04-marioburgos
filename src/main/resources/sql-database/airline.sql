DROP SCHEMA IF EXISTS lab_three_o_four;
CREATE SCHEMA lab_three_o_four;
USE lab_three_o_four;
--

CREATE TABLE aircraft (
    model VARCHAR(255) NOT NULL UNIQUE,
    total_seats INT,
    PRIMARY KEY (model)
);

CREATE TABLE customer (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    status VARCHAR(255),
    PRIMARY KEY (id),
);

CREATE TABLE flight (
    number VARCHAR(255) NOT NULL,
    mileage INT NOT NULL,
    aircraft_model VARCHAR(255) NOT NULL,
    PRIMARY KEY (number),
    FOREIGN KEY (aircraft_model)
        REFERENCES aircraft (model)
);
