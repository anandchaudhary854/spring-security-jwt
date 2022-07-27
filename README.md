# spring-security-jwt
Using postman hit /authenticate (post method). In the body provide {
    "userName": "user",
    "password": "user"
}
It will generate a jwt token use that and paste it in headers using 'Authorization' as key and token as value and then access "/" api
