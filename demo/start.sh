<<comment This script should create a database identical to the one I have created on my local machine, which has worked in testsing.

I used post man to send the json to the following address localhost:8080/save
Post man tests will be provided as a collection in the demo folder as a .json

The JSON tested with was the same as what was provided
{
	"tournamentId": "174638",
	"tournamentName": "Women's Open Championship",
	"forecast": "fair",
	"courseName": "Sunnydale Golf Course",
	"countryCode": "GB",
	"startDate": "09/07/21",
	"endDate": "13/07/21",
	"roundCount": "4"
}
{
	"tournamentUUID":"87fc6650-e114-4179-9aef-6a9a13030f80",
    "golfCourse":"Happy Days Golf Club",
    "competitionName":"South West Invitational",
    "hostCountry":"United States Of America",
    "epochStart":"1638349200",
    "epochFinish":"1638468000",
    "rounds":"2",
    "playerCount":"35"
}

comment
#!/bin/bash
docker run --name golf -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres

psql -U postgres -h localhost -W
password

CREATE DATABASE golf;

CREATE TABLE [IF NOT EXISTS] golf_tournament_type_1 (
    tournamentID INTEGER NOT NULL PRIMARY KEY,
    tournamentName: VARCHAR(100) NOT NULL,
    forecast VARCHAR(30) NOT NULL,
    courseName VARCHAR(100) NOT NULL,
    countryCode VARCHAR(4) NOT NULL,
    startDate DATE NOT NULL DEFAULT CURRENT DATE,
    endDate DATE NOT NULL DEFAULT CURRENT DATE,
    roundCount INTEGER NOT NULL
);

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE [IF NOT EXISTS] golf_tournament_type_2(
    tournamentuuid UUID NOT NULL PRIMARY KEY uuid_generate_v1(),
    golfCourse VARCHAR(100) NOT NULL,
    competitionName VARCHAR(100) NOT NULL,
    hostCountry VARCHAR(100) NOT NULL,
    epochStart INTEGER NOT NULL,
    epochFinish INTEGER NOT NULL,
    rounds INTEGER NOT NULL,
    playerCount INTEGER NOT NULL,
);