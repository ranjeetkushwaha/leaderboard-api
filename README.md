The idea is to develop a highly scalable REST-based application. This web application will return the list of the team in ascending order of rank. The API response will be helpful to create a leader board on top of the API response.
The best part of this project is it is supported micro-service environment(spring-boot). It can run as a standalone application, deployed over the cloud and it can run behind the Load balancer. with these features, it becomes a highly scalable application.

API End point will be: http://localhost:8080/api/v1/leaderboard

API Response will looks:

[
    {
        "teamId": 2,
        "teamName": "team2",
        "userId": 2505,
        "matchId": 251,
        "captainId": 689,
        "vcaptainId": 754,
        "totalScore": 5.0,
        "rank": 1
    },
    {
        "teamId": 3,
        "teamName": "team3",
        "userId": 73505,
        "matchId": 2750,
        "captainId": 689,
        "vcaptainId": 854,
        "totalScore": 3.0,
        "rank": 2
    },
    {
        "teamId": 1,
        "teamName": "team1",
        "userId": 353505,
        "matchId": 2750,
        "captainId": 919,
        "vcaptainId": 734,
        "totalScore": 3.0,
        "rank": 2
    },
    {
        "teamId": 4,
        "teamName": "team4",
        "userId": 563505,
        "matchId": 22350,
        "captainId": 9489,
        "vcaptainId": 76754,
        "totalScore": 2.0,
        "rank": 3
    }
]    


This project module has some more API introduced to add Teams and players:

API's are: 

http://localhost:8080/api/v1/team [POST, GET]

http://localhost:8080/api/v1/player [POST, GET]

Health API: http://localhost:8080/actuator/health