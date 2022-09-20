-- Create tables
CREATE TABLE `vehicle_category` (
  `categoryID` varchar(6) NOT NULL,
  `categoryName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`categoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `vehicle` (
  `numberPlate` varchar(8) NOT NULL,
  `categoryID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`numberPlate`),
  KEY `fk_vehicle_category_idx` (`categoryID`),
  CONSTRAINT `fk_vehicle_category` FOREIGN KEY (`categoryID`) REFERENCES `vehicle_category` (`categoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `branch` (
  `branchID` varchar(6) NOT NULL,
  `branchName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`branchID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `location` (
  `locationID` varchar(6) NOT NULL,
  `branchID` varchar(6) DEFAULT NULL,
  `locationName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`locationID`),
  KEY `fk_branch_idx` (`branchID`),
  CONSTRAINT `fk_branch` FOREIGN KEY (`branchID`) REFERENCES `branch` (`branchID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- disjoint and covering isa mapping relationship
CREATE TABLE `customer` (
  `userID` varchar(6) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `dateCreated` datetime DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `administrator` (
  `userID` varchar(6) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `admin` tinyint DEFAULT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `driver` (
  `userID` varchar(6) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `phoneNumber` varchar(10) DEFAULT NULL,
  `numberPlate` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`userID`),
  KEY `fk_vehicle_idx` (`numberPlate`),
  CONSTRAINT `fk_vehicle` FOREIGN KEY (`numberPlate`) REFERENCES `vehicle` (`numberPlate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


SELECT * FROM gocheeta.vehicle_category;
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("CAR001","4 - Seater Car");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("CAR002","2 - Seater Car");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("VAN001","6 - Seater Van");
INSERT INTO vehicle_category (categoryID,categoryName) VALUES ("BUS001","12 - Seater Bus");

SELECT * FROM gocheeta.vehicle;
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("ABCD1234","CAR001");
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("DEFG1234","CAR002");
INSERT INTO vehicle (numberPlate,categoryID) VALUES ("WXYZ1234","VAN001");

SELECT * FROM gocheeta.branch;
INSERT INTO branch (branchID,branchName) VALUES ("KANDY","Kandy City Branch");
INSERT INTO branch (branchID,branchName) VALUES ("COLMET","Colombo Metro Branch");

SELECT * FROM gocheeta.location;
INSERT INTO location(locationID,branchID,locationName) VALUES ("KAN001","KANDY","Kandy North");
INSERT INTO location(locationID,branchID,locationName) VALUES ("KAN002","KANDY","Kandy South");
INSERT INTO location(locationID,branchID,locationName) VALUES ("KAN003","KANDY","Kandy East");
INSERT INTO location(locationID,branchID,locationName) VALUES ("KAN004","KANDY","Kandy West");
INSERT INTO location(locationID,branchID,locationName) VALUES ("COL001","COLMET","Colombo North");
INSERT INTO location(locationID,branchID,locationName) VALUES ("COL002","COLMET","Colombo South");



