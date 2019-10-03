drop table if exists mobile;
drop table if exists sensor;

create table mobile(
Model_id INT PRIMARY KEY,
Model_name VARCHAR(255),
Os_name VARCHAR(255),
Price DOUBLE(20),
Manufacturer_Company VARCHAR(255),
Manufacturer_Country VARCHAR(255),
Screen_size INT(20),
Internal_memory VARCHAR(100),
External_memory VARCHAR(100),
Mobile_width INT,
Android_version VARCHAR(100),
Battery_capacity VARCHAR(100)
);

create table sensor(
Sensor_id INT PRIMARY KEY,
Sensor_name VARCHAR(255),
Sensor_desc VARCHAR(255),
);