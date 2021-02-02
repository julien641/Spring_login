
CREATE TABLE `Person_Login` (
  `EmplId` int NOT NULL,
  `effdate` date NOT NULL,
  `DOB` date DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmplId`,`effdate`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

CREATE TABLE `Person` (
  `EmplId` int NOT NULL AUTO_INCREMENT,
  `Creation_Date` date DEFAULT NULL,
  `Deleted_Date` date DEFAULT NULL,
  PRIMARY KEY (`EmplId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci