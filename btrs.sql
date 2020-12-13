
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `booking` (
  `BookingId` varchar(20) NOT NULL,
  `userid` varchar(128) DEFAULT NULL,
  `MovieId` varchar(20) DEFAULT NULL,
  `DepartureDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `DepartureTime` time DEFAULT NULL,
  PRIMARY KEY (`BookingId`),
  KEY `UserId` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `bookinghistory` (
  `bookinghistoryid` varchar(128) DEFAULT NULL,
  `UserHistoryId` varchar(20) DEFAULT NULL,
  `MovieId` varchar(20) DEFAULT NULL,
  `DepartureDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `DepartureTime` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `movie` (
  `MovieId` varchar(20) NOT NULL,
  `MovieName` varchar(128) DEFAULT NULL,
  `MovieType` varchar(128) DEFAULT NULL,
  `DepartureTime` time DEFAULT NULL,
  `TravelTime` time DEFAULT NULL,
  `DepartureCity` varchar(128) DEFAULT NULL,
  `ArrivalCity` varchar(128) DEFAULT NULL,
  `cost` double NOT NULL,
  `OperatorId` varchar(20) DEFAULT NULL,
  `TotalSeats` int DEFAULT NULL,
  PRIMARY KEY (`MovieId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `moviefrequency` (
  `FrequencyId` varchar(20) NOT NULL,
  `MovieId` varchar(20) DEFAULT NULL,
  `FrequencyDays` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`FrequencyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `movieoperator` (
  `OperatorId` varchar(20) NOT NULL,
  `OperatorName` varchar(128) DEFAULT NULL,
  `Address` varchar(128) DEFAULT NULL,
  `email` varchar(128) NOT NULL,
  `City` varchar(128) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `Password` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`OperatorId`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `operatorhistory` (
  `OperatorId` varchar(20) NOT NULL,
  `OperatorName` varchar(128) DEFAULT NULL,
  `Address` varchar(128) DEFAULT NULL,
  `EMail` varchar(128) DEFAULT NULL,
  `City` varchar(128) DEFAULT NULL,
  `PhoneNumber` varchar(15) DEFAULT NULL,
  `ArchivedYear` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Password` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`OperatorId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `payment` (
  `PaymentId` varchar(200) NOT NULL,
  `BookingId` varchar(20) DEFAULT NULL,
  `TotalAmount` int DEFAULT NULL,
  `PaymentDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `OperatorId` varchar(20) DEFAULT NULL,
  `TotalSeats` int DEFAULT NULL,
  `Status` varchar(10) DEFAULT 'NOT PAID',
  PRIMARY KEY (`PaymentId`),
  KEY `BookingId` (`BookingId`),
  KEY `OperatorId` (`OperatorId`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`BookingId`) REFERENCES `booking` (`BookingId`) ON DELETE CASCADE,
  CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`OperatorId`) REFERENCES `movieoperator` (`OperatorId`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `seatallocation` (
  `SeatId` varchar(20) NOT NULL,
  `BookingId` varchar(20) DEFAULT NULL,
  `SeatType` varchar(10) DEFAULT NULL,
  `MovieId` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SeatId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `user` (
  `userid` varchar(128) NOT NULL DEFAULT '',
  `FirstName` varchar(64) DEFAULT NULL,
  `LastName` varchar(64) DEFAULT NULL,
  `Address` varchar(128) DEFAULT NULL,
  `City` varchar(128) DEFAULT NULL,
  `email` varchar(128) NOT NULL,
  `PhoneNumber` varchar(50) DEFAULT NULL,
  `Password` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `userhistory` (
  `UserHistoryId` varchar(128) DEFAULT NULL,
  `FirstName` varchar(64) DEFAULT NULL,
  `LastName` varchar(64) DEFAULT NULL,
  `Address` varchar(128) DEFAULT NULL,
  `City` varchar(128) DEFAULT NULL,
  `EMail` varchar(128) DEFAULT NULL,
  `PhoneNumber` varchar(15) DEFAULT NULL,
  `ArchivedYear` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


