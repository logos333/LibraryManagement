create database if not exists JavaProjectLibrary;
use JavaProjectLibrary;

CREATE TABLE `Student` (
`Sid` varchar(20) NOT NULL,
`Sname` nvarchar(50) NOT NULL,
`Stream` nvarchar(20) NOT NULL,
`Class` nvarchar(20) NOT NULL,
`Sadd` nvarchar(60) NOT NULL,
PRIMARY KEY (`Sid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `Books` (
`Bid` varchar(20) NOT NULL,
`Bname` nvarchar(50) NOT NULL,
`Author` nvarchar(60) NOT NULL,
`Stream` nvarchar(20) NOT NULL,
`Class` nvarchar(20) NOT NULL,
`Available` nvarchar(5) NOT NULL,
PRIMARY KEY (`Bid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `ReturnDetails` (
`Sid` varchar(20) NOT NULL,
`Sname` nvarchar(50) NOT NULL,
`Bid` nvarchar(20) NOT NULL,
`Bname` nvarchar(50) NOT NULL,
`IssuedOn` nvarchar(10) NOT NULL,
`ReturnDate` varchar(10) NOT NULL,
PRIMARY KEY (`Sid`, `Bid`,`IssuedOn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `Issue` (
`Sid` varchar(20) NOT NULL,
`Sname` nvarchar(50) NOT NULL,
`Bid` nvarchar(20) NOT NULL,
`Bname` nvarchar(50) NOT NULL,
`Sadd` nvarchar(60) NOT NULL,
`IssueDate` nvarchar(10) NOT NULL, 
`Stream` nvarchar(20) NOT NULL,
`Class` nvarchar(20) NOT NULL,
PRIMARY KEY (`Sid`, `Bid`, `IssueDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;