SELECT * FROM gocheeta.vehicle_category;
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("CAR001","4 - Seater Car");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("CAR002","2 - Seater Car");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("VAN001","6 - Seater Van");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("BUS001","12 - Seater Bus");

SELECT * FROM gocheeta.vehicle;
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("ABCD1234","CAR001");
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("DEFG1234","CAR002");
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("WXYZ1234","VAN001");